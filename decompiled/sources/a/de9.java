package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class de9 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5938a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ de9(mm40 mm40Var, a4x a4xVar, Function1 function1) {
        this.f5938a = (byte) 6;
        this.b = mm40Var;
        this.c = a4xVar;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5938a;
        mm40 mm40Var = this.b;
        Function1 function1 = this.d;
        a4x a4xVar = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                j120.j(x8x.L(1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                hic.a(x8x.L(1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 2:
                ((Integer) obj2).getClass();
                p8a.C(x8x.L(1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 3:
                ((Integer) obj2).getClass();
                q0x.g(x8x.L(1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 4:
                ((Integer) obj2).getClass();
                s0x.a(x8x.L(1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 5:
                ((Integer) obj2).getClass();
                wdx.q(x8x.L(7), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 6:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = xfn.a(fetVar).d;
                    float f2 = xfn.a(fetVar).d;
                    zcl zclVar = qmk.f28987a;
                    ch80 ch80VarF = knm0.f(s5x0.u(f, 0.0f, f2, 24.0f, 2), fetVar);
                    boolean zG = fetVar.g(a4xVar) | fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new or0(a4xVar, function1, (byte) 29);
                        fetVar.o0(objP);
                    }
                    b8k0.e(this.b, null, ch80VarF, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
                } else {
                    fetVar.X();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                y860.S(x8x.L(7), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 8:
                ((Integer) obj2).getClass();
                ju70.F(x8x.L(7), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 9:
                ((Integer) obj2).getClass();
                afn0.f(x8x.L(1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            default:
                ((Integer) obj2).getClass();
                hfm0.j(x8x.L(1), (fet) obj, a4xVar, mm40Var, function1);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ de9(mm40 mm40Var, a4x a4xVar, Function1 function1, int i, byte b) {
        this.f5938a = b;
        this.b = mm40Var;
        this.c = a4xVar;
        this.d = function1;
    }
}
