package a;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mye implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22600a;
    public final /* synthetic */ rye b;

    public /* synthetic */ mye(rye ryeVar, byte b) {
        this.f22600a = b;
        this.b = ryeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f22600a;
        xb50 xb50Var = xb50.f40585a;
        rye ryeVar = this.b;
        switch (b) {
            case 0:
                kwd kwdVar = rye.S1;
                h620 h620VarH0 = ryeVar.H0();
                h620VarH0.F.c("coupon");
                h620VarH0.E.i("coupon");
                p7m0 p7m0Var = h620VarH0.V;
                p7m0Var.getClass();
                p7m0Var.o(null, xb50Var);
                break;
            case 1:
                kwd kwdVar2 = rye.S1;
                h620 h620VarH1 = ryeVar.H0();
                h620VarH1.F.c("coupon");
                h620VarH1.E.i("coupon");
                p7m0 p7m0Var2 = h620VarH1.V;
                p7m0Var2.getClass();
                p7m0Var2.o(null, xb50Var);
                break;
            default:
                kwd kwdVar3 = rye.S1;
                h620 h620VarH2 = ryeVar.H0();
                h620VarH2.Q.f(k7k.RegularCoupon);
                l7k l7kVar = h620VarH2.R;
                y1p y1pVar = y1p.MAIN;
                l7kVar.b("regular_coupon", h620VarH2.S.g());
                sac.V(jiu0.a(h620VarH2), new p520(h620VarH2, (byte) 3), null, h620VarH2.c.f22085a, new cm10(h620VarH2, null), 10);
                break;
        }
    }
}
