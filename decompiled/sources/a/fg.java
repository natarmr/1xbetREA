package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\rH§@¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0003\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"La/fg;", "", "", "auth", "La/b8c;", "body", "La/q16;", "La/jd;", "La/i2o;", "b", "(Ljava/lang/String;La/b8c;La/yje;)Ljava/lang/Object;", "e", "(La/b8c;La/yje;)Ljava/lang/Object;", "La/xk;", "d", "(Ljava/lang/String;La/xk;La/yje;)Ljava/lang/Object;", "messageId", "La/eck0;", "c", "(Ljava/lang/String;Ljava/lang/String;La/eck0;La/yje;)Ljava/lang/Object;", "g", "(La/eck0;La/yje;)Ljava/lang/Object;", "La/p28;", "a", "(Ljava/lang/String;La/p28;La/yje;)Ljava/lang/Object;", "acceptHeader", "phone", "La/dx5;", "La/s4c;", "f", "(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface fg {
    @kg80("Account/v1/Mb/ActivateEmail")
    Object a(@xpv("X-Auth") String str, @jb8 p28 p28Var, yje<? super q16<jd, ? extends i2o>> yjeVar);

    @kg80("Account/v1/CheckCode")
    Object b(@xpv("X-Auth") String str, @jb8 b8c b8cVar, yje<? super q16<jd, ? extends i2o>> yjeVar);

    @kg80("Account/v1/SendCode")
    Object c(@xpv("X-Auth") String str, @xpv("X-Message-Id") String str2, @jb8 eck0 eck0Var, yje<? super q16<jd, ? extends i2o>> yjeVar);

    @kg80("Account/v1/Mb/ChangePhone")
    Object d(@xpv("X-Auth") String str, @jb8 xk xkVar, yje<? super q16<jd, ? extends i2o>> yjeVar);

    @kg80("Account/v1/CheckCode")
    Object e(@jb8 b8c b8cVar, yje<? super q16<jd, ? extends i2o>> yjeVar);

    @ofr("/RestCoreService/v1/mb/GetPhoneNumber")
    Object f(@xpv("Accept") String str, @nkd0("phone") String str2, yje<? super dx5<s4c>> yjeVar);

    @kg80("Account/v1/SendCode")
    Object g(@jb8 eck0 eck0Var, yje<? super q16<jd, ? extends i2o>> yjeVar);
}
