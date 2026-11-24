package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zi6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44427a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ ugd g;

    public /* synthetic */ zi6(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, Function1 function1, Function1 function2, ugd ugdVar, int i, byte b) {
        this.f44427a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = xczVar;
        this.e = function1;
        this.f = function2;
        this.g = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f44427a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(196609);
                ju70.f(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(196609);
                x8f.p(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
