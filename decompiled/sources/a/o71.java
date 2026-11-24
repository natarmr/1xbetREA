package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collection;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o71 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24762a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ o71(Function1 function1, l7m0 l7m0Var) {
        this.f24762a = (byte) 14;
        this.c = function1;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24762a;
        byte b2 = 13;
        byte b3 = 5;
        byte b4 = 6;
        cl5 cl5Var = ukd.f35823a;
        byte b5 = 2;
        byte b6 = 1;
        Function1 function1 = this.c;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    n0q n0qVar = o7k0.c;
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    boolean z = ((v81) l7m0Var.getValue()).e;
                    jm40 jm40Var = jm40.b;
                    if (z) {
                        fetVar.e0(1589225786);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1586731030);
                        WeakHashMap weakHashMap = djv0.w;
                        mm40 mm40VarK0 = j120.k0(jm40Var, zcm0.i(fetVar).o);
                        imm immVar = ((v81) l7m0Var.getValue()).f36958a.b;
                        boolean zG = fetVar.g(function1);
                        Object objP = fetVar.P();
                        if (zG || objP == cl5Var) {
                            objP = new nr0(function1, (byte) 16);
                            fetVar.o0(objP);
                        }
                        Function0 function0 = (Function0) objP;
                        boolean zG2 = fetVar.g(function1);
                        Object objP2 = fetVar.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new h61(function1, b6);
                            fetVar.o0(objP2);
                        }
                        hlm.c(mm40VarK0, immVar, null, function0, null, (Function1) objP2, null, null, null, null, u1c.M(-39837935, new o71(l7m0Var, function1, b4), fetVar), null, fetVar, 0, 6, 3028);
                        fetVar.r(false);
                    }
                    String str = ((v81) l7m0Var.getValue()).b;
                    if (str == null) {
                        fetVar.e0(1589282360);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1589282361);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarJ = s5x0.J(jm40Var, 4.0f);
                        boolean zG3 = fetVar.g(function1);
                        Object objP3 = fetVar.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new nr0(function1, (byte) 17);
                            fetVar.o0(objP3);
                        }
                        g8x.g(mm40VarJ, str, (Function0) objP3, fetVar, 0);
                        fetVar.r(false);
                    }
                    ohq0.g(o2e.e0(n0qVar, "AGGREGATOR_MULTI_GAME_WEB_VIEW"), ((v81) l7m0Var.getValue()).i, fetVar, 6);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                wb.b(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                uc9.a(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 3:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    imm immVarA = ((w11) l7m0Var.getValue()).a();
                    boolean zG4 = fetVar2.g(function1);
                    Object objP4 = fetVar2.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new nr0(function1, (byte) 10);
                        fetVar2.o0(objP4);
                    }
                    Function0 function2 = (Function0) objP4;
                    boolean zG5 = fetVar2.g(function1);
                    Object objP5 = fetVar2.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new y7(function1, (byte) 29);
                        fetVar2.o0(objP5);
                    }
                    hlm.c(null, immVarA, null, function2, null, (Function1) objP5, null, null, null, null, null, null, fetVar2, 0, 0, 4053);
                } else {
                    fetVar2.X();
                }
                break;
            case 4:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ju70.a(null, ((w11) l7m0Var.getValue()).b(), function1, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                break;
            case 5:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    fetVar4.X();
                } else if (((v81) l7m0Var.getValue()).e) {
                    fetVar4.e0(-1236606777);
                    boolean zG6 = fetVar4.g(function1);
                    Object objP6 = fetVar4.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new nr0(function1, (byte) 18);
                        fetVar4.o0(objP6);
                    }
                    mm40 mm40VarW = y860.W(jm40.b, null, null, false, null, (Function0) objP6, 28);
                    zcl zclVar2 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_collapse, 0, fetVar4), null, s5x0.J(o7k0.n(s5x0.J(mm40VarW, 2.0f), 34.0f), 4.0f), ((StaticColors) fetVar4.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar4, 56, 0);
                    fetVar4.r(false);
                } else {
                    fetVar4.e0(-1235812433);
                    fetVar4.r(false);
                }
                break;
            case 6:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    qc50 qc50Var = ((v81) l7m0Var.getValue()).f36958a.f2384a;
                    boolean z2 = qc50Var instanceof nc50;
                    jm40 jm40Var2 = jm40.b;
                    if (z2) {
                        fetVar5.e0(370457129);
                        nc50 nc50Var = (nc50) qc50Var;
                        ee eeVar = nc50Var.f23275a;
                        sd sdVar = nc50Var.b;
                        rd rdVar = nc50Var.c;
                        boolean zG7 = fetVar5.g(function1);
                        Object objP7 = fetVar5.P();
                        if (zG7 || objP7 == cl5Var) {
                            objP7 = new nr0(function1, b2);
                            fetVar5.o0(objP7);
                        }
                        jcb.f(jm40Var2, eeVar, sdVar, true, rdVar, (Function0) objP7, fetVar5, 6, 0);
                        fetVar5.r(false);
                    } else if (qc50Var instanceof oc50) {
                        fetVar5.e0(-1400076601);
                        zcl zclVar3 = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(jm40Var2, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                        oc50 oc50Var = (oc50) qc50Var;
                        String str2 = oc50Var.f25013a;
                        String str3 = oc50Var.b;
                        boolean zG8 = fetVar5.g(function1);
                        Object objP8 = fetVar5.P();
                        if (zG8 || objP8 == cl5Var) {
                            objP8 = new nr0(function1, (byte) 14);
                            fetVar5.o0(objP8);
                        }
                        Function0 function3 = (Function0) objP8;
                        boolean zG9 = fetVar5.g(function1);
                        Object objP9 = fetVar5.P();
                        if (zG9 || objP9 == cl5Var) {
                            objP9 = new nr0(function1, (byte) 15);
                            fetVar5.o0(objP9);
                        }
                        pzb.g(mm40VarN, str2, str3, function3, (Function0) objP9, fetVar5, 0);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(370506773);
                        fetVar5.r(false);
                    }
                } else {
                    fetVar5.X();
                }
                break;
            case 7:
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    zfn zfnVar = zaq0.b;
                    imm immVar2 = new imm(new ilm(((ThemeColors) fetVar6.k(zfnVar)).getSecondary()), new plm(((kg1) l7m0Var.getValue()).a(), ((ThemeColors) fetVar6.k(zfnVar)).getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, ((ThemeColors) fetVar6.k(zfnVar)).getSecondary()))), ((ThemeColors) fetVar6.k(zfnVar)).getBackgroundContent(), false, null);
                    boolean zG10 = fetVar6.g(function1);
                    Object objP10 = fetVar6.P();
                    if (zG10 || objP10 == cl5Var) {
                        objP10 = new nr0(function1, (byte) 26);
                        fetVar6.o0(objP10);
                    }
                    Function0 function4 = (Function0) objP10;
                    boolean zG11 = fetVar6.g(function1);
                    Object objP11 = fetVar6.P();
                    if (zG11 || objP11 == cl5Var) {
                        objP11 = new h61(function1, b3);
                        fetVar6.o0(objP11);
                    }
                    hlm.c(null, immVar2, null, function4, null, (Function1) objP11, null, null, null, null, null, null, fetVar6, 0, 0, 4053);
                } else {
                    fetVar6.X();
                }
                break;
            case 8:
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    y860.a(null, ((kg1) l7m0Var.getValue()).b(), function1, fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                kc5.L(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                jar0.v(l7m0Var, function1, (fet) obj, x8x.L(55));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ahy.e(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ahy.i(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ahy.F(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 14:
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    fetVar8.X();
                } else if (((Collection) ((l7m0) l7m0Var.getValue()).getValue()).isEmpty()) {
                    fetVar8.e0(131920707);
                    fetVar8.r(false);
                } else {
                    fetVar8.e0(131511321);
                    mtl mtlVar = new mtl((a4x) ((l7m0) l7m0Var.getValue()).getValue());
                    boolean zG12 = fetVar8.g(function1);
                    Object objP12 = fetVar8.P();
                    if (zG12 || objP12 == cl5Var) {
                        objP12 = new uo6(function1, b2);
                        fetVar8.o0(objP12);
                    }
                    bkb.f(null, mtlVar, null, false, null, (Function1) objP12, fetVar8, 0, 29);
                    fetVar8.r(false);
                }
                break;
            case 15:
                ((Integer) obj2).getClass();
                ny9.c(l7m0Var, function1, (fet) obj, x8x.L(7));
                break;
            case 16:
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    imm immVar3 = ((a29) l7m0Var.getValue()).f114a;
                    boolean zG13 = fetVar9.g(function1);
                    Object objP13 = fetVar9.P();
                    if (zG13 || objP13 == cl5Var) {
                        objP13 = new n19(function1, (byte) 5);
                        fetVar9.o0(objP13);
                    }
                    Function0 function5 = (Function0) objP13;
                    boolean zG14 = fetVar9.g(function1);
                    Object objP14 = fetVar9.P();
                    if (zG14 || objP14 == cl5Var) {
                        objP14 = new xz8(function1, b6);
                        fetVar9.o0(objP14);
                    }
                    Function1 function6 = (Function1) objP14;
                    boolean zG15 = fetVar9.g(function1);
                    Object objP15 = fetVar9.P();
                    if (zG15 || objP15 == cl5Var) {
                        objP15 = new xz8(function1, b5);
                        fetVar9.o0(objP15);
                    }
                    Function1 function7 = (Function1) objP15;
                    boolean zG16 = fetVar9.g(function1);
                    Object objP16 = fetVar9.P();
                    if (zG16 || objP16 == cl5Var) {
                        objP16 = new n19(function1, (byte) 6);
                        fetVar9.o0(objP16);
                    }
                    hlm.c(null, immVar3, null, function5, null, function6, function7, null, (Function0) objP16, null, null, null, fetVar9, 0, 0, 3733);
                } else {
                    fetVar9.X();
                }
                break;
            case 17:
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    s5x0.j(0, fetVar10, null, l7m0Var, function1);
                } else {
                    fetVar10.X();
                }
                break;
            case 18:
                ((Integer) obj2).getClass();
                cwr0.k(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                hew0.v(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                zgc.j(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                cjx.m(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                lv00.q(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                lv00.H(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                vfc.d(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                i120.o(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                fre0.s(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                unh0.o(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                acb.j(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                j120.m(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ o71(l7m0 l7m0Var, Function1 function1, int i, byte b) {
        this.f24762a = b;
        this.b = l7m0Var;
        this.c = function1;
    }

    public /* synthetic */ o71(l7m0 l7m0Var, Function1 function1, byte b) {
        this.f24762a = b;
        this.b = l7m0Var;
        this.c = function1;
    }
}
