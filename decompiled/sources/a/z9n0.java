package a;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\tH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"La/z9n0;", "", "", "authToken", "La/o6n0;", "request", "", "b", "(Ljava/lang/String;La/o6n0;La/yje;)Ljava/lang/Object;", "La/k6k;", "c", "(Ljava/lang/String;La/k6k;La/yje;)Ljava/lang/Object;", "La/dx5;", "La/att0;", "a", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface z9n0 {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/SubServiceMb/v4/subs/teams/GetSubscriptions")
    Object a(@xpv("X-Auth") String str, yje<? super dx5<att0>> yjeVar);

    @kg80("/SubServiceMb/v4/subs/teams/AddSubscription")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object b(@xpv("X-Auth") String str, @jb8 o6n0 o6n0Var, yje<? super Unit> yjeVar);

    @kg80("/SubServiceMb/v4/subs/teams/DeleteSubscriptions")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object c(@xpv("X-Auth") String str, @jb8 k6k k6kVar, yje<? super Unit> yjeVar);
}
