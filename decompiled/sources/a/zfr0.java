package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zfr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44313a;
    public final fd40 b;
    public final ouu c;
    public final ScheduledThreadPoolExecutor e;
    public final xfr0 g;
    public final gx3 d = new gx3(0);
    public boolean f = false;

    public zfr0(fd40 fd40Var, xfr0 xfr0Var, ouu ouuVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = fd40Var;
        this.g = xfr0Var;
        this.c = ouuVar;
        this.f44313a = context;
        this.e = scheduledThreadPoolExecutor;
    }

    public final synchronized void a(boolean z) {
        this.f = z;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d9 A[Catch: IOException -> 0x008b, TryCatch #3 {IOException -> 0x008b, blocks: (B:15:0x002e, B:32:0x00d9, B:34:0x00e1, B:20:0x0040, B:22:0x0048, B:24:0x0078, B:27:0x008e, B:29:0x0096, B:31:0x00c6), top: B:87:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e1 A[Catch: IOException -> 0x008b, TRY_LEAVE, TryCatch #3 {IOException -> 0x008b, blocks: (B:15:0x002e, B:32:0x00d9, B:34:0x00e1, B:20:0x0040, B:22:0x0048, B:24:0x0078, B:27:0x008e, B:29:0x0096, B:31:0x00c6), top: B:87:0x002e }] */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00e1, please report this as an issue */
    public final boolean b() throws IOException {
        wfr0 wfr0VarA;
        while (true) {
            synchronized (this) {
                try {
                    wfr0VarA = this.g.a();
                    if (wfr0VarA == null) {
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ouu ouuVar = this.c;
            byte b = 0;
            try {
                String str = wfr0VarA.b;
                String str2 = wfr0VarA.f39084a;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals(TokenNames.U)) {
                        cgq cgqVar = (cgq) ((dgq) ouuVar.b);
                        String str3 = ((d45) ouu.k(cgqVar.d())).f5438a;
                        ((FirebaseMessaging) ouuVar.d).a();
                        ouuVar.K(str2, str3, (String) ouu.k(cgqVar.c()), "unsubscribe");
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                    } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + wfr0VarA + Separators.DOT);
                    }
                } else if (str.equals(TokenNames.S)) {
                    cgq cgqVar2 = (cgq) ((dgq) ouuVar.b);
                    String str4 = ((d45) ouu.k(cgqVar2.d())).f5438a;
                    ((FirebaseMessaging) ouuVar.d).a();
                    ouuVar.K(str2, str4, (String) ouu.k(cgqVar2.c()), "subscribe");
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Unknown topic operation" + wfr0VarA + Separators.DOT);
                }
                xfr0 xfr0Var = this.g;
                synchronized (xfr0Var) {
                    y3v y3vVar = xfr0Var.f40806a;
                    String str5 = wfr0VarA.c;
                    synchronized (((ArrayDeque) y3vVar.c)) {
                        if (((ArrayDeque) y3vVar.c).remove(str5)) {
                            ((ScheduledThreadPoolExecutor) y3vVar.d).execute(new apj0(y3vVar, b));
                        }
                    }
                }
                synchronized (this.d) {
                    try {
                        String str6 = wfr0VarA.c;
                        if (this.d.containsKey(str6)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.d.get(str6);
                            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                            if (taskCompletionSource != null) {
                                taskCompletionSource.setResult(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.d.remove(str6);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (IOException e) {
                if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                    Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                } else {
                    if (e.getMessage() != null) {
                        throw e;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                }
                return false;
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void c(long j) {
        this.e.schedule(new bgr0(this, this.f44313a, this.b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        a(true);
    }
}
