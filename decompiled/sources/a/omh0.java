package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class omh0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25504a;
    public final /* synthetic */ qmh0 b;

    public /* synthetic */ omh0(qmh0 qmh0Var, byte b) {
        this.f25504a = b;
        this.b = qmh0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        byte b = this.f25504a;
        qmh0 qmh0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                qmh0Var.w.b(th, new dke0(qmh0Var, (byte) 28));
                break;
            default:
                oyg0 oyg0Var = qmh0Var.f;
                ocj ocjVar = qmh0Var.i;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                if (th2 instanceof uun) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value2, mmh0.a((mmh0) value2, new ilh0(z1o.f43631a), null, false, 0, null, null, null, false, null, 510)));
                } else if (((mmh0) qmh0Var.D()).b.isEmpty()) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value, mmh0.a((mmh0) value, new ilh0(z1o.b), null, false, 0, null, null, null, false, null, 510)));
                }
                break;
        }
        return Unit.f46060a;
    }
}
