package a;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class ojn extends tjn {
    @Override // a.tjn
    public void b(c9o0 c9o0Var, c9o0 c9o0Var2, Window window, View view, boolean z, boolean z2) {
        ycm0 ziv0Var;
        c9o0Var.getClass();
        c9o0Var2.getClass();
        window.getClass();
        view.getClass();
        bcm0.x(window, false);
        window.setStatusBarColor(z ? c9o0Var.b : c9o0Var.f3972a);
        window.setNavigationBarColor(z2 ? c9o0Var2.b : c9o0Var2.f3972a);
        ani0 ani0Var = new ani0(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            ziv0Var = new bjv0(window, ani0Var);
        } else if (i >= 30) {
            ziv0Var = new ajv0(window, ani0Var);
        } else {
            ziv0Var = i >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
        }
        ziv0Var.w(!z);
        ziv0Var.v(!z2);
    }
}
