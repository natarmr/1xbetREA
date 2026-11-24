package a;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bze implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3463a;
    public final /* synthetic */ gze b;

    public /* synthetic */ bze(gze gzeVar, byte b) {
        this.f3463a = b;
        this.b = gzeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f3463a;
        xb50 xb50Var = xb50.f40585a;
        yje yjeVar = null;
        gze gzeVar = this.b;
        switch (b) {
            case 0:
                usd usdVar = gze.S1;
                qg20 qg20VarI0 = gzeVar.I0();
                qg20VarI0.r0.c("coupon");
                qg20VarI0.s0.i("coupon");
                p7m0 p7m0Var = qg20VarI0.b1;
                p7m0Var.getClass();
                p7m0Var.o(null, xb50Var);
                break;
            case 1:
                usd usdVar2 = gze.S1;
                qg20 qg20VarI1 = gzeVar.I0();
                qg20VarI1.r0.c("coupon");
                qg20VarI1.s0.i("coupon");
                p7m0 p7m0Var2 = qg20VarI1.b1;
                p7m0Var2.getClass();
                p7m0Var2.o(null, xb50Var);
                break;
            default:
                usd usdVar3 = gze.S1;
                qg20 qg20VarI2 = gzeVar.I0();
                qg20VarI2.I0.f(k7k.RegularCoupon);
                l7k l7kVar = qg20VarI2.J0;
                y1p y1pVar = y1p.MAIN;
                l7kVar.b("regular_coupon", qg20VarI2.K0.g());
                sac.V(jiu0.a(qg20VarI2), new cd20(qg20VarI2, (byte) 4), null, qg20VarI2.d.f22085a, new v620(qg20VarI2, yjeVar, (byte) 22), 10);
                break;
        }
    }
}
