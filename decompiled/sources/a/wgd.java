package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Map;
import kotlin.Unit;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wgd implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39110a;

    public /* synthetic */ wgd(byte b) {
        this.f39110a = b;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        byte b = this.f39110a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        switch (b) {
            case 0:
                pm80 pm80Var = (pm80) obj;
                fet fetVar = (fet) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                pm80Var.getClass();
                ((o0x) obj2).getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? fetVar.g(pm80Var) : fetVar.i(pm80Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 131) != 130)) {
                    n0q n0qVar = o7k0.c;
                    zcl zclVar = qmk.f28987a;
                    j0x.b(pm80Var, "", lgb.J(n0qVar, vgg0.a(24.0f)), null, null, 0.0f, null, fetVar, 56 | (iIntValue & 14), 120);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                pm80 pm80Var2 = (pm80) obj;
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                pm80Var2.getClass();
                ((o0x) obj2).getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? fetVar2.g(pm80Var2) : fetVar2.i(pm80Var2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 131) != 130)) {
                    n0q n0qVar2 = o7k0.c;
                    zcl zclVar2 = qmk.f28987a;
                    j0x.b(pm80Var2, "", lgb.J(n0qVar2, vgg0.a(24.0f)), null, null, 0.0f, null, fetVar2, 56 | (iIntValue2 & 14), 120);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                pm80 pm80Var3 = (pm80) obj;
                fet fetVar3 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                pm80Var3.getClass();
                ((o0x) obj2).getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? fetVar3.g(pm80Var3) : fetVar3.i(pm80Var3) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 131) != 130)) {
                    j0x.b(pm80Var3, null, o7k0.c, null, gqw0.A, 0.0f, null, fetVar3, 25016 | (iIntValue3 & 14), 104);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                ((Boolean) obj2).getClass();
                ((Boolean) obj3).getClass();
                return Boolean.FALSE;
            case 4:
                long jLongValue = ((Long) obj).longValue();
                long jLongValue2 = ((Long) obj2).longValue();
                kfm kfmVar = (kfm) obj3;
                a4x a4xVar = (a4x) obj4;
                kfmVar.getClass();
                a4xVar.getClass();
                return new yem(jLongValue, jLongValue2, a4xVar, kfmVar);
            case 5:
                long jLongValue3 = ((Long) obj).longValue();
                long jLongValue4 = ((Long) obj2).longValue();
                lfm lfmVar = (lfm) obj3;
                a4x a4xVar2 = (a4x) obj4;
                lfmVar.getClass();
                a4xVar2.getClass();
                return new yem(jLongValue3, jLongValue4, a4xVar2, lfmVar);
            case 6:
                long jLongValue5 = ((Long) obj).longValue();
                long jLongValue6 = ((Long) obj2).longValue();
                kfm kfmVar2 = (kfm) obj3;
                a4x a4xVar3 = (a4x) obj4;
                kfmVar2.getClass();
                a4xVar3.getClass();
                return new zem(jLongValue5, jLongValue6, a4xVar3, kfmVar2);
            case 7:
                long jLongValue7 = ((Long) obj).longValue();
                long jLongValue8 = ((Long) obj2).longValue();
                lfm lfmVar2 = (lfm) obj3;
                a4x a4xVar4 = (a4x) obj4;
                lfmVar2.getClass();
                a4xVar4.getClass();
                return new zem(jLongValue7, jLongValue8, a4xVar4, lfmVar2);
            case 8:
                long jLongValue9 = ((Long) obj).longValue();
                long jLongValue10 = ((Long) obj2).longValue();
                kfm kfmVar3 = (kfm) obj3;
                a4x a4xVar5 = (a4x) obj4;
                kfmVar3.getClass();
                a4xVar5.getClass();
                return new afm(jLongValue9, jLongValue10, a4xVar5, kfmVar3);
            case 9:
                long jLongValue11 = ((Long) obj).longValue();
                long jLongValue12 = ((Long) obj2).longValue();
                lfm lfmVar3 = (lfm) obj3;
                a4x a4xVar6 = (a4x) obj4;
                lfmVar3.getClass();
                a4xVar6.getClass();
                return new afm(jLongValue11, jLongValue12, a4xVar6, lfmVar3);
            case 10:
                long jLongValue13 = ((Long) obj).longValue();
                long jLongValue14 = ((Long) obj2).longValue();
                kfm kfmVar4 = (kfm) obj3;
                a4x a4xVar7 = (a4x) obj4;
                kfmVar4.getClass();
                a4xVar7.getClass();
                return new bfm(jLongValue13, jLongValue14, a4xVar7, kfmVar4);
            case 11:
                long jLongValue15 = ((Long) obj).longValue();
                long jLongValue16 = ((Long) obj2).longValue();
                lfm lfmVar4 = (lfm) obj3;
                a4x a4xVar8 = (a4x) obj4;
                lfmVar4.getClass();
                a4xVar8.getClass();
                return new bfm(jLongValue15, jLongValue16, a4xVar8, lfmVar4);
            case 12:
                long jLongValue17 = ((Long) obj).longValue();
                long jLongValue18 = ((Long) obj2).longValue();
                kfm kfmVar5 = (kfm) obj3;
                a4x a4xVar9 = (a4x) obj4;
                kfmVar5.getClass();
                a4xVar9.getClass();
                return new bfm(jLongValue17, jLongValue18, a4xVar9, kfmVar5);
            case 13:
                long jLongValue19 = ((Long) obj).longValue();
                long jLongValue20 = ((Long) obj2).longValue();
                lfm lfmVar5 = (lfm) obj3;
                a4x a4xVar10 = (a4x) obj4;
                lfmVar5.getClass();
                a4xVar10.getClass();
                return new bfm(jLongValue19, jLongValue20, a4xVar10, lfmVar5);
            case 14:
                ((Integer) obj).getClass();
                ((Boolean) obj2).getClass();
                ((Boolean) obj3).getClass();
                ((Boolean) obj4).getClass();
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                fet fetVar4 = (fet) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 129) != 128)) {
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarS = o7k0.s(o7k0.e(s5x0.L(jm40Var, 0.0f, 4.0f, 1), 40.0f), 80.0f);
                    zcl zclVar4 = qmk.m;
                    ugg0 ugg0Var = vgg0.f37379a;
                    zq8.a(0, fetVar4, xbc.c0(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarS), vbc.d0(null, fetVar4, 0, 1)));
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                fet fetVar5 = (fet) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 129) != 128)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar5, 0);
                    int iHashCode = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM = fetVar5.m();
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarC0 = kbc.c0(fetVar5, jm40Var2);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC0, gqw0.v);
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(jm40Var2, 48.0f);
                    zcl zclVar6 = qmk.m;
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    zq8.a(0, fetVar5, xbc.c0(h97.e(zclVar6, zclVar6, zclVar6, zclVar6, mm40VarN), vbc.d0(null, fetVar5, 0, 1)));
                    dw9.x(h97.e(zclVar6, zclVar6, zclVar6, zclVar6, o7k0.s(o7k0.e(s5x0.N(jm40Var2, 0.0f, 4.0f, 0.0f, 8.0f, 5), 12.0f), 48.0f)), vbc.d0(null, fetVar5, 0, 1), fetVar5, 0, true);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 17:
                String str = (String) obj2;
                fet fetVar6 = (fet) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                str.getClass();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= fetVar6.g(str) ? 32 : 16;
                }
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode2 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM2 = fetVar6.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar6, jm40Var);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, tj30VarC, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar6);
                    jpm0.o(fetVar6, mm40VarC1, gqw0.v);
                    long textPrimary = ((ThemeColors) fetVar6.k(zaq0.b)).getTextPrimary();
                    ((g1t0) fetVar6.k(j1t0.e)).getClass();
                    v8q0.a(str, null, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.w(), fetVar6, (iIntValue6 >> 3) & 14, 0, 131066);
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 18:
                String str2 = (String) obj2;
                fet fetVar7 = (fet) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                str2.getClass();
                if ((iIntValue7 & 48) == 0) {
                    iIntValue7 |= fetVar7.g(str2) ? 32 : 16;
                }
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 145) != 144)) {
                    tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                    int iHashCode3 = Long.hashCode(fetVar7.T);
                    bh90 bh90VarM3 = fetVar7.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar7, jm40Var);
                    mkd.c0.getClass();
                    fetVar7.i0();
                    if (fetVar7.S) {
                        fetVar7.l(pcyVar);
                    } else {
                        fetVar7.r0();
                    }
                    jpm0.o(fetVar7, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar7, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar7, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar7);
                    jpm0.o(fetVar7, mm40VarC2, gqw0.v);
                    long textPrimary2 = ((ThemeColors) fetVar7.k(zaq0.b)).getTextPrimary();
                    ((g1t0) fetVar7.k(j1t0.e)).getClass();
                    v8q0.a(str2, null, textPrimary2, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.w(), fetVar7, (iIntValue7 >> 3) & 14, 0, 131066);
                    fetVar7.r(true);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                fet fetVar8 = (fet) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                ((k8z) obj).getClass();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 129) != 128)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar7 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40VarD, 88.0f);
                    zcl zclVar8 = qmk.i;
                    ugg0 ugg0Var3 = vgg0.f37379a;
                    qxw.o(fetVar8, xbc.c0(h97.e(zclVar8, zclVar8, zclVar8, zclVar8, mm40VarE), vbc.d0(null, fetVar8, 0, 1)));
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 20:
                iom0.a((p4u0) obj, (Map) obj2, (fet) obj3, ((Integer) obj4).intValue() & 126);
                return Unit.f46060a;
            case 21:
                int iIntValue9 = ((Integer) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue10 & 48) == 0) {
                    iIntValue10 |= fetVar9.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar9.U(iIntValue10 & 1, (iIntValue10 & 145) != 144)) {
                    eeq.g(null, iIntValue9 % 2 > 0, fetVar9, 0, 1);
                    if (iIntValue9 < 2) {
                        fetVar9.e0(979940478);
                        zcl zclVar9 = qmk.f28987a;
                        mbc.o(zfi0.f44303a, s5x0.N(jm40.b, 64.0f, 0.0f, 0.0f, 0.0f, 14), false, fetVar9, 6, 4);
                        fetVar9.r(false);
                    } else {
                        fetVar9.e0(980158222);
                        fetVar9.r(false);
                    }
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                fet fetVar10 = (fet) obj3;
                int iIntValue11 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar10.U(iIntValue11 & 1, (iIntValue11 & 129) != 128)) {
                    zcl zclVar10 = qmk.f28987a;
                    rsr0.c(0, 0, fetVar10, s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 6.0f, 7));
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar11.U(iIntValue12 & 1, (iIntValue12 & 129) != 128)) {
                    ay3.G(0, fetVar11);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 24:
                j83 j83Var = (j83) obj2;
                fet fetVar12 = (fet) obj3;
                int iIntValue13 = ((Integer) obj4).intValue();
                ((yhg0) obj).getClass();
                j83Var.getClass();
                if ((iIntValue13 & 48) == 0) {
                    iIntValue13 |= fetVar12.g(j83Var) ? 32 : 16;
                }
                if (fetVar12.U(iIntValue13 & 1, (iIntValue13 & 145) != 144)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    ((g1t0) fetVar12.k(j1t0.e)).getClass();
                    v8q0.b(j83Var, mm40VarD2, ((StaticColors) fetVar12.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, idm0.v(0.7f, 4294967296L), new f2q0(3), 0L, 2, false, 2, 0, null, null, g1t0.g(), fetVar12, ((iIntValue13 >> 3) & 14) | 48, 24960, 240376);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                xdp0 xdp0Var = (xdp0) obj2;
                fet fetVar13 = (fet) obj3;
                int iIntValue14 = ((Integer) obj4).intValue();
                ((yhg0) obj).getClass();
                xdp0Var.getClass();
                if ((iIntValue14 & 48) == 0) {
                    iIntValue14 |= fetVar13.g(xdp0Var) ? 32 : 16;
                }
                if (fetVar13.U(iIntValue14 & 1, (iIntValue14 & 145) != 144)) {
                    wpm0.c(null, xdp0Var, null, fetVar13, iIntValue14 & 112, 5);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                xdp0 xdp0Var2 = (xdp0) obj2;
                fet fetVar14 = (fet) obj3;
                int iIntValue15 = ((Integer) obj4).intValue();
                ((y5d) obj).getClass();
                xdp0Var2.getClass();
                if ((iIntValue15 & 48) == 0) {
                    iIntValue15 |= fetVar14.g(xdp0Var2) ? 32 : 16;
                }
                if (fetVar14.U(iIntValue15 & 1, (iIntValue15 & 145) != 144)) {
                    wpm0.c(null, xdp0Var2, null, fetVar14, iIntValue15 & 112, 5);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                mm40 mm40Var = (mm40) obj;
                xdr xdrVar = (xdr) obj2;
                fet fetVar15 = (fet) obj3;
                int iIntValue16 = ((Integer) obj4).intValue();
                mm40Var.getClass();
                xdrVar.getClass();
                if ((iIntValue16 & 6) == 0) {
                    i = iIntValue16 | (fetVar15.g(mm40Var) ? 4 : 2);
                } else {
                    i = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i |= fetVar15.i(xdrVar) ? 32 : 16;
                }
                if (fetVar15.U(i & 1, (i & 147) != 146)) {
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar15, 48);
                    int iHashCode4 = Long.hashCode(fetVar15.T);
                    bh90 bh90VarM4 = fetVar15.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar15, mm40Var);
                    mkd.c0.getClass();
                    fetVar15.i0();
                    if (fetVar15.S) {
                        fetVar15.l(pcyVar);
                    } else {
                        fetVar15.r0();
                    }
                    jpm0.o(fetVar15, thg0VarA, gqw0.x);
                    jpm0.o(fetVar15, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar15, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar15);
                    w6x.v(i & 112, xdrVar, o7k0.c(ohs0.i(fetVar15, mm40VarC3, gqw0.v, 1.0f, true), 1.0f), fetVar15, true);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                mm40 mm40Var2 = (mm40) obj;
                xdr xdrVar2 = (xdr) obj2;
                fet fetVar16 = (fet) obj3;
                int iIntValue17 = ((Integer) obj4).intValue();
                mm40Var2.getClass();
                xdrVar2.getClass();
                if ((iIntValue17 & 6) == 0) {
                    i2 = iIntValue17 | (fetVar16.g(mm40Var2) ? 4 : 2);
                } else {
                    i2 = iIntValue17;
                }
                if ((iIntValue17 & 48) == 0) {
                    i2 |= fetVar16.i(xdrVar2) ? 32 : 16;
                }
                if (fetVar16.U(i2 & 1, (i2 & 147) != 146)) {
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar16, 48);
                    int iHashCode5 = Long.hashCode(fetVar16.T);
                    bh90 bh90VarM5 = fetVar16.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar16, mm40Var2);
                    mkd.c0.getClass();
                    fetVar16.i0();
                    if (fetVar16.S) {
                        fetVar16.l(pcyVar);
                    } else {
                        fetVar16.r0();
                    }
                    jpm0.o(fetVar16, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar16, bh90VarM5, gqw0.w);
                    jpm0.o(fetVar16, Integer.valueOf(iHashCode5), gqw0.y);
                    jpm0.n(fetVar16);
                    w6x.v(i2 & 112, xdrVar2, o7k0.c(ohs0.i(fetVar16, mm40VarC4, gqw0.v, 1.0f, true), 1.0f), fetVar16, true);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            default:
                kc90 kc90Var = (kc90) obj2;
                fet fetVar17 = (fet) obj3;
                int iIntValue18 = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                kc90Var.getClass();
                if ((iIntValue18 & 48) == 0) {
                    iIntValue18 |= fetVar17.g(kc90Var) ? 32 : 16;
                }
                if (!fetVar17.U(iIntValue18 & 1, (iIntValue18 & 145) != 144)) {
                    fetVar17.X();
                } else if (kc90Var instanceof ac90) {
                    fetVar17.e0(1280595136);
                    zcl zclVar11 = qmk.f28987a;
                    ac90 ac90Var = (ac90) kc90Var;
                    mm40 mm40VarS2 = i120.S(o7k0.n(jm40Var, 18.0f), 1.0f, ac90Var.b, vgg0.f37379a);
                    tj30 tj30VarC3 = zq8.c(gqw0.e, false);
                    int iHashCode6 = Long.hashCode(fetVar17.T);
                    bh90 bh90VarM6 = fetVar17.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar17, mm40VarS2);
                    mkd.c0.getClass();
                    fetVar17.i0();
                    if (fetVar17.S) {
                        fetVar17.l(pcyVar);
                    } else {
                        fetVar17.r0();
                    }
                    jpm0.o(fetVar17, tj30VarC3, gqw0.x);
                    jpm0.o(fetVar17, bh90VarM6, gqw0.w);
                    jpm0.o(fetVar17, Integer.valueOf(iHashCode6), gqw0.y);
                    jpm0.n(fetVar17);
                    jpm0.o(fetVar17, mm40VarC5, gqw0.v);
                    v8q0.a(ac90Var.c, o7k0.d(jm40Var, 1.0f), ac90Var.b, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar17, 48, 0, 130040);
                    fetVar17.r(true);
                    fetVar17.r(false);
                } else {
                    if (!(kc90Var instanceof fc90)) {
                        throw b1j.f(1703875741, fetVar17, false);
                    }
                    fetVar17.e0(1281291179);
                    zcl zclVar12 = qmk.f28987a;
                    j0x.b(iom0.r(jpm0.t(((fc90) kc90Var).b, 6, fetVar17), fetVar17), null, o7k0.n(jm40Var, 18.0f), null, null, 0.0f, null, fetVar17, 56, 120);
                    fetVar17.r(false);
                }
                return Unit.f46060a;
        }
    }
}
