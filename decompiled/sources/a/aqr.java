package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\t\u0010\bJ,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\bJ,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H§@¢\u0006\u0004\b\u000b\u0010\bJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"La/aqr;", "", "", "", "params", "La/dx5;", "La/f5h;", "a", "(Ljava/util/Map;La/yje;)Ljava/lang/Object;", "c", "e", "d", "La/bds;", "gameId", "La/zms0;", "b", "(JLa/yje;)Ljava/lang/Object;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface aqr {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLine/mobile/v3/game")
    Object a(@okd0 Map<String, Object> map, yje<dx5<f5h>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("RefGame/v2/GetMainLiveByLineId")
    Object b(@nkd0(ParameterNames.ID) long j, yje<dx5<zms0>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLive/mobile/v3/game")
    Object c(@okd0 Map<String, Object> map, yje<dx5<f5h>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLive/mb/cyber/v3/game")
    Object d(@okd0 Map<String, Object> map, yje<dx5<f5h>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLine/mb/cyber/v3/game")
    Object e(@okd0 Map<String, Object> map, yje<dx5<f5h>> yjeVar);
}
