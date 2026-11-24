package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t7n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33477a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ w7n c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ t7n(mm40 mm40Var, w7n w7nVar, boolean z, Function0 function0, int i, byte b) {
        this.f33477a = b;
        this.b = mm40Var;
        this.c = w7nVar;
        this.d = z;
        this.e = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33477a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                v7n.a(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                v7n.b(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
