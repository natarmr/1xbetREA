package a;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J<\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\u000e\u0010\n¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"La/hon;", "", "", "lineLive", "", "params", "La/q16;", "La/i0t;", "La/i2o;", "a", "(Ljava/lang/String;Ljava/util/Map;La/yje;)Ljava/lang/Object;", "betType", "La/dx5;", "La/su10;", "b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface hon {
    @ofr("{BetType}Feed/Mb_GetEventsZip")
    Object a(@z190("BetType") String str, @okd0 Map<String, Object> map, yje<q16<i0t, i2o>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeed{BetType}/mobile/v3/game")
    Object b(@z190("BetType") String str, @okd0 Map<String, Object> map, yje<dx5<su10>> yjeVar);
}
