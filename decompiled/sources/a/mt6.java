package a;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mt6 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22356a;
    public final /* synthetic */ st6 b;

    public /* synthetic */ mt6(st6 st6Var, byte b) {
        this.f22356a = b;
        this.b = st6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f22356a;
        xd20 xd20Var = xd20.f40677a;
        yje yjeVar = null;
        st6 st6Var = this.b;
        switch (b) {
            case 0:
                yk5 yk5Var = st6.R1;
                rg20 rg20VarH0 = st6Var.H0();
                rg20VarH0.u.c("bet_constructor");
                rg20VarH0.r.i("bet_constructor");
                p7m0 p7m0Var = rg20VarH0.N;
                p7m0Var.getClass();
                p7m0Var.o(null, xd20Var);
                break;
            case 1:
                yk5 yk5Var2 = st6.R1;
                rg20 rg20VarH1 = st6Var.H0();
                rg20VarH1.u.c("bet_constructor");
                rg20VarH1.r.i("bet_constructor");
                p7m0 p7m0Var2 = rg20VarH1.N;
                p7m0Var2.getClass();
                p7m0Var2.o(null, xd20Var);
                break;
            default:
                yk5 yk5Var3 = st6.R1;
                rg20 rg20VarH2 = st6Var.H0();
                rg20VarH2.v.f(k7k.BetConstructor);
                l7k l7kVar = rg20VarH2.w;
                y1p y1pVar = y1p.MAIN;
                l7kVar.b("bet_constructor", rg20VarH2.E.g());
                sac.V(jiu0.a(rg20VarH2), new hd20(rg20VarH2, (byte) 0), null, rg20VarH2.o.f22085a, new v620(rg20VarH2, yjeVar, (byte) 23), 10);
                break;
        }
    }
}
