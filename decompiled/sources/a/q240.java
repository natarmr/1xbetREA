package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q240 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27983a;
    public final /* synthetic */ j340 b;

    public /* synthetic */ q240(j340 j340Var, byte b) {
        this.f27983a = b;
        this.b = j340Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f27983a;
        j340 j340Var = this.b;
        switch (b) {
            case 0:
                j340Var.q.d(new p240(j340Var, (byte) 14));
                break;
            case 1:
                p7m0 p7m0Var = j340Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    j340Var.f.getClass();
                } while (!p7m0Var.m(value, d140.a((d140) value, false, false, false, null, null, null, null, null, null, false, false, null, false, null, null, null, null, null, null, 1073739775)));
                break;
            default:
                j340Var.G(a140.f52a);
                break;
        }
        return Unit.f46060a;
    }
}
