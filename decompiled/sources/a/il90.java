package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"La/il90;", "", "", "phone", "La/dx5;", "La/s4c;", "b", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "auth", "La/xk;", "body", "La/q16;", "La/jd;", "La/i2o;", "a", "(Ljava/lang/String;La/xk;La/yje;)Ljava/lang/Object;", "La/eck0;", "messageId", "c", "(Ljava/lang/String;La/eck0;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface il90 {
    @kg80("Account/v1/Mb/ActivatePhone")
    Object a(@xpv("X-Auth") String str, @jb8 xk xkVar, yje<? super q16<jd, ? extends i2o>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/RestCoreService/v1/mb/GetPhoneNumber")
    Object b(@nkd0("phone") String str, yje<? super dx5<s4c>> yjeVar);

    @kg80("Account/v1/SendCode")
    Object c(@xpv("X-Auth") String str, @jb8 eck0 eck0Var, @xpv("X-Message-Id") String str2, yje<? super q16<jd, ? extends i2o>> yjeVar);
}
