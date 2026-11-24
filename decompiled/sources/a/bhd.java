package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.championships.list.presentation.CyberChampsMainParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bhd implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2600a;

    public /* synthetic */ bhd(byte b) {
        this.f2600a = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f2600a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    m7x.g(0, fetVar);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                oje ojeVar = (oje) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(ojeVar) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    zq8.a(0, fetVar2, i120.Q(o7k0.e(o7k0.d(s5x0.L(jm40Var, 0.0f, qje.g, 1), 1.0f), qje.f), ojeVar.c, jd8.n));
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    qxw.o(fetVar3, o7k0.e(jm40Var, 4.0f));
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                ajg ajgVar = (ajg) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ajgVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(ajgVar) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    eeq.s((CyberChampsMainParams) fetVar4.k(jgg.f16477a), ajgVar.f974a, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                hbo0 hbo0Var = (hbo0) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                hbo0Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar5.g(hbo0Var) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    vbc.n(hbo0Var.f12779a, hbo0Var.b, fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    qxw.o(fetVar6, o7k0.e(jm40Var, 6.0f));
                } else {
                    fetVar6.X();
                }
                break;
            case 6:
                mm40 mm40Var = (mm40) obj;
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                mm40Var.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar7.g(mm40Var) ? 4 : 2;
                }
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    mbc.o(zfi0.f44303a, mm40Var, false, fetVar7, ((iIntValue7 << 3) & 112) | 6, 4);
                } else {
                    fetVar7.X();
                }
                break;
            case 7:
                lr8 lr8Var = (lr8) obj;
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                lr8Var.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar8.g(lr8Var) ? 4 : 2;
                }
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    float fD = lr8Var.d();
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar8, 0);
                    int iHashCode = Long.hashCode(fetVar8.T);
                    bh90 bh90VarM = fetVar8.m();
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarC0 = kbc.c0(fetVar8, jm40Var2);
                    mkd.c0.getClass();
                    fetVar8.i0();
                    if (fetVar8.S) {
                        fetVar8.l(pcyVar);
                    } else {
                        fetVar8.r0();
                    }
                    jpm0.o(fetVar8, thg0VarA, gqw0.x);
                    jpm0.o(fetVar8, bh90VarM, gqw0.w);
                    jpm0.o(fetVar8, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar8);
                    jpm0.o(fetVar8, mm40VarC0, gqw0.v);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarS = o7k0.s(o7k0.e(s5x0.N(jm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14), 80.0f), fD * 0.9f);
                    zcl zclVar4 = qmk.i;
                    ugg0 ugg0Var = vgg0.f37379a;
                    zq8.a(0, fetVar8, xbc.c0(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarS), vbc.d0(null, fetVar8, 0, 1)));
                    dw9.x(lgb.J(o7k0.d(o7k0.e(s5x0.N(jm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14), 80.0f), 1.0f), new ayf()), vbc.d0(null, fetVar8, 0, 1), fetVar8, 0, true);
                } else {
                    fetVar8.X();
                }
                break;
            case 8:
                lr8 lr8Var2 = (lr8) obj;
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                lr8Var2.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar9.g(lr8Var2) ? 4 : 2;
                }
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    float fD2 = lr8Var2.d() * 0.59375f;
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40VarD, fD2 + 148.0f);
                    zcl zclVar6 = qmk.k;
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    zq8.a(0, fetVar9, xbc.c0(h97.e(zclVar6, zclVar6, zclVar6, zclVar6, mm40VarE), vbc.d0(null, fetVar9, 0, 1)));
                } else {
                    fetVar9.X();
                }
                break;
            case 9:
                hol holVar = (hol) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                holVar.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= (iIntValue10 & 8) == 0 ? fetVar10.g(holVar) : fetVar10.i(holVar) ? 4 : 2;
                }
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    zfn zfnVar = m8m0.f21378a;
                    holVar.f13398a = new y3d(((StaticColors) fetVar10.k(zfnVar)).m123getWhite0d7_KjU());
                    holVar.c = new y3d(((StaticColors) fetVar10.k(zfnVar)).m123getWhite0d7_KjU());
                } else {
                    fetVar10.X();
                }
                break;
            case 10:
                hol holVar2 = (hol) obj;
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                holVar2.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= (iIntValue11 & 8) == 0 ? fetVar11.g(holVar2) : fetVar11.i(holVar2) ? 4 : 2;
                }
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    zfn zfnVar2 = m8m0.f21378a;
                    holVar2.f13398a = new y3d(((StaticColors) fetVar11.k(zfnVar2)).m123getWhite0d7_KjU());
                    holVar2.c = new y3d(((StaticColors) fetVar11.k(zfnVar2)).m123getWhite0d7_KjU());
                } else {
                    fetVar11.X();
                }
                break;
            case 11:
                r5m r5mVar = (r5m) obj;
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                r5mVar.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= fetVar12.g(r5mVar) ? 4 : 2;
                }
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    bkb.b(r5mVar, fetVar12, iIntValue12 & 14);
                } else {
                    fetVar12.X();
                }
                break;
            case 12:
                e6m e6mVar = (e6m) obj;
                fet fetVar13 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= fetVar13.g(e6mVar) ? 4 : 2;
                }
                if (!fetVar13.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    fetVar13.X();
                } else if (e6mVar == null) {
                    fetVar13.e0(-1721078255);
                    fetVar13.r(false);
                } else {
                    fetVar13.e0(-1721078254);
                    zcl zclVar7 = qmk.f28987a;
                    ckb.I(s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13), e6mVar, fetVar13, 0);
                    fetVar13.r(false);
                }
                break;
            case 13:
                u5m u5mVar = (u5m) obj;
                fet fetVar14 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                u5mVar.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= fetVar14.g(u5mVar) ? 4 : 2;
                }
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar8 = qmk.f28987a;
                    thb.m(s5x0.N(mm40VarD2, 0.0f, 8.0f, 0.0f, 0.0f, 13), u5mVar.f, fetVar14, 0);
                } else {
                    fetVar14.X();
                }
                break;
            case 14:
                u5m u5mVar2 = (u5m) obj;
                fet fetVar15 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                u5mVar2.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= fetVar15.g(u5mVar2) ? 4 : 2;
                }
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar15, 48);
                    int iHashCode2 = Long.hashCode(fetVar15.T);
                    bh90 bh90VarM2 = fetVar15.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar15, mm40VarD3);
                    mkd.c0.getClass();
                    fetVar15.i0();
                    if (fetVar15.S) {
                        fetVar15.l(pcyVar);
                    } else {
                        fetVar15.r0();
                    }
                    jpm0.o(fetVar15, x5dVarA, gqw0.x);
                    jpm0.o(fetVar15, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar15, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar15);
                    jpm0.o(fetVar15, mm40VarC1, gqw0.v);
                    e6m e6mVar2 = u5mVar2.e;
                    lgb.r(e6mVar2, e6mVar2 != null, cfx0.h, fetVar15, 384);
                    f5m f5mVar = u5mVar2.f;
                    lgb.r(u5mVar2, (f5mVar.f8968a == null && f5mVar.b == null) ? false : true, cfx0.i, fetVar15, (iIntValue15 & 14) | 384);
                    fetVar15.r(true);
                } else {
                    fetVar15.X();
                }
                break;
            case 15:
                String str = (String) obj;
                fet fetVar16 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= fetVar16.g(str) ? 4 : 2;
                }
                if (!fetVar16.U(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    fetVar16.X();
                } else if (str == null) {
                    fetVar16.e0(-606089276);
                    fetVar16.r(false);
                } else {
                    fetVar16.e0(-606089275);
                    mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar9 = qmk.f28987a;
                    kkb.E(0, fetVar16, s5x0.N(mm40VarD4, 0.0f, 0.0f, 0.0f, 8.0f, 7), str);
                    fetVar16.r(false);
                }
                break;
            case 16:
                String str2 = (String) obj;
                fet fetVar17 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= fetVar17.g(str2) ? 4 : 2;
                }
                if (!fetVar17.U(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    fetVar17.X();
                } else if (str2 == null) {
                    fetVar17.e0(1392995562);
                    fetVar17.r(false);
                } else {
                    fetVar17.e0(1392995563);
                    mm40 mm40VarD5 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar10 = qmk.f28987a;
                    kkb.E(0, fetVar17, s5x0.N(mm40VarD5, 0.0f, 0.0f, 0.0f, 8.0f, 7), str2);
                    fetVar17.r(false);
                }
                break;
            case 17:
                a4x a4xVar = (a4x) obj;
                fet fetVar18 = (fet) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                a4xVar.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= fetVar18.g(a4xVar) ? 4 : 2;
                }
                if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    xkb.m((iIntValue18 << 3) & 112, fetVar18, a4xVar, null);
                } else {
                    fetVar18.X();
                }
                break;
            case 18:
                fet fetVar19 = (fet) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar19.U(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    zcl zclVar11 = qmk.f28987a;
                    v8q0.a(rsm0.w(R.string.auto_sub_description, 0, fetVar19), s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar19), fetVar19, 0, 0, 131068);
                } else {
                    fetVar19.X();
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fet fetVar20 = (fet) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar20.U(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    zcl zclVar12 = qmk.f28987a;
                    wwb.i(s5x0.N(jm40.b, 0.0f, 24.0f, 0.0f, 8.0f, 5), rsm0.w(R.string.clear, 0, fetVar20), 0L, 0, 0L, fetVar20, 0, 28);
                } else {
                    fetVar20.X();
                }
                break;
            case 20:
                fet fetVar21 = (fet) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((vdo0) obj).getClass();
                if (fetVar21.U(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    gq80.Y(0, fetVar21);
                } else {
                    fetVar21.X();
                }
                break;
            case 21:
                fet fetVar22 = (fet) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((vj60) obj).getClass();
                if (fetVar22.U(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    xdx.f(0, fetVar22);
                } else {
                    fetVar22.X();
                }
                break;
            case 22:
                y5d y5dVar = (y5d) obj;
                fet fetVar23 = (fet) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if ((iIntValue23 & 6) == 0) {
                    iIntValue23 |= fetVar23.g(y5dVar) ? 4 : 2;
                }
                if (fetVar23.U(iIntValue23 & 1, (iIntValue23 & 19) != 18)) {
                    mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar13 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA, 0.0f, 28.0f, 0.0f, 16.0f, 5), rsm0.w(R.string.bet_type, 0, fetVar23), 0L, 0, 0L, fetVar23, 0, 28);
                } else {
                    fetVar23.X();
                }
                break;
            case 23:
                fet fetVar24 = (fet) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar24.U(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    mm40 mm40VarD6 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar14 = qmk.f28987a;
                    mm40 mm40VarJ = s5x0.J(mm40VarD6, 24.0f);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode3 = Long.hashCode(fetVar24.T);
                    bh90 bh90VarM3 = fetVar24.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar24, mm40VarJ);
                    mkd.c0.getClass();
                    fetVar24.i0();
                    if (fetVar24.S) {
                        fetVar24.l(pcyVar);
                    } else {
                        fetVar24.r0();
                    }
                    jpm0.o(fetVar24, tj30VarC, gqw0.x);
                    jpm0.o(fetVar24, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar24, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar24);
                    jpm0.o(fetVar24, mm40VarC2, gqw0.v);
                    p3c0.a(o7k0.n(jm40Var, 24.0f), ((ThemeColors) fetVar24.k(zaq0.b)).getSecondary60(), 2.0f, 0L, 0, 0.0f, fetVar24, 0, 56);
                    fetVar24.r(true);
                } else {
                    fetVar24.X();
                }
                break;
            case 24:
                fet fetVar25 = (fet) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar25.U(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    zcl zclVar15 = qmk.f28987a;
                    qxw.o(fetVar25, o7k0.e(jm40Var, 12.0f));
                } else {
                    fetVar25.X();
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fet fetVar26 = (fet) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar26.U(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    mm40 mm40VarD7 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar16 = qmk.f28987a;
                    slb.n(s5x0.N(mm40VarD7, 0.0f, 12.0f, 0.0f, 0.0f, 13), rsm0.w(R.string.chose_sport_type, 0, fetVar26), null, null, null, false, null, new ojm(127), null, null, fetVar26, 1797504, 768);
                } else {
                    fetVar26.X();
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fet fetVar27 = (fet) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar27.U(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    slb.n(o7k0.d(jm40Var, 1.0f), rsm0.w(R.string.chose_outcome_type, 0, fetVar27), null, null, null, false, null, new ojm(127), null, null, fetVar27, 1797510, 768);
                } else {
                    fetVar27.X();
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                y5d y5dVar2 = (y5d) obj;
                fet fetVar28 = (fet) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                y5dVar2.getClass();
                if ((iIntValue28 & 6) == 0) {
                    iIntValue28 |= fetVar28.g(y5dVar2) ? 4 : 2;
                }
                if (fetVar28.U(iIntValue28 & 1, (iIntValue28 & 19) != 18)) {
                    mm40 mm40VarA2 = y5dVar2.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar17 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA2, 0.0f, 24.0f, 0.0f, 0.0f, 13), rsm0.w(R.string.time_before_start_events, 0, fetVar28), 0L, 0, 0L, fetVar28, 0, 28);
                } else {
                    fetVar28.X();
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                y5d y5dVar3 = (y5d) obj;
                fet fetVar29 = (fet) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                y5dVar3.getClass();
                if ((iIntValue29 & 6) == 0) {
                    iIntValue29 |= fetVar29.g(y5dVar3) ? 4 : 2;
                }
                if (fetVar29.U(iIntValue29 & 1, (iIntValue29 & 19) != 18)) {
                    mm40 mm40VarA3 = y5dVar3.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar18 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA3, 0.0f, 24.0f, 0.0f, 0.0f, 13), rsm0.w(R.string.type_coupon, 0, fetVar29), 0L, 0, 0L, fetVar29, 0, 28);
                } else {
                    fetVar29.X();
                }
                break;
            default:
                y5d y5dVar4 = (y5d) obj;
                fet fetVar30 = (fet) obj2;
                int iIntValue30 = ((Integer) obj3).intValue();
                y5dVar4.getClass();
                if ((iIntValue30 & 6) == 0) {
                    iIntValue30 |= fetVar30.g(y5dVar4) ? 4 : 2;
                }
                if (fetVar30.U(iIntValue30 & 1, (iIntValue30 & 19) != 18)) {
                    mm40 mm40VarA4 = y5dVar4.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar19 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA4, 0.0f, 24.0f, 0.0f, 0.0f, 13), rsm0.w(R.string.hide_history_for_new, 0, fetVar30), 0L, 0, 0L, fetVar30, 0, 28);
                } else {
                    fetVar30.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
