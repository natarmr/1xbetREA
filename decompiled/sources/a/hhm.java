package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hhm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13071a;
    public final /* synthetic */ xk80 b;
    public final /* synthetic */ int c;

    public /* synthetic */ hhm(xk80 xk80Var, int i) {
        this.f13071a = (byte) 2;
        this.b = xk80Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (this.f13071a) {
            case 0:
                num.getClass();
                lgb.c(this.b, this.c, fetVar, x8x.L(1));
                break;
            case 1:
                num.getClass();
                lgb.c(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                num.intValue();
                wdx.n(this.b, fetVar, x8x.L(this.c | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ hhm(xk80 xk80Var, int i, int i2, byte b) {
        this.f13071a = b;
        this.b = xk80Var;
        this.c = i;
    }
}
