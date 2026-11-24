package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\f\u0010\nJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000e\u0010\n¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"La/c9s0;", "", "", "feedId", "", "language", "La/dx5;", "", "La/i0s0;", "c", "(JLjava/lang/String;La/yje;)Ljava/lang/Object;", "La/o2s0;", "b", "La/w8s0;", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface c9s0 {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/cyberstatistic/v1/tournaments/valorant/feed/{feedId}")
    Object a(@z190("feedId") long j, @nkd0("lng") String str, yje<? super dx5<w8s0>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/cyberstatistic/v1/tournaments/lol/feed/{feedId}")
    Object b(@z190("feedId") long j, @nkd0("lng") String str, yje<? super dx5<o2s0>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/cyberstatistic/v1/tournaments/cs2/feed/{feedId}")
    Object c(@z190("feedId") long j, @nkd0("lng") String str, yje<? super dx5<? extends List<i0s0>>> yjeVar);
}
