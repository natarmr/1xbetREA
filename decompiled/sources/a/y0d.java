package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\bJ0\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"La/y0d;", "", "", "token", "La/q16;", "La/dwa;", "La/i2o;", "b", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "", "La/s2z;", "c", "La/lhs0;", "request", "a", "(Ljava/lang/String;La/lhs0;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface y0d {
    @kg80("PromoServiceAuth/CoinplayCCash/UserWithdraw")
    Object a(@xpv("X-Auth") String str, @jb8 lhs0 lhs0Var, yje<? super q16<dwa, ? extends i2o>> yjeVar);

    @ofr("PromoServiceAuth/CoinplayCCash/GetUserBalance")
    Object b(@xpv("X-Auth") String str, yje<? super q16<dwa, ? extends i2o>> yjeVar);

    @ofr("PromoServiceAuth/CoinplayCCash/LastTransactions")
    Object c(@xpv("X-Auth") String str, yje<? super q16<? extends List<s2z>, ? extends i2o>> yjeVar);
}
