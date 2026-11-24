package a;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0006H§@¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000f0\u00062\b\b\u0001\u0010\u0013\u001a\u00020\nH§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"La/xyg;", "", "", "subSportId", "", "year", "La/dx5;", "La/tyg;", "d", "(JILa/yje;)Ljava/lang/Object;", "", Payload.SOURCE, "La/jyg;", "a", "(ILjava/lang/String;La/yje;)Ljava/lang/Object;", "", "La/ial;", "c", "(La/yje;)Ljava/lang/Object;", "region", "La/y5l;", "b", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface xyg {
    @ofr("cyberstatistic/v1/cs-leaderboard")
    Object a(@nkd0("year") int i, @nkd0(Payload.SOURCE) String str, yje<? super dx5<jyg>> yjeVar);

    @ofr("cyberstatistic/v1/dota-leaderboard/players")
    Object b(@nkd0("region") String str, yje<? super dx5<? extends List<y5l>>> yjeVar);

    @ofr("cyberstatistic/v1/dota-leaderboard/teams")
    Object c(yje<? super dx5<? extends List<ial>>> yjeVar);

    @ofr("cyberstatistic/v1/leaderboard")
    Object d(@nkd0("subSportId") long j, @nkd0("year") int i, yje<? super dx5<tyg>> yjeVar);
}
