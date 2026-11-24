package a;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J2\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"La/x7n0;", "", "", "", "params", "La/dx5;", "", "La/r7n0;", "b", "(Ljava/util/Map;La/yje;)Ljava/lang/Object;", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface x7n0 {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/MainFeedLine/mb/subscriptions/v3/games")
    Object a(@okd0 Map<String, Object> map, yje<dx5<List<r7n0>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/MainFeedLive/mb/subscriptions/v3/games")
    Object b(@okd0 Map<String, Object> map, yje<dx5<List<r7n0>>> yjeVar);
}
