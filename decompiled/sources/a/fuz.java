package a;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001c\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"La/fuz;", "", "", "auth", "language", "La/dx5;", "La/j300;", "a", "(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/qti0;", "request", "", "f", "(Ljava/lang/String;La/qti0;La/yje;)Ljava/lang/Object;", "La/pni0;", "e", "(Ljava/lang/String;La/pni0;La/yje;)Ljava/lang/Object;", "La/mni0;", "b", "(Ljava/lang/String;La/mni0;La/yje;)Ljava/lang/Object;", "La/woi0;", "La/zpi0;", "g", "(Ljava/lang/String;La/woi0;La/yje;)Ljava/lang/Object;", "La/ymz;", "c", "(Ljava/lang/String;La/ymz;La/yje;)Ljava/lang/Object;", "La/gce0;", "d", "(Ljava/lang/String;La/gce0;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface fuz {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("LimitService/api/mobile/v4/limits")
    Object a(@xpv("X-Auth") String str, @nkd0("lng") String str2, yje<? super dx5<j300>> yjeVar);

    @kg80("LimitService/api/mobile/v4/limits")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object b(@xpv("X-Auth") String str, @jb8 mni0 mni0Var, yje<? super dx5<Unit>> yjeVar);

    @kg80("LimitService/api/mobile/v4/limitaction")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object c(@xpv("X-Auth") String str, @jb8 ymz ymzVar, yje<? super Unit> yjeVar);

    @kg80("LimitService/api/mobile/v3/realitycheckaction")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object d(@xpv("X-Auth") String str, @jb8 gce0 gce0Var, yje<? super Unit> yjeVar);

    @kg80("LimitService/api/mobile/v4/limits")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object e(@xpv("X-Auth") String str, @jb8 pni0 pni0Var, yje<? super dx5<Unit>> yjeVar);

    @kg80("LimitService/api/mobile/v4/limits")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object f(@xpv("X-Auth") String str, @jb8 qti0 qti0Var, yje<? super dx5<Unit>> yjeVar);

    @kg80("LimitService/api/mobile/v4/limits")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object g(@xpv("X-Auth") String str, @jb8 woi0 woi0Var, yje<? super dx5<zpi0>> yjeVar);
}
