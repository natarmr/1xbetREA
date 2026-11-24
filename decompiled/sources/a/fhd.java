package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fhd implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9535a;

    public /* synthetic */ fhd(byte b) {
        this.f9535a = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f9535a;
        jm40 jm40Var = jm40.b;
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
                    mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA, 0.0f, 24.0f, 0.0f, 0.0f, 13), rsm0.w(R.string.choose_date_period_title, 0, fetVar), 0L, 0, 0L, fetVar, 0, 28);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                y5d y5dVar2 = (y5d) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                y5dVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(y5dVar2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    mm40 mm40VarA2 = y5dVar2.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar2 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA2, 0.0f, 24.0f, 0.0f, 0.0f, 13), rsm0.w(R.string.select_action, 0, fetVar2), 0L, 0, 0L, fetVar2, 0, 28);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                y5d y5dVar3 = (y5d) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                y5dVar3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(y5dVar3) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    mm40 mm40VarA3 = y5dVar3.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar3 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA3, 0.0f, 24.0f, 0.0f, 0.0f, 13), rsm0.w(R.string.history_type_title, 0, fetVar3), 0L, 0, 0L, fetVar3, 0, 28);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                g9z g9zVar = (g9z) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                g9zVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(g9zVar) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    b8k0.h(g9z.b(g9zVar, jm40Var, null, 7), udl0.ADVANCED, fetVar4);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    zcl zclVar4 = qmk.f28987a;
                    qxw.o(fetVar5, s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13));
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                g9z g9zVar2 = (g9z) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                g9zVar2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= fetVar6.g(g9zVar2) ? 4 : 2;
                }
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    b8k0.h(g9z.b(g9zVar2, jm40Var, null, 7), udl0.CLASSIC, fetVar6);
                } else {
                    fetVar6.X();
                }
                break;
            case 6:
                g9z g9zVar3 = (g9z) obj;
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                g9zVar3.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar7.g(g9zVar3) ? 4 : 2;
                }
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    b8k0.h(g9z.b(g9zVar3, jm40Var, null, 7), udl0.DASHBOARD, fetVar7);
                } else {
                    fetVar7.X();
                }
                break;
            case 7:
                g9z g9zVar4 = (g9z) obj;
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                g9zVar4.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar8.g(g9zVar4) ? 4 : 2;
                }
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    b8k0.h(g9z.b(g9zVar4, jm40Var, null, 7), udl0.LITE, fetVar8);
                } else {
                    fetVar8.X();
                }
                break;
            case 8:
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    nkb.h(jm40.b, new ijm(), kjm.b, null, null, null, fetVar9, 390, 56);
                } else {
                    fetVar9.X();
                }
                break;
            case 9:
                y5d y5dVar4 = (y5d) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                y5dVar4.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= fetVar10.g(y5dVar4) ? 4 : 2;
                }
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    mm40 mm40VarA4 = y5dVar4.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar5 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA4, 0.0f, 24.0f, 0.0f, 0.0f, 13), rsm0.w(R.string.statistic_last_game_pager_choose_type_of_game, 0, fetVar10), 0L, 0, 0L, fetVar10, 0, 28);
                } else {
                    fetVar10.X();
                }
                break;
            case 10:
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    zcl zclVar6 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 12.0f, 7), 1.0f), 32.0f);
                    zcl zclVar7 = qmk.g;
                    ugg0 ugg0Var = vgg0.f37379a;
                    zq8.a(0, fetVar11, xbc.c0(h97.e(zclVar7, zclVar7, zclVar7, zclVar7, mm40VarE), vbc.d0(null, fetVar11, 0, 1)));
                } else {
                    fetVar11.X();
                }
                break;
            case 11:
                y5d y5dVar5 = (y5d) obj;
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                y5dVar5.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= fetVar12.g(y5dVar5) ? 4 : 2;
                }
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarA5 = y5dVar5.a(o7k0.d(jm40Var2, 1.0f), gqw0.n);
                    zcl zclVar8 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA5, 0.0f, 28.0f, 0.0f, 8.0f, 5), rsm0.w(R.string.region, 0, fetVar12), 0L, 0, 0L, fetVar12, 0, 28);
                    mbc.o(zfi0.f44303a, s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7), false, fetVar12, 6, 4);
                } else {
                    fetVar12.X();
                }
                break;
            case 12:
                y5d y5dVar6 = (y5d) obj;
                fet fetVar13 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                y5dVar6.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= fetVar13.g(y5dVar6) ? 4 : 2;
                }
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    jm40 jm40Var3 = jm40.b;
                    mm40 mm40VarA6 = y5dVar6.a(o7k0.d(jm40Var3, 1.0f), gqw0.n);
                    zcl zclVar9 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA6, 0.0f, 28.0f, 0.0f, 8.0f, 5), rsm0.w(R.string.statistic_info_rating, 0, fetVar13), 0L, 0, 0L, fetVar13, 0, 28);
                    mbc.o(zfi0.f44303a, s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, 16.0f, 7), false, fetVar13, 6, 4);
                } else {
                    fetVar13.X();
                }
                break;
            case 13:
                y5d y5dVar7 = (y5d) obj;
                fet fetVar14 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                y5dVar7.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= fetVar14.g(y5dVar7) ? 4 : 2;
                }
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    jm40 jm40Var4 = jm40.b;
                    mm40 mm40VarA7 = y5dVar7.a(o7k0.d(jm40Var4, 1.0f), gqw0.n);
                    zcl zclVar10 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA7, 0.0f, 28.0f, 0.0f, 8.0f, 5), rsm0.w(R.string.period, 0, fetVar14), 0L, 0, 0L, fetVar14, 0, 28);
                    mbc.o(zfi0.f44303a, s5x0.N(jm40Var4, 0.0f, 0.0f, 0.0f, 16.0f, 7), false, fetVar14, 6, 4);
                } else {
                    fetVar14.X();
                }
                break;
            case 14:
                y5d y5dVar8 = (y5d) obj;
                fet fetVar15 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                y5dVar8.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= fetVar15.g(y5dVar8) ? 4 : 2;
                }
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    jm40 jm40Var5 = jm40.b;
                    mm40 mm40VarA8 = y5dVar8.a(o7k0.d(jm40Var5, 1.0f), gqw0.n);
                    zcl zclVar11 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA8, 0.0f, 28.0f, 0.0f, 8.0f, 5), rsm0.w(R.string.leaderboard_type, 0, fetVar15), 0L, 0, 0L, fetVar15, 0, 28);
                    mbc.o(zfi0.f44303a, s5x0.N(jm40Var5, 0.0f, 0.0f, 0.0f, 16.0f, 7), false, fetVar15, 6, 4);
                } else {
                    fetVar15.X();
                }
                break;
            case 15:
                y5d y5dVar9 = (y5d) obj;
                fet fetVar16 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                y5dVar9.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= fetVar16.g(y5dVar9) ? 4 : 2;
                }
                if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    mm40 mm40VarA9 = y5dVar9.a(jm40Var, gqw0.n);
                    zcl zclVar12 = qmk.f28987a;
                    mm40 mm40VarM = s5x0.M(mm40VarA9, 16.0f, 12.0f, 16.0f, 8.0f);
                    String strS = xsm0.s(R.string.limits_bottom_sheet_title, fetVar16);
                    zfn zfnVar = zaq0.b;
                    long textPrimary = ((ThemeColors) fetVar16.k(zfnVar)).getTextPrimary();
                    zfn zfnVar2 = j1t0.e;
                    ((g1t0) fetVar16.k(zfnVar2)).getClass();
                    v8q0.a(strS, mm40VarM, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.q(), fetVar16, 0, 0, 131064);
                    mm40 mm40VarL = s5x0.L(o7k0.d(jm40Var, 1.0f), 16.0f, 0.0f, 2);
                    String strS2 = xsm0.s(R.string.limits_bottom_sheet_description, fetVar16);
                    ((g1t0) fetVar16.k(zfnVar2)).getClass();
                    v8q0.a(strS2, mm40VarL, ((ThemeColors) fetVar16.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.k(), fetVar16, 0, 0, 130040);
                } else {
                    fetVar16.X();
                }
                break;
            case 16:
                fet fetVar17 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    zcl zclVar13 = qmk.f28987a;
                    v8q0.a(xsm0.s(R.string.limits_self_exclusion_warning_title, fetVar17), s5x0.M(jm40Var, 16.0f, 12.0f, 16.0f, 8.0f), ((ThemeColors) fetVar17.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, fetVar17, 0, 0, 262136);
                } else {
                    fetVar17.X();
                }
                break;
            case 17:
                fet fetVar18 = (fet) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    zcl zclVar14 = qmk.f28987a;
                    v8q0.a(xsm0.s(R.string.limits_self_exclusion_warning_title, fetVar18), s5x0.M(jm40Var, 16.0f, 12.0f, 16.0f, 8.0f), ((ThemeColors) fetVar18.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, fetVar18, 0, 0, 262136);
                } else {
                    fetVar18.X();
                }
                break;
            case 18:
                fet fetVar19 = (fet) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar19.U(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    zcl zclVar15 = qmk.f28987a;
                    v8q0.a(xsm0.s(R.string.limits_self_exclusion_warning_title, fetVar19), s5x0.M(jm40Var, 16.0f, 12.0f, 16.0f, 8.0f), ((ThemeColors) fetVar19.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, fetVar19, 0, 0, 262136);
                } else {
                    fetVar19.X();
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fet fetVar20 = (fet) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar20.U(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    zcl zclVar16 = qmk.f28987a;
                    mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 14.0f), 84.0f);
                    zcl zclVar17 = qmk.m;
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    zq8.a(0, fetVar20, xbc.c0(h97.e(zclVar17, zclVar17, zclVar17, zclVar17, mm40VarS), vbc.d0(vqm.f37862a, fetVar20, 6, 0)));
                } else {
                    fetVar20.X();
                }
                break;
            case 20:
                fet fetVar21 = (fet) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar21.U(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    zcl zclVar18 = qmk.f28987a;
                    mm40 mm40VarS2 = o7k0.s(o7k0.e(jm40Var, 14.0f), 84.0f);
                    zcl zclVar19 = qmk.m;
                    ugg0 ugg0Var3 = vgg0.f37379a;
                    zq8.a(0, fetVar21, xbc.c0(h97.e(zclVar19, zclVar19, zclVar19, zclVar19, mm40VarS2), vbc.d0(vqm.f37862a, fetVar21, 6, 0)));
                } else {
                    fetVar21.X();
                }
                break;
            case 21:
                fet fetVar22 = (fet) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar22.U(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    zcl zclVar20 = qmk.f28987a;
                    mm40 mm40VarS3 = o7k0.s(o7k0.e(jm40Var, 14.0f), 84.0f);
                    zcl zclVar21 = qmk.m;
                    ugg0 ugg0Var4 = vgg0.f37379a;
                    zq8.a(0, fetVar22, xbc.c0(h97.e(zclVar21, zclVar21, zclVar21, zclVar21, mm40VarS3), vbc.d0(vqm.f37862a, fetVar22, 6, 0)));
                } else {
                    fetVar22.X();
                }
                break;
            case 22:
                mm40 mm40Var = (mm40) obj;
                fet fetVar23 = (fet) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                mm40Var.getClass();
                if ((iIntValue23 & 6) == 0) {
                    iIntValue23 |= fetVar23.g(mm40Var) ? 4 : 2;
                }
                if (fetVar23.U(iIntValue23 & 1, (iIntValue23 & 19) != 18)) {
                    zcl zclVar22 = qmk.f28987a;
                    mbc.o(wfi0.f39073a, o7k0.e(mm40Var, 18.0f), false, fetVar23, 390, 0);
                } else {
                    fetVar23.X();
                }
                break;
            case 23:
                mm40 mm40Var2 = (mm40) obj;
                fet fetVar24 = (fet) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                mm40Var2.getClass();
                if ((iIntValue24 & 6) == 0) {
                    iIntValue24 |= fetVar24.g(mm40Var2) ? 4 : 2;
                }
                if (fetVar24.U(iIntValue24 & 1, (iIntValue24 & 19) != 18)) {
                    mbc.o(zfi0.f44303a, mm40Var2, false, fetVar24, ((iIntValue24 << 3) & 112) | 6, 4);
                } else {
                    fetVar24.X();
                }
                break;
            case 24:
                mm40 mm40Var3 = (mm40) obj;
                fet fetVar25 = (fet) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                mm40Var3.getClass();
                if ((iIntValue25 & 6) == 0) {
                    iIntValue25 |= fetVar25.g(mm40Var3) ? 4 : 2;
                }
                if (fetVar25.U(iIntValue25 & 1, (iIntValue25 & 19) != 18)) {
                    mbc.o(zfi0.f44303a, mm40Var3, false, fetVar25, ((iIntValue25 << 3) & 112) | 6, 4);
                } else {
                    fetVar25.X();
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                mm40 mm40Var4 = (mm40) obj;
                fet fetVar26 = (fet) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                mm40Var4.getClass();
                if ((iIntValue26 & 6) == 0) {
                    iIntValue26 |= fetVar26.g(mm40Var4) ? 4 : 2;
                }
                if (fetVar26.U(iIntValue26 & 1, (iIntValue26 & 19) != 18)) {
                    mbc.o(zfi0.f44303a, mm40Var4, false, fetVar26, ((iIntValue26 << 3) & 112) | 6, 4);
                } else {
                    fetVar26.X();
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                vwv vwvVar = (vwv) obj;
                fet fetVar27 = (fet) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                vwvVar.getClass();
                if ((iIntValue27 & 6) == 0) {
                    iIntValue27 |= fetVar27.g(vwvVar) ? 4 : 2;
                }
                if (fetVar27.U(iIntValue27 & 1, (iIntValue27 & 19) != 18)) {
                    zcl zclVar23 = qmk.f28987a;
                    qbc.v(s5x0.K(jm40Var, 8.0f, 8.0f), vwvVar, fetVar27, (iIntValue27 << 3) & 112);
                } else {
                    fetVar27.X();
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                g9z g9zVar5 = (g9z) obj;
                fet fetVar28 = (fet) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                g9zVar5.getClass();
                if ((iIntValue28 & 6) == 0) {
                    iIntValue28 |= fetVar28.g(g9zVar5) ? 4 : 2;
                }
                if (fetVar28.U(iIntValue28 & 1, (iIntValue28 & 19) != 18)) {
                    mbc.o(zfi0.f44303a, g9z.b(g9zVar5, jm40Var, null, 7), false, fetVar28, 6, 4);
                } else {
                    fetVar28.X();
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                vwv vwvVar2 = (vwv) obj;
                fet fetVar29 = (fet) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                vwvVar2.getClass();
                if ((iIntValue29 & 6) == 0) {
                    iIntValue29 |= fetVar29.g(vwvVar2) ? 4 : 2;
                }
                if (fetVar29.U(iIntValue29 & 1, (iIntValue29 & 19) != 18)) {
                    zcl zclVar24 = qmk.i;
                    ugg0 ugg0Var5 = vgg0.f37379a;
                    qbc.v(s5x0.K(i120.Q(dw9.i(zclVar24, zclVar24, zclVar24, zclVar24, jm40Var), ((ThemeColors) fetVar29.k(zaq0.b)).getBackgroundContent(), jd8.n), 8.0f, 14.0f), vwvVar2, fetVar29, (iIntValue29 << 3) & 112);
                } else {
                    fetVar29.X();
                }
                break;
            default:
                fet fetVar30 = (fet) obj2;
                int iIntValue30 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar30.U(iIntValue30 & 1, (iIntValue30 & 17) != 16)) {
                    zcl zclVar25 = qmk.f28987a;
                    qxw.o(fetVar30, s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13));
                } else {
                    fetVar30.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
