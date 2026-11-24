package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i2k0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14052a;
    public final /* synthetic */ l2k0 b;

    public /* synthetic */ i2k0(l2k0 l2k0Var, byte b) {
        this.f14052a = b;
        this.b = l2k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        byte b = this.f14052a;
        l2k0 l2k0Var = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th.getClass();
                str.getClass();
                bby bbyVar = l2k0Var.G;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                p7m0 p7m0Var = l2k0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    l2k0Var.f.getClass();
                } while (!p7m0Var.m(value, f2k0.a((f2k0) value, null, null, null, ui5.c, false, 0, 231)));
                break;
            default:
                th.getClass();
                str.getClass();
                bby bbyVar2 = l2k0Var.G;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                p7m0 p7m0Var2 = l2k0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    l2k0Var.f.getClass();
                } while (!p7m0Var2.m(value2, f2k0.a((f2k0) value2, null, null, null, ui5.d, false, 0, 231)));
                break;
        }
        return Unit.f46060a;
    }
}
