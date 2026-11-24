package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s810 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31781a;
    public final /* synthetic */ e910 b;

    public /* synthetic */ s810(e910 e910Var, byte b) {
        this.f31781a = b;
        this.b = e910Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f31781a;
        final e910 e910Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                final byte b2 = 1;
                e910Var.g.b(th, new Function2() { // from class: a.t810
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b3 = b2;
                        e910 e910Var2 = e910Var;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b3) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                e910Var2.e.getClass();
                                e910Var2.w(sqt.d(th2));
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                e910Var2.e.getClass();
                                e910Var2.w(sqt.d(th2));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            default:
                th.getClass();
                final byte b3 = 0;
                e910Var.g.b(th, new Function2() { // from class: a.t810
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b4 = b3;
                        e910 e910Var2 = e910Var;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b4) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                e910Var2.e.getClass();
                                e910Var2.w(sqt.d(th2));
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                e910Var2.e.getClass();
                                e910Var2.w(sqt.d(th2));
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
