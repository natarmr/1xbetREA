package a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import java.io.IOException;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hp2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13421a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hp2(pmi0 pmi0Var, IOException iOException, boolean z) {
        this.f13421a = (byte) 4;
        this.c = pmi0Var;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f13421a;
        cjv0 cjv0Var = null;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((ip2) obj).f15142a.d(z);
                break;
            case 1:
                qlo qloVar = (qlo) ((xex) obj).b;
                String str = vtt0.f38024a;
                ulo uloVar = qloVar.f28944a;
                if (uloVar.c0 != z) {
                    uloVar.c0 = z;
                    uloVar.m.e(23, new mlo((byte) 1, z));
                    break;
                }
                break;
            case 2:
                ((q0a) obj).c.d(z);
                break;
            case 3:
                cwj cwjVar = (cwj) ((md3) obj).b;
                cwjVar.b = z;
                if (cwjVar.f5083a) {
                    Handler handler = (Handler) cwjVar.e;
                    handler.removeCallbacksAndMessages(null);
                    if (cwjVar.b) {
                        handler.postDelayed((z7a) cwjVar.f, 300000L);
                    }
                }
                break;
            case 4:
                hru hruVar = (hru) ((jrs0) ((pmi0) obj).f27236a).f;
                hruVar.getClass();
                xaw xawVar = (xaw) hruVar.f13549a;
                x0x.K(xawVar.k);
                if (z && xawVar.m == null) {
                    xawVar.f();
                    break;
                }
                break;
            case 5:
                View view = (View) obj;
                if (z) {
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    if (Build.VERSION.SDK_INT >= 30) {
                        cjv0Var = ogu0.c(view);
                    } else {
                        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                            if (context instanceof Activity) {
                                Window window = ((Activity) context).getWindow();
                                if (window != null) {
                                    cjv0Var = new cjv0(window, view);
                                }
                            }
                        }
                    }
                    if (cjv0Var != null) {
                        cjv0Var.d(8);
                    }
                }
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
            default:
                ((x3w0) obj).b.invoke(Boolean.valueOf(z));
                break;
        }
    }

    public /* synthetic */ hp2(Object obj, boolean z, byte b) {
        this.f13421a = b;
        this.c = obj;
        this.b = z;
    }
}
