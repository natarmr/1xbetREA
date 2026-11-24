package a;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J2\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\tJ,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\tJ2\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\u000e\u0010\tJ2\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\u000f\u0010\t¨\u0006\u0010À\u0006\u0003"}, d2 = {"La/z8p0;", "", "", "", "params", "La/dx5;", "", "La/f5h;", "a", "(Ljava/util/Map;La/yje;)Ljava/lang/Object;", "b", "La/fcp0;", "c", "La/jj30;", "d", "e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface z8p0 {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLive/mb/cyber/v3/gamesByOpp")
    Object a(@okd0 Map<String, Object> map, yje<dx5<List<f5h>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLine/mb/cyber/v3/gamesByOpp")
    Object b(@okd0 Map<String, Object> map, yje<dx5<List<f5h>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("ResultService/cyber/mobile/api/v1/gamesByOpp")
    Object c(@okd0 Map<String, Object> map, yje<dx5<fcp0>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLive/mb/cyber/v3/gamesByOppPartner")
    Object d(@okd0 Map<String, Object> map, yje<dx5<List<jj30>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLine/mb/cyber/v3/gamesByOppPartner")
    Object e(@okd0 Map<String, Object> map, yje<dx5<List<jj30>>> yjeVar);
}
