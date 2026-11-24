package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class upk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36069a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ qdz e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 g;

    public /* synthetic */ upk(l7m0 l7m0Var, l7m0 l7m0Var2, xcz xczVar, qdz qdzVar, Function1 function1, Function1 function2, int i, byte b) {
        this.f36069a = b;
        this.b = l7m0Var;
        this.c = l7m0Var2;
        this.d = xczVar;
        this.e = qdzVar;
        this.f = function1;
        this.g = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36069a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(439);
                dwi0.m(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(439);
                ay3.o(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(439);
                kc5.W(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }
}
