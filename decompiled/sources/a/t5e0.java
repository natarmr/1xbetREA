package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t5e0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33365a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ t5e0(Function1 function1, l7m0 l7m0Var) {
        this.f33365a = (byte) 21;
        this.c = function1;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f33365a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.c;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                xf0.v(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ay3.A(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ay3.B(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                hp4.r(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                kc5.v0(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 5:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarW = o050.W(jm40Var);
                    imm immVar = ((ade0) l7m0Var.getValue()).e;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new dvd0(function1, (byte) 17);
                        fetVar.o0(objP);
                    }
                    hlm.c(mm40VarW, immVar, null, null, null, (Function1) objP, null, null, null, null, null, null, fetVar, 0, 0, 4060);
                } else {
                    fetVar.X();
                }
                break;
            case 6:
                boolean z = false;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if ((iIntValue2 & 3) != 2) {
                    z = true;
                }
                if (fetVar2.U(iIntValue2 & 1, z)) {
                    mtl mtlVar = ((ade0) l7m0Var.getValue()).f;
                    boolean zG2 = fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new dvd0(function1, (byte) 16);
                        fetVar2.o0(objP2);
                    }
                    bkb.f(null, mtlVar, null, false, null, (Function1) objP2, fetVar2, 0, 29);
                } else {
                    fetVar2.X();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                kc5.U(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 8:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    imm immVar2 = ((ofe0) l7m0Var.getValue()).f25164a;
                    boolean zG3 = fetVar3.g(function1);
                    Object objP3 = fetVar3.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new evd0(function1, (byte) 22);
                        fetVar3.o0(objP3);
                    }
                    Function0 function0 = (Function0) objP3;
                    boolean zG4 = fetVar3.g(function1);
                    Object objP4 = fetVar3.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new dvd0(function1, (byte) 20);
                        fetVar3.o0(objP4);
                    }
                    hlm.c(null, immVar2, null, function0, null, (Function1) objP4, null, null, null, null, null, null, fetVar3, 0, 0, 4053);
                } else {
                    fetVar3.X();
                }
                break;
            case 9:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    see0 see0Var = ((ofe0) l7m0Var.getValue()).b;
                    if (see0Var instanceof qee0) {
                        fetVar4.e0(-504384336);
                        qee0 qee0Var = (qee0) see0Var;
                        ijl ijlVar = qee0Var.b;
                        jjl jjlVar = qee0Var.f28579a;
                        boolean zG5 = fetVar4.g(function1);
                        Object objP5 = fetVar4.P();
                        if (zG5 || objP5 == cl5Var) {
                            objP5 = new evd0(function1, (byte) 23);
                            fetVar4.o0(objP5);
                        }
                        Function0 function2 = (Function0) objP5;
                        boolean zG6 = fetVar4.g(function1);
                        Object objP6 = fetVar4.P();
                        if (zG6 || objP6 == cl5Var) {
                            objP6 = new evd0(function1, (byte) 18);
                            fetVar4.o0(objP6);
                        }
                        Function0 function3 = (Function0) objP6;
                        boolean zG7 = fetVar4.g(function1);
                        Object objP7 = fetVar4.P();
                        if (zG7 || objP7 == cl5Var) {
                            objP7 = new evd0(function1, (byte) 19);
                            fetVar4.o0(objP7);
                        }
                        feb.k(ijlVar, jjlVar, null, function2, function3, (Function0) objP7, fetVar4, 0, 4);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(-503721246);
                        fetVar4.r(false);
                    }
                } else {
                    fetVar4.X();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                dj8.K(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                rq8.w(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ny9.C(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ny9.B(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 14:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    l7m0 l7m0Var2 = ((nbf0) l7m0Var.getValue()).c;
                    boolean zG8 = fetVar5.g(function1);
                    Object objP8 = fetVar5.P();
                    if (zG8 || objP8 == cl5Var) {
                        objP8 = new pme0(function1, (byte) 5);
                        fetVar5.o0(objP8);
                    }
                    r7x.i(null, l7m0Var2, (Function0) objP8, fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                break;
            case 15:
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    imm immVar3 = ((qgf0) l7m0Var.getValue()).c;
                    boolean zG9 = fetVar6.g(function1);
                    Object objP9 = fetVar6.P();
                    if (zG9 || objP9 == cl5Var) {
                        objP9 = new pme0(function1, (byte) 8);
                        fetVar6.o0(objP9);
                    }
                    Function0 function4 = (Function0) objP9;
                    boolean zG10 = fetVar6.g(function1);
                    Object objP10 = fetVar6.P();
                    if (zG10 || objP10 == cl5Var) {
                        objP10 = new pme0(function1, (byte) 9);
                        fetVar6.o0(objP10);
                    }
                    hlm.c(jm40.b, immVar3, null, function4, (Function0) objP10, null, null, null, null, null, null, null, fetVar6, 805306374, 54, Response.ADDRESS_INCOMPLETE);
                } else {
                    fetVar6.X();
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                saj.G(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                d7g0.c(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                knx.J(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zG11 = fetVar7.g(function1);
                    Object objP11 = fetVar7.P();
                    if (zG11 || objP11 == cl5Var) {
                        objP11 = new pme0(function1, (byte) 21);
                        fetVar7.o0(objP11);
                    }
                    Function0 function5 = (Function0) objP11;
                    boolean zG12 = fetVar7.g(function1);
                    Object objP12 = fetVar7.P();
                    if (zG12 || objP12 == cl5Var) {
                        objP12 = new pme0(function1, (byte) 22);
                        fetVar7.o0(objP12);
                    }
                    c3x.k(l7m0Var, function5, (Function0) objP12, fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                break;
            case 20:
                ((Integer) obj2).getClass();
                ahy.J(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 21:
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    fetVar8.X();
                } else if (((ung0) l7m0Var.getValue()).b) {
                    fetVar8.e0(485511607);
                    mm40 mm40VarW2 = o050.W(o7k0.d(jm40Var, 1.0f));
                    zfn zfnVar = zaq0.b;
                    imm immVar4 = new imm(new ilm(((ThemeColors) fetVar8.k(zfnVar)).getSecondary()), new plm(((ung0) l7m0Var.getValue()).f35960a, ha50.THREE_LINES, ((ThemeColors) fetVar8.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar8.k(zfnVar)).getBackgroundContent(), true, null);
                    boolean zG13 = fetVar8.g(function1);
                    Object objP13 = fetVar8.P();
                    if (zG13 || objP13 == cl5Var) {
                        objP13 = new pme0(function1, (byte) 29);
                        fetVar8.o0(objP13);
                    }
                    hlm.c(mm40VarW2, immVar4, null, (Function0) objP13, null, null, null, null, null, null, null, null, fetVar8, 805306368, 54, 500);
                    fetVar8.r(false);
                } else {
                    fetVar8.e0(486672929);
                    fetVar8.r(false);
                }
                break;
            case 22:
                ((Integer) obj2).getClass();
                m7x.n(l7m0Var, function1, (fet) obj, x8x.L(7));
                break;
            case 23:
                ((Integer) obj2).getClass();
                p7x.k(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                bww.t(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                bww.a(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                ohq0.O(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                jar0.F(l7m0Var, function1, (fet) obj, x8x.L(7));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                cwr0.C(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            default:
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    mm40 mm40VarW3 = o050.W(jm40Var);
                    imm immVar5 = ((c8i0) l7m0Var.getValue()).g;
                    boolean zG14 = fetVar9.g(function1);
                    Object objP14 = fetVar9.P();
                    if (zG14 || objP14 == cl5Var) {
                        objP14 = new w7i0(function1, (byte) 0);
                        fetVar9.o0(objP14);
                    }
                    hlm.c(mm40VarW3, immVar5, null, (Function0) objP14, null, null, null, null, null, null, null, null, fetVar9, 805306368, 54, 500);
                } else {
                    fetVar9.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ t5e0(l7m0 l7m0Var, Function1 function1, int i, byte b) {
        this.f33365a = b;
        this.b = l7m0Var;
        this.c = function1;
    }

    public /* synthetic */ t5e0(l7m0 l7m0Var, Function1 function1, byte b) {
        this.f33365a = b;
        this.b = l7m0Var;
        this.c = function1;
    }
}
