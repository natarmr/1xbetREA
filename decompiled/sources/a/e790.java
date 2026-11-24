package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e790 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7321a;
    public final /* synthetic */ j790 b;

    public /* synthetic */ e790(j790 j790Var, byte b) {
        this.f7321a = b;
        this.b = j790Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f7321a;
        final j790 j790Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                final byte b2 = 0;
                j790Var.v.b(th, new Function2() { // from class: a.f790
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Object value;
                        Object value2;
                        byte b3 = b2;
                        j790 j790Var2 = j790Var;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b3) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                p7m0 p7m0Var = j790Var2.i.f25029a;
                                do {
                                    value = p7m0Var.getValue();
                                    value.getClass();
                                    j790Var2.f.getClass();
                                } while (!p7m0Var.m(value, y690.a((y690) value, x690.d, 0L, false, 6)));
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                p7m0 p7m0Var2 = j790Var2.i.f25029a;
                                do {
                                    value2 = p7m0Var2.getValue();
                                    value2.getClass();
                                    j790Var2.f.getClass();
                                } while (!p7m0Var2.m(value2, y690.a((y690) value2, x690.d, 0L, false, 6)));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 1:
                th.getClass();
                j790Var.v.b(th, new ht80((byte) 10));
                break;
            default:
                th.getClass();
                final byte b3 = 1;
                j790Var.v.b(th, new Function2() { // from class: a.f790
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Object value;
                        Object value2;
                        byte b4 = b3;
                        j790 j790Var2 = j790Var;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b4) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                p7m0 p7m0Var = j790Var2.i.f25029a;
                                do {
                                    value = p7m0Var.getValue();
                                    value.getClass();
                                    j790Var2.f.getClass();
                                } while (!p7m0Var.m(value, y690.a((y690) value, x690.d, 0L, false, 6)));
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                p7m0 p7m0Var2 = j790Var2.i.f25029a;
                                do {
                                    value2 = p7m0Var2.getValue();
                                    value2.getClass();
                                    j790Var2.f.getClass();
                                } while (!p7m0Var2.m(value2, y690.a((y690) value2, x690.d, 0L, false, 6)));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
        }
        return Unit.f46060a;
    }
}
