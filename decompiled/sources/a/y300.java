package a;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"La/y300;", "", "", "auth", "language", "La/dx5;", "La/k300;", "a", "(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/oti0;", "request", "", "c", "(Ljava/lang/String;La/oti0;La/yje;)Ljava/lang/Object;", "b", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/qqi0;", "setMoneyLimitsRequest", "d", "(Ljava/lang/String;La/qqi0;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface y300 {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("LimitService/api/mobile/v4/limits")
    Object a(@xpv("X-Auth") String str, @nkd0("lng") String str2, yje<? super dx5<k300>> yjeVar);

    @kg80("UserPingsCollector/api/v1/ping")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object b(@xpv("X-Auth") String str, yje<? super Unit> yjeVar);

    @kg80("LimitService/api/mobile/v4/limits")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object c(@xpv("X-Auth") String str, @jb8 oti0 oti0Var, yje<? super dx5<Unit>> yjeVar);

    @kg80("LimitService/api/mobile/v4/limits")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object d(@xpv("X-Auth") String str, @jb8 qqi0 qqi0Var, yje<? super dx5<Unit>> yjeVar);
}
