package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vik0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37483a;
    public final /* synthetic */ cjk0 b;

    public /* synthetic */ vik0(cjk0 cjk0Var, byte b) {
        this.f37483a = b;
        this.b = cjk0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f37483a;
        cjk0 cjk0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                cjk0Var.h.b(th, new jak0((byte) 4));
                break;
            case 1:
                th.getClass();
                cjk0Var.h.b(th, new edk0(cjk0Var, (byte) 2));
                p7m0 p7m0Var = cjk0Var.m;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, new nik0(false)));
                break;
            default:
                th.getClass();
                cjk0Var.h.b(th, new jak0((byte) 5));
                break;
        }
        return Unit.f46060a;
    }
}
