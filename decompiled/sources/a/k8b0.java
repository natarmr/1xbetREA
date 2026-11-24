package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k8b0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17866a;
    public final /* synthetic */ g9b0 b;

    public /* synthetic */ k8b0(g9b0 g9b0Var, byte b) {
        this.f17866a = b;
        this.b = g9b0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17866a;
        g9b0 g9b0Var = this.b;
        switch (b) {
            case 0:
                g9b0Var.E.q(new bb50(false), true);
                break;
            default:
                p7m0 p7m0Var = g9b0Var.F;
                v8b0 v8b0Var = new v8b0(false);
                p7m0Var.getClass();
                p7m0Var.o(null, v8b0Var);
                break;
        }
        return Unit.f46060a;
    }
}
