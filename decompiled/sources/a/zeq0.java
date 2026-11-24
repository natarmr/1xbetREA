package a;

import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zeq0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44266a;
    public final /* synthetic */ wfq0 b;

    public /* synthetic */ zeq0(wfq0 wfq0Var, byte b) {
        this.f44266a = b;
        this.b = wfq0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44266a;
        wfq0 wfq0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                wfq0Var.s.l(th, jiu0.a(wfq0Var).f3272a);
                break;
            default:
                th.getClass();
                if ((th instanceof zhi0) && ((zhi0) th).c == l5t.g) {
                    wfq0Var.A();
                } else if (th instanceof UnknownHostException) {
                    wfq0Var.getClass();
                    wfq0Var.B();
                    wfq0Var.s.l(th, jiu0.a(wfq0Var).f3272a);
                } else {
                    wfq0Var.A();
                    wfq0Var.s.l(th, jiu0.a(wfq0Var).f3272a);
                }
                break;
        }
        return Unit.f46060a;
    }
}
