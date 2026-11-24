package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vs9 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37939a;
    public final /* synthetic */ at9 b;

    public /* synthetic */ vs9(at9 at9Var, byte b) {
        this.f37939a = b;
        this.b = at9Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f37939a;
        final at9 at9Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                final byte b2 = 1;
                at9Var.u.b(th, new Function2() { // from class: a.ws9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Object value;
                        byte b3 = b2;
                        at9 at9Var2 = at9Var;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b3) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                p7m0 p7m0Var = at9Var2.i.f25029a;
                                do {
                                    value = p7m0Var.getValue();
                                    value.getClass();
                                    at9Var2.f.getClass();
                                } while (!p7m0Var.m(value, cs9.a((cs9) value, iun.f15405a, bs9.c, false, null, 28)));
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                at9Var2.G(yr9.f43110a);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            default:
                th.getClass();
                final byte b3 = 0;
                at9Var.u.b(th, new Function2() { // from class: a.ws9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Object value;
                        byte b4 = b3;
                        at9 at9Var2 = at9Var;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b4) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                p7m0 p7m0Var = at9Var2.i.f25029a;
                                do {
                                    value = p7m0Var.getValue();
                                    value.getClass();
                                    at9Var2.f.getClass();
                                } while (!p7m0Var.m(value, cs9.a((cs9) value, iun.f15405a, bs9.c, false, null, 28)));
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                at9Var2.G(yr9.f43110a);
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
