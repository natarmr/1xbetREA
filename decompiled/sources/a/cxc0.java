package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cxc0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5118a;
    public final /* synthetic */ gxc0 b;

    public /* synthetic */ cxc0(gxc0 gxc0Var, byte b) {
        this.f5118a = b;
        this.b = gxc0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f5118a;
        gxc0 gxc0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                gxc0Var.N(th);
                break;
            case 1:
                th.getClass();
                gxc0Var.u.b(th, new ksc0((byte) 7));
                break;
            case 2:
                th.getClass();
                gxc0Var.N(th);
                break;
            default:
                th.getClass();
                gxc0Var.u.b(th, new ksc0((byte) 8));
                break;
        }
        return Unit.f46060a;
    }
}
