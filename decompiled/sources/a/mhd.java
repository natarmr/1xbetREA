package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mhd implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21786a;

    public /* synthetic */ mhd(byte b) {
        this.f21786a = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f21786a;
        jm40 jm40Var = jm40.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    i4w0.f(0, fetVar, s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).d, 0.0f, 2));
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    i4w0.u(0, fetVar2);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    i4w0.t(0, fetVar3);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    i4w0.C(0, fetVar4);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    qxw.o(fetVar5, o7k0.e(jm40Var, 16.0f));
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                ir8 ir8Var = (ir8) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ir8Var.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= fetVar6.g(ir8Var) ? 4 : 2;
                }
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    mm40 mm40VarB = ir8Var.b(jm40Var, gqw0.i);
                    zcl zclVar2 = qmk.f28987a;
                    thb.f(s5x0.N(mm40VarB, 0.0f, 0.0f, 2.0f, 4.0f, 3), new rf5(3, null), fetVar6, 48, 0);
                } else {
                    fetVar6.X();
                }
                break;
            case 6:
                ir8 ir8Var2 = (ir8) obj;
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ir8Var2.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar7.g(ir8Var2) ? 4 : 2;
                }
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    mm40 mm40VarB2 = ir8Var2.b(jm40Var, gqw0.i);
                    zcl zclVar3 = qmk.f28987a;
                    thb.f(s5x0.N(mm40VarB2, 0.0f, 0.0f, 2.0f, 4.0f, 3), new rf5(3, null), fetVar7, 48, 0);
                } else {
                    fetVar7.X();
                }
                break;
            case 7:
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarD = o7k0.d(o7k0.e(s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13), 146.0f), 1.0f);
                    pz40 pz40Var = s6t0.f31722a;
                    zq8.a(0, fetVar8, xbc.c0(lgb.J(i120.Q(mm40VarD, s6t0.b().f33626a.getBackgroundGroup(), vgg0.a(8.0f)), vgg0.a(8.0f)), vbc.d0(null, fetVar8, 0, 1)));
                } else {
                    fetVar8.X();
                }
                break;
            case 8:
                g9z g9zVar = (g9z) obj;
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                g9zVar.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar9.g(g9zVar) ? 4 : 2;
                }
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    l7x.w(0, 2, 0L, fetVar9, g9z.c(g9zVar));
                } else {
                    fetVar9.X();
                }
                break;
            case 9:
                mm40 mm40Var = (mm40) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                mm40Var.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= fetVar10.g(mm40Var) ? 4 : 2;
                }
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    l7x.w(iIntValue10 & 14, 0, StaticColors.INSTANCE.m131getWhite800d7_KjU(), fetVar10, mm40Var);
                } else {
                    fetVar10.X();
                }
                break;
            case 10:
                y5d y5dVar = (y5d) obj;
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= fetVar11.g(y5dVar) ? 4 : 2;
                }
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar5 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA, 0.0f, 24.0f, 0.0f, 0.0f, 13), rsm0.w(R.string.available_statistic_games, 0, fetVar11), 0L, 0, 0L, fetVar11, 0, 28);
                } else {
                    fetVar11.X();
                }
                break;
            case 11:
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    zcl zclVar6 = qmk.f28987a;
                    qxw.o(fetVar12, o7k0.s(jm40Var, 8.0f));
                } else {
                    fetVar12.X();
                }
                break;
            case 12:
                fet fetVar13 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    zcl zclVar7 = qmk.f28987a;
                    qxw.o(fetVar13, o7k0.e(jm40Var, 24.0f));
                } else {
                    fetVar13.X();
                }
                break;
            case 13:
                Function2 function2 = (Function2) obj;
                fet fetVar14 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= fetVar14.i(function2) ? 4 : 2;
                }
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    function2.invoke(fetVar14, Integer.valueOf(iIntValue14 & 14));
                } else {
                    fetVar14.X();
                }
                break;
            case 14:
                fet fetVar15 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    efx.q(0, 1, fetVar15, null);
                } else {
                    fetVar15.X();
                }
                break;
            case 15:
                fet fetVar16 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar8 = qmk.f28987a;
                    v8q0.a(rsm0.w(R.string.season_header, 0, fetVar16), s5x0.N(mm40VarD2, 0.0f, 28.0f, 0.0f, 0.0f, 13), ((ThemeColors) fetVar16.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.t, null, j1t0.b, 0L, null, 0, 0, idm0.t(22), 16646109), fetVar16, 0, 0, 130040);
                } else {
                    fetVar16.X();
                }
                break;
            case 16:
                fet fetVar17 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    ((g1t0) fetVar17.k(j1t0.e)).getClass();
                    v8q0.a(xsm0.s(R.string.security_get_promotion, fetVar17), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.m(), fetVar17, 0, 0, 131070);
                } else {
                    fetVar17.X();
                }
                break;
            case 17:
                fet fetVar18 = (fet) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    hkb.k(0, 1, fetVar18, null, rsm0.w(R.string.cashback_rules_message_title, 0, fetVar18));
                } else {
                    fetVar18.X();
                }
                break;
            case 18:
                fet fetVar19 = (fet) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar19.U(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    hkb.k(0, 1, fetVar19, null, rsm0.w(R.string.cashback_info, 0, fetVar19));
                } else {
                    fetVar19.X();
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fet fetVar20 = (fet) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar20.U(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    zcl zclVar9 = qmk.f28987a;
                    wvb.o(null, 28.0f, 0L, fetVar20, 0, 5);
                    wwb.i(null, rsm0.w(R.string.calendar_date_module_select_date, 0, fetVar20), 0L, 0, 0L, fetVar20, 0, 29);
                    wvb.o(null, 16.0f, 0L, fetVar20, 0, 5);
                    vtb.t(null, qqm.b, null, 0L, fetVar20, 48, 13);
                } else {
                    fetVar20.X();
                }
                break;
            case 20:
                fet fetVar21 = (fet) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar21.U(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    zcl zclVar10 = qmk.f28987a;
                    wvb.o(null, 28.0f, 0L, fetVar21, 0, 5);
                    wwb.i(null, rsm0.w(R.string.calendar_date_module_set_period, 0, fetVar21), 0L, 0, 0L, fetVar21, 0, 29);
                    wvb.o(null, 16.0f, 0L, fetVar21, 0, 5);
                    vtb.t(null, qqm.b, null, 0L, fetVar21, 48, 13);
                } else {
                    fetVar21.X();
                }
                break;
            case 21:
                fet fetVar22 = (fet) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar22.U(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    zcl zclVar11 = qmk.f28987a;
                    qxw.o(fetVar22, o7k0.e(jm40Var, 8.0f));
                } else {
                    fetVar22.X();
                }
                break;
            case 22:
                fet fetVar23 = (fet) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar23.U(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    zcl zclVar12 = qmk.f28987a;
                    qxw.o(fetVar23, o7k0.e(jm40Var, 8.0f));
                } else {
                    fetVar23.X();
                }
                break;
            case 23:
                fet fetVar24 = (fet) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar24.U(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    m2x.g(0, fetVar24);
                } else {
                    fetVar24.X();
                }
                break;
            case 24:
                fet fetVar25 = (fet) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar25.U(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    x2x.r(0, fetVar25);
                } else {
                    fetVar25.X();
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fet fetVar26 = (fet) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar26.U(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    x2x.r(0, fetVar26);
                } else {
                    fetVar26.X();
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fet fetVar27 = (fet) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar27.U(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    x2x.r(0, fetVar27);
                } else {
                    fetVar27.X();
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fet fetVar28 = (fet) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar28.U(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    zcl zclVar13 = qmk.f28987a;
                    nkb.h(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), new ijm(), kjm.b, null, null, null, fetVar28, 384, 56);
                } else {
                    fetVar28.X();
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                mm40 mm40Var2 = (mm40) obj;
                fet fetVar29 = (fet) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                mm40Var2.getClass();
                if ((iIntValue29 & 6) == 0) {
                    iIntValue29 |= fetVar29.g(mm40Var2) ? 4 : 2;
                }
                if (fetVar29.U(iIntValue29 & 1, (iIntValue29 & 19) != 18)) {
                    dww.c(a8k0.F(R.drawable.ic_glyph_arrow_left, 0, fetVar29), null, mm40Var2, 0L, fetVar29, 56 | ((iIntValue29 << 6) & 896), 8);
                } else {
                    fetVar29.X();
                }
                break;
            default:
                mm40 mm40Var3 = (mm40) obj;
                fet fetVar30 = (fet) obj2;
                int iIntValue30 = ((Integer) obj3).intValue();
                mm40Var3.getClass();
                if ((iIntValue30 & 6) == 0) {
                    iIntValue30 |= fetVar30.g(mm40Var3) ? 4 : 2;
                }
                if (fetVar30.U(iIntValue30 & 1, (iIntValue30 & 19) != 18)) {
                    dww.c(a8k0.F(R.drawable.ic_glyph_search, 0, fetVar30), null, mm40Var3, 0L, fetVar30, 56 | ((iIntValue30 << 6) & 896), 8);
                } else {
                    fetVar30.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
