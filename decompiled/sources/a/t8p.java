package a;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\ba\u0018\u00002\u00020\u0001J<\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\rJ<\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000e\u0010\u000bJ2\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010À\u0006\u0003"}, d2 = {"La/t8p;", "", "", "", "params", "La/r8p;", "body", "La/dx5;", "", "La/su10;", "d", "(Ljava/util/Map;La/r8p;La/yje;)Ljava/lang/Object;", "c", "(Ljava/util/Map;La/yje;)Ljava/lang/Object;", "b", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface t8p {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLine/mobile/v3/favorites/games")
    Object a(@okd0 Map<String, Object> map, yje<dx5<List<su10>>> yjeVar);

    @kg80("MainFeedLine/mobile/v3/favorites/games")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object b(@okd0 Map<String, Object> map, @jb8 r8p r8pVar, yje<dx5<List<su10>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLive/mobile/v3/favorites/games")
    Object c(@okd0 Map<String, Object> map, yje<dx5<List<su10>>> yjeVar);

    @kg80("MainFeedLive/mobile/v3/favorites/games")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object d(@okd0 Map<String, Object> map, @jb8 r8p r8pVar, yje<dx5<List<su10>>> yjeVar);
}
