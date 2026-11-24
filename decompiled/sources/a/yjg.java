package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yjg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42738a;
    public final /* synthetic */ g5h b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ qdz d;
    public final /* synthetic */ l7m0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ xcz h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ int k;

    public /* synthetic */ yjg(g5h g5hVar, pz40 pz40Var, qdz qdzVar, l7m0 l7m0Var, boolean z, boolean z2, xcz xczVar, Function1 function1, Function1 function2, int i, byte b) {
        this.f42738a = b;
        this.b = g5hVar;
        this.c = pz40Var;
        this.d = qdzVar;
        this.e = l7m0Var;
        this.f = z;
        this.g = z2;
        this.h = xczVar;
        this.i = function1;
        this.j = function2;
        this.k = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f42738a;
        int i = this.k;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ntr.P(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                cfx0.u(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
