package a;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J2\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"La/mb6;", "", "", "", "requestParams", "La/dx5;", "", "La/f5h;", "a", "(Ljava/util/Map;La/yje;)Ljava/lang/Object;", "b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface mb6 {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/MainFeedLive/mb/cyber/v3/bestGames/real")
    Object a(@okd0 Map<String, Object> map, yje<dx5<List<f5h>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/MainFeedLine/mb/cyber/v3/bestGames/real")
    Object b(@okd0 Map<String, Object> map, yje<dx5<List<f5h>>> yjeVar);
}
