package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J:\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJ:\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\n¨\u0006\rÀ\u0006\u0003"}, d2 = {"La/kpg;", "", "", "teamOne", "teamTwo", "startTime", "La/dx5;", "", "La/rmg;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/g4g;", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface kpg {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/cyberstatistic/v1/matches/cs")
    Object a(@nkd0("team1") String str, @nkd0("team2") String str2, @nkd0("startTime") String str3, yje<dx5<List<g4g>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/cyberstatistic/v1/matches/dota2")
    Object b(@nkd0("team1") String str, @nkd0("team2") String str2, @nkd0("startTime") String str3, yje<dx5<List<rmg>>> yjeVar);
}
