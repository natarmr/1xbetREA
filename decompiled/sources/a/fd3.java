package a;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fd3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9339a;
    public final /* synthetic */ Context b;

    public /* synthetic */ fd3(Context context, byte b) {
        this.f9339a = b;
        this.b = context;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    @Override // java.lang.Runnable
    public final void run() {
        ss00 ss00VarC;
        Object systemService;
        Context contextI;
        byte b = this.f9339a;
        Context context = this.b;
        switch (b) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i >= 33) {
                            lx3 lx3Var = hd3.g;
                            lx3Var.getClass();
                            bx3 bx3Var = new bx3(lx3Var);
                            while (true) {
                                if (bx3Var.hasNext()) {
                                    hd3 hd3Var = (hd3) ((WeakReference) bx3Var.next()).get();
                                    if (hd3Var != null && (contextI = hd3Var.i()) != null) {
                                        systemService = contextI.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                ss00VarC = ss00.c(f7.q(systemService));
                            } else {
                                ss00VarC = ss00.b;
                            }
                        } else {
                            ss00VarC = hd3.c;
                            if (ss00VarC == null) {
                                ss00VarC = ss00.b;
                            }
                        }
                        if (ss00VarC.b()) {
                            String strJ0 = jd8.j0(context);
                            Object systemService2 = context.getSystemService("locale");
                            if (systemService2 != null) {
                                f7.s(systemService2, LocaleList.forLanguageTags(strJ0));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                hd3.f = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new fd3(context, (byte) 2));
                break;
            default:
                t2c0.b(context, new ew3((byte) 1), t2c0.f33208a, false);
                break;
        }
    }
}
