package a;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xiv0 {
    public static final xiv0 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uiv0 f40966a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = siv0.x;
        } else if (i >= 30) {
            b = qiv0.w;
        } else {
            b = uiv0.b;
        }
    }

    public xiv0(xiv0 xiv0Var) {
        if (xiv0Var == null) {
            this.f40966a = new uiv0(this);
            return;
        }
        uiv0 uiv0Var = xiv0Var.f40966a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (uiv0Var instanceof tiv0)) {
            this.f40966a = new tiv0(this, (tiv0) uiv0Var);
        } else if (i >= 34 && (uiv0Var instanceof siv0)) {
            this.f40966a = new siv0(this, (siv0) uiv0Var);
        } else if (i >= 31 && (uiv0Var instanceof riv0)) {
            this.f40966a = new riv0(this, (riv0) uiv0Var);
        } else if (i >= 30 && (uiv0Var instanceof qiv0)) {
            this.f40966a = new qiv0(this, (qiv0) uiv0Var);
        } else if (i >= 29 && (uiv0Var instanceof piv0)) {
            this.f40966a = new piv0(this, (piv0) uiv0Var);
        } else if (i >= 28 && (uiv0Var instanceof oiv0)) {
            this.f40966a = new oiv0(this, (oiv0) uiv0Var);
        } else if (uiv0Var instanceof niv0) {
            this.f40966a = new niv0(this, (niv0) uiv0Var);
        } else if (uiv0Var instanceof miv0) {
            this.f40966a = new miv0(this, (miv0) uiv0Var);
        } else {
            this.f40966a = new uiv0(this);
        }
        uiv0Var.e(this);
    }

    public static pfx e(pfx pfxVar, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, pfxVar.f26926a - i);
        int iMax2 = Math.max(0, pfxVar.b - i2);
        int iMax3 = Math.max(0, pfxVar.c - i3);
        int iMax4 = Math.max(0, pfxVar.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? pfxVar : pfx.c(iMax, iMax2, iMax3, iMax4);
    }

    public static xiv0 h(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        xiv0 xiv0Var = new xiv0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = rgu0.f30456a;
            xiv0 xiv0VarA = jgu0.a(view);
            uiv0 uiv0Var = xiv0Var.f40966a;
            uiv0Var.y(xiv0VarA);
            View rootView = view.getRootView();
            uiv0Var.d(rootView);
            uiv0Var.p(rootView);
            uiv0Var.q();
            uiv0Var.A(view.getWindowSystemUiVisibility());
        }
        return xiv0Var;
    }

    public final int a() {
        return this.f40966a.n().d;
    }

    public final int b() {
        return this.f40966a.n().f26926a;
    }

    public final int c() {
        return this.f40966a.n().c;
    }

    public final int d() {
        return this.f40966a.n().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xiv0) {
            return Objects.equals(this.f40966a, ((xiv0) obj).f40966a);
        }
        return false;
    }

    public final xiv0 f(int i, int i2, int i3, int i4) {
        liv0 fiv0Var;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            fiv0Var = new kiv0(this);
        } else if (i5 >= 35) {
            fiv0Var = new jiv0(this);
        } else if (i5 >= 34) {
            fiv0Var = new iiv0(this);
        } else if (i5 >= 31) {
            fiv0Var = new hiv0(this);
        } else if (i5 >= 30) {
            fiv0Var = new giv0(this);
        } else {
            fiv0Var = i5 >= 29 ? new fiv0(this) : new eiv0(this);
        }
        fiv0Var.h(pfx.c(i, i2, i3, i4));
        return fiv0Var.b();
    }

    public final WindowInsets g() {
        uiv0 uiv0Var = this.f40966a;
        if (uiv0Var instanceof miv0) {
            return ((miv0) uiv0Var).c;
        }
        return null;
    }

    public final int hashCode() {
        uiv0 uiv0Var = this.f40966a;
        if (uiv0Var == null) {
            return 0;
        }
        return uiv0Var.hashCode();
    }

    public xiv0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f40966a = new tiv0(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.f40966a = new siv0(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.f40966a = new riv0(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f40966a = new qiv0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f40966a = new piv0(this, windowInsets);
        } else if (i >= 28) {
            this.f40966a = new oiv0(this, windowInsets);
        } else {
            this.f40966a = new niv0(this, windowInsets);
        }
    }
}
