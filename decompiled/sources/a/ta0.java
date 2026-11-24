package a;

import kotlin.Metadata;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ$\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"La/ta0;", "", "", "auth", "Lokhttp3/RequestBody;", "request", "La/e02;", "c", "(Ljava/lang/String;Lokhttp3/RequestBody;La/yje;)Ljava/lang/Object;", "b", "(Lokhttp3/RequestBody;La/yje;)Ljava/lang/Object;", "La/obf;", "La/rbf;", "a", "(Ljava/lang/String;La/obf;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface ta0 {
    @kg80("Aggregator_v3/v2/CreateNick")
    Object a(@xpv("X-Auth") String str, @jb8 obf obfVar, yje<rbf> yjeVar);

    @kg80("aggrop/OpenGame")
    Object b(@jb8 RequestBody requestBody, yje<e02> yjeVar);

    @kg80("aggrop/OpenGame2")
    Object c(@xpv("X-Auth") String str, @jb8 RequestBody requestBody, yje<e02> yjeVar);
}
