package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J,\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ0\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\tJ:\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0019J6\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0005\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 À\u0006\u0003"}, d2 = {"La/qu9;", "", "", "auth", "La/q16;", "", "La/mu9;", "La/i2o;", "b", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/y5k;", "request", "La/ht9;", "a", "(Ljava/lang/String;La/y5k;La/yje;)Ljava/lang/Object;", "La/e6k;", "d", "(Ljava/lang/String;La/e6k;La/yje;)Ljava/lang/Object;", "lng", "La/dx5;", "La/ip9;", "c", "La/zin0;", "language", "e", "(Ljava/lang/String;La/zin0;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "appGuid", "", "refId", "La/et9;", "f", "(Ljava/lang/String;ILa/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface qu9 {
    @kg80("/Account/v1/Mb/BackCallDelete")
    Object a(@xpv("X-Auth") String str, @jb8 y5k y5kVar, yje<? super q16<ht9, ? extends i2o>> yjeVar);

    @ofr("/Account/v1/Mb/GetUserCalls")
    Object b(@xpv("X-Auth") String str, yje<? super q16<? extends List<mu9>, ? extends i2o>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("RestCoreService/v1/Mb/GetCallTheme")
    Object c(@nkd0("lng") String str, yje<? super dx5<? extends List<ip9>>> yjeVar);

    @kg80("/Account/v1/Mb/BackCallDelete")
    Object d(@xpv("X-Auth") String str, @jb8 e6k e6kVar, yje<? super q16<ht9, ? extends i2o>> yjeVar);

    @kg80("/Account/v1/Mb/BackCall")
    Object e(@xpv("X-Auth") String str, @jb8 zin0 zin0Var, @nkd0("Language") String str2, yje<? super q16<ht9, ? extends i2o>> yjeVar);

    @ofr("/Account/v1/BackCallLanguages")
    Object f(@xpv("AppGuid") String str, @nkd0("partner") int i, yje<? super q16<? extends List<et9>, ? extends i2o>> yjeVar);
}
