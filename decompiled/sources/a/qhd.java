package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qhd implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28732a;

    public /* synthetic */ qhd(byte b) {
        this.f28732a = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f28732a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    v8q0.a(rsm0.w(R.string.information, 0, fetVar), s5x0.N(mm40VarD, 16.0f, 28.0f, 16.0f, 0.0f, 8), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 0, 0, null, y9q0.a(new y9q0(0L, qmk.t, null, j1t0.b, 0L, null, 0, 0, idm0.t(22), 16646109), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 384, 125948);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                us8 us8Var = (us8) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                us8Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? fetVar2.g(us8Var) : fetVar2.i(us8Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    pab pabVar = us8Var.f36199a.c;
                    pabVar.getClass();
                    mim0 mim0Var = pabVar.c;
                    Object objP = fetVar2.P();
                    if (objP == cl5Var) {
                        objP = new y2d((byte) 11);
                        fetVar2.o0(objP);
                    }
                    lgb.n(null, mim0Var, true, (Function1) objP, fetVar2, 1);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 20.0f), 64.0f);
                    zcl zclVar3 = qmk.m;
                    ugg0 ugg0Var = vgg0.f37379a;
                    zq8.a(0, fetVar3, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarS), vbc.d0(vqm.b, fetVar3, 6, 0)));
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((k8z) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    jcb.l(null, new mdm(R.string.empty_str, pdm.b, null, R.drawable.ic_glyph_circle_notification, 0, R.string.subscriptions_empty_games, 0, 0, 0L, 0L, 980), true, null, fetVar4, 384, 9);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((k8z) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    jcb.l(null, new mdm(R.string.empty_str, pdm.b, null, R.drawable.ic_glyph_circle_notification, 0, R.string.subscriptions_empty_games, 0, 0, 0L, 0L, 980), true, null, fetVar5, 384, 9);
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                y5d y5dVar = (y5d) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= fetVar6.g(y5dVar) ? 4 : 2;
                }
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar4 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA, 0.0f, 28.0f, 0.0f, 0.0f, 13), rsm0.w(R.string.choose_action, 0, fetVar6), 0L, 0, 0L, fetVar6, 0, 28);
                } else {
                    fetVar6.X();
                }
                break;
            case 6:
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    m7x.g(0, fetVar7);
                } else {
                    fetVar7.X();
                }
                break;
            case 7:
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarD2 = o7k0.d(o7k0.e(jm40Var, 36.0f), 1.0f);
                    zcl zclVar6 = qmk.g;
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    zq8.a(0, fetVar8, xbc.c0(h97.e(zclVar6, zclVar6, zclVar6, zclVar6, mm40VarD2), vbc.d0(null, fetVar8, 0, 1)));
                } else {
                    fetVar8.X();
                }
                break;
            case 8:
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    m7x.g(0, fetVar9);
                } else {
                    fetVar9.X();
                }
                break;
            case 9:
                y5d y5dVar2 = (y5d) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                y5dVar2.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= fetVar10.g(y5dVar2) ? 4 : 2;
                }
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    mm40 mm40VarA2 = y5dVar2.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar7 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA2, 0.0f, 24.0f, 0.0f, 0.0f, 13), rsm0.w(R.string.select_action, 0, fetVar10), 0L, 0, 0L, fetVar10, 0, 28);
                } else {
                    fetVar10.X();
                }
                break;
            case 10:
                p6t0 p6t0Var = (p6t0) obj;
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                p6t0Var.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= fetVar11.g(p6t0Var) ? 4 : 2;
                }
                if (!fetVar11.U(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    fetVar11.X();
                } else if (p6t0Var instanceof q7p0) {
                    fetVar11.e0(-487525699);
                    ozb.l(jm40.b, ((q7p0) p6t0Var).b, null, fetVar11, 0, 4);
                    fetVar11.r(false);
                } else {
                    fetVar11.e0(-487399498);
                    fetVar11.r(false);
                }
                break;
            case 11:
                y5d y5dVar3 = (y5d) obj;
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                y5dVar3.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= fetVar12.g(y5dVar3) ? 4 : 2;
                }
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarA3 = y5dVar3.a(o7k0.d(jm40Var2, 1.0f), gqw0.n);
                    zcl zclVar8 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA3, 0.0f, 28.0f, 0.0f, 8.0f, 5), rsm0.w(R.string.other_lineups, 0, fetVar12), 0L, 0, 0L, fetVar12, 0, 28);
                    mbc.o(zfi0.f44303a, s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7), false, fetVar12, 6, 4);
                } else {
                    fetVar12.X();
                }
                break;
            case 12:
                fet fetVar13 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    mbc.o(agi0.f827a, null, false, fetVar13, 6, 6);
                } else {
                    fetVar13.X();
                }
                break;
            case 13:
                fet fetVar14 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    zcl zclVar9 = qmk.f28987a;
                    v8q0.a(rsm0.w(R.string.tennis_summary_service_record, 0, fetVar14), s5x0.L(s5x0.N(jm40.b, 0.0f, 16.0f, 0.0f, 0.0f, 13), xfn.a(fetVar14).d, 0.0f, 2), ((ThemeColors) fetVar14.k(zaq0.b)).getPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar14, 0, 0, 131064);
                } else {
                    fetVar14.X();
                }
                break;
            case 14:
                fet fetVar15 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    zcl zclVar10 = qmk.f28987a;
                    v8q0.a(rsm0.w(R.string.tennis_summary_return_record, 0, fetVar15), s5x0.L(s5x0.N(jm40.b, 0.0f, 24.0f, 0.0f, 0.0f, 13), xfn.a(fetVar15).d, 0.0f, 2), ((ThemeColors) fetVar15.k(zaq0.b)).getPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar15, 0, 0, 131064);
                } else {
                    fetVar15.X();
                }
                break;
            case 15:
                fet fetVar16 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    mbc.o(agi0.f827a, o7k0.d(jm40Var, 1.0f), false, fetVar16, 54, 4);
                } else {
                    fetVar16.X();
                }
                break;
            case 16:
                fet fetVar17 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    zcl zclVar11 = qmk.f28987a;
                    qxw.o(fetVar17, o7k0.e(jm40Var, 8.0f));
                } else {
                    fetVar17.X();
                }
                break;
            case 17:
                fet fetVar18 = (fet) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((afo0) obj).getClass();
                if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    qsm0.m(0, fetVar18);
                } else {
                    fetVar18.X();
                }
                break;
            case 18:
                y5d y5dVar4 = (y5d) obj;
                fet fetVar19 = (fet) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                y5dVar4.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= fetVar19.g(y5dVar4) ? 4 : 2;
                }
                if (fetVar19.U(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    mm40 mm40VarA4 = y5dVar4.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar12 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA4, 0.0f, 28.0f, 0.0f, 0.0f, 13), rsm0.w(R.string.additional_info, 0, fetVar19), 0L, 0, 0L, fetVar19, 0, 28);
                } else {
                    fetVar19.X();
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                uoo0 uoo0Var = (uoo0) obj;
                fet fetVar20 = (fet) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                uoo0Var.getClass();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= fetVar20.g(uoo0Var) ? 4 : 2;
                }
                if (fetVar20.U(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    boolean z = uoo0Var instanceof soo0;
                    jm40 jm40Var3 = jm40.b;
                    if (z) {
                        fetVar20.e0(420225757);
                        zcl zclVar13 = qmk.f28987a;
                        soo0 soo0Var = (soo0) uoo0Var;
                        j6n.h(soo0Var.f32554a, soo0Var.b, s5x0.N(jm40Var3, 0.0f, 0.0f, 2.0f, 0.0f, 11), 0, 0, fetVar20, 0, 24);
                        fetVar20.r(false);
                    } else if (uoo0Var instanceof ioo0) {
                        fetVar20.e0(420504199);
                        zcl zclVar14 = qmk.f28987a;
                        j6n.h(((ioo0) uoo0Var).f15128a, tqo0.f34390a, s5x0.N(jm40Var3, 0.0f, 0.0f, 2.0f, 0.0f, 11), 0, 0, fetVar20, 48, 24);
                        fetVar20.r(false);
                    } else {
                        fetVar20.e0(-540616415);
                        fetVar20.r(false);
                    }
                } else {
                    fetVar20.X();
                }
                break;
            case 20:
                fet fetVar21 = (fet) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((mm40) obj).getClass();
                if (!fetVar21.U(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    fetVar21.X();
                }
                break;
            case 21:
                y5d y5dVar5 = (y5d) obj;
                fet fetVar22 = (fet) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                y5dVar5.getClass();
                if ((iIntValue22 & 6) == 0) {
                    iIntValue22 |= fetVar22.g(y5dVar5) ? 4 : 2;
                }
                if (fetVar22.U(iIntValue22 & 1, (iIntValue22 & 19) != 18)) {
                    jm40 jm40Var4 = jm40.b;
                    mm40 mm40VarA5 = y5dVar5.a(o7k0.d(jm40Var4, 1.0f), gqw0.n);
                    zcl zclVar15 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA5, 0.0f, 28.0f, 0.0f, 8.0f, 5), rsm0.w(R.string.period, 0, fetVar22), 0L, 0, 0L, fetVar22, 0, 28);
                    mbc.o(zfi0.f44303a, s5x0.N(jm40Var4, 0.0f, 0.0f, 0.0f, 16.0f, 7), false, fetVar22, 6, 4);
                } else {
                    fetVar22.X();
                }
                break;
            case 22:
                p6t0 p6t0Var2 = (p6t0) obj;
                fet fetVar23 = (fet) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                p6t0Var2.getClass();
                if ((iIntValue23 & 6) == 0) {
                    iIntValue23 |= fetVar23.g(p6t0Var2) ? 4 : 2;
                }
                if (!fetVar23.U(iIntValue23 & 1, (iIntValue23 & 19) != 18)) {
                    fetVar23.X();
                } else if (p6t0Var2 instanceof pat0) {
                    fetVar23.e0(1164752676);
                    q8m q8mVar = ((pat0) p6t0Var2).b;
                    Object objP2 = fetVar23.P();
                    if (objP2 == cl5Var) {
                        objP2 = new y2d((byte) 12);
                        fetVar23.o0(objP2);
                    }
                    u1c.h(null, q8mVar, null, (Function1) objP2, fetVar23, 3072, 5);
                    fetVar23.r(false);
                } else {
                    fetVar23.e0(1164837554);
                    fetVar23.r(false);
                }
                break;
            case 23:
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar24 = (fet) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue24 & 6) == 0) {
                    iIntValue24 |= fetVar24.g(yhg0Var) ? 4 : 2;
                }
                if (fetVar24.U(iIntValue24 & 1, (iIntValue24 & 19) != 18)) {
                    mm40 mm40VarB = yhg0Var.b(gqw0.k, jm40Var);
                    zcl zclVar16 = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(mm40VarB, 20.0f);
                    pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar24);
                    pz40 pz40Var = s6t0.f31722a;
                    dww.c(pm80VarF, null, mm40VarN, s6t0.b().f33626a.getPrimary(), fetVar24, 56, 0);
                } else {
                    fetVar24.X();
                }
                break;
            case 24:
                fet fetVar25 = (fet) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar25.U(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    zcl zclVar17 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 256.0f), 120.0f);
                    zcl zclVar18 = qmk.k;
                    ugg0 ugg0Var3 = vgg0.f37379a;
                    qxw.o(fetVar25, xbc.c0(h97.e(zclVar18, zclVar18, zclVar18, zclVar18, mm40VarE), vbc.d0(vqm.b, fetVar25, 6, 0)));
                } else {
                    fetVar25.X();
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                yhg0 yhg0Var2 = (yhg0) obj;
                fet fetVar26 = (fet) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                yhg0Var2.getClass();
                if ((iIntValue26 & 6) == 0) {
                    iIntValue26 |= fetVar26.g(yhg0Var2) ? 4 : 2;
                }
                if (fetVar26.U(iIntValue26 & 1, (iIntValue26 & 19) != 18)) {
                    zcl zclVar19 = qmk.f28987a;
                    k7n0.a(0, fetVar26, s5x0.J(i120.Q(yhg0Var2.a(1.0f, o7k0.e(jm40Var, 168.0f), true), ((ThemeColors) fetVar26.k(zaq0.b)).getBackgroundContent(), vgg0.a(16.0f)), 12.0f));
                } else {
                    fetVar26.X();
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                yhg0 yhg0Var3 = (yhg0) obj;
                fet fetVar27 = (fet) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                yhg0Var3.getClass();
                if ((iIntValue27 & 6) == 0) {
                    iIntValue27 |= fetVar27.g(yhg0Var3) ? 4 : 2;
                }
                if (fetVar27.U(iIntValue27 & 1, (iIntValue27 & 19) != 18)) {
                    zcl zclVar20 = qmk.f28987a;
                    k7n0.d(0, fetVar27, s5x0.J(i120.Q(yhg0Var3.a(1.0f, o7k0.e(jm40Var, 168.0f), true), ((ThemeColors) fetVar27.k(zaq0.b)).getBackgroundContent(), vgg0.a(16.0f)), 12.0f));
                } else {
                    fetVar27.X();
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fet fetVar28 = (fet) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar28.U(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    gq80.J(0, fetVar28);
                } else {
                    fetVar28.X();
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                fet fetVar29 = (fet) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar29.U(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    mbc.o(zfi0.f44303a, null, false, fetVar29, 6, 6);
                } else {
                    fetVar29.X();
                }
                break;
            default:
                fet fetVar30 = (fet) obj2;
                int iIntValue30 = ((Integer) obj3).intValue();
                ((rb50) obj).getClass();
                if (!fetVar30.U(iIntValue30 & 1, (iIntValue30 & 17) != 16)) {
                    fetVar30.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
