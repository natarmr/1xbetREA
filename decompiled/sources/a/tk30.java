package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tk30 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34075a;
    public final /* synthetic */ zk30 b;

    public /* synthetic */ tk30(zk30 zk30Var, byte b) {
        this.f34075a = b;
        this.b = zk30Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34075a;
        zk30 zk30Var = this.b;
        switch (b) {
            case 0:
                return g2v.d(zk30Var.i, pb10.g, null, null, R.string.data_retrieval_error, R.string.try_again_text, new tk30(zk30Var, (byte) 3), 94);
            case 1:
                return g2v.d(zk30Var.i, pb10.g, null, null, R.string.currently_no_events, R.string.refresh_data, new tk30(zk30Var, (byte) 2), 94);
            case 2:
                zk30Var.w(true);
                return Unit.f46060a;
            default:
                zk30Var.w(true);
                return Unit.f46060a;
        }
    }
}
