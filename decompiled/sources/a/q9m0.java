package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q9m0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28356a;
    public final /* synthetic */ tam0 b;

    public /* synthetic */ q9m0(tam0 tam0Var, byte b) {
        this.f28356a = b;
        this.b = tam0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f28356a;
        tam0 tam0Var = this.b;
        switch (b) {
            case 0:
                if (((Integer) obj).intValue() == 1 && ((Boolean) tam0Var.k.getValue()).booleanValue()) {
                    tam0Var.l.f(m9m0.f21418a);
                }
                break;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                tam0Var.y();
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                tam0Var.y();
                break;
            default:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                tam0Var.y();
                break;
        }
        return Unit.f46060a;
    }
}
