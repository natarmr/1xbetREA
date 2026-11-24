package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eef0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7671a;
    public final /* synthetic */ hef0 b;

    public /* synthetic */ eef0(hef0 hef0Var, byte b) {
        this.f7671a = b;
        this.b = hef0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f7671a;
        hef0 hef0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                bby bbyVar = hef0Var.z;
                if (bbyVar != null) {
                    e3c.n(bbyVar);
                }
                hef0Var.N();
                break;
            default:
                th.getClass();
                p7m0 p7m0Var = hef0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    hef0Var.f.getClass();
                } while (!p7m0Var.m(value, aef0.a((aef0) value, null, true, null, 2041)));
                break;
        }
        return Unit.f46060a;
    }
}
