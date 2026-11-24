package a;

import kotlin.Metadata;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.presentation.dialog.bet_summary.BetsSummaryInfoUiModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/jv7;", "La/iw5;", "<init>", "()V", "a/kl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jv7 extends iw5 {
    public final khf0 k2 = new khf0("BETS_SUMMARY_INFO");
    public static final /* synthetic */ iiy[] m2 = {new ez40(jv7.class, "betsSummaryInfoUiModel", "getBetsSummaryInfoUiModel()Lorg/xplatform/bet_history/history/presentation/dialog/bet_summary/BetsSummaryInfoUiModel;", 0)};
    public static final kl5 l2 = new kl5();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-1219745577);
        final byte b = 1;
        final byte b2 = 0;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-777244984, new xdr(this) { // from class: a.iv7
            public final /* synthetic */ jv7 b;

            {
                this.b = this;
            }

            @Override // a.xdr
            public final Object F(Object obj, Object obj2, Object obj3) {
                byte b3 = b2;
                jm40 jm40Var = jm40.b;
                jv7 jv7Var = this.b;
                switch (b3) {
                    case 0:
                        y5d y5dVar = (y5d) obj;
                        fet fetVar2 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        kl5 kl5Var = jv7.l2;
                        y5dVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar2.g(y5dVar) ? 4 : 2;
                        }
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                            mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                            zcl zclVar = qmk.f28987a;
                            wwb.i(s5x0.N(mm40VarA, 0.0f, 24.0f, 0.0f, 0.0f, 13), rsm0.w(R.string.dialog_bet_info_title, 0, fetVar2), 0L, 0, 0L, fetVar2, 0, 28);
                            mm40 mm40VarL = s5x0.L(o7k0.d(jm40Var, 1.0f), 0.0f, 8.0f, 1);
                            String str = ((BetsSummaryInfoUiModel) jv7Var.k2.n(jv7Var, jv7.m2[0])).f46396a;
                            ((g1t0) fetVar2.k(j1t0.e)).getClass();
                            v8q0.a(str, mm40VarL, 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 2, 0, null, ibm0.n(g1t0.k(), fetVar2), fetVar2, 0, 24576, 113660);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        kl5 kl5Var2 = jv7.l2;
                        ((y5d) obj).getClass();
                        if (fetVar3.U(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                            ccq0.c(jm40Var, (BetsSummaryInfoUiModel) jv7Var.k2.n(jv7Var, jv7.m2[0]), fetVar3, 70);
                        } else {
                            fetVar3.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), (ugd) null, u1c.M(409732358, new xdr(this) { // from class: a.iv7
            public final /* synthetic */ jv7 b;

            {
                this.b = this;
            }

            @Override // a.xdr
            public final Object F(Object obj, Object obj2, Object obj3) {
                byte b3 = b;
                jm40 jm40Var = jm40.b;
                jv7 jv7Var = this.b;
                switch (b3) {
                    case 0:
                        y5d y5dVar = (y5d) obj;
                        fet fetVar2 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        kl5 kl5Var = jv7.l2;
                        y5dVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar2.g(y5dVar) ? 4 : 2;
                        }
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                            mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                            zcl zclVar = qmk.f28987a;
                            wwb.i(s5x0.N(mm40VarA, 0.0f, 24.0f, 0.0f, 0.0f, 13), rsm0.w(R.string.dialog_bet_info_title, 0, fetVar2), 0L, 0, 0L, fetVar2, 0, 28);
                            mm40 mm40VarL = s5x0.L(o7k0.d(jm40Var, 1.0f), 0.0f, 8.0f, 1);
                            String str = ((BetsSummaryInfoUiModel) jv7Var.k2.n(jv7Var, jv7.m2[0])).f46396a;
                            ((g1t0) fetVar2.k(j1t0.e)).getClass();
                            v8q0.a(str, mm40VarL, 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 2, 0, null, ibm0.n(g1t0.k(), fetVar2), fetVar2, 0, 24576, 113660);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        kl5 kl5Var2 = jv7.l2;
                        ((y5d) obj).getClass();
                        if (fetVar3.U(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                            ccq0.c(jm40Var, (BetsSummaryInfoUiModel) jv7Var.k2.n(jv7Var, jv7.m2[0]), fetVar3, 70);
                        } else {
                            fetVar3.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }
}
