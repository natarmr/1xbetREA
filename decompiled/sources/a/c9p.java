package a;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012À\u0006\u0003"}, d2 = {"La/c9p;", "", "", "", "params", "La/fk9;", "cachingTag", "La/jtf0;", "La/rcp;", "a", "(Ljava/util/Map;La/fk9;La/yje;)Ljava/lang/Object;", "auth", "Lokhttp3/RequestBody;", "request", "", "b", "(Ljava/lang/String;Lokhttp3/RequestBody;La/yje;)Ljava/lang/Object;", "c", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface c9p {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("ResultService/mobile/api/v1/favoritegames")
    Object a(@okd0 Map<String, Object> map, @doo0 fk9 fk9Var, yje<jtf0<rcp>> yjeVar);

    @kg80("FavoriteService/v1/Favorite/Games")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object b(@xpv("X-Auth") String str, @jb8 RequestBody requestBody, yje<Unit> yjeVar);

    @ujv(hasBody = true, method = "DELETE", path = "FavoriteService/v2/Favorite/Games")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object c(@xpv("X-Auth") String str, @jb8 RequestBody requestBody, yje<Unit> yjeVar);
}
