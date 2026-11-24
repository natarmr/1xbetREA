package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JD\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00100\t2\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"La/pkg;", "", "", ParameterNames.ID, "", "ref", "country", "", "lng", "La/dx5;", "La/djf;", "b", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/gpf;", "a", "(JIILjava/lang/String;La/yje;)Ljava/lang/Object;", "", "players", "La/bqf;", "c", "(Ljava/util/List;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface pkg {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/statisticGame/v2/mapstats")
    Object a(@nkd0(ParameterNames.ID) long j, @nkd0("ref") int i, @nkd0("fcountry") int i2, @nkd0("lng") String str, yje<? super dx5<gpf>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/statisticGame/v2/PlayerComparison")
    Object b(@nkd0(ParameterNames.ID) long j, @nkd0("ref") Integer num, @nkd0("fcountry") Integer num2, @nkd0("lng") String str, yje<? super dx5<djf>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/cyberstatistic/v1/players/cs")
    Object c(@nkd0("players") List<String> list, yje<? super dx5<? extends List<bqf>>> yjeVar);
}
