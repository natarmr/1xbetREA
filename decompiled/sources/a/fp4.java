package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fp4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9911a;
    public final /* synthetic */ kp4 b;

    public /* synthetic */ fp4(kp4 kp4Var, byte b) {
        this.f9911a = b;
        this.b = kp4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f9911a;
        final kp4 kp4Var = this.b;
        final byte b2 = 0;
        switch (b) {
            case 0:
                final Throwable th = (Throwable) obj;
                th.getClass();
                kp4Var.P(false);
                final byte b3 = 2;
                kp4Var.y.b(th, new Function2() { // from class: a.dp4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b4 = b3;
                        Throwable th2 = th;
                        kp4 kp4Var2 = kp4Var;
                        Throwable th3 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b4) {
                            case 0:
                                th3.getClass();
                                str.getClass();
                                kp4Var2.N(th2);
                                break;
                            case 1:
                                th3.getClass();
                                str.getClass();
                                kp4Var2.N(th2);
                                break;
                            default:
                                th3.getClass();
                                str.getClass();
                                kp4Var2.N(th2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 1:
                final Throwable th2 = (Throwable) obj;
                th2.getClass();
                kp4Var.P(false);
                final byte b4 = 1;
                kp4Var.y.b(th2, new Function2() { // from class: a.dp4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b5 = b4;
                        Throwable th3 = th2;
                        kp4 kp4Var2 = kp4Var;
                        Throwable th4 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b5) {
                            case 0:
                                th4.getClass();
                                str.getClass();
                                kp4Var2.N(th3);
                                break;
                            case 1:
                                th4.getClass();
                                str.getClass();
                                kp4Var2.N(th3);
                                break;
                            default:
                                th4.getClass();
                                str.getClass();
                                kp4Var2.N(th3);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            default:
                final Throwable th3 = (Throwable) obj;
                th3.getClass();
                p7m0 p7m0Var = kp4Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    kp4Var.f.getClass();
                } while (!p7m0Var.m(value, zn4.a((zn4) value, false, false, false, false, null, null, 251)));
                kp4Var.P(false);
                kp4Var.y.b(th3, new Function2() { // from class: a.dp4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b5 = b2;
                        Throwable th4 = th3;
                        kp4 kp4Var2 = kp4Var;
                        Throwable th5 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b5) {
                            case 0:
                                th5.getClass();
                                str.getClass();
                                kp4Var2.N(th4);
                                break;
                            case 1:
                                th5.getClass();
                                str.getClass();
                                kp4Var2.N(th4);
                                break;
                            default:
                                th5.getClass();
                                str.getClass();
                                kp4Var2.N(th4);
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
