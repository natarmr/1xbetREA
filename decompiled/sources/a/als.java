package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class als implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1083a;
    public final /* synthetic */ bls b;

    public /* synthetic */ als(bls blsVar, int i, byte b) {
        this.f1083a = b;
        this.b = blsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1083a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                tdc.q(this.b, fetVar, x8x.L(1));
                break;
            case 1:
                tdc.w(this.b, fetVar, x8x.L(49));
                break;
            default:
                tdc.g(this.b, fetVar, x8x.L(49));
                break;
        }
        return Unit.f46060a;
    }
}
