package a;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class vo8 extends po8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f37753a;
    public final xiv0 b;
    public Window c;
    public boolean d;

    public vo8(View view, xiv0 xiv0Var) {
        this.b = xiv0Var;
        ki30 ki30Var = BottomSheetBehavior.E(view).j;
        ColorStateList backgroundTintList = ki30Var != null ? ki30Var.b.c : view.getBackgroundTintList();
        if (backgroundTintList != null) {
            this.f37753a = Boolean.valueOf(d7x.D(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList colorStateListF = plc.F(view.getBackground());
        Integer numValueOf = colorStateListF != null ? Integer.valueOf(colorStateListF.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.f37753a = Boolean.valueOf(d7x.D(numValueOf.intValue()));
        } else {
            this.f37753a = null;
        }
    }

    @Override // a.po8
    public final void a(View view) {
        d(view);
    }

    @Override // a.po8
    public final void b(View view, float f) {
        d(view);
    }

    @Override // a.po8
    public final void c(View view, int i) {
        d(view);
    }

    public final void d(View view) {
        ycm0 ziv0Var;
        ycm0 ziv0Var2;
        int top = view.getTop();
        xiv0 xiv0Var = this.b;
        if (top < xiv0Var.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.f37753a;
                boolean zBooleanValue = bool == null ? this.d : bool.booleanValue();
                ani0 ani0Var = new ani0(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                if (i >= 35) {
                    ziv0Var2 = new bjv0(window, ani0Var);
                } else if (i >= 30) {
                    ziv0Var2 = new ajv0(window, ani0Var);
                } else {
                    ziv0Var2 = i >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
                }
                ziv0Var2.w(zBooleanValue);
            }
            view.setPadding(view.getPaddingLeft(), xiv0Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                boolean z = this.d;
                ani0 ani0Var2 = new ani0(window2.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 35) {
                    ziv0Var = new bjv0(window2, ani0Var2);
                } else if (i2 >= 30) {
                    ziv0Var = new ajv0(window2, ani0Var2);
                } else {
                    ziv0Var = i2 >= 26 ? new ziv0(window2, ani0Var2) : new yiv0(window2, ani0Var2);
                }
                ziv0Var.w(z);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            this.d = new cjv0(window, window.getDecorView()).f4478a.u();
        }
    }
}
