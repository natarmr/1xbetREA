package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g9v0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10934a;
    public final /* synthetic */ j9v0 b;

    public /* synthetic */ g9v0(j9v0 j9v0Var, byte b) {
        this.f10934a = b;
        this.b = j9v0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f10934a;
        c9v0 c9v0Var = c9v0.f3981a;
        j9v0 j9v0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                j9v0Var.t.b(th, new b4u0((byte) 29));
                j9v0Var.G(c9v0Var);
                break;
            default:
                th.getClass();
                j9v0Var.t.b(th, new i9v0((byte) 0));
                j9v0Var.G(c9v0Var);
                break;
        }
        return Unit.f46060a;
    }
}
