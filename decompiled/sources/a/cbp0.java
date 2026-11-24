package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cbp0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4072a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ l7m0 d;
    public final /* synthetic */ xcz e;
    public final /* synthetic */ qdz f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ Function1 h;

    public /* synthetic */ cbp0(mm40 mm40Var, l7m0 l7m0Var, l7m0 l7m0Var2, xcz xczVar, qdz qdzVar, Function1 function1, Function1 function2, int i, byte b) {
        this.f4072a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = l7m0Var2;
        this.e = xczVar;
        this.f = qdzVar;
        this.g = function1;
        this.h = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4072a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                dj8.R(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(433);
                cy2.t(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
