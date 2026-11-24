package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J<\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\u000b\u0010\nJ,\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u00062\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H§@¢\u0006\u0004\b\u000f\u0010\u0010J<\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\u0012\u0010\nJ<\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\u0013\u0010\nJ2\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00070\u00062\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00070\u00062\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\u0017\u0010\u0016J<\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\u0019\u0010\nJ<\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\u001a\u0010\nJ<\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\u001c\u0010\nJ<\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\u001d\u0010\nJ2\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00070\u00062\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\u001f\u0010\u0016¨\u0006 À\u0006\u0003"}, d2 = {"La/bog;", "", "", "cyberPagePath", "", "requestParams", "La/dx5;", "", "La/fzq0;", "f", "(Ljava/lang/String;Ljava/util/Map;La/yje;)Ljava/lang/Object;", "k", "", "champIdList", "La/fmb;", "e", "(Ljava/util/List;La/yje;)Ljava/lang/Object;", "La/l7r0;", "l", "c", "La/g4t;", "h", "(Ljava/util/Map;La/yje;)Ljava/lang/Object;", "a", "La/web;", "b", "g", "La/f5h;", "j", "i", "La/abh;", "d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface bog {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/MainFeedLine/mb/cyber/v3/gamesByChamp")
    Object a(@okd0 Map<String, Object> map, yje<dx5<List<g4t>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/MainFeedLive/mb/cyber/v3/champs/{cyberPagePath}")
    Object b(@z190("cyberPagePath") String str, @okd0 Map<String, Object> map, yje<dx5<List<web>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/MainFeedLine/mb/cyber/v3/topGames/{cyberPagePath}")
    Object c(@z190("cyberPagePath") String str, @okd0 Map<String, Object> map, yje<dx5<List<l7r0>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("aggregatorfeed/v1/topcyberchamps/real")
    Object d(@okd0 Map<String, Object> map, yje<dx5<List<abh>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/cyberImages/v1/champs")
    Object e(@nkd0(ParameterNames.ID) List<Long> list, yje<dx5<List<fmb>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/MainFeedLive/mb/cyber/v3/topChamps/{cyberPagePath}")
    Object f(@z190("cyberPagePath") String str, @okd0 Map<String, Object> map, yje<dx5<List<fzq0>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/MainFeedLine/mb/cyber/v3/champs/{cyberPagePath}")
    Object g(@z190("cyberPagePath") String str, @okd0 Map<String, Object> map, yje<dx5<List<web>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/MainFeedLive/mb/cyber/v3/gamesByChamp")
    Object h(@okd0 Map<String, Object> map, yje<dx5<List<g4t>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/MainFeedLine/mb/cyber/v3/gamesBySport/{cyberPagePath}")
    Object i(@z190("cyberPagePath") String str, @okd0 Map<String, Object> map, yje<dx5<List<f5h>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/MainFeedLive/mb/cyber/v3/gamesBySport/{cyberPagePath}")
    Object j(@z190("cyberPagePath") String str, @okd0 Map<String, Object> map, yje<dx5<List<f5h>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/MainFeedLine/mb/cyber/v3/topChamps/{cyberPagePath}")
    Object k(@z190("cyberPagePath") String str, @okd0 Map<String, Object> map, yje<dx5<List<fzq0>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/MainFeedLive/mb/cyber/v3/topGames/{cyberPagePath}")
    Object l(@z190("cyberPagePath") String str, @okd0 Map<String, Object> map, yje<dx5<List<l7r0>>> yjeVar);
}
