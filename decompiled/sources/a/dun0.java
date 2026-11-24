package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dun0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6705a;
    public final /* synthetic */ pun0 b;

    public /* synthetic */ dun0(pun0 pun0Var, byte b) {
        this.f6705a = b;
        this.b = pun0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f6705a;
        final pun0 pun0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                final byte b2 = 1;
                pun0Var.e.b(th, new Function2() { // from class: a.eun0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b3 = b2;
                        pun0 pun0Var2 = pun0Var;
                        switch (b3) {
                            case 0:
                                Throwable th2 = (Throwable) obj2;
                                String str = (String) obj3;
                                th2.getClass();
                                str.getClass();
                                th2.printStackTrace();
                                sac.V(jiu0.a(pun0Var2), new ndn0(1, pun0Var2.e, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, pun0Var2.d.f22085a, new ssl0(pun0Var2, str, (yje) null), 10);
                                break;
                            default:
                                b1j.z((String) obj3, (Throwable) obj2);
                                p7m0 p7m0Var = pun0Var2.x;
                                p7m0Var.getClass();
                                p7m0Var.o(null, fun0.f10173a);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            default:
                th.getClass();
                final byte b3 = 0;
                pun0Var.e.b(th, new Function2() { // from class: a.eun0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b4 = b3;
                        pun0 pun0Var2 = pun0Var;
                        switch (b4) {
                            case 0:
                                Throwable th2 = (Throwable) obj2;
                                String str = (String) obj3;
                                th2.getClass();
                                str.getClass();
                                th2.printStackTrace();
                                sac.V(jiu0.a(pun0Var2), new ndn0(1, pun0Var2.e, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, pun0Var2.d.f22085a, new ssl0(pun0Var2, str, (yje) null), 10);
                                break;
                            default:
                                b1j.z((String) obj3, (Throwable) obj2);
                                p7m0 p7m0Var = pun0Var2.x;
                                p7m0Var.getClass();
                                p7m0Var.o(null, fun0.f10173a);
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
