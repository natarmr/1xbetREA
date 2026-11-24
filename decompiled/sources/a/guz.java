package a;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\b¨\u0006\u0014À\u0006\u0003"}, d2 = {"La/guz;", "", "", "auth", "language", "La/dx5;", "La/l300;", "a", "(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/mqi0;", "request", "", "b", "(Ljava/lang/String;La/mqi0;La/yje;)Ljava/lang/Object;", "La/rsi0;", "d", "(Ljava/lang/String;La/rsi0;La/yje;)Ljava/lang/Object;", "", "La/g7i0;", "c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface guz {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("LimitService/api/mobile/v4/limits")
    Object a(@xpv("X-Auth") String str, @nkd0("lng") String str2, yje<? super dx5<l300>> yjeVar);

    @kg80("LimitService/api/mobile/v4/limits")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object b(@xpv("X-Auth") String str, @jb8 mqi0 mqi0Var, yje<? super dx5<Unit>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("LimitService/external/v3/reasons/selfexclude")
    Object c(@xpv("X-Auth") String str, @nkd0("lng") String str2, yje<? super dx5<? extends List<g7i0>>> yjeVar);

    @kg80("LimitService/api/mobile/v4/limits")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object d(@xpv("X-Auth") String str, @jb8 rsi0 rsi0Var, yje<? super dx5<Unit>> yjeVar);
}
