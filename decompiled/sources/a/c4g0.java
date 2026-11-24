package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c4g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3724a;
    public final /* synthetic */ k4g0 b;

    public /* synthetic */ c4g0(k4g0 k4g0Var, byte b) {
        this.f3724a = b;
        this.b = k4g0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        byte b = this.f3724a;
        k4g0 k4g0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                p7m0 p7m0Var = k4g0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    k4g0Var.f.getClass();
                } while (!p7m0Var.m(value, y3g0.a((y3g0) value, false, null, false, null, new khh0(th), null, null, null, false, false, 16363)));
                break;
            default:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                p7m0 p7m0Var2 = k4g0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    k4g0Var.f.getClass();
                } while (!p7m0Var2.m(value2, y3g0.a((y3g0) value2, false, null, false, new ymf0(th2), null, null, null, null, false, false, 16375)));
                break;
        }
        return Unit.f46060a;
    }
}
