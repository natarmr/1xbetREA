package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class atq0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1444a;
    public final /* synthetic */ xtq0 b;

    public /* synthetic */ atq0(xtq0 xtq0Var, byte b) {
        this.f1444a = b;
        this.b = xtq0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1444a;
        xtq0 xtq0Var = this.b;
        switch (b) {
            case 0:
                xtq0 xtq0Var2 = this.b;
                sac.V(jiu0.a(xtq0Var2), new w6q0(1, xtq0Var2, xtq0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, xtq0Var2.x.f22085a, new z2n0(xtq0Var2, null, (byte) 21), 10);
                break;
            case 1:
                xtq0Var.C0.f(ctq0.f4953a);
                break;
            default:
                xtq0Var.y.d(new zsq0(xtq0Var, (byte) 7));
                break;
        }
        return Unit.f46060a;
    }
}
