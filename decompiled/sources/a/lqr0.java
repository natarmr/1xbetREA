package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lqr0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20499a;
    public final /* synthetic */ k3t0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ lqr0(k3t0 k3t0Var, int i, int i2, byte b) {
        this.f20499a = b;
        this.b = k3t0Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20499a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                oja0.T(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                ffb0.I(this.b, this.c, fetVar, x8x.L(9));
                break;
        }
        return Unit.f46060a;
    }
}
