package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wjg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39261a;
    public final /* synthetic */ g5h b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ xcz f;
    public final /* synthetic */ qdz g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ Function1 i;

    public /* synthetic */ wjg(g5h g5hVar, l7m0 l7m0Var, boolean z, boolean z2, xcz xczVar, qdz qdzVar, Function1 function1, Function1 function2, int i, byte b) {
        this.f39261a = b;
        this.b = g5hVar;
        this.c = l7m0Var;
        this.d = z;
        this.e = z2;
        this.f = xczVar;
        this.g = qdzVar;
        this.h = function1;
        this.i = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f39261a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                ntr.K(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                cfx0.q(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
