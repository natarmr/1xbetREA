package a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ftw0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10136a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Parcelable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public ftw0(a4x0 a4x0Var, com.google.android.gms.measurement.internal.zzr zzrVar, boolean z, zzah zzahVar) {
        this.f10136a = (byte) 3;
        this.c = zzrVar;
        this.b = z;
        this.d = zzahVar;
        Objects.requireNonNull(a4x0Var);
        this.e = a4x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Executor executorUnconfigurableExecutorService;
        int iA;
        switch (this.f10136a) {
            case 0:
                Intent intent = (Intent) this.c;
                Context context = (Context) this.d;
                boolean z = this.b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.e;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 == null) {
                        int iIntValue = 500;
                        if (intent.getExtras() != null) {
                            CloudMessage cloudMessage = new CloudMessage(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.b;
                                    executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new n950("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.b = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            executorUnconfigurableExecutorService.execute(new hf5(context, cloudMessage, countDownLatch, (byte) 13));
                            try {
                                iIntValue = ((Integer) Tasks.await(new ehf0(context).q(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e);
                            }
                            try {
                                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e2) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e2.toString()));
                            }
                        }
                        iA = iIntValue;
                        break;
                    } else {
                        iA = FirebaseInstanceIdReceiver.a(intent2);
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(iA);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
            case 1:
                a4x0 a4x0Var = (a4x0) this.e;
                gtw0 gtw0Var = a4x0Var.e;
                if (gtw0Var != null) {
                    a4x0Var.D1(gtw0Var, this.b ? null : (zzpl) this.d, (com.google.android.gms.measurement.internal.zzr) this.c);
                    a4x0Var.y1();
                    return;
                } else {
                    uuw0 uuw0Var = ((kxw0) a4x0Var.b).f;
                    kxw0.g(uuw0Var);
                    uuw0Var.g.a("Discarding data. Failed to set user property");
                    return;
                }
            case 2:
                a4x0 a4x0Var2 = (a4x0) this.e;
                gtw0 gtw0Var2 = a4x0Var2.e;
                if (gtw0Var2 != null) {
                    a4x0Var2.D1(gtw0Var2, this.b ? null : (zzbh) this.d, (com.google.android.gms.measurement.internal.zzr) this.c);
                    a4x0Var2.y1();
                    return;
                } else {
                    uuw0 uuw0Var2 = ((kxw0) a4x0Var2.b).f;
                    kxw0.g(uuw0Var2);
                    uuw0Var2.g.a("Discarding data. Failed to send event to service");
                    return;
                }
            default:
                a4x0 a4x0Var3 = (a4x0) this.e;
                gtw0 gtw0Var3 = a4x0Var3.e;
                if (gtw0Var3 != null) {
                    a4x0Var3.D1(gtw0Var3, this.b ? null : (zzah) this.d, (com.google.android.gms.measurement.internal.zzr) this.c);
                    a4x0Var3.y1();
                    return;
                } else {
                    uuw0 uuw0Var3 = ((kxw0) a4x0Var3.b).f;
                    kxw0.g(uuw0Var3);
                    uuw0Var3.g.a("Discarding data. Failed to send conditional user property to service");
                    return;
                }
        }
    }

    public /* synthetic */ ftw0(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f10136a = (byte) 0;
        this.c = intent;
        this.d = context;
        this.b = z;
        this.e = pendingResult;
    }

    public /* synthetic */ ftw0(a4x0 a4x0Var, com.google.android.gms.measurement.internal.zzr zzrVar, boolean z, AbstractSafeParcelable abstractSafeParcelable, byte b) {
        this.f10136a = b;
        this.c = zzrVar;
        this.b = z;
        this.d = abstractSafeParcelable;
        this.e = a4x0Var;
    }
}
