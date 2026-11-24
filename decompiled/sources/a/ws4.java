package a;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJ>\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000b2\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00102\b\b\u0003\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0016J4\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\u001aJ8\u0010\u001c\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u001b2\b\b\u0003\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010 \u001a\u00020\u00112\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\b\b\u0003\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b \u0010!J.\u0010\"\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\"\u0010\u001aJ&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\b\b\u0001\u0010\u0005\u001a\u00020#H§@¢\u0006\u0004\b'\u0010(J4\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020)H§@¢\u0006\u0004\b+\u0010,J4\u0010.\u001a\b\u0012\u0004\u0012\u00020*0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020-H§@¢\u0006\u0004\b.\u0010/J.\u00101\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u0002002\b\b\u0003\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b1\u00102J:\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002050$2\b\b\u0001\u00103\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u0002042\b\b\u0001\u0010\f\u001a\u00020\u0002H§@¢\u0006\u0004\b6\u00107J&\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000209080\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b:\u0010;J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u0007H§@¢\u0006\u0004\b=\u0010>¨\u0006?À\u0006\u0003"}, d2 = {"La/ws4;", "", "", "auth", "La/bte0;", "request", "acceptHeader", "La/dx5;", "La/ete0;", "j", "(Ljava/lang/String;La/bte0;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/qte0;", "messageId", "La/tte0;", "i", "(Ljava/lang/String;La/qte0;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/pbu0;", "", "a", "(Ljava/lang/String;La/pbu0;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/tq4;", "b", "(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "notificationId", "La/pq4;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/wwd;", "f", "(Ljava/lang/String;Ljava/lang/String;La/wwd;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/wvd;", "code", "c", "(Ljava/lang/String;La/wvd;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "h", "La/y8c;", "La/q16;", "La/b9c;", "La/i2o;", "l", "(La/y8c;La/yje;)Ljava/lang/Object;", "La/wet0;", "La/tet0;", "n", "(Ljava/lang/String;Ljava/lang/String;La/wet0;La/yje;)Ljava/lang/Object;", "La/qet0;", "m", "(Ljava/lang/String;Ljava/lang/String;La/qet0;La/yje;)Ljava/lang/Object;", "La/aft0;", "k", "(Ljava/lang/String;La/aft0;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "version", "La/odi0;", "La/tvq0;", "o", "(Ljava/lang/String;La/odi0;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "", "La/n84;", "g", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/kr4;", "e", "(La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface ws4 {
    @kg80("/authenticator/api/v2/registration/register-verify")
    Object a(@xpv("X-Auth") String str, @jb8 pbu0 pbu0Var, @xpv("Accept") String str2, yje<? super Unit> yjeVar);

    @ofr("/authenticator/api/v2/approvals")
    Object b(@xpv("X-Auth") String str, @xpv("Accept") String str2, yje<? super dx5<tq4>> yjeVar);

    @kg80("/authenticator/api/v2/approvals/{notificationId}/confirmByCode")
    Object c(@z190("notificationId") String str, @jb8 wvd wvdVar, @xpv("Accept") String str2, yje<? super Unit> yjeVar);

    @ofr("/authenticator/api/v2/approvals/{notificationId}")
    Object d(@xpv("X-Auth") String str, @xpv("Accept") String str2, @z190("notificationId") String str3, yje<? super dx5<pq4>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("authenticator/api/v2/registration/partner-permission-info")
    Object e(yje<? super dx5<kr4>> yjeVar);

    @kg80("/authenticator/api/v2/approvals/{notificationId}/confirm")
    Object f(@xpv("X-Auth") String str, @z190("notificationId") String str2, @jb8 wwd wwdVar, @xpv("Accept") String str3, yje<? super Unit> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/authenticator/api/v2/registration/get-registrations")
    Object g(@xpv("X-Auth") String str, yje<? super dx5<? extends List<n84>>> yjeVar);

    @kg80("/authenticator/api/v2/approvals/{notificationId}/decline")
    Object h(@xpv("X-Auth") String str, @z190("notificationId") String str2, @xpv("Accept") String str3, yje<? super Unit> yjeVar);

    @kg80("/authenticator/api/v2/registration/register-sendsms")
    Object i(@xpv("X-Auth") String str, @jb8 qte0 qte0Var, @xpv("Accept") String str2, @xpv("X-Message-Id") String str3, yje<? super dx5<tte0>> yjeVar);

    @kg80("/authenticator/api/v2/registration/register")
    Object j(@xpv("X-Auth") String str, @jb8 bte0 bte0Var, @xpv("Accept") String str2, yje<? super dx5<ete0>> yjeVar);

    @kg80("/authenticator/api/v2/registration/unregister-verify")
    Object k(@xpv("X-Auth") String str, @jb8 aft0 aft0Var, @xpv("Accept") String str2, yje<? super Unit> yjeVar);

    @kg80("/Account/v1/Mb/CheckToken")
    Object l(@jb8 y8c y8cVar, yje<? super q16<b9c, ? extends i2o>> yjeVar);

    @kg80("/authenticator/api/v2/registration/unregister")
    Object m(@xpv("X-Auth") String str, @xpv("Accept") String str2, @jb8 qet0 qet0Var, yje<? super dx5<tet0>> yjeVar);

    @kg80("/authenticator/api/v2/registration/unregister")
    Object n(@xpv("X-Auth") String str, @xpv("Accept") String str2, @jb8 wet0 wet0Var, yje<? super dx5<tet0>> yjeVar);

    @kg80("UserAuth/SendConfirmationSms")
    Object o(@nkd0("v") String str, @jb8 odi0 odi0Var, @xpv("X-Message-Id") String str2, yje<? super q16<String, ? extends tvq0>> yjeVar);
}
