package a;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J2\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\b\u0010\tJ2\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\r\u0010\tJ2\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u000f\u0010\tJ2\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0011\u0010\tJ2\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0013\u0010\t¨\u0006\u0014À\u0006\u0003"}, d2 = {"La/wea0;", "", "", "", "requestParams", "La/dx5;", "", "La/u5l;", "e", "(Ljava/util/Map;La/yje;)Ljava/lang/Object;", "La/vif;", "d", "La/f110;", "c", "La/hyt0;", "f", "La/txd0;", "b", "La/uj40;", "a", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface wea0 {
    @ofr("/cyberstatistic/v1/teams-lineup/mlbb")
    Object a(@okd0 Map<String, String> map, yje<? super dx5<? extends List<uj40>>> yjeVar);

    @ofr("/cyberstatistic/v1/teams-lineup/rainbow")
    Object b(@okd0 Map<String, String> map, yje<? super dx5<? extends List<txd0>>> yjeVar);

    @ofr("/cyberstatistic/v1/teams-lineup/lol")
    Object c(@okd0 Map<String, String> map, yje<? super dx5<? extends List<f110>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/cyberstatistic/v1/teams-lineup/cs")
    Object d(@okd0 Map<String, String> map, yje<? super dx5<? extends List<vif>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/cyberstatistic/v1/teams-lineup/dota2")
    Object e(@okd0 Map<String, String> map, yje<? super dx5<? extends List<u5l>>> yjeVar);

    @ofr("/cyberstatistic/v1/teams-lineup/valorant")
    Object f(@okd0 Map<String, String> map, yje<? super dx5<? extends List<hyt0>>> yjeVar);
}
