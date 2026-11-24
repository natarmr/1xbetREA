package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o72 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24764a;
    public final /* synthetic */ s72 b;

    public /* synthetic */ o72(s72 s72Var, byte b) {
        this.f24764a = b;
        this.b = s72Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f24764a;
        s72 s72Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                s72Var.B.f(th, new o72(s72Var, (byte) 1));
                break;
            case 1:
                s72Var.G(new a72(s72Var.u.b.a(((Integer) obj).intValue(), Arrays.copyOf(new Object[0], 0))));
                break;
            default:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                p7m0 p7m0Var = s72Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    s72Var.f.getClass();
                } while (!p7m0Var.m(value, g72.a((g72) value, null, null, false, new c72(th2), false, false, false, false, false, null, null, null, 522223)));
                break;
        }
        return Unit.f46060a;
    }
}
