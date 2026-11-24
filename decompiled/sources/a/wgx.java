package a;

import android.gov.nist.core.Separators;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wgx implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39138a;
    public final /* synthetic */ ygx b;

    public /* synthetic */ wgx(ygx ygxVar, byte b) {
        this.f39138a = b;
        this.b = ygxVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f39138a;
        cl5 cl5Var = ukd.f35823a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        ygx ygxVar = this.b;
        switch (b) {
            case 0:
                y5d y5dVar = (y5d) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(y5dVar) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    zcl zclVar = qmk.f28987a;
                    d7x.c(y5dVar, s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), this.b, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar, iIntValue & 14, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    v8q0.a(ua80.e(ygxVar.f, Separators.LPAREN, Separators.RPAREN), s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar2, 0, 0, 131064);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(yhg0Var) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    g7x.e(yhg0Var, null, ygxVar.c, ygxVar.g, fetVar3, iIntValue3 & 14, 1);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    zcl zclVar3 = qmk.f28987a;
                    pzw.j(o7k0.n(jm40Var, 20.0f), ygxVar.e, ((ThemeColors) fetVar4.k(zaq0.b)).getPrimary(), fetVar4);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                y5d y5dVar2 = (y5d) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                y5dVar2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar5.g(y5dVar2) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    zcl zclVar4 = qmk.f28987a;
                    d7x.c(y5dVar2, s5x0.N(jm40.b, 0.0f, 4.0f, 16.0f, 0.0f, 9), this.b, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar5, iIntValue5 & 14, 0);
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    zcl zclVar5 = qmk.f28987a;
                    v8q0.a(ua80.e(ygxVar.f, Separators.LPAREN, Separators.RPAREN), s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), ((ThemeColors) fetVar6.k(zaq0.b)).getSecondary(), null, qmk.r, null, null, j1t0.c, 0L, null, 0L, 0, false, 0, 0, null, null, fetVar6, 0, 0, 261992);
                } else {
                    fetVar6.X();
                }
                break;
            case 6:
                yhg0 yhg0Var2 = (yhg0) obj;
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                yhg0Var2.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar7.g(yhg0Var2) ? 4 : 2;
                }
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    g7x.e(yhg0Var2, null, ygxVar.c, ygxVar.g, fetVar7, iIntValue7 & 14, 1);
                } else {
                    fetVar7.X();
                }
                break;
            case 7:
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    zfn zfnVar = zaq0.b;
                    long background = ((ThemeColors) fetVar8.k(zfnVar)).getBackground();
                    zcl zclVar6 = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(jm40Var, 30.0f);
                    boolean zF = fetVar8.f(background);
                    Object objP = fetVar8.P();
                    if (zF || objP == cl5Var) {
                        objP = new dls((byte) 11, background);
                        fetVar8.o0(objP);
                    }
                    mm40 mm40VarK = rq8.K(mm40VarN, (Function1) objP);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar8.T);
                    bh90 bh90VarM = fetVar8.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar8, mm40VarK);
                    mkd.c0.getClass();
                    fetVar8.i0();
                    if (fetVar8.S) {
                        fetVar8.l(pcyVar);
                    } else {
                        fetVar8.r0();
                    }
                    jpm0.o(fetVar8, tj30VarC, gqw0.x);
                    jpm0.o(fetVar8, bh90VarM, gqw0.w);
                    jpm0.o(fetVar8, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar8);
                    jpm0.o(fetVar8, mm40VarC0, gqw0.v);
                    pzw.j(o7k0.n(jm40Var, 20.0f), ygxVar.e, ((ThemeColors) fetVar8.k(zfnVar)).getPrimary(), fetVar8);
                    fetVar8.r(true);
                } else {
                    fetVar8.X();
                }
                break;
            case 8:
                y5d y5dVar3 = (y5d) obj;
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                y5dVar3.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar9.g(y5dVar3) ? 4 : 2;
                }
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    d7x.c(y5dVar3, null, this.b, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar9, iIntValue9 & 14, 1);
                } else {
                    fetVar9.X();
                }
                break;
            case 9:
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    zcl zclVar7 = qmk.f28987a;
                    tdc.e(new rpe(ygxVar.f), new fpe(null, false, 3), s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), fetVar10, 0, 0);
                } else {
                    fetVar10.X();
                }
                break;
            case 10:
                yhg0 yhg0Var3 = (yhg0) obj;
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                yhg0Var3.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= fetVar11.g(yhg0Var3) ? 4 : 2;
                }
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    g7x.e(yhg0Var3, null, ygxVar.c, ygxVar.g, fetVar11, iIntValue11 & 14, 1);
                } else {
                    fetVar11.X();
                }
                break;
            case 11:
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    zcl zclVar8 = qmk.f28987a;
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
                    pzw.j(o7k0.n(jm40Var, 20.0f), ygxVar.e, ((ThemeColors) fetVar12.k(zaq0.b)).getSecondary(), fetVar12);
                    fetVar12.r(true);
                } else {
                    fetVar12.X();
                }
                break;
            case 12:
                y5d y5dVar4 = (y5d) obj;
                fet fetVar13 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                y5dVar4.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= fetVar13.g(y5dVar4) ? 4 : 2;
                }
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    zcl zclVar9 = qmk.f28987a;
                    d7x.c(y5dVar4, s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), this.b, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar13, iIntValue13 & 14, 0);
                } else {
                    fetVar13.X();
                }
                break;
            case 13:
                fet fetVar14 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    zcl zclVar10 = qmk.f28987a;
                    tdc.e(new rpe(ygxVar.f), new fpe(null, false, 3), s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), fetVar14, 0, 0);
                } else {
                    fetVar14.X();
                }
                break;
            case 14:
                yhg0 yhg0Var4 = (yhg0) obj;
                fet fetVar15 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                yhg0Var4.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= fetVar15.g(yhg0Var4) ? 4 : 2;
                }
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    g7x.e(yhg0Var4, null, ygxVar.c, ygxVar.g, fetVar15, iIntValue15 & 14, 1);
                } else {
                    fetVar15.X();
                }
                break;
            default:
                fet fetVar16 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    zfn zfnVar2 = zaq0.b;
                    long background2 = ((ThemeColors) fetVar16.k(zfnVar2)).getBackground();
                    zcl zclVar11 = qmk.f28987a;
                    mm40 mm40VarN3 = o7k0.n(jm40Var, 28.0f);
                    boolean zF2 = fetVar16.f(background2);
                    Object objP2 = fetVar16.P();
                    if (zF2 || objP2 == cl5Var) {
                        objP2 = new dls((byte) 12, background2);
                        fetVar16.o0(objP2);
                    }
                    mm40 mm40VarK2 = rq8.K(mm40VarN3, (Function1) objP2);
                    tj30 tj30VarC3 = zq8.c(gqw0.e, false);
                    int iHashCode3 = Long.hashCode(fetVar16.T);
                    bh90 bh90VarM3 = fetVar16.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar16, mm40VarK2);
                    mkd.c0.getClass();
                    fetVar16.i0();
                    if (fetVar16.S) {
                        fetVar16.l(pcyVar);
                    } else {
                        fetVar16.r0();
                    }
                    jpm0.o(fetVar16, tj30VarC3, gqw0.x);
                    jpm0.o(fetVar16, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar16, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar16);
                    jpm0.o(fetVar16, mm40VarC2, gqw0.v);
                    pzw.j(o7k0.n(jm40Var, 20.0f), ygxVar.e, ((ThemeColors) fetVar16.k(zfnVar2)).getSecondary(), fetVar16);
                    fetVar16.r(true);
                } else {
                    fetVar16.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
