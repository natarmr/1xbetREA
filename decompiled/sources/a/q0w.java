package a;

import kotlin.Metadata;
import kotlin.Pair;
import org.xplatform.bet_history.history.presentation.dialog.history_data_filter.model.HistoryDateFilterTypeModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/q0w;", "La/iw5;", "<init>", "()V", "a/tqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class q0w extends iw5 {
    public final phf0 k2 = new phf0("REQUEST_KEY");
    public final lhf0 l2 = new lhf0("HISTORY_DATE_FILTER_LIST_KEY", (byte) 7);
    public static final /* synthetic */ iiy[] n2 = {new ez40(q0w.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(q0w.class, "historyDateFilterTypeUiModelList", "getHistoryDateFilterTypeUiModelList()Ljava/util/List;", 0)};
    public static final tqt m2 = new tqt();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-2106127587);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), xia0.c, (ugd) null, u1c.M(-1866786612, new elm(this, (byte) 17), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    public final void P0(HistoryDateFilterTypeModel historyDateFilterTypeModel) {
        if (R()) {
            return;
        }
        vcc.f0(i120.V(new Pair("HISTORY_DATE_FILTER_REQUEST", historyDateFilterTypeModel)), this, this.k2.n(this, n2[0]));
        y0();
    }
}
