package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wfo0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39081a;
    public final /* synthetic */ fho0 b;

    public /* synthetic */ wfo0(fho0 fho0Var, byte b) {
        this.f39081a = b;
        this.b = fho0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39081a;
        fho0 fho0Var = this.b;
        switch (b) {
            case 0:
                fho0 fho0Var2 = this.b;
                fho0Var2.getClass();
                sac.V(jiu0.a(fho0Var2), new tfo0(1, fho0Var2, fho0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 3), null, fho0Var2.x.b, new z2n0(fho0Var2, null, (byte) 4), 10);
                break;
            case 1:
                fho0Var.D0.f(zfo0.f44310a);
                break;
            default:
                fho0Var.y.d(new vfo0(fho0Var, (byte) 8));
                break;
        }
        return Unit.f46060a;
    }
}
