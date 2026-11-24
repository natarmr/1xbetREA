package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ0\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"La/uvu0;", "", "", "token", "La/lq;", "request", "La/q16;", "La/oq;", "La/i2o;", "a", "(Ljava/lang/String;La/lq;La/yje;)Ljava/lang/Object;", "La/t4k;", "b", "(Ljava/lang/String;La/t4k;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface uvu0 {
    @kg80("Account/v1/Mb/AddCurrency")
    Object a(@xpv("X-Auth") String str, @jb8 lq lqVar, yje<? super q16<oq, ? extends i2o>> yjeVar);

    @kg80("Account/v1/Mb/DeleteCurrency")
    Object b(@xpv("X-Auth") String str, @jb8 t4k t4kVar, yje<? super q16<oq, ? extends i2o>> yjeVar);
}
