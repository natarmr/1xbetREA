package a;

import java.util.Map;
import kotlin.Metadata;
import org.xplatform.aggregator.impl.core.data.models.AggregatorClearRecentGamesResponse;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ>\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0001\u0010\f\u001a\u00020\u00132\b\b\u0001\u0010\r\u001a\u00020\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0016\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\u00182\b\b\u0001\u0010\u0016\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\u0017H§@¢\u0006\u0004\b\u001b\u0010\u001aJ$\u0010\u001d\u001a\u00020\u00182\b\b\u0001\u0010\u0016\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001d\u0010\u001eJJ\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010 \u001a\u00020\u001f2\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b!\u0010\"JL\u0010)\u001a\u00020(2\b\b\u0001\u0010\u0016\u001a\u00020\u00032\b\b\u0001\u0010$\u001a\u00020#2\b\b\u0001\u0010%\u001a\u00020\u00032\b\b\u0001\u0010'\u001a\u00020&2\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b)\u0010*J\\\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u00032\b\b\u0001\u0010$\u001a\u00020#2\b\b\u0001\u0010'\u001a\u00020&2\b\b\u0001\u0010+\u001a\u00020\u00032\b\b\u0001\u0010,\u001a\u00020\u001f2\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b.\u0010/JL\u00101\u001a\u0002002\b\b\u0001\u0010\u0016\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0001\u0010$\u001a\u00020#2\b\b\u0001\u0010%\u001a\u00020\u00032\b\b\u0001\u0010'\u001a\u00020&2\b\b\u0003\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b1\u00102J,\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00072\b\b\u0001\u00104\u001a\u0002032\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b6\u00107JB\u00108\u001a\b\u0012\u0004\u0012\u0002050\u00072\u0014\b\u0001\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b8\u00109J$\u0010;\u001a\u00020:2\b\b\u0001\u0010\u0016\u001a\u00020\u00032\b\b\u0001\u0010\r\u001a\u00020\u0003H§@¢\u0006\u0004\b;\u0010<¨\u0006=À\u0006\u0003"}, d2 = {"La/bx0;", "", "", "", "paramsMap", "La/fk9;", "cachingTag", "La/dx5;", "La/bt0;", "f", "(Ljava/util/Map;La/fk9;La/yje;)Ljava/lang/Object;", "La/cee0;", "request", "appGuid", "token", "acceptHeader", "La/ay0;", "b", "(La/cee0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/vos;", "j", "(La/vos;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "auth", "La/du0;", "La/icp;", "n", "(Ljava/lang/String;La/du0;La/yje;)Ljava/lang/Object;", "c", "La/w6p;", "i", "(Ljava/lang/String;La/w6p;La/yje;)Ljava/lang/Object;", "", "useSmartSearch", "l", "(Ljava/util/Map;ZLjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;", "", "userId", "language", "", "whence", "La/ae8;", "h", "(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;", "country", "onlyActive", "La/woe;", "m", "(Ljava/lang/String;JILjava/lang/String;ZLjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;", "La/nl;", "e", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILa/fk9;La/yje;)Ljava/lang/Object;", "La/edy;", "params", "La/ty0;", "a", "(La/edy;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "g", "(Ljava/util/Map;Ljava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;", "Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;", "d", "(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface bx0 {
    @kg80("/Aggregator_v3/v2/Games/Search")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object a(@jb8 edy edyVar, @xpv("X-Auth") String str, yje<dx5<ty0>> yjeVar);

    @kg80("/Aggregator_v3/v2/GetRecommendedGames")
    Object b(@jb8 cee0 cee0Var, @xpv("AppGuid") String str, @xpv("X-Auth") String str2, @xpv("Accept") String str3, yje<dx5<ay0>> yjeVar);

    @kg80("/Aggregator_v3/v2/FavoriteGames/RemoveFavoriteGame")
    Object c(@xpv("X-Auth") String str, @jb8 du0 du0Var, yje<icp> yjeVar);

    @kg80("/Aggregator_v3/v2/RecentGames/ClearRecentGames")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object d(@xpv("X-Auth") String str, @xpv("AppGuid") String str2, yje<AggregatorClearRecentGamesResponse> yjeVar);

    @ofr("MobileB2/ActiveBonusAmount")
    Object e(@xpv("X-Auth") String str, @xpv("Accept") String str2, @nkd0("AccId") long j, @nkd0("lng") String str3, @nkd0("Whence") int i, @doo0 fk9 fk9Var, yje<nl> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/Aggregator_v3/v2/Games/Get")
    Object f(@okd0 Map<String, String> map, @doo0 fk9 fk9Var, yje<dx5<bt0>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/ContentAggregator/v2/Games/List")
    Object g(@okd0 Map<String, String> map, @xpv("X-Auth") String str, @doo0 fk9 fk9Var, yje<dx5<ty0>> yjeVar);

    @ofr("MobileB2/CountBonusesAvailable")
    Object h(@xpv("X-Auth") String str, @nkd0("AccId") long j, @nkd0("lng") String str2, @nkd0("Whence") int i, @xpv("Accept") String str3, @doo0 fk9 fk9Var, yje<ae8> yjeVar);

    @kg80("/Aggregator_v3/v2/FavoriteGames/ClearFavoriteGames")
    Object i(@xpv("X-Auth") String str, @jb8 w6p w6pVar, yje<icp> yjeVar);

    @kg80("/Aggregator_v3/v2/GetRecommendedGames")
    Object j(@jb8 vos vosVar, @xpv("AppGuid") String str, @xpv("X-Auth") String str2, @xpv("Accept") String str3, yje<dx5<ay0>> yjeVar);

    @ofr("/ContentAggregator/v2/GetGamesByCharsMobile")
    Object l(@okd0 Map<String, Object> map, @nkd0("useSmartSearch") boolean z, @xpv("Accept") String str, @doo0 fk9 fk9Var, yje<dx5<ay0>> yjeVar);

    @ofr("MobileF2/CntAvailableOffers")
    Object m(@xpv("X-Auth") String str, @nkd0("accId") long j, @nkd0("Whence") int i, @nkd0("fcountry") String str2, @nkd0("onlyActive") boolean z, @xpv("Accept") String str3, @doo0 fk9 fk9Var, yje<dx5<woe>> yjeVar);

    @kg80("/Aggregator_v3/v2/FavoriteGames/AddFavoriteGame")
    Object n(@xpv("X-Auth") String str, @jb8 du0 du0Var, yje<icp> yjeVar);
}
