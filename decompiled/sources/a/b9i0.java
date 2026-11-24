package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b9i0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2211a;
    public final /* synthetic */ c9i0 b;

    public /* synthetic */ b9i0(c9i0 c9i0Var, byte b) {
        this.f2211a = b;
        this.b = c9i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f2211a;
        c9i0 c9i0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                c9i0Var.q.b(th, new d1i0((byte) 4));
                break;
            default:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                p7m0 p7m0Var = c9i0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    c9i0Var.f.getClass();
                } while (!p7m0Var.m(value, z8i0.a((z8i0) value, false, null, 0, false, false, false, 31)));
                c9i0Var.q.b(th2, new uph0(c9i0Var, (byte) 10));
                break;
        }
        return Unit.f46060a;
    }
}
