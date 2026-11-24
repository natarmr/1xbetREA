package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d8i0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5650a;
    public final /* synthetic */ e8i0 b;

    public /* synthetic */ d8i0(e8i0 e8i0Var, byte b) {
        this.f5650a = b;
        this.b = e8i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        byte b = this.f5650a;
        e8i0 e8i0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                p7m0 p7m0Var = e8i0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    e8i0Var.f.getClass();
                } while (!p7m0Var.m(value, b8i0.a((b8i0) value, false, 60)));
                e8i0Var.q.b(th, new uph0(e8i0Var, (byte) 8));
                break;
            default:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                p7m0 p7m0Var2 = e8i0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    e8i0Var.f.getClass();
                } while (!p7m0Var2.m(value2, b8i0.a((b8i0) value2, false, 62)));
                e8i0Var.q.b(th2, new kqh0(e8i0Var, th2, (byte) 4));
                break;
        }
        return Unit.f46060a;
    }
}
