package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ded0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5946a;
    public final /* synthetic */ ned0 b;

    public /* synthetic */ ded0(ned0 ned0Var, byte b) {
        this.f5946a = b;
        this.b = ned0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f5946a;
        ned0 ned0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                ned0Var.y.b(th, new nrc0(ned0Var, (byte) 5));
                break;
            default:
                th.getClass();
                ned0Var.y.b(th, new yr0(th, (byte) 22));
                break;
        }
        return Unit.f46060a;
    }
}
