package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bv90 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3269a;
    public final /* synthetic */ pdm0 b;

    public /* synthetic */ bv90(pdm0 pdm0Var, int i, byte b) {
        this.f3269a = b;
        this.b = pdm0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3269a;
        pdm0 pdm0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ucx.b(pdm0Var, fetVar, x8x.L(1));
                break;
            default:
                hfm0.a(pdm0Var, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
