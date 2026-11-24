package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c1i0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3573a;
    public final /* synthetic */ g1i0 b;

    public /* synthetic */ c1i0(g1i0 g1i0Var, byte b) {
        this.f3573a = b;
        this.b = g1i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        byte b = this.f3573a;
        g1i0 g1i0Var = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = g1i0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    g1i0Var.f.getClass();
                } while (!p7m0Var.m(value, s0i0.a((s0i0) value, null, null, null, false, false, 15)));
                break;
            default:
                p7m0 p7m0Var2 = g1i0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    g1i0Var.f.getClass();
                } while (!p7m0Var2.m(value2, s0i0.a((s0i0) value2, null, null, null, false, false, 15)));
                break;
        }
        return Unit.f46060a;
    }
}
