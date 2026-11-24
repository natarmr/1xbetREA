package a;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0003\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"La/u5t;", "", "", "", "request", "La/dx5;", "La/l6t;", "b", "(Ljava/util/Map;La/yje;)Ljava/lang/Object;", "La/fk9;", "cachingTag", "a", "(Ljava/util/Map;La/fk9;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface u5t {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("ResultService/mobile/api/v1/gamesByGlobalChamp/all")
    Object a(@okd0 Map<String, Object> map, @doo0 fk9 fk9Var, yje<dx5<l6t>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("ResultService/mobile/api/v1/gamesByGlobalChamp")
    Object b(@okd0 Map<String, Object> map, yje<dx5<l6t>> yjeVar);
}
