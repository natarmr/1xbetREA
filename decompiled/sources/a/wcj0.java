package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wcj0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38927a;
    public final /* synthetic */ odj0 b;

    public /* synthetic */ wcj0(odj0 odj0Var, byte b) {
        this.f38927a = b;
        this.b = odj0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38927a;
        odj0 odj0Var = this.b;
        switch (b) {
            case 0:
                odj0Var.H(new r3j0((byte) 10));
                break;
            case 1:
                odj0Var.H(new cxi0((byte) 7, true));
                break;
            default:
                odj0Var.r.w();
                odj0Var.G(zbj0.f44119a);
                break;
        }
        return Unit.f46060a;
    }
}
