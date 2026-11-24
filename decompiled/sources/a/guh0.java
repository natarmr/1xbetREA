package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class guh0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11929a;
    public final /* synthetic */ zuh0 b;

    public /* synthetic */ guh0(zuh0 zuh0Var, byte b) {
        this.f11929a = b;
        this.b = zuh0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11929a;
        zuh0 zuh0Var = this.b;
        switch (b) {
            case 0:
                return g2v.d(zuh0Var.r, pb10.g, null, null, R.string.data_retrieval_error, R.string.try_again_text, new guh0(zuh0Var, (byte) 1), 94);
            default:
                zuh0Var.x();
                return Unit.f46060a;
        }
    }
}
