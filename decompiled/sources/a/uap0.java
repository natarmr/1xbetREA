package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uap0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35343a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ xcz c;
    public final /* synthetic */ qdz d;
    public final /* synthetic */ l7m0 e;
    public final /* synthetic */ l7m0 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ int h;

    public /* synthetic */ uap0(mm40 mm40Var, xcz xczVar, qdz qdzVar, l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, int i, byte b) {
        this.f35343a = b;
        this.b = mm40Var;
        this.c = xczVar;
        this.d = qdzVar;
        this.e = l7m0Var;
        this.f = l7m0Var2;
        this.g = function1;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35343a) {
            case 0:
                ((Integer) obj2).getClass();
                jd8.M(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(this.h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                wb.u(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(this.h | 1));
                break;
        }
        return Unit.f46060a;
    }
}
