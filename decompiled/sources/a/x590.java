package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x590 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40304a;
    public final /* synthetic */ s690 b;

    public /* synthetic */ x590(s690 s690Var, byte b) {
        this.f40304a = b;
        this.b = s690Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f40304a;
        final s690 s690Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                s690Var.l.b(th, new ht80((byte) 9));
                break;
            case 1:
                th.getClass();
                final byte b2 = 0;
                s690Var.l.b(th, new Function2() { // from class: a.y590
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b3 = b2;
                        s690 s690Var2 = s690Var;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b3) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                p7m0 p7m0Var = s690Var2.v;
                                k690 k690Var = new k690(s690Var2.z);
                                p7m0Var.getClass();
                                p7m0Var.o(null, k690Var);
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                if (!s690Var2.u) {
                                    p7m0 p7m0Var2 = s690Var2.v;
                                    k690 k690Var2 = new k690(s690Var2.z);
                                    p7m0Var2.getClass();
                                    p7m0Var2.o(null, k690Var2);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            default:
                th.getClass();
                final byte b3 = 1;
                s690Var.l.b(th, new Function2() { // from class: a.y590
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b4 = b3;
                        s690 s690Var2 = s690Var;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b4) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                p7m0 p7m0Var = s690Var2.v;
                                k690 k690Var = new k690(s690Var2.z);
                                p7m0Var.getClass();
                                p7m0Var.o(null, k690Var);
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                if (!s690Var2.u) {
                                    p7m0 p7m0Var2 = s690Var2.v;
                                    k690 k690Var2 = new k690(s690Var2.z);
                                    p7m0Var2.getClass();
                                    p7m0Var2.o(null, k690Var2);
                                }
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
