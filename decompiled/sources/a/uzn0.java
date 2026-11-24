package a;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class uzn0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36544a;
    public final PowerManager.WakeLock b;
    public final FirebaseMessaging c;
    public final ThreadPoolExecutor d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new n950("firebase-iid-executor"));

    public uzn0(FirebaseMessaging firebaseMessaging, long j) {
        this.c = firebaseMessaging;
        this.f36544a = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.c.b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() throws IOException {
        try {
            if (this.c.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.b;
        mii0 mii0VarU = mii0.u();
        FirebaseMessaging firebaseMessaging = this.c;
        if (mii0VarU.z(firebaseMessaging.b)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.k = true;
                }
                if (!firebaseMessaging.i.e()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.k = false;
                    }
                    if (mii0.u().z(firebaseMessaging.b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (mii0.u().y(firebaseMessaging.b) && !a()) {
                    tzn0 tzn0Var = new tzn0();
                    tzn0Var.c = this;
                    tzn0Var.a();
                    if (mii0.u().z(firebaseMessaging.b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.k = false;
                    }
                } else {
                    firebaseMessaging.g(this.f36544a);
                }
                if (mii0.u().z(firebaseMessaging.b)) {
                    wakeLock.release();
                }
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.k = false;
                    if (mii0.u().z(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (mii0.u().z(firebaseMessaging.b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
