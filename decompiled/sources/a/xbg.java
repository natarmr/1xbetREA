package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH§@¢\u0006\u0004\b\r\u0010\u000eJl\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\n2\b\b\u0001\u0010\u0013\u001a\u00020\u000f2\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\nH§@¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"La/xbg;", "", "", "champId", "La/dx5;", "", "La/scg;", "c", "(JLa/yje;)Ljava/lang/Object;", "", "", "params", "La/ydg;", "b", "(Ljava/util/Map;La/yje;)Ljava/lang/Object;", "", "countryId", "groupId", "language", "refId", "dateFrom", "dateTo", "cyberType", "La/geg;", "a", "(IILjava/lang/String;ILjava/util/List;JJILa/yje;)Ljava/lang/Object;", "subSportId", "La/hsh;", "d", "(JLjava/lang/String;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface xbg {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("ResultService/mobile/api/v2/games")
    Object a(@nkd0("country") int i, @nkd0("Gr") int i2, @nkd0("Lng") String str, @nkd0("Ref") int i3, @nkd0("ChampIds") List<Long> list, @nkd0("DateFrom") long j, @nkd0("DateTo") long j2, @nkd0("CyberType") int i4, yje<dx5<geg>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("ResultService/cyber/mobile/api/v2/gamesCalendar")
    Object b(@okd0 Map<String, Object> map, yje<dx5<ydg>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("cyberImages/v1/champs")
    Object c(@nkd0(ParameterNames.ID) long j, yje<dx5<List<scg>>> yjeVar);

    @ofr("/cyberstatistic/v1/tournaments")
    Object d(@nkd0("subSportId") long j, @nkd0("lng") String str, yje<dx5<hsh>> yjeVar);
}
