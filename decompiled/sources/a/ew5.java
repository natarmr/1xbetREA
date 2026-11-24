package a;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class ew5 extends po8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kie0 f8504a;
    public final /* synthetic */ iw5 b;

    public ew5(kie0 kie0Var, iw5 iw5Var) {
        this.f8504a = kie0Var;
        this.b = iw5Var;
    }

    @Override // a.po8
    public final void c(View view, int i) {
        ycm0 ziv0Var;
        if (i == 1 || i == 2) {
            return;
        }
        kie0 kie0Var = this.f8504a;
        if (i == 4 && kie0Var.f18333a == 3) {
            iw5 iw5Var = this.b;
            View viewQ0 = iw5Var.q0();
            WeakHashMap weakHashMap = rgu0.f30456a;
            xiv0 xiv0VarA = jgu0.a(viewQ0);
            if (xiv0VarA != null ? xiv0VarA.f40966a.u(8) : false) {
                Dialog dialog = iw5Var.S1;
                Window window = dialog != null ? dialog.getWindow() : null;
                if (window != null) {
                    ani0 ani0Var = new ani0(viewQ0);
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 35) {
                        ziv0Var = new bjv0(window, ani0Var);
                    } else if (i2 >= 30) {
                        ziv0Var = new ajv0(window, ani0Var);
                    } else {
                        ziv0Var = i2 >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
                    }
                    ziv0Var.s(8);
                }
                viewQ0.requestFocus();
            }
        }
        kie0Var.f18333a = i;
    }
}
