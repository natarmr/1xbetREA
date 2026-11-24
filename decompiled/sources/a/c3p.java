package a;

import android.javax.sip.message.Response;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c3p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3688a;
    public final /* synthetic */ g2v b;

    public /* synthetic */ c3p(g2v g2vVar, byte b) {
        this.f3688a = b;
        this.b = g2vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3688a) {
            case 0:
                pb10 pb10Var = pb10.g;
                g2v g2vVar = this.b;
                return new w2p(true, true, false, g2v.b(g2vVar, pb10Var, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), g2v.b(g2vVar, pb10Var, null, null, 0, 0, R.string.empty_favorites_champs, 0, 0, 0L, 0L, 990), iun.f15405a, null);
            case 1:
                return new h4p0(true, false, false, iun.f15405a, this.b);
            default:
                return g2v.b(this.b, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, 0, 0L, 0L, 990);
        }
    }
}
