package a;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J2\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ<\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00052\b\b\u0001\u0010\n\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\rJ<\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00052\b\b\u0001\u0010\n\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"La/nqu0;", "", "", "", "requestParams", "La/dx5;", "", "La/rru0;", "c", "(Ljava/util/Map;La/yje;)Ljava/lang/Object;", "cyberPagePath", "La/l7r0;", "a", "(Ljava/lang/String;Ljava/util/Map;La/yje;)Ljava/lang/Object;", "b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface nqu0 {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLive/mb/cyber/v3/topGames/{cyberPagePath}")
    Object a(@z190("cyberPagePath") String str, @okd0 Map<String, Object> map, yje<dx5<List<l7r0>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLine/mb/cyber/v3/topGames/{cyberPagePath}")
    Object b(@z190("cyberPagePath") String str, @okd0 Map<String, Object> map, yje<dx5<List<l7r0>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("aggregatorfeed/v1/cybersportsbycategory")
    Object c(@okd0 Map<String, Object> map, yje<dx5<List<rru0>>> yjeVar);
}
