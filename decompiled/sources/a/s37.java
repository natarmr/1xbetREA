package a;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\tH§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"La/s37;", "", "", "auth", "La/ab7;", "request", "La/c57;", "a", "(Ljava/lang/String;La/ab7;La/yje;)Ljava/lang/Object;", "La/db7;", "f", "(Ljava/lang/String;La/db7;La/yje;)Ljava/lang/Object;", "La/hb7;", "b", "(Ljava/lang/String;La/hb7;La/yje;)Ljava/lang/Object;", "La/kb7;", "d", "(Ljava/lang/String;La/kb7;La/yje;)Ljava/lang/Object;", "La/rqt0;", "La/q16;", "", "La/i2o;", "e", "(Ljava/lang/String;La/rqt0;La/yje;)Ljava/lang/Object;", "La/rp10;", "", "c", "(Ljava/lang/String;La/rp10;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface s37 {
    @kg80("BetHistory/Mobile/GetBetInfoHistoryWithSummaryByDates")
    Object a(@xpv("X-Auth") String str, @jb8 ab7 ab7Var, yje<? super c57> yjeVar);

    @kg80("BetHistory/Mobile/GetBetInfoHistoryWithSummaryByGlobalChamp")
    Object b(@xpv("X-Auth") String str, @jb8 hb7 hb7Var, yje<? super c57> yjeVar);

    @kg80("/BetHistory/Mobile/SendBetHistoryToEmail")
    Object c(@xpv("X-Auth") String str, @jb8 rp10 rp10Var, yje<? super Unit> yjeVar);

    @kg80("BetHistory/Mobile/GetBetInfoHistoryWithSummaryByGlobalChamp")
    Object d(@xpv("X-Auth") String str, @jb8 kb7 kb7Var, yje<? super c57> yjeVar);

    @kg80("BetHistory/Mobile/HideUserBets")
    Object e(@xpv("X-Auth") String str, @jb8 rqt0 rqt0Var, yje<? super q16<Boolean, ? extends i2o>> yjeVar);

    @kg80("BetHistory/Mobile/GetBetInfoHistoryWithSummaryByDates")
    Object f(@xpv("X-Auth") String str, @jb8 db7 db7Var, yje<? super c57> yjeVar);
}
