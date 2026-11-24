package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e550 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7215a;
    public final /* synthetic */ d650 b;

    public /* synthetic */ e550(d650 d650Var, byte b) {
        this.f7215a = b;
        this.b = d650Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7215a;
        d650 d650Var = this.b;
        switch (b) {
            case 0:
                d650Var.C0.remove("GUEST_RECOMMENDED_KEY");
                break;
            default:
                d650Var.C0.remove("GUEST_RECOMMENDED_KEY");
                break;
        }
        return Unit.f46060a;
    }
}
