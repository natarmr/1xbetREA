package a;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J2\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\tJ2\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\tJ2\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\r\u0010\t¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"La/hmb;", "", "", "", "params", "La/dx5;", "", "La/pu10;", "a", "(Ljava/util/Map;La/yje;)Ljava/lang/Object;", "d", "La/du10;", "b", "c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface hmb {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLive/mobile/v3/ChampsBySport")
    Object a(@okd0 Map<String, Object> map, yje<dx5<List<pu10>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLive/mobile/v3/ChampsBySportAndCountries")
    Object b(@okd0 Map<String, Object> map, yje<dx5<List<du10>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLive/mobile/v3/topChampsAndCountries")
    Object c(@okd0 Map<String, Object> map, yje<dx5<List<du10>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLive/mobile/v3/TopChamps")
    Object d(@okd0 Map<String, Object> map, yje<dx5<List<pu10>>> yjeVar);
}
