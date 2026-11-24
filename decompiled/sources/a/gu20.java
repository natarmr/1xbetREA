package a;

import android.gov.nist.core.Separators;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gu20 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11910a;
    public final /* synthetic */ uv20 b;

    public /* synthetic */ gu20(uv20 uv20Var, byte b) {
        this.f11910a = b;
        this.b = uv20Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f11910a;
        cl5 cl5Var = ukd.f35823a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        byte b2 = 16;
        uv20 uv20Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    v8q0.a(ua80.e(uv20Var.e, Separators.LPAREN, Separators.RPAREN), s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 0, 131064);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(yhg0Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    zcl zclVar2 = qmk.f28987a;
                    g7x.e(yhg0Var, s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), uv20Var.b, uv20Var.i, fetVar2, iIntValue2 & 14, 0);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    zcl zclVar3 = qmk.f28987a;
                    pzw.j(o7k0.n(jm40Var, 20.0f), uv20Var.d, ((ThemeColors) fetVar3.k(zaq0.b)).getPrimary(), fetVar3);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    zcl zclVar4 = qmk.f28987a;
                    v8q0.a(ua80.e(uv20Var.e, Separators.LPAREN, Separators.RPAREN), s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, qmk.r, null, null, j1t0.c, 0L, null, 0L, 0, false, 0, 0, null, null, fetVar4, 0, 0, 261992);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                yhg0 yhg0Var2 = (yhg0) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                yhg0Var2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar5.g(yhg0Var2) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    zcl zclVar5 = qmk.f28987a;
                    g7x.e(yhg0Var2, s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), uv20Var.b, uv20Var.i, fetVar5, iIntValue5 & 14, 0);
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    zfn zfnVar = zaq0.b;
                    long background = ((ThemeColors) fetVar6.k(zfnVar)).getBackground();
                    zcl zclVar6 = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(jm40Var, 30.0f);
                    boolean zF = fetVar6.f(background);
                    Object objP = fetVar6.P();
                    if (zF || objP == cl5Var) {
                        objP = new dls(b2, background);
                        fetVar6.o0(objP);
                    }
                    mm40 mm40VarK = rq8.K(mm40VarN, (Function1) objP);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM = fetVar6.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar6, mm40VarK);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, tj30VarC, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar6);
                    jpm0.o(fetVar6, mm40VarC0, gqw0.v);
                    pzw.j(o7k0.n(jm40Var, 20.0f), uv20Var.d, ((ThemeColors) fetVar6.k(zfnVar)).getPrimary(), fetVar6);
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                break;
            case 6:
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    zcl zclVar7 = qmk.f28987a;
                    v8q0.a(ua80.e(uv20Var.e, Separators.LPAREN, Separators.RPAREN), s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), ((ThemeColors) fetVar7.k(zaq0.b)).getSecondary(), null, qmk.r, null, null, j1t0.c, 0L, null, 0L, 0, false, 0, 0, null, null, fetVar7, 0, 0, 261992);
                } else {
                    fetVar7.X();
                }
                break;
            case 7:
                yhg0 yhg0Var3 = (yhg0) obj;
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                yhg0Var3.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar8.g(yhg0Var3) ? 4 : 2;
                }
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    zcl zclVar8 = qmk.f28987a;
                    g7x.e(yhg0Var3, s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), uv20Var.b, uv20Var.i, fetVar8, iIntValue8 & 14, 0);
                } else {
                    fetVar8.X();
                }
                break;
            case 8:
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    zcl zclVar9 = qmk.f28987a;
                    pzw.j(o7k0.n(jm40Var, 20.0f), uv20Var.d, ((ThemeColors) fetVar9.k(zaq0.b)).getPrimary(), fetVar9);
                } else {
                    fetVar9.X();
                }
                break;
            case 9:
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    zcl zclVar10 = qmk.f28987a;
                    tdc.e(new rpe(uv20Var.e), new fpe(null, false, 3), s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), fetVar10, 0, 0);
                } else {
                    fetVar10.X();
                }
                break;
            case 10:
                yhg0 yhg0Var4 = (yhg0) obj;
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                yhg0Var4.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= fetVar11.g(yhg0Var4) ? 4 : 2;
                }
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    g7x.e(yhg0Var4, null, uv20Var.b, uv20Var.i, fetVar11, iIntValue11 & 14, 1);
                } else {
                    fetVar11.X();
                }
                break;
            case 11:
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    zcl zclVar11 = qmk.f28987a;
                    mm40 mm40VarN2 = o7k0.n(jm40Var, 28.0f);
                    tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                    int iHashCode2 = Long.hashCode(fetVar12.T);
                    bh90 bh90VarM2 = fetVar12.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar12, mm40VarN2);
                    mkd.c0.getClass();
                    fetVar12.i0();
                    if (fetVar12.S) {
                        fetVar12.l(pcyVar);
                    } else {
                        fetVar12.r0();
                    }
                    jpm0.o(fetVar12, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar12, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar12, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar12);
                    jpm0.o(fetVar12, mm40VarC1, gqw0.v);
                    pzw.j(o7k0.n(jm40Var, 20.0f), uv20Var.d, ((ThemeColors) fetVar12.k(zaq0.b)).getSecondary(), fetVar12);
                    fetVar12.r(true);
                } else {
                    fetVar12.X();
                }
                break;
            case 12:
                fet fetVar13 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    zcl zclVar12 = qmk.f28987a;
                    tdc.e(new rpe(uv20Var.e), new fpe(null, false, 3), s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), fetVar13, 0, 0);
                } else {
                    fetVar13.X();
                }
                break;
            case 13:
                yhg0 yhg0Var5 = (yhg0) obj;
                fet fetVar14 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                yhg0Var5.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= fetVar14.g(yhg0Var5) ? 4 : 2;
                }
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    g7x.e(yhg0Var5, null, uv20Var.b, uv20Var.i, fetVar14, iIntValue14 & 14, 1);
                } else {
                    fetVar14.X();
                }
                break;
            default:
                fet fetVar15 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    zfn zfnVar2 = zaq0.b;
                    long background2 = ((ThemeColors) fetVar15.k(zfnVar2)).getBackground();
                    zcl zclVar13 = qmk.f28987a;
                    mm40 mm40VarN3 = o7k0.n(jm40Var, 28.0f);
                    boolean zF2 = fetVar15.f(background2);
                    Object objP2 = fetVar15.P();
                    if (zF2 || objP2 == cl5Var) {
                        objP2 = new dls((byte) 21, background2);
                        fetVar15.o0(objP2);
                    }
                    mm40 mm40VarK2 = rq8.K(mm40VarN3, (Function1) objP2);
                    tj30 tj30VarC3 = zq8.c(gqw0.e, false);
                    int iHashCode3 = Long.hashCode(fetVar15.T);
                    bh90 bh90VarM3 = fetVar15.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar15, mm40VarK2);
                    mkd.c0.getClass();
                    fetVar15.i0();
                    if (fetVar15.S) {
                        fetVar15.l(pcyVar);
                    } else {
                        fetVar15.r0();
                    }
                    jpm0.o(fetVar15, tj30VarC3, gqw0.x);
                    jpm0.o(fetVar15, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar15, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar15);
                    jpm0.o(fetVar15, mm40VarC2, gqw0.v);
                    pzw.j(o7k0.n(jm40Var, 20.0f), uv20Var.d, ((ThemeColors) fetVar15.k(zfnVar2)).getSecondary(), fetVar15);
                    fetVar15.r(true);
                } else {
                    fetVar15.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
