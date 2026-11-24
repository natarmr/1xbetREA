package a;

import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rj7 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30578a;
    public final /* synthetic */ tj7 b;

    public /* synthetic */ rj7(tj7 tj7Var, byte b) {
        this.f30578a = b;
        this.b = tj7Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f30578a;
        tj7 tj7Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                gl5 gl5Var = tj7.t2;
                ((g9z) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    String strW = rsm0.w(R.string.bet_coupon_will_sold_at, 0, fetVar);
                    pn40 pn40Var = pn40.f27267a;
                    chf0 chf0Var = tj7Var.r2;
                    iiy[] iiyVarArr = tj7.u2;
                    hp4.c(mm40VarN, new f3w("autoSaleSum", strW, pn40.c(chf0Var.n(tj7Var, iiyVarArr[5]).doubleValue(), p3u0.c), tj7Var.o2.n(tj7Var, iiyVarArr[2]), e3w.f7156a), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                y5d y5dVar = (y5d) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                gl5 gl5Var2 = tj7.t2;
                y5dVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(y5dVar) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    mm40 mm40VarA = y5dVar.a(o7k0.d(jm40.b, 1.0f), gqw0.n);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(mm40VarA, 0.0f, 24.0f, 0.0f, 0.0f, 13);
                    String string = tj7Var.G().getString(tj7Var.s2.n(tj7Var, tj7.u2[6]).booleanValue() ? R.string.confirm_autosale_title : R.string.confirm_sale_title);
                    string.getClass();
                    wwb.i(mm40VarN2, string, 0L, 0, 0L, fetVar2, 0, 28);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                gl5 gl5Var3 = tj7.t2;
                ((g9z) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN3 = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    String strW2 = rsm0.w(R.string.history_bet_value_will_reduced, 0, fetVar3);
                    pn40 pn40Var2 = pn40.f27267a;
                    chf0 chf0Var2 = tj7Var.p2;
                    iiy[] iiyVarArr2 = tj7.u2;
                    hp4.c(mm40VarN3, new f3w("downGradeBet", strW2, pn40.c(chf0Var2.n(tj7Var, iiyVarArr2[3]).doubleValue(), p3u0.c), tj7Var.o2.n(tj7Var, iiyVarArr2[2]), e3w.f7156a), fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
