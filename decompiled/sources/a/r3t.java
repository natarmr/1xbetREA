package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J6\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"La/r3t;", "", "", "auth", "", "", "gameIds", "La/nz5;", "La/yk10;", "La/l5t;", "a", "(Ljava/lang/String;Ljava/util/List;La/yje;)Ljava/lang/Object;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface r3t {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("BonusFeed/GetUserBonusesGrouped")
    Object a(@xpv("X-Auth") String str, @nkd0("GID") List<Long> list, yje<? super nz5<yk10, ? extends l5t>> yjeVar);
}
