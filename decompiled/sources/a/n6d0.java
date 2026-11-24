package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n6d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22993a;
    public final /* synthetic */ r6d0 b;

    public /* synthetic */ n6d0(r6d0 r6d0Var, byte b) {
        this.f22993a = b;
        this.b = r6d0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        byte b = this.f22993a;
        r6d0 r6d0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                th.printStackTrace();
                p7m0 p7m0Var = r6d0Var.k;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, o6d0.a((o6d0) value, null, false, false, 11)));
                break;
            default:
                th.getClass();
                th.printStackTrace();
                p7m0 p7m0Var2 = r6d0Var.k;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, o6d0.a((o6d0) value2, null, false, false, 11)));
                break;
        }
        return Unit.f46060a;
    }
}
