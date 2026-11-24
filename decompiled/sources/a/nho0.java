package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nho0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23543a;
    public final /* synthetic */ rio0 b;

    public /* synthetic */ nho0(rio0 rio0Var, byte b) {
        this.f23543a = b;
        this.b = rio0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23543a;
        rio0 rio0Var = this.b;
        switch (b) {
            case 0:
                rio0Var.M0.f(rho0.f30501a);
                break;
            case 1:
                rio0 rio0Var2 = this.b;
                rio0Var2.getClass();
                sac.V(jiu0.a(rio0Var2), new tfo0(1, rio0Var2, rio0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 9), null, rio0Var2.y.f22085a, new kio0(rio0Var2, null, (byte) 1), 10);
                break;
            default:
                rio0Var.z.d(new lho0(rio0Var, (byte) 6));
                break;
        }
        return Unit.f46060a;
    }
}
