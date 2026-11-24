package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ,\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"La/kjk0;", "", "", "auth", "La/vt;", "request", "La/q16;", "La/t16;", "La/i2o;", "b", "(Ljava/lang/String;La/vt;La/yje;)Ljava/lang/Object;", "", "La/buu;", "a", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface kjk0 {
    @ofr("Account/v1/Mb/GetSocials")
    Object a(@xpv("X-Auth") String str, yje<? super q16<? extends List<buu>, ? extends i2o>> yjeVar);

    @kg80("Account/v1/Mb/AddSocial")
    Object b(@xpv("X-Auth") String str, @jb8 vt vtVar, yje<? super q16<t16, ? extends i2o>> yjeVar);
}
