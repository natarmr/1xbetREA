package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o210 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24508a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ g2v d;
    public final /* synthetic */ xcz e;
    public final /* synthetic */ qdz f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ int i;

    public /* synthetic */ o210(l7m0 l7m0Var, l7m0 l7m0Var2, g2v g2vVar, xcz xczVar, qdz qdzVar, Function1 function1, Function0 function0, int i, byte b) {
        this.f24508a = b;
        this.b = l7m0Var;
        this.c = l7m0Var2;
        this.d = g2vVar;
        this.e = xczVar;
        this.f = qdzVar;
        this.g = function1;
        this.h = function0;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24508a) {
            case 0:
                ((Integer) obj2).intValue();
                phu0.i(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(this.i | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                cy2.f(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(this.i | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                b34.o(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, x8x.L(this.i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
