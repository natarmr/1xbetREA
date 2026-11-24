package a;

import kotlin.jvm.functions.Function1;
import org.xplatform.bethistory.history.domain.model.BetHistoryFilterItemModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i47 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i47 f14133a = new i47(1, j47.class, "toHistoryEventType", "toHistoryEventType(Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;)Lorg/xplatform/analytics/domain/scope/history/HistoryParamType;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BetHistoryFilterItemModel betHistoryFilterItemModel = (BetHistoryFilterItemModel) obj;
        betHistoryFilterItemModel.getClass();
        switch (betHistoryFilterItemModel.f46411a.ordinal()) {
            case 1:
                return z5w.n;
            case 2:
                return z5w.o;
            case 3:
                return z5w.p;
            case 4:
                return z5w.q;
            case 5:
                return z5w.r;
            case 6:
            default:
                return z5w.b;
            case 7:
                return z5w.s;
            case 8:
                return z5w.t;
            case 9:
                return z5w.k;
            case 10:
                return z5w.l;
            case 11:
                return z5w.v;
        }
    }
}
