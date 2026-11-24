package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zk1 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44506a;
    public final /* synthetic */ cl1 b;

    public /* synthetic */ zk1(cl1 cl1Var, byte b) {
        this.f44506a = b;
        this.b = cl1Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f44506a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        cl1 cl1Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                gfk0 gfk0Var = cl1.o2;
                ((g9z) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarD = o7k0.d(s5x0.N(jm40.b, 0.0f, 20.0f, 0.0f, 0.0f, 13), 1.0f);
                    String strH = cl1Var.H(R.string.how_to_earn_points_tournaments);
                    strH.getClass();
                    kkb.m(mm40VarD, strH, null, 5, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), 0L, fetVar, 0, 36);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                gfk0 gfk0Var2 = cl1.o2;
                ((ir8) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    vtb.t(null, qqm.b, null, 0L, fetVar2, 48, 13);
                    zcl zclVar2 = qmk.f28987a;
                    byte b3 = 2;
                    mm40 mm40VarD2 = o7k0.d(s5x0.L(jm40Var, 16.0f, 0.0f, 2), 1.0f);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13);
                    lul lulVar = lul.e;
                    oe9 oe9Var = oe9.f25112a;
                    String strH2 = cl1Var.H(R.string.play_button);
                    strH2.getClass();
                    wul wulVar = new wul(lulVar, oe9Var, new ue9(strH2), true, false, true);
                    boolean zI = fetVar2.i(cl1Var);
                    Object objP = fetVar2.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zI || objP == cl5Var) {
                        objP = new yk1(cl1Var, b2);
                        fetVar2.o0(objP);
                    }
                    qzb.n(mm40VarN, wulVar, (Function0) objP, fetVar2, 0, 0);
                    mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 12.0f, 0.0f, 8.0f, 5);
                    nul nulVar = nul.e;
                    String strH3 = cl1Var.H(R.string.tournaments_more);
                    strH3.getClass();
                    wul wulVar2 = new wul(nulVar, oe9Var, new ue9(strH3), true, false, true);
                    boolean zI2 = fetVar2.i(cl1Var);
                    Object objP2 = fetVar2.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new yk1(cl1Var, b3);
                        fetVar2.o0(objP2);
                    }
                    qzb.n(mm40VarN2, wulVar2, (Function0) objP2, fetVar2, 0, 0);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                gfk0 gfk0Var3 = cl1.o2;
                ((g9z) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarM = s5x0.M(mm40VarD3, 16.0f, 20.0f, 16.0f, 12.0f);
                    thg0 thg0VarA = shg0.a(uc9.f, gqw0.j, fetVar3, 6);
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarM);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, thg0VarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                    cl1Var.Q0(R.drawable.ic_glyph_aggregator_alt, R.string.place_your_bets_tournaments, fetVar3, 0);
                    cl1Var.P0(0, fetVar3);
                    cl1Var.Q0(R.drawable.ic_glyph_bonus_info, R.string.earn_points_tournaments, fetVar3, 0);
                    cl1Var.P0(0, fetVar3);
                    cl1Var.Q0(R.drawable.ic_glyph_gift, R.string.qet_your_prize_tournaments, fetVar3, 0);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
