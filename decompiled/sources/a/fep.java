package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\f\u0010\u000b¨\u0006\rÀ\u0006\u0003"}, d2 = {"La/fep;", "", "", "auth", "La/dx5;", "La/jx60;", "a", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/mv60;", "request", "b", "(Ljava/lang/String;La/mv60;La/yje;)Ljava/lang/Object;", "c", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface fep {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/GamesFavorites/v2/Favorites")
    Object a(@xpv("X-Auth") String str, yje<? super dx5<jx60>> yjeVar);

    @kg80("/GamesFavorites/v2/Favorites/Add")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object b(@xpv("X-Auth") String str, @jb8 mv60 mv60Var, yje<? super dx5<jx60>> yjeVar);

    @kg80("/GamesFavorites/v2/Favorites/Remove")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object c(@xpv("X-Auth") String str, @jb8 mv60 mv60Var, yje<? super dx5<jx60>> yjeVar);
}
