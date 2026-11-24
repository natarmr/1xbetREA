package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iz6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15622a;
    public final /* synthetic */ b07 b;

    public /* synthetic */ iz6(b07 b07Var, byte b) {
        this.f15622a = b;
        this.b = b07Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15622a;
        b07 b07Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                b07Var.z(new tz6(false));
                if (!saj.Y(th)) {
                    ax5 ax5Var = b07Var.q;
                    jiu0.a(b07Var);
                    ((b07) ax5Var.c).f.a(th);
                    b07Var.z(new nz6(""));
                }
                break;
            default:
                th.getClass();
                b07Var.w(th);
                b07Var.z(oz6.f26090a);
                b07Var.z(new tz6(false));
                break;
        }
        return Unit.f46060a;
    }
}
