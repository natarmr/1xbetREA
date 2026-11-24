package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lt4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20612a;
    public final /* synthetic */ ku4 b;

    public /* synthetic */ lt4(ku4 ku4Var, byte b) {
        this.f20612a = b;
        this.b = ku4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f20612a;
        ut4 ut4Var = ut4.f36240a;
        ku4 ku4Var = this.b;
        switch (b) {
            case 0:
                ku4Var.G(ut4Var);
                return Unit.f46060a;
            case 1:
                ku4Var.G(ut4Var);
                return Unit.f46060a;
            case 2:
                ku4 ku4Var2 = this.b;
                return g2v.d(ku4Var2.t, pb10.g, null, null, R.string.data_retrieval_error, R.string.try_again_text, new f8(0, ku4Var2, ku4.class, "buttonTryAgainClick", "buttonTryAgainClick()V", 0, (byte) 25), 94);
            default:
                ku4Var.G(ut4Var);
                return Unit.f46060a;
        }
    }
}
