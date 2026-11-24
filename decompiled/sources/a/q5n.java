package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q5n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28159a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ int c;
    public final /* synthetic */ qao0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ int g;

    public /* synthetic */ q5n(a4x a4xVar, int i, qao0 qao0Var, boolean z, Function1 function1, int i2, byte b) {
        this.f28159a = b;
        this.b = a4xVar;
        this.c = i;
        this.d = qao0Var;
        this.e = z;
        this.f = function1;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28159a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                z5n.k(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                z5n.i(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
