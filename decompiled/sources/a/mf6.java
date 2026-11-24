package a;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001JF\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000b\u0010\fJ6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"La/mf6;", "", "", "betType", "", "params", "La/kg6;", "request", "La/dx5;", "", "La/ah6;", "a", "(Ljava/lang/String;Ljava/util/Map;La/kg6;La/yje;)Ljava/lang/Object;", "La/ph6;", "b", "(Ljava/lang/String;Ljava/util/Map;La/yje;)Ljava/lang/Object;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface mf6 {
    @kg80("/MainFeed{BetType}/mobile/betbuilder/v3/events")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object a(@z190("BetType") String str, @okd0 Map<String, Object> map, @jb8 kg6 kg6Var, yje<dx5<List<ah6>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/MainFeed{BetType}/mobile/betbuilder/v3/gameInfo")
    Object b(@z190("BetType") String str, @okd0 Map<String, Object> map, yje<dx5<ph6>> yjeVar);
}
