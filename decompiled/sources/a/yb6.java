package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yb6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42326a;
    public final /* synthetic */ zb6 b;
    public final /* synthetic */ wb6 c;

    public /* synthetic */ yb6(zb6 zb6Var, wb6 wb6Var, int i, byte b) {
        this.f42326a = b;
        this.b = zb6Var;
        this.c = wb6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f42326a;
        wb6 wb6Var = this.c;
        zb6 zb6Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                kc5.P(zb6Var, wb6Var, fetVar, x8x.L(1));
                break;
            default:
                kc5.e0(zb6Var, wb6Var, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
