package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wx20 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39912a;
    public final /* synthetic */ dy20 b;

    public /* synthetic */ wx20(dy20 dy20Var, byte b) {
        this.f39912a = b;
        this.b = dy20Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39912a;
        dy20 dy20Var = this.b;
        switch (b) {
            case 0:
                return dy20Var.d.a();
            case 1:
                return g2v.d(dy20Var.g, pb10.g, null, null, R.string.statistic_empty_data, 0, null, 478);
            case 2:
                return g2v.d(dy20Var.g, pb10.g, null, null, R.string.data_retrieval_error, R.string.try_again_text, new wx20(dy20Var, (byte) 3), 94);
            default:
                dy20Var.y(true);
                return Unit.f46060a;
        }
    }
}
