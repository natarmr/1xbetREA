package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uwj implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36395a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ qdz e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ int h;

    public /* synthetic */ uwj(pz40 pz40Var, l7m0 l7m0Var, xcz xczVar, qdz qdzVar, Function1 function1, Function1 function2, int i, byte b) {
        this.f36395a = b;
        this.b = pz40Var;
        this.c = l7m0Var;
        this.d = xczVar;
        this.e = qdzVar;
        this.f = function1;
        this.g = function2;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f36395a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                wwj.a(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                vbw0.t(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
