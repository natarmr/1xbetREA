package a;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0001H§@¢\u0006\u0004\b\u0006\u0010\u0007J8\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u0004\u001a\u00020\u0001H§@¢\u0006\u0004\b\f\u0010\rJ8\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u000e2\b\b\u0003\u0010\u0004\u001a\u00020\u0001H§@¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00112\b\b\u0003\u0010\u0004\u001a\u00020\u0001H§@¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0015\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00142\b\b\u0003\u0010\u0004\u001a\u00020\u0001H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"La/nzf;", "", "", "customerIOAuthToken", "tag", "La/yf;", "a", "(Ljava/lang/String;Ljava/lang/Object;La/yje;)Ljava/lang/Object;", "customerId", "La/mzf;", "request", "", "c", "(Ljava/lang/String;Ljava/lang/String;La/mzf;Ljava/lang/Object;La/yje;)Ljava/lang/Object;", "La/yyf;", "e", "(Ljava/lang/String;Ljava/lang/String;La/yyf;Ljava/lang/Object;La/yje;)Ljava/lang/Object;", "La/qyf;", "d", "(Ljava/lang/String;Ljava/lang/String;La/qyf;Ljava/lang/Object;La/yje;)Ljava/lang/Object;", "La/tyf;", "b", "(Ljava/lang/String;La/tyf;Ljava/lang/Object;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface nzf {
    @ofr("/api/v1/accounts/region")
    Object a(@xpv("Authorization") String str, @doo0 Object obj, yje<? super yf> yjeVar);

    @kg80("/api/v1/metrics")
    Object b(@xpv("Authorization") String str, @jb8 tyf tyfVar, @doo0 Object obj, yje<? super Unit> yjeVar);

    @lg80("/api/v1/customers/{customer_id}")
    Object c(@xpv("Authorization") String str, @z190("customer_id") String str2, @jb8 mzf mzfVar, @doo0 Object obj, yje<? super Unit> yjeVar);

    @lg80("/api/v1/customers/{customer_id}/devices")
    Object d(@xpv("Authorization") String str, @z190("customer_id") String str2, @jb8 qyf qyfVar, @doo0 Object obj, yje<? super Unit> yjeVar);

    @lg80("/api/v1/customers/{customer_id}")
    Object e(@xpv("Authorization") String str, @z190("customer_id") String str2, @jb8 yyf yyfVar, @doo0 Object obj, yje<? super Unit> yjeVar);
}
