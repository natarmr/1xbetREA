package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cr9 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4833a;
    public final /* synthetic */ mr9 b;

    public /* synthetic */ cr9(mr9 mr9Var, byte b) {
        this.f4833a = b;
        this.b = mr9Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f4833a;
        final mr9 mr9Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                final byte b2 = 0;
                mr9Var.h.b(th, new Function2() { // from class: a.er9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Object value;
                        byte b3 = b2;
                        mr9 mr9Var2 = mr9Var;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b3) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                p7m0 p7m0Var = mr9Var2.l;
                                do {
                                    value = p7m0Var.getValue();
                                } while (!p7m0Var.m(value, es9.a((es9) value, iun.f15405a, ds9.c, false, null, 12)));
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                p7m0 p7m0Var2 = mr9Var2.n;
                                p7m0Var2.getClass();
                                p7m0Var2.o(null, rq9.f30920a);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            default:
                th.getClass();
                final byte b3 = 1;
                mr9Var.h.b(th, new Function2() { // from class: a.er9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Object value;
                        byte b4 = b3;
                        mr9 mr9Var2 = mr9Var;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b4) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                p7m0 p7m0Var = mr9Var2.l;
                                do {
                                    value = p7m0Var.getValue();
                                } while (!p7m0Var.m(value, es9.a((es9) value, iun.f15405a, ds9.c, false, null, 12)));
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                p7m0 p7m0Var2 = mr9Var2.n;
                                p7m0Var2.getClass();
                                p7m0Var2.o(null, rq9.f30920a);
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
