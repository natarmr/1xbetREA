package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zwi0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45108a;
    public final /* synthetic */ xxi0 b;

    public /* synthetic */ zwi0(xxi0 xxi0Var, byte b) {
        this.f45108a = b;
        this.b = xxi0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f45108a;
        xxi0 xxi0Var = this.b;
        switch (b) {
            case 0:
                xxi0Var.H(new kui0((byte) 7));
                break;
            case 1:
                xxi0Var.r.w();
                xxi0Var.P.e("oneclick");
                xxi0Var.G(w0j0.f38351a);
                break;
            default:
                xxi0Var.H(new obg((byte) 29, true));
                break;
        }
        return Unit.f46060a;
    }
}
