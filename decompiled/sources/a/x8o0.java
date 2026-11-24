package a;

import kotlin.Metadata;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0001H§@¢\u0006\u0004\b\b\u0010\tJ.\u0010\u000b\u001a\u00020\u00072\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\n2\b\b\u0003\u0010\u0006\u001a\u00020\u0001H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"La/x8o0;", "", "Lokhttp3/RequestBody;", "request", "", "auth", "tag", "Lokhttp3/ResponseBody;", "b", "(Lokhttp3/RequestBody;Ljava/lang/String;Ljava/lang/Object;La/yje;)Ljava/lang/Object;", "La/mb8;", "a", "(Ljava/lang/String;La/mb8;Ljava/lang/Object;La/yje;)Ljava/lang/Object;", "analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface x8o0 {
    @kg80("/r/")
    Object a(@xpv("Authorization") String str, @jb8 mb8 mb8Var, @doo0 Object obj, yje<? super ResponseBody> yjeVar);

    @kg80("/log/Android")
    Object b(@jb8 RequestBody requestBody, @xpv("Authorization") String str, @doo0 Object obj, yje<? super ResponseBody> yjeVar);
}
