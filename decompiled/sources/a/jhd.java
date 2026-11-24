package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jhd implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16520a;

    public /* synthetic */ jhd(byte b) {
        this.f16520a = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f16520a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        switch (b) {
            case 0:
                vwv vwvVar = (vwv) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                vwvVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(vwvVar) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    zcl zclVar = qmk.f28987a;
                    qbc.v(s5x0.K(mm40VarQ, 8.0f, 12.0f), vwvVar, fetVar, (iIntValue << 3) & 112);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    qxw.o(fetVar2, s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13));
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    zcl zclVar3 = qmk.f28987a;
                    qxw.o(fetVar3, s5x0.N(jm40.b, 0.0f, 2.0f, 0.0f, 0.0f, 13));
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                vwv vwvVar2 = (vwv) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                vwvVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(vwvVar2) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    mm40 mm40VarQ2 = i120.Q(jm40Var, ((ThemeColors) fetVar4.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    zcl zclVar4 = qmk.f28987a;
                    qbc.v(s5x0.L(mm40VarQ2, 0.0f, 8.0f, 1), vwvVar2, fetVar4, (iIntValue4 << 3) & 112);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    mbc.o(zfi0.f44303a, null, false, fetVar5, 6, 6);
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar5 = qmk.f28987a;
                    v8q0.a(rsm0.w(R.string.tennis_math_type_header, 0, fetVar6), s5x0.N(mm40VarD, 0.0f, 28.0f, 0.0f, 0.0f, 13), ((ThemeColors) fetVar6.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.t, null, j1t0.b, 0L, null, 0, 0, idm0.t(22), 16646109), fetVar6, 0, 0, 130040);
                } else {
                    fetVar6.X();
                }
                break;
            case 6:
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    nkb.h(jm40.b, new ijm(), kjm.b, null, null, null, fetVar7, 390, 56);
                } else {
                    fetVar7.X();
                }
                break;
            case 7:
                y5d y5dVar = (y5d) obj;
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar8.g(y5dVar) ? 4 : 2;
                }
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var2, 1.0f), gqw0.n);
                    zcl zclVar6 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA, 0.0f, 28.0f, 0.0f, 8.0f, 5), rsm0.w(R.string.role_title, 0, fetVar8), 0L, 0, 0L, fetVar8, 0, 28);
                    mbc.o(zfi0.f44303a, s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7), false, fetVar8, 6, 4);
                } else {
                    fetVar8.X();
                }
                break;
            case 8:
                long jLongValue = ((Long) obj).longValue();
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar9.f(jLongValue) ? 4 : 2;
                }
                if (!fetVar9.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    fetVar9.X();
                } else if (jLongValue > 0) {
                    fetVar9.e0(-811781873);
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    String str = String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jLongValue / 60), Long.valueOf(jLongValue % 60)}, 2));
                    ((g1t0) fetVar9.k(j1t0.e)).getClass();
                    v8q0.a(str, mm40VarD2, ((StaticColors) fetVar9.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar9, 48, 24960, 109560);
                    fetVar9.r(false);
                } else {
                    fetVar9.e0(-811424071);
                    fetVar9.r(false);
                }
                break;
            case 9:
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    zcl zclVar7 = qmk.f28987a;
                    qxw.o(fetVar10, o7k0.e(jm40Var, 32.0f));
                } else {
                    fetVar10.X();
                }
                break;
            case 10:
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    zcl zclVar8 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(jm40Var, 0.0f, 8.0f, 1);
                    lak0 lak0Var = lak0.c;
                    Object objP = fetVar11.P();
                    if (objP == ukd.f35823a) {
                        objP = new chd((byte) 28);
                        fetVar11.o0(objP);
                    }
                    etl.e(mm40VarL, lak0Var, cq5.f4775a, true, null, 0.0f, 0, null, (Function2) objP, fetVar11, 100666800, 240);
                } else {
                    fetVar11.X();
                }
                break;
            case 11:
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    zcl zclVar9 = qmk.f28987a;
                    qxw.o(fetVar12, o7k0.e(jm40Var, 32.0f));
                } else {
                    fetVar12.X();
                }
                break;
            case 12:
                fet fetVar13 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    zcl zclVar10 = qmk.f28987a;
                    qxw.o(fetVar13, o7k0.e(jm40Var, 32.0f));
                } else {
                    fetVar13.X();
                }
                break;
            case 13:
                fet fetVar14 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    y860.O(0, fetVar14, null);
                } else {
                    fetVar14.X();
                }
                break;
            case 14:
                fet fetVar15 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    zcl zclVar11 = qmk.f28987a;
                    qxw.o(fetVar15, o7k0.e(jm40Var, 32.0f));
                } else {
                    fetVar15.X();
                }
                break;
            case 15:
                fet fetVar16 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    m7x.g(0, fetVar16);
                } else {
                    fetVar16.X();
                }
                break;
            case 16:
                fet fetVar17 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    jiq0.w(0, fetVar17);
                } else {
                    fetVar17.X();
                }
                break;
            case 17:
                hol holVar = (hol) obj;
                fet fetVar18 = (fet) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                holVar.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= (iIntValue18 & 8) == 0 ? fetVar18.g(holVar) : fetVar18.i(holVar) ? 4 : 2;
                }
                if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    zfn zfnVar = zaq0.b;
                    holVar.f13398a = new y3d(((ThemeColors) fetVar18.k(zfnVar)).getSecondary40());
                    holVar.c = new y3d(((ThemeColors) fetVar18.k(zfnVar)).getSecondary40());
                    holVar.b = new y3d(((ThemeColors) fetVar18.k(zfnVar)).getSecondary40());
                } else {
                    fetVar18.X();
                }
                break;
            case 18:
                ir8 ir8Var = (ir8) obj;
                fet fetVar19 = (fet) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ir8Var.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= fetVar19.g(ir8Var) ? 4 : 2;
                }
                if (fetVar19.U(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    mm40 mm40VarA2 = ir8Var.a(jm40Var);
                    zcl zclVar12 = qmk.f28987a;
                    mm40 mm40VarJ = lgb.J(mm40VarA2, vgg0.a(10.0f));
                    pz40 pz40Var = s6t0.f31722a;
                    mm40 mm40VarQ3 = i120.Q(mm40VarJ, s6t0.b().f33626a.getPrimary10(), jd8.n);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar19.T);
                    bh90 bh90VarM = fetVar19.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar19, mm40VarQ3);
                    mkd.c0.getClass();
                    fetVar19.i0();
                    if (fetVar19.S) {
                        fetVar19.l(pcyVar);
                    } else {
                        fetVar19.r0();
                    }
                    jpm0.o(fetVar19, tj30VarC, gqw0.x);
                    jpm0.o(fetVar19, bh90VarM, gqw0.w);
                    jpm0.o(fetVar19, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar19);
                    jpm0.o(fetVar19, mm40VarC0, gqw0.v);
                    dww.c(a8k0.F(R.drawable.glyph_plus_rounded_square, 0, fetVar19), null, o7k0.n(jm40Var, 24.0f), s6t0.b().f33626a.getPrimary(), fetVar19, 56, 0);
                    fetVar19.r(true);
                } else {
                    fetVar19.X();
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fet fetVar20 = (fet) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((cco0) obj).getClass();
                if (fetVar20.U(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    ffb0.A(0, fetVar20);
                } else {
                    fetVar20.X();
                }
                break;
            case 20:
                fet fetVar21 = (fet) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar21.U(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar13 = qmk.f28987a;
                    mm40 mm40VarJ2 = s5x0.J(mm40VarD3, 24.0f);
                    tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                    int iHashCode2 = Long.hashCode(fetVar21.T);
                    bh90 bh90VarM2 = fetVar21.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar21, mm40VarJ2);
                    mkd.c0.getClass();
                    fetVar21.i0();
                    if (fetVar21.S) {
                        fetVar21.l(pcyVar);
                    } else {
                        fetVar21.r0();
                    }
                    jpm0.o(fetVar21, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar21, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar21, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar21);
                    jpm0.o(fetVar21, mm40VarC1, gqw0.v);
                    p3c0.a(null, ((ThemeColors) fetVar21.k(zaq0.b)).getSecondary60(), 4.0f, 0L, 0, 0.0f, fetVar21, 0, 57);
                    fetVar21.r(true);
                } else {
                    fetVar21.X();
                }
                break;
            case 21:
                y5d y5dVar2 = (y5d) obj;
                fet fetVar22 = (fet) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                y5dVar2.getClass();
                if ((iIntValue22 & 6) == 0) {
                    iIntValue22 |= fetVar22.g(y5dVar2) ? 4 : 2;
                }
                if (fetVar22.U(iIntValue22 & 1, (iIntValue22 & 19) != 18)) {
                    mm40 mm40VarA3 = y5dVar2.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar14 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA3, 0.0f, 28.0f, 0.0f, 0.0f, 13), rsm0.w(R.string.players_duel_choose_game_dialog_title, 0, fetVar22), 0L, 0, 0L, fetVar22, 0, 28);
                } else {
                    fetVar22.X();
                }
                break;
            case 22:
                fet fetVar23 = (fet) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar23.U(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    zcl zclVar15 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(jm40.b, xfn.a(fetVar23).e, 12.0f, 0.0f, 0.0f, 12);
                    String strW = rsm0.w(R.string.additional_info, 0, fetVar23);
                    d4d d4dVar = d4d.PRIMARY;
                    nkb.h(mm40VarN, new hjm(strW, new ojm(126), null, null, null, null, false, null, null, false, null, null, 8188), kjm.b, null, null, null, fetVar23, 384, 56);
                } else {
                    fetVar23.X();
                }
                break;
            case 23:
                y5d y5dVar3 = (y5d) obj;
                fet fetVar24 = (fet) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                y5dVar3.getClass();
                if ((iIntValue24 & 6) == 0) {
                    iIntValue24 |= fetVar24.g(y5dVar3) ? 4 : 2;
                }
                if (fetVar24.U(iIntValue24 & 1, (iIntValue24 & 19) != 18)) {
                    mm40 mm40VarA4 = y5dVar3.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar16 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA4, 0.0f, 24.0f, 0.0f, 16.0f, 5), rsm0.w(R.string.additional_info, 0, fetVar24), 0L, 0, 0L, fetVar24, 0, 28);
                } else {
                    fetVar24.X();
                }
                break;
            case 24:
                y5d y5dVar4 = (y5d) obj;
                fet fetVar25 = (fet) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                y5dVar4.getClass();
                if ((iIntValue25 & 6) == 0) {
                    iIntValue25 |= fetVar25.g(y5dVar4) ? 4 : 2;
                }
                if (fetVar25.U(iIntValue25 & 1, (iIntValue25 & 19) != 18)) {
                    mm40 mm40VarA5 = y5dVar4.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar17 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA5, 0.0f, 24.0f, 0.0f, 16.0f, 5), rsm0.w(R.string.players_duel_choose_game_dialog_title, 0, fetVar25), 0L, 0, 0L, fetVar25, 0, 28);
                } else {
                    fetVar25.X();
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                y5d y5dVar5 = (y5d) obj;
                fet fetVar26 = (fet) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                y5dVar5.getClass();
                if ((iIntValue26 & 6) == 0) {
                    iIntValue26 |= fetVar26.g(y5dVar5) ? 4 : 2;
                }
                if (fetVar26.U(iIntValue26 & 1, (iIntValue26 & 19) != 18)) {
                    mm40 mm40VarA6 = y5dVar5.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar18 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA6, 0.0f, 24.0f, 0.0f, 16.0f, 5), rsm0.w(R.string.additional_info, 0, fetVar26), 0L, 0, 0L, fetVar26, 0, 28);
                } else {
                    fetVar26.X();
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                y5d y5dVar6 = (y5d) obj;
                fet fetVar27 = (fet) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                y5dVar6.getClass();
                if ((iIntValue27 & 6) == 0) {
                    iIntValue27 |= fetVar27.g(y5dVar6) ? 4 : 2;
                }
                if (fetVar27.U(iIntValue27 & 1, (iIntValue27 & 19) != 18)) {
                    mm40 mm40VarA7 = y5dVar6.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar19 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA7, 0.0f, 24.0f, 0.0f, 16.0f, 5), rsm0.w(R.string.players_duel_choose_game_dialog_title, 0, fetVar27), 0L, 0, 0L, fetVar27, 0, 28);
                } else {
                    fetVar27.X();
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fet fetVar28 = (fet) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar28.U(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    zcl zclVar20 = qmk.f28987a;
                    wvb.o(null, 8.0f, 0L, fetVar28, 0, 5);
                } else {
                    fetVar28.X();
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                fet fetVar29 = (fet) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar29.U(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    nkb.h(jm40.b, new hjm(rsm0.w(R.string.powerbet_change_section_title, 0, fetVar29), new ojm(127), null, null, null, null, false, null, null, false, null, null, 8188), kjm.b, null, null, null, fetVar29, 390, 56);
                } else {
                    fetVar29.X();
                }
                break;
            default:
                fet fetVar30 = (fet) obj2;
                int iIntValue30 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar30.U(iIntValue30 & 1, (iIntValue30 & 17) != 16)) {
                    zcl zclVar21 = qmk.f28987a;
                    qxw.o(fetVar30, o7k0.e(jm40Var, 16.0f));
                } else {
                    fetVar30.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
