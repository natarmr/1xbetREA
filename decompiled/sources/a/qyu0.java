package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\tJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"La/qyu0;", "", "", "auth", "La/jq40;", "request", "La/dx5;", "La/gq40;", "b", "(Ljava/lang/String;La/jq40;La/yje;)Ljava/lang/Object;", "c", "La/lyu0;", "La/oyu0;", "a", "(Ljava/lang/String;La/lyu0;La/yje;)Ljava/lang/Object;", "La/iyu0;", "d", "(Ljava/lang/String;La/iyu0;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface qyu0 {
    @kg80("/SeamWalletService/SendSmsCodeWithCaptcha")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object a(@xpv("X-Auth") String str, @jb8 lyu0 lyu0Var, yje<? super dx5<oyu0>> yjeVar);

    @kg80("/SeamWalletService/CheckSmsCodeAndTransferTo")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object b(@xpv("X-Auth") String str, @jb8 jq40 jq40Var, yje<? super dx5<gq40>> yjeVar);

    @kg80("/SeamWalletService/CheckSmsCodeAndTransferFrom")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object c(@xpv("X-Auth") String str, @jb8 jq40 jq40Var, yje<? super dx5<gq40>> yjeVar);

    @kg80("/SeamWalletService/ResendSmsCodeWithCaptcha")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object d(@xpv("X-Auth") String str, @jb8 iyu0 iyu0Var, yje<? super dx5<oyu0>> yjeVar);
}
