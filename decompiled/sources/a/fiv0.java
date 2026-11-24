package a;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class fiv0 extends liv0 {
    public final WindowInsets.Builder e;

    public fiv0(xiv0 xiv0Var) {
        super(xiv0Var);
        WindowInsets windowInsetsG = xiv0Var.g();
        this.e = windowInsetsG != null ? i8q0.g(windowInsetsG) : i8q0.f();
    }

    @Override // a.liv0
    public xiv0 b() {
        a();
        xiv0 xiv0VarH = xiv0.h(this.e.build(), null);
        pfx[] pfxVarArr = this.b;
        uiv0 uiv0Var = xiv0VarH.f40966a;
        uiv0Var.w(pfxVarArr);
        uiv0Var.v(null);
        uiv0Var.B(this.c);
        uiv0Var.C(this.d);
        return xiv0VarH;
    }

    @Override // a.liv0
    public void e(pfx pfxVar) {
        this.e.setMandatorySystemGestureInsets(pfxVar.e());
    }

    @Override // a.liv0
    public void f(pfx pfxVar) {
        this.e.setStableInsets(pfxVar.e());
    }

    @Override // a.liv0
    public void g(pfx pfxVar) {
        this.e.setSystemGestureInsets(pfxVar.e());
    }

    @Override // a.liv0
    public void h(pfx pfxVar) {
        this.e.setSystemWindowInsets(pfxVar.e());
    }

    @Override // a.liv0
    public void i(pfx pfxVar) {
        this.e.setTappableElementInsets(pfxVar.e());
    }

    public fiv0() {
        this.e = i8q0.f();
    }
}
