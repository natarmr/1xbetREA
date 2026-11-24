package a;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016Jj\u0010\"\u001a\u00020!2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00182\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001d\u001a\u00020\u00182\b\b\u0001\u0010\u001e\u001a\u00020\u001b2\b\b\u0001\u0010\u001f\u001a\u00020\u001b2\b\b\u0001\u0010 \u001a\u00020\u001bH§@¢\u0006\u0004\b\"\u0010#J*\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020$H§@¢\u0006\u0004\b(\u0010)¨\u0006*À\u0006\u0003"}, d2 = {"La/r37;", "", "", "auth", "La/zs7;", "request", "La/q16;", "", "La/i2o;", "b", "(Ljava/lang/String;La/zs7;La/yje;)Ljava/lang/Object;", "La/wdi0;", "requestData", "", "c", "(Ljava/lang/String;La/wdi0;La/yje;)Ljava/lang/Object;", "La/wst;", "La/sg7;", "a", "(Ljava/lang/String;La/wst;La/yje;)Ljava/lang/Object;", "La/zst;", "f", "(Ljava/lang/String;La/zst;La/yje;)Ljava/lang/Object;", "appGuid", "", "timeFrom", "timeTo", "", "typeGame", "lastKnownId", "limit", "amountSort", "typeTransaction", "La/h31;", "d", "(Ljava/lang/String;Ljava/lang/String;JJIJIIILa/yje;)Ljava/lang/Object;", "La/h2f;", "body", "La/dx5;", "La/t1h0;", "e", "(Ljava/lang/String;La/h2f;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface r37 {
    @kg80("BetHistory/Mobile/GetBetInfoHistoryWithSummaryByDates")
    Object a(@xpv("X-Auth") String str, @jb8 wst wstVar, yje<? super sg7> yjeVar);

    @kg80("BetHistory/Mobile/HideUserBets")
    Object b(@xpv("X-Auth") String str, @jb8 zs7 zs7Var, yje<? super q16<Boolean, ? extends i2o>> yjeVar);

    @kg80("/BetHistory/Mobile/SendBetHistoryToEmail")
    Object c(@xpv("X-Auth") String str, @jb8 wdi0 wdi0Var, yje<? super Unit> yjeVar);

    @ofr("BetStorage/GetHistoryBetMobile")
    Object d(@xpv("X-Auth") String str, @xpv("AppGuid") String str2, @nkd0("UnixTimeFrom") long j, @nkd0("UnixTimeTo") long j2, @nkd0("TypeGame") int i, @nkd0("LastKnownId") long j3, @nkd0("Limit") int i2, @nkd0("AmountSort") int i3, @nkd0("TypeTransaction") int i4, yje<? super h31> yjeVar);

    @kg80("/BetHistory/Mobile/GetBetInfoHistoryByBetIdScan")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object e(@xpv("X-Auth") String str, @jb8 h2f h2fVar, yje<? super dx5<t1h0>> yjeVar);

    @kg80("BetHistory/Mobile/GetBetInfoHistoryWithSummaryByGlobalChamp")
    Object f(@xpv("X-Auth") String str, @jb8 zst zstVar, yje<? super sg7> yjeVar);
}
