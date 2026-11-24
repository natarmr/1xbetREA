package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J,\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ:\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"La/gmh0;", "", "", "lng", "La/q16;", "", "La/wlh0;", "La/i2o;", "b", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "auth", "appGuid", "La/csh0;", "request", "", "a", "(Ljava/lang/String;Ljava/lang/String;La/csh0;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface gmh0 {
    @kg80("Account/v1/Mb/Question/Set")
    Object a(@xpv("X-Auth") String str, @xpv("AppGuid") String str2, @jb8 csh0 csh0Var, yje<? super q16<Boolean, ? extends i2o>> yjeVar);

    @ofr("Account/v1/Mb/Question/Get")
    Object b(@nkd0("r.language") String str, yje<? super q16<? extends List<wlh0>, ? extends i2o>> yjeVar);
}
