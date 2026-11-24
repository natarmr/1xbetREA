package a;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0015\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001b\u0010\u0019¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"La/y8n0;", "", "", "authToken", "", "constId", "", "requestSource", "La/dx5;", "La/yts;", "c", "(Ljava/lang/String;JILa/yje;)Ljava/lang/Object;", "La/l6n0;", "request", "", "b", "(Ljava/lang/String;La/l6n0;La/yje;)Ljava/lang/Object;", "La/f5k;", "a", "(Ljava/lang/String;La/f5k;La/yje;)Ljava/lang/Object;", "La/d6n0;", "d", "(Ljava/lang/String;La/d6n0;La/yje;)Ljava/lang/Object;", "La/ust0;", "e", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/grt0;", "f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface y8n0 {
    @kg80("/SubServiceMb/v4/subs/games/DeleteSubscriptions")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object a(@xpv("X-Auth") String str, @jb8 f5k f5kVar, yje<? super Unit> yjeVar);

    @kg80("/SubServiceMb/v4/subs/games/AddSubscription")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object b(@xpv("X-Auth") String str, @jb8 l6n0 l6n0Var, yje<? super Unit> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/SubServiceMb/v4/subs/games/GetSavedGameSubscriptionSettings")
    Object c(@xpv("X-Auth") String str, @nkd0("constId") long j, @nkd0("requestSource") int i, yje<? super dx5<yts>> yjeVar);

    @kg80("/SubServiceMb/v4/subs/bets/AddSubscription")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object d(@xpv("X-Auth") String str, @jb8 d6n0 d6n0Var, yje<? super Unit> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/SubServiceMb/v4/subs/common/GetSubscriptions")
    Object e(@xpv("X-Auth") String str, yje<? super dx5<ust0>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/SubServiceMb/v4/subs/games/GetSubscriptions")
    Object f(@xpv("X-Auth") String str, yje<? super dx5<grt0>> yjeVar);
}
