package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"La/cup0;", "", "", "auth", "La/dx5;", "La/hvp0;", "b", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "botId", "La/avp0;", "c", "(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/iwp0;", "request", "La/lwp0;", "a", "(Ljava/lang/String;Ljava/lang/String;La/iwp0;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface cup0 {
    @kg80("TgBotLink/deep-link/check-tg-user-pair")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object a(@xpv("X-Auth") String str, @xpv("X-Bot-Id") String str2, @jb8 iwp0 iwp0Var, yje<? super dx5<lwp0>> yjeVar);

    @kg80("TgBotLink/deep-link/auth")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object b(@xpv("X-Auth") String str, yje<? super dx5<hvp0>> yjeVar);

    @kg80("TgBotLink/deep-link/auth-with-code")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object c(@xpv("X-Auth") String str, @xpv("X-Bot-Id") String str2, yje<? super dx5<avp0>> yjeVar);
}
