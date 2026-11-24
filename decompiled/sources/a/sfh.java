package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J>\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000b¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"La/sfh;", "", "", "gameStatId", "", "ref", "country", "lng", "La/dx5;", "La/e2h;", "a", "(Ljava/lang/String;IILjava/lang/String;La/yje;)Ljava/lang/Object;", ParameterNames.ID, "La/xeh;", "b", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface sfh {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/statisticGame/v2/Cyber/Game")
    Object a(@nkd0(ParameterNames.ID) String str, @nkd0("ref") int i, @nkd0("fcountry") int i2, @nkd0("lng") String str2, yje<? super dx5<e2h>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/statisticGame/v2/StageTTable")
    Object b(@nkd0(ParameterNames.ID) String str, @nkd0("ref") int i, @nkd0("fcountry") int i2, @nkd0("lng") String str2, yje<? super dx5<xeh>> yjeVar);
}
