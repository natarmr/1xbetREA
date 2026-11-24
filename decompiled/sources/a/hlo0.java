package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hlo0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13274a;
    public final /* synthetic */ vlo0 b;

    public /* synthetic */ hlo0(vlo0 vlo0Var, int i, byte b) {
        this.f13274a = b;
        this.b = vlo0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13274a;
        vlo0 vlo0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                k7n0.f(vlo0Var, fetVar, x8x.L(1));
                break;
            case 1:
                k7n0.g(vlo0Var, fetVar, x8x.L(1));
                break;
            default:
                k7n0.h(vlo0Var, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
