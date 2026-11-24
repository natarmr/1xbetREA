package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ufj0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35581a;
    public final /* synthetic */ ngj0 b;

    public /* synthetic */ ufj0(ngj0 ngj0Var, byte b) {
        this.f35581a = b;
        this.b = ngj0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f35581a;
        ngj0 ngj0Var = this.b;
        switch (b) {
            case 0:
                ngj0Var.H(new cxi0((byte) 14, true));
                break;
            case 1:
                ngj0Var.r.w();
                ngj0Var.Q.e("oneclick");
                ngj0Var.G(w0j0.f38351a);
                break;
            default:
                ngj0Var.H(new mej0((byte) 14));
                break;
        }
        return Unit.f46060a;
    }
}
