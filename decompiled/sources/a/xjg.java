package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xjg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40983a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ g5h c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ xjg(l7m0 l7m0Var, g5h g5hVar, boolean z, Function1 function1, int i, byte b) {
        this.f40983a = b;
        this.b = l7m0Var;
        this.c = g5hVar;
        this.d = z;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f40983a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ntr.p(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                cfx0.g(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
