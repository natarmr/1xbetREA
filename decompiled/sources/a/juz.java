package a;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0017\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"La/juz;", "", "", "auth", "", "b", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "language", "La/dx5;", "La/o300;", "a", "(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/pqi0;", "request", "e", "(Ljava/lang/String;La/pqi0;La/yje;)Ljava/lang/Object;", "La/pti0;", "f", "(Ljava/lang/String;La/pti0;La/yje;)Ljava/lang/Object;", "La/qsi0;", "d", "(Ljava/lang/String;La/qsi0;La/yje;)Ljava/lang/Object;", "La/wmz;", "c", "(Ljava/lang/String;La/wmz;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface juz {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("LimitService/api/mobile/v4/limits")
    Object a(@xpv("X-Auth") String str, @nkd0("lng") String str2, yje<? super dx5<o300>> yjeVar);

    @kg80("UserPingsCollector/api/v1/ping")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object b(@xpv("X-Auth") String str, yje<? super Unit> yjeVar);

    @kg80("LimitService/api/mobile/v4/limitaction")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object c(@xpv("X-Auth") String str, @jb8 wmz wmzVar, yje<? super Unit> yjeVar);

    @kg80("LimitService/api/mobile/v4/limits")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object d(@xpv("X-Auth") String str, @jb8 qsi0 qsi0Var, yje<? super dx5<Unit>> yjeVar);

    @kg80("LimitService/api/mobile/v4/limits")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object e(@xpv("X-Auth") String str, @jb8 pqi0 pqi0Var, yje<? super dx5<Unit>> yjeVar);

    @kg80("LimitService/api/mobile/v4/limits")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object f(@xpv("X-Auth") String str, @jb8 pti0 pti0Var, yje<? super dx5<Unit>> yjeVar);
}
