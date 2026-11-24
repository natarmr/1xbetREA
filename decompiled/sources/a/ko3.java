package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ko3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18610a;
    public final /* synthetic */ to3 b;

    public /* synthetic */ ko3(to3 to3Var, byte b) {
        this.f18610a = b;
        this.b = to3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f18610a;
        to3 to3Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                to3Var.j(th);
                to3Var.s.g(c56.f3755a);
                to3Var.d();
                break;
            default:
                th.getClass();
                to3Var.i(th);
                break;
        }
        return Unit.f46060a;
    }
}
