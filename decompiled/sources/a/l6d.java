package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"La/l6d;", "", "", "token", "La/dx5;", "", "La/ff3;", "b", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/yix;", "apps", "", "a", "(Ljava/lang/String;La/yix;La/yje;)Ljava/lang/Object;", "xplatform.android:onexuser"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface l6d {
    @kg80("ConfigAppService/v1/ComApp")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object a(@xpv("X-Auth") String str, @jb8 yix yixVar, yje<? super dx5<Boolean>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("ConfigAppService/v1/ComApp")
    Object b(@xpv("X-Auth") String str, yje<? super dx5<? extends List<ff3>>> yjeVar);
}
