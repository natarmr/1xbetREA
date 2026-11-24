package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u7i0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35185a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ u7i0(l7m0 l7m0Var, Function1 function1, byte b) {
        this.f35185a = b;
        this.b = l7m0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35185a;
        jm40 jm40Var = jm40.b;
        byte b2 = 8;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.c;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mtl mtlVar = ((c8i0) l7m0Var.getValue()).i;
                    if (mtlVar == null) {
                        fetVar.e0(-1373081054);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1373081053);
                        boolean zG = fetVar.g(function1);
                        Object objP = fetVar.P();
                        if (zG || objP == cl5Var) {
                            objP = new abh0(function1, b2);
                            fetVar.o0(objP);
                        }
                        bkb.f(jm40.b, mtlVar, null, false, null, (Function1) objP, fetVar, 6, 28);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                cwr0.m(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                f1t0.G(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarW = o050.W(jm40Var);
                    imm immVar = ((a9i0) l7m0Var.getValue()).d;
                    boolean zG2 = fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new w7i0(function1, (byte) 2);
                        fetVar2.o0(objP2);
                    }
                    hlm.c(mm40VarW, immVar, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar2, 0, 0, 4084);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 4:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mtl mtlVar2 = ((a9i0) l7m0Var.getValue()).f;
                    if (mtlVar2 == null) {
                        fetVar3.e0(335130105);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(335130106);
                        boolean zG3 = fetVar3.g(function1);
                        Object objP3 = fetVar3.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new abh0(function1, (byte) 9);
                            fetVar3.o0(objP3);
                        }
                        bkb.f(jm40.b, mtlVar2, null, false, null, (Function1) objP3, fetVar3, 6, 28);
                        fetVar3.r(false);
                    }
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                f1t0.n(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                i4w0.H(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mm40 mm40VarW2 = o050.W(jm40Var);
                    imm immVar2 = ((tli0) l7m0Var.getValue()).h;
                    boolean zG4 = fetVar4.g(function1);
                    Object objP4 = fetVar4.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new w7i0(function1, (byte) 3);
                        fetVar4.o0(objP4);
                    }
                    hlm.c(mm40VarW2, immVar2, null, (Function0) objP4, null, null, null, null, null, null, null, null, fetVar4, 805306368, 54, 500);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 8:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    mtl mtlVar3 = ((tli0) l7m0Var.getValue()).j;
                    if (mtlVar3 == null) {
                        fetVar5.e0(99156178);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(99156179);
                        boolean zG5 = fetVar5.g(function1);
                        Object objP5 = fetVar5.P();
                        if (zG5 || objP5 == cl5Var) {
                            objP5 = new abh0(function1, (byte) 10);
                            fetVar5.o0(objP5);
                        }
                        bkb.f(jm40.b, mtlVar3, null, false, null, (Function1) objP5, fetVar5, 6, 28);
                        fetVar5.r(false);
                    }
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                i4w0.p(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                dwi0.y(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                ay3.E(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                o050.E(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    xxl0 xxl0Var = (xxl0) l7m0Var.getValue();
                    if (xxl0Var != null) {
                        if (xxl0Var instanceof vxl0) {
                            fetVar6.e0(1462037337);
                            q5x.y(0, fetVar6);
                            fetVar6.r(false);
                        } else if (xxl0Var instanceof uxl0) {
                            fetVar6.e0(1462039526);
                            gq80.v(((uxl0) xxl0Var).b, function1, fetVar6, 0);
                            fetVar6.r(false);
                        } else if (xxl0Var instanceof wxl0) {
                            fetVar6.e0(1462045173);
                            z1x.o((wxl0) xxl0Var, function1, fetVar6, 8);
                            fetVar6.r(false);
                        }
                    }
                    throw b1j.f(1462035205, fetVar6, false);
                }
                fetVar6.X();
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                gq80.U(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                h8x.o(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                l8x.M(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                hxm0.f(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                fen0.d(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                f1t0.I(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                w7n0.k(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                j47.p0(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                j47.S(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                ohm0.d(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                ny9.J(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                p8a.I(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                ofm0.e(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                q8a.F(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                tke.N(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                cjx.K(l7m0Var, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ u7i0(l7m0 l7m0Var, Function1 function1, int i, byte b) {
        this.f35185a = b;
        this.b = l7m0Var;
        this.c = function1;
    }
}
