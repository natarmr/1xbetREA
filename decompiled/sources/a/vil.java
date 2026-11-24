package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vil implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37484a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ vil(mm40 mm40Var, float f, float f2, int i, byte b) {
        this.f37484a = b;
        this.b = mm40Var;
        this.c = f;
        this.d = f2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37484a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                jcb.t(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 1:
                e9x.c(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 2:
                c9x.b(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 3:
                d9x.e(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            default:
                x8x.c(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
