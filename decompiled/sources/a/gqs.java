package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J>\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000b\u0010\fJ\\\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"La/gqs;", "", "", "gameId", "", "lng", "", "ref", "fCountry", "La/dx5;", "La/we30;", "b", "(JLjava/lang/String;IILa/yje;)Ljava/lang/Object;", "country", "fcountry", "groupId", "whence", "La/of30;", "a", "(IIJILjava/lang/String;IILa/yje;)Ljava/lang/Object;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface gqs {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLive/mobile/v3/chronoLine")
    Object a(@nkd0("country") int i, @nkd0("fcountry") int i2, @nkd0("gameId") long j, @nkd0("gr") int i3, @nkd0("lng") String str, @nkd0("ref") int i4, @nkd0("whence") int i5, yje<? super dx5<of30>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("statisticGame/v2/Events")
    Object b(@nkd0(ParameterNames.ID) long j, @nkd0("lng") String str, @nkd0("ref") int i, @nkd0("fcountry") int i2, yje<? super dx5<we30>> yjeVar);
}
