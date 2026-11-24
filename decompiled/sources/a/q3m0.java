package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q3m0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28060a;
    public final /* synthetic */ int b;
    public final /* synthetic */ dp20 c;

    public /* synthetic */ q3m0(int i, dp20 dp20Var, int i2, byte b) {
        this.f28060a = b;
        this.b = i;
        this.c = dp20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28060a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                r3m0.d(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                r3m0.a(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
