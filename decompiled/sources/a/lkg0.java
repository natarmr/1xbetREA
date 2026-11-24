package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lkg0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20202a;
    public final /* synthetic */ kkg0 b;

    public /* synthetic */ lkg0(kkg0 kkg0Var, int i, byte b) {
        this.f20202a = b;
        this.b = kkg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20202a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                j120.A(this.b, fetVar, x8x.L(1));
                break;
            case 1:
                j120.x(this.b, fetVar, x8x.L(1));
                break;
            default:
                j120.w(this.b, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
