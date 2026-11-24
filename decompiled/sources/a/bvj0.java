package a;

import android.view.View;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bvj0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3281a = 1;
    public final /* synthetic */ kvj0 b;

    public /* synthetic */ bvj0(kvj0 kvj0Var) {
        this.b = kvj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f3281a;
        kvj0 kvj0Var = this.b;
        switch (b) {
            case 0:
                eke0 eke0Var = kvj0.S1;
                yxj0 yxj0VarM0 = kvj0Var.M0();
                yxj0VarM0.v.c("fin_bet");
                yxj0VarM0.u.i("fin_bet");
                p7m0 p7m0Var = yxj0VarM0.Y;
                vb50 vb50Var = new vb50(yxj0VarM0.T);
                p7m0Var.getClass();
                p7m0Var.o(null, vb50Var);
                break;
            default:
                eke0 eke0Var2 = kvj0.S1;
                yxj0 yxj0VarM1 = kvj0Var.M0();
                yxj0VarM1.P.f(k7k.FinBet);
                l7k l7kVar = yxj0VarM1.Q;
                y1p y1pVar = y1p.MAIN;
                l7kVar.b("fin_bet", yxj0VarM1.S.g());
                ql5 ql5VarD = yxj0VarM1.D();
                if (ql5VarD != null) {
                    ((kt2) yxj0VarM1.t.b).c("ev_place_bet_deposit");
                    yxj0VarM1.r.a(yxj0VarM1.z, true, ql5VarD.f28916a);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ bvj0(kvj0 kvj0Var, MakeBetBalanceViewDs makeBetBalanceViewDs) {
        this.b = kvj0Var;
    }
}
