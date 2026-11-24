package a;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J2\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ2\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\u000b\u0010\t¨\u0006\fÀ\u0006\u0003"}, d2 = {"La/c7t;", "", "", "", "params", "La/dx5;", "", "La/su10;", "b", "(Ljava/util/Map;La/yje;)Ljava/lang/Object;", "La/d4t;", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface c7t {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLive/mobile/v3/gamesByChamp")
    Object a(@okd0 Map<String, Object> map, yje<dx5<List<d4t>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLive/mobile/v3/favorites/gamesByTeam")
    Object b(@okd0 Map<String, Object> map, yje<dx5<List<su10>>> yjeVar);
}
