package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h9v0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12696a;
    public final /* synthetic */ j9v0 b;

    public /* synthetic */ h9v0(j9v0 j9v0Var, byte b) {
        this.f12696a = b;
        this.b = j9v0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        byte b = this.f12696a;
        j9v0 j9v0Var = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = j9v0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    j9v0Var.f.getClass();
                } while (!p7m0Var.m(value, e9v0.a((e9v0) value, false, false, null, 0, 14)));
                break;
            default:
                p7m0 p7m0Var2 = j9v0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    j9v0Var.f.getClass();
                } while (!p7m0Var2.m(value2, e9v0.a((e9v0) value2, false, false, null, 0, 14)));
                break;
        }
        return Unit.f46060a;
    }
}
