package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i23 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14029a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ int d;

    public /* synthetic */ i23(mm40 mm40Var, ugd ugdVar, int i, byte b) {
        this.f14029a = b;
        this.b = mm40Var;
        this.c = ugdVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f14029a;
        int i = this.d;
        ugd ugdVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                mrv.U(mm40Var, ugdVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                mrv.V(mm40Var, ugdVar, fetVar, x8x.L(i | 1));
                break;
            case 2:
                v3c.b(mm40Var, ugdVar, fetVar, x8x.L(i | 1));
                break;
            case 3:
                vfc.j(mm40Var, ugdVar, fetVar, x8x.L(i | 1));
                break;
            case 4:
                xxj.d(mm40Var, ugdVar, fetVar, x8x.L(i | 1));
                break;
            case 5:
                efx.j(mm40Var, ugdVar, fetVar, x8x.L(i | 1));
                break;
            case 6:
                efx.i(mm40Var, ugdVar, fetVar, x8x.L(i | 1));
                break;
            case 7:
                f1t0.o(mm40Var, ugdVar, fetVar, x8x.L(i | 1));
                break;
            case 8:
                wpm0.a(mm40Var, ugdVar, fetVar, x8x.L(i | 1));
                break;
            default:
                dqm0.c(mm40Var, ugdVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
