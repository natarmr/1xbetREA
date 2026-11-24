package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"La/w4c0;", "", "", "auth", "La/n390;", "request", "La/u2t;", "La/q390;", "b", "(Ljava/lang/String;La/n390;La/yje;)Ljava/lang/Object;", "La/poc0;", "La/trt;", "a", "(Ljava/lang/String;La/poc0;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface w4c0 {
    @kg80("/Games/PromoBonus/Generic/GetBalance")
    Object a(@xpv("X-Auth") String str, @jb8 poc0 poc0Var, yje<? super u2t<trt>> yjeVar);

    @kg80("/Games/PromoBonus/Generic/PayRotations")
    Object b(@xpv("X-Auth") String str, @jb8 n390 n390Var, yje<? super u2t<q390>> yjeVar);
}
