package a;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class egx extends oyc implements zf60 {
    public boolean c;
    public View d;
    public xiv0 e;

    @Override // a.oyc
    public final void f(div0 div0Var) {
        if (!this.c || (div0Var.f6156a.d() & 8) == 0) {
            return;
        }
        this.c = false;
        View view = this.d;
        xiv0 xiv0Var = this.e;
        if (xiv0Var == null || view == null) {
            return;
        }
        rgu0.b(view, xiv0Var);
    }

    @Override // a.oyc
    public final void g(div0 div0Var) {
        if ((div0Var.f6156a.d() & 8) != 0) {
            this.c = true;
        }
    }

    @Override // a.zf60
    public final xiv0 l(View view, xiv0 xiv0Var) {
        uiv0 uiv0Var = xiv0Var.f40966a;
        view.getClass();
        this.d = view;
        this.e = xiv0Var;
        pfx pfxVarI = uiv0Var.i(this.c ? 519 : 527);
        pfxVarI.getClass();
        view.setPadding(pfxVarI.f26926a, pfxVarI.b, pfxVarI.c, pfxVarI.d - uiv0Var.i(2).d);
        xiv0 xiv0Var2 = xiv0.b;
        xiv0Var2.getClass();
        return xiv0Var2;
    }
}
