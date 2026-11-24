package a;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\tH§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"La/cst0;", "", "", "authToken", "La/zyg0;", "request", "", "b", "(Ljava/lang/String;La/zyg0;La/yje;)Ljava/lang/Object;", "La/wyg0;", "a", "(Ljava/lang/String;La/wyg0;La/yje;)Ljava/lang/Object;", "analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface cst0 {
    @kg80("/SubServiceMb/v4/push-notification/reactions/SaveUserReactionByMessageId")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object a(@xpv("X-Auth") String str, @jb8 wyg0 wyg0Var, yje<? super Unit> yjeVar);

    @kg80("/subscriptionservice/api/v3/subs/SaveUserReaction")
    Object b(@xpv("X-Auth") String str, @jb8 zyg0 zyg0Var, yje<? super Unit> yjeVar);
}
