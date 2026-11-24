package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pbg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26705a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ pbg(a4x a4xVar, Function1 function1, Function0 function0) {
        this.f26705a = (byte) 4;
        this.b = a4xVar;
        this.d = function1;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26705a;
        Function1 function1 = this.d;
        a4x a4xVar = this.b;
        Function0 function0 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                tke.s(x8x.L(1), (fet) obj, a4xVar, function0, function1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                j2e.C(x8x.L(1), (fet) obj, a4xVar, function0, function1);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ulb.y(x8x.L(1), (fet) obj, a4xVar, function0, function1);
                break;
            case 3:
                ((Integer) obj2).getClass();
                sj3.G(x8x.L(1), (fet) obj, a4xVar, function0, function1);
                break;
            case 4:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarG = o7k0.g(mm40VarD, 0.0f, 1024.0f, 1);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarG);
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
                    tdc.m(s5x0.N(jm40Var, 12.0f, 10.0f, 12.0f, 0.0f, 8), this.b, t3n.f33276a, true, null, this.d, fetVar, 3456, 16);
                    boolean zG = fetVar.g(function0);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new dbn(function0, (byte) 13);
                        fetVar.o0(objP);
                    }
                    x1x.l(0, 0, fetVar, s5x0.M(jm40Var, 12.0f, 24.0f, 12.0f, 12.0f), (Function0) objP);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                dwi0.w(x8x.L(1), (fet) obj, a4xVar, function0, function1);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ pbg(a4x a4xVar, Function0 function0, Function1 function1, int i, byte b) {
        this.f26705a = b;
        this.b = a4xVar;
        this.c = function0;
        this.d = function1;
    }

    public /* synthetic */ pbg(a4x a4xVar, Function1 function1, Function0 function0, int i) {
        this.f26705a = (byte) 5;
        this.b = a4xVar;
        this.d = function1;
        this.c = function0;
    }
}
