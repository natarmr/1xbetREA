package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.api.presentation.GameVideoPlayerColorScheme;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.game_broadcasting.api.presentation.models.GameVideoUiConfig;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zb8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44102a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zb8(mwa mwaVar, Function0 function0, Function0 function1, int i) {
        this.f44102a = (byte) 29;
        this.b = mwaVar;
        this.d = function0;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44102a;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        byte b2 = 2;
        byte b3 = 1;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ac8.a((mm40) obj5, (xb8) obj3, (Function0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                String str = (String) obj5;
                ThemeColors themeColors = (ThemeColors) obj3;
                String str2 = (String) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarN = s5x0.N(jm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    v8q0.a(str, null, themeColors.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.l(), fetVar, 0, 0, 131066);
                    v8q0.a(str2, s5x0.N(jm40Var2, 4.0f, 0.0f, 0.0f, 0.0f, 14), themeColors.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 0, 0, 131064);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                q8a.b((rd8) obj5, (od8) obj3, (Function1) obj4, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                o2e.j((mm40) obj5, (he8) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                tke.k((mm40) obj5, (ie8) obj3, (ugd) obj4, (fet) obj, x8x.L(385));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                j2e.j((mm40) obj5, (ge8) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                cjx.j((mm40) obj5, (ArrayList) obj3, (ow3) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                rsr0.k((mm40) obj5, (sj8) obj3, (Function1) obj4, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                cwr0.d((mm40) obj5, (vl8) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                rsr0.l((mm40) obj5, (fo8) obj3, (Function0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                hew0.c((mm40) obj5, (dln) obj3, (Function0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                y0x0.g((mm40) obj5, (c09) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                xf0.g((mm40) obj5, (va9) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                tke.n((mm40) obj5, (pc9) obj3, (uwe) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                cp cpVar = (cp) obj5;
                Function1 function1 = (Function1) obj3;
                Function0 function0 = (Function0) obj4;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    gy30 gy30Var = ((i140) cpVar.u()).d;
                    boolean zG = fetVar2.g(function1) | fetVar2.i(cpVar);
                    Object objP = fetVar2.P();
                    if (zG || objP == cl5Var) {
                        objP = new cp9(function1, cpVar);
                        fetVar2.o0(objP);
                    }
                    Function0 function2 = (Function0) objP;
                    boolean zG2 = fetVar2.g(function0);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new pk9(function0, (byte) 4);
                        fetVar2.o0(objP2);
                    }
                    jiq0.y(null, gy30Var, function2, null, (Function0) objP2, fetVar2, 0, 9);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                kc5.H((mm40) obj5, (waa) obj3, (Function2) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                taa taaVar = (taa) obj5;
                taa taaVar2 = (taa) obj3;
                taa taaVar3 = (taa) obj4;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(o7k0.p(jm40Var, 256.0f, 28.0f), 20.0f, 0.0f, 2);
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarL);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                    zhg0 zhg0Var = zhg0.f44392a;
                    x8f.W(zhg0Var.a(1.0f, jm40Var, true), taaVar, fetVar3, 0);
                    x8f.W(zhg0Var.a(1.0f, jm40Var, true), taaVar2, fetVar3, 0);
                    x8f.W(zhg0Var.a(1.0f, jm40Var, true), taaVar3, fetVar3, 0);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 17:
                uaa uaaVar = (uaa) obj5;
                uaa uaaVar2 = (uaa) obj3;
                uaa uaaVar3 = (uaa) obj4;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarK = s5x0.K(o7k0.e(mm40VarD, 36.0f), 24.0f, 4.0f);
                    thg0 thg0VarA3 = shg0.a(uc9.f35418a, gqw0.k, fetVar4, 48);
                    int iHashCode3 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM3 = fetVar4.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar4, mm40VarK);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, thg0VarA3, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC2, gqw0.v);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    kc5.J0(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), uaaVar, fetVar4, 0, 0);
                    kc5.J0(null, uaaVar2, fetVar4, 0, 1);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    kc5.J0(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), uaaVar3, fetVar4, 0, 0);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                i120.l((mm40) obj5, (nda) obj3, (Function2) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                xia0.m((mm40) obj5, (oda) obj3, (Function2) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                dea.b((mm40) obj5, (iea) obj3, (l7m0) obj4, (fet) obj, x8x.L(385));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                ffb0.i((mm40) obj5, (nea) obj3, (Function1) obj4, (fet) obj, x8x.L(385));
                return Unit.f46060a;
            case 22:
                mm40 mm40Var = (mm40) obj5;
                gdp0 gdp0Var = (gdp0) obj3;
                Function2 function3 = (Function2) obj4;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    dwi0.h(mm40Var, gdp0Var, null, u1c.M(-589288617, new naa(function3, b2), fetVar5), fetVar5, 24576, 12);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 23:
                ydr ydrVar = (ydr) obj3;
                mm40 mm40Var2 = (mm40) obj5;
                List list = (List) obj4;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ydrVar.j(mm40Var2, u1c.M(1725538542, new jka(list, b3), fetVar6), fetVar6, 48);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                kc5.S((mm40) obj5, (vka) obj3, (Function2) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                j47.Q((mm40) obj5, (wka) obj3, (Function2) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                soa soaVar = (soa) obj5;
                nek nekVar = (nek) obj3;
                Function1 function4 = (Function1) obj4;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    fetVar7.X();
                } else if (soaVar instanceof poa) {
                    fetVar7.e0(1550969712);
                    GameBroadcastingParams gameBroadcastingParams = ((poa) soaVar).f27319a;
                    jxs[] jxsVarArr = jxs.f17324a;
                    nekVar.e(jm40.b, gameBroadcastingParams, new GameVideoUiConfig("16:9", R.dimen.corner_radius_16, -1, -1, GameVideoPlayerColorScheme.Static.f46687a), fetVar7, 70);
                    fetVar7.r(false);
                } else if (soaVar instanceof qoa) {
                    fetVar7.e0(1551619317);
                    String str3 = ((qoa) soaVar).f29064a;
                    boolean zG3 = fetVar7.g(function4) | fetVar7.g(soaVar);
                    Object objP3 = fetVar7.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new yw9(function4, soaVar, b2);
                        fetVar7.o0(objP3);
                    }
                    ahy.j(null, str3, (Function0) objP3, fetVar7, 0);
                    fetVar7.r(false);
                } else {
                    if (!(soaVar instanceof roa)) {
                        throw b1j.f(1158408147, fetVar7, false);
                    }
                    fetVar7.e0(1551864310);
                    lv00.p(0, fetVar7, null, ((roa) soaVar).f30827a);
                    fetVar7.r(false);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ara araVar = (ara) obj5;
                xak xakVar = (xak) obj3;
                Function1 function5 = (Function1) obj4;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    fetVar8.X();
                } else if (araVar instanceof xqa) {
                    fetVar8.e0(613026164);
                    xakVar.o(jm40Var, ((xqa) araVar).f41306a, fetVar8, 70);
                    fetVar8.r(false);
                } else if (araVar instanceof yqa) {
                    fetVar8.e0(613251286);
                    String str4 = ((yqa) araVar).f43067a;
                    boolean zG4 = fetVar8.g(function5) | fetVar8.g(araVar);
                    Object objP4 = fetVar8.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new yw9(function5, araVar, (byte) 3);
                        fetVar8.o0(objP4);
                    }
                    ahy.j(null, str4, (Function0) objP4, fetVar8, 0);
                    fetVar8.r(false);
                } else {
                    if (!(araVar instanceof zqa)) {
                        throw b1j.f(573962621, fetVar8, false);
                    }
                    fetVar8.e0(613476284);
                    lv00.p(0, fetVar8, null, ((zqa) araVar).f44799a);
                    fetVar8.r(false);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                q8a.d((mm40) obj5, (mua) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                y9a.k((mwa) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ zb8(ydr ydrVar, mm40 mm40Var, List list) {
        this.f44102a = (byte) 23;
        this.c = ydrVar;
        this.b = mm40Var;
        this.d = list;
    }

    public /* synthetic */ zb8(Object obj, Object obj2, Object obj3, byte b) {
        this.f44102a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ zb8(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.f44102a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ zb8(String str, ThemeColors themeColors, g1t0 g1t0Var, String str2) {
        this.f44102a = (byte) 1;
        this.b = str;
        this.c = themeColors;
        this.d = str2;
    }
}
