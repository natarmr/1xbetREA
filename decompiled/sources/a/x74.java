package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x74 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40395a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ x74(mm40 mm40Var, l7m0 l7m0Var, Function1 function1, int i, byte b) {
        this.f40395a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f40395a;
        int i = this.e;
        Function1 function1 = this.d;
        l7m0 l7m0Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                o2e.i(x8x.L(i | 1), fetVar, mm40Var, l7m0Var, function1);
                break;
            case 1:
                ffb0.f(x8x.L(i | 1), fetVar, mm40Var, l7m0Var, function1);
                break;
            case 2:
                vtb.A(x8x.L(i | 1), fetVar, mm40Var, l7m0Var, function1);
                break;
            default:
                o5n0.k(x8x.L(i | 1), fetVar, mm40Var, l7m0Var, function1);
                break;
        }
        return Unit.f46060a;
    }
}
