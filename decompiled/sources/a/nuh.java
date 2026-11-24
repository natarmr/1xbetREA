package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nuh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24146a;
    public final /* synthetic */ ir8 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ nuh(ir8 ir8Var, l7m0 l7m0Var, Function1 function1, int i, byte b) {
        this.f24146a = b;
        this.b = ir8Var;
        this.c = l7m0Var;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24146a;
        int i = this.e;
        Function1 function1 = this.d;
        l7m0 l7m0Var = this.c;
        ir8 ir8Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                gkb.e(ir8Var, l7m0Var, function1, fetVar, x8x.L(i | 1));
                break;
            case 1:
                o050.o(ir8Var, l7m0Var, function1, fetVar, x8x.L(i | 1));
                break;
            case 2:
                kkb.i(ir8Var, l7m0Var, function1, fetVar, x8x.L(i | 1));
                break;
            case 3:
                saj.E(ir8Var, l7m0Var, function1, fetVar, x8x.L(i | 1));
                break;
            case 4:
                hhm0.k(ir8Var, l7m0Var, function1, fetVar, x8x.L(i | 1));
                break;
            case 5:
                ju70.I(ir8Var, l7m0Var, function1, fetVar, x8x.L(i | 1));
                break;
            default:
                ohm0.g(ir8Var, l7m0Var, function1, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
