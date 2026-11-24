package a;

import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ckq0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4520a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ ckq0(l7m0 l7m0Var, Function1 function1, byte b) {
        this.f4520a = b;
        this.b = l7m0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4520a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.c;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                boolean z = false;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if ((iIntValue & 3) != 2) {
                    z = true;
                }
                if (fetVar.U(iIntValue & 1, z)) {
                    mm40 mm40VarW = o050.W(jm40Var);
                    imm immVar = ((jkq0) l7m0Var.getValue()).h;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new o0q0(function1, (byte) 13);
                        fetVar.o0(objP);
                    }
                    hlm.c(mm40VarW, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 805306368, 54, 500);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    itl itlVar = ((jkq0) l7m0Var.getValue()).j;
                    if (itlVar == null) {
                        fetVar2.e0(2066901155);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(2066901156);
                        mtl mtlVar = new mtl(dyb.g0(itlVar));
                        boolean zG2 = fetVar2.g(function1);
                        Object objP2 = fetVar2.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new coo0(function1, (byte) 23);
                            fetVar2.o0(objP2);
                        }
                        bkb.f(jm40.b, mtlVar, null, false, null, (Function1) objP2, fetVar2, 6, 28);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                cjx.n(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                y860.T(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                dqm0.f(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ju70.H(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                cwr0.H(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                f1t0.J(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                f1t0.E(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                f1t0.p(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                nsm0.i(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                dwi0.E(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                j47.s0(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                jd8.W(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                x8f.V(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                cjx.L(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                cjx.E(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                vsm0.h(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 18:
                boolean z2 = false;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if ((iIntValue3 & 3) != 2) {
                    z2 = true;
                }
                if (fetVar3.U(iIntValue3 & 1, z2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    uc50 uc50Var = ((f9v0) l7m0Var.getValue()).d;
                    boolean zG3 = fetVar3.g(function1);
                    Object objP3 = fetVar3.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new szu0(function1, (byte) 3);
                        fetVar3.o0(objP3);
                    }
                    vtb.v(mm40VarD, (Function1) objP3, uc50Var, fetVar3, 6, 8);
                } else {
                    fetVar3.X();
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                knx.p(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ihm0.e(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                gq80.Z(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                wha0.H(l7m0Var, function1, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ckq0(l7m0 l7m0Var, Function1 function1, int i, byte b) {
        this.f4520a = b;
        this.b = l7m0Var;
        this.c = function1;
    }
}
