package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gc30 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11041a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ fqj0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ gc30(mm40 mm40Var, fqj0 fqj0Var, int i, byte b) {
        this.f11041a = b;
        this.b = mm40Var;
        this.c = fqj0Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (this.f11041a) {
            case 0:
                num.intValue();
                yyw.b(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 1:
                num.intValue();
                pzw.a(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 2:
                num.intValue();
                pzw.s(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 3:
                num.getClass();
                r7x.h(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            default:
                num.getClass();
                a8k0.i(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
        }
        return Unit.f46060a;
    }
}
