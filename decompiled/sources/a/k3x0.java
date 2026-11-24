package a;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class k3x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17641a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k3x0(t3x0 t3x0Var, Parcelable parcelable, byte b) {
        this.f17641a = b;
        this.b = parcelable;
        this.c = t3x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = 10;
        switch (this.f17641a) {
            case 0:
                ((t3x0) this.c).c.w1((ComponentName) this.b);
                return;
            case 1:
                f8x0 f8x0Var = (f8x0) this.c;
                d6x0 d6x0Var = (d6x0) this.b;
                int i = f8x0Var.f9130a;
                synchronized (d6x0Var) {
                    SparseArray sparseArray = d6x0Var.e;
                    f8x0 f8x0Var2 = (f8x0) sparseArray.get(i);
                    if (f8x0Var2 != null) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("Timing out request: ");
                        sb.append(i);
                        Log.w("MessengerIpcClient", sb.toString());
                        sparseArray.remove(i);
                        f8x0Var2.c(new c44("Timed out waiting for response", null, (byte) 20));
                        d6x0Var.d();
                    }
                    break;
                }
                return;
            case 2:
                a4x0 a4x0Var = ((t3x0) this.c).c;
                a4x0Var.e = null;
                if (((ConnectionResult) this.b).b != 7777) {
                    a4x0Var.A1();
                    return;
                }
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = a4x0Var.h;
                if (scheduledExecutorServiceNewScheduledThreadPool == null) {
                    scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
                    a4x0Var.h = scheduledExecutorServiceNewScheduledThreadPool;
                }
                scheduledExecutorServiceNewScheduledThreadPool.schedule(new fju0(this, b), ((Long) btw0.Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
                return;
            case 3:
                drm0 drm0Var = (drm0) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
                ((h4x0) ((Service) drm0Var.f6568a)).b(jobParameters);
                return;
            default:
                Context context = ((c1x0) this.b).b;
                wcf0 wcf0Var = pfw.q;
                if (wcf0Var == null) {
                    synchronized (pfw.p) {
                        wcf0Var = pfw.q;
                        if (wcf0Var == null) {
                            zz2 zz2VarA = wcf0.a();
                            try {
                                String[] list = context.getAssets().list("phenotype");
                                if (list != null) {
                                    for (String str : list) {
                                        if (str.endsWith("_package_metadata.binarypb")) {
                                            try {
                                                AssetManager assets = context.getAssets();
                                                StringBuilder sb2 = new StringBuilder(str.length() + 10);
                                                sb2.append("phenotype/");
                                                sb2.append(str);
                                                InputStream inputStreamOpen = assets.open(sb2.toString());
                                                try {
                                                    bew0 bew0Var = bew0.b;
                                                    int i2 = ldw0.f19874a;
                                                    pfw pfwVar = new pfw(context, z6x0.t(inputStreamOpen, bew0.c));
                                                    zz2VarA.A(pfwVar.b, pfwVar);
                                                    if (inputStreamOpen != null) {
                                                        inputStreamOpen.close();
                                                    }
                                                } catch (Throwable th) {
                                                    if (inputStreamOpen != null) {
                                                        try {
                                                            inputStreamOpen.close();
                                                        } catch (Throwable th2) {
                                                            th.addSuppressed(th2);
                                                        }
                                                        break;
                                                    }
                                                    throw th;
                                                }
                                            } catch (zew0 e) {
                                                StringBuilder sb3 = new StringBuilder(str.length() + 45);
                                                sb3.append("Unable to read Phenotype PackageMetadata for ");
                                                sb3.append(str);
                                                Log.e("PackageInfo", sb3.toString(), e);
                                            }
                                        }
                                    }
                                }
                            } catch (IOException e2) {
                                Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e2);
                            }
                            wcf0 wcf0VarE = zz2VarA.e(true);
                            pfw.q = wcf0VarE;
                            wcf0Var = wcf0VarE;
                        }
                    }
                }
                String str2 = (String) this.c;
                if (wcf0Var.containsKey(str2)) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(str2.length() + 173);
                sb4.append("Config package ");
                sb4.append(str2);
                sb4.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                Log.e("FilePhenotypeFlags", sb4.toString());
                return;
        }
    }

    public /* synthetic */ k3x0(Object obj, Object obj2, byte b) {
        this.f17641a = b;
        this.b = obj;
        this.c = obj2;
    }
}
