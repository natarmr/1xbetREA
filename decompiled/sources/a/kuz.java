package a;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u0010\u0010\u000eJ&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u0019\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"La/kuz;", "", "", "auth", "language", "La/dx5;", "", "La/qhu;", "a", "(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/qpi0;", "request", "La/tpi0;", "f", "(Ljava/lang/String;Ljava/lang/String;La/qpi0;La/yje;)Ljava/lang/Object;", "La/ypi0;", "c", "La/wqt;", "d", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/fce0;", "", "b", "(Ljava/lang/String;La/fce0;La/yje;)Ljava/lang/Object;", "La/xmz;", "e", "(Ljava/lang/String;Ljava/lang/String;La/xmz;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface kuz {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("LimitService/v2/external/mobile/limits")
    Object a(@xpv("X-Auth") String str, @nkd0("lng") String str2, yje<? super dx5<? extends List<qhu>>> yjeVar);

    @kg80("LimitService/v2/external/mobile/realitycheckaction")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object b(@xpv("X-Auth") String str, @jb8 fce0 fce0Var, yje<? super Unit> yjeVar);

    @kg80("LimitService/v2/external/mobile/limits")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object c(@xpv("X-Auth") String str, @nkd0("X-Language") String str2, @jb8 qpi0 qpi0Var, yje<? super dx5<ypi0>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("Limit/time/v1/AvaliableLimits")
    Object d(@xpv("X-Auth") String str, yje<? super dx5<? extends List<wqt>>> yjeVar);

    @kg80("LimitService/v2/external/mobile/limitaction")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object e(@xpv("X-Auth") String str, @nkd0("X-Language") String str2, @jb8 xmz xmzVar, yje<? super Unit> yjeVar);

    @kg80("LimitService/v2/external/mobile/limits")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object f(@xpv("X-Auth") String str, @nkd0("X-Language") String str2, @jb8 qpi0 qpi0Var, yje<? super dx5<tpi0>> yjeVar);
}
