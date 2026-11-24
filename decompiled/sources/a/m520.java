package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ6\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000f\u0010\nJ0\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0014\u0010\nJ6\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\fH§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"La/m520;", "", "", "token", "La/zt6;", "betDataRequest", "La/q16;", "La/gi7;", "La/i2o;", "a", "(Ljava/lang/String;La/zt6;La/yje;)Ljava/lang/Object;", "La/qw40;", "", "d", "(Ljava/lang/String;La/qw40;La/yje;)Ljava/lang/Object;", "f", "La/d40;", "", "b", "(Ljava/lang/String;La/d40;La/yje;)Ljava/lang/Object;", "e", "La/pxg0;", "request", "c", "(Ljava/lang/String;Ljava/util/List;La/yje;)Ljava/lang/Object;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface m520 {
    @kg80("MobileLiveBetX/MobileMakeBet")
    Object a(@xpv("X-Auth") String str, @jb8 zt6 zt6Var, yje<q16<gi7, i2o>> yjeVar);

    @kg80("MobileLiveBetX/MobileGetAvanceX")
    Object b(@xpv("X-Auth") String str, @jb8 d40 d40Var, yje<q16<Double, i2o>> yjeVar);

    @kg80("MobileLiveBetX/SaveBets")
    Object c(@xpv("X-Auth") String str, @jb8 List<pxg0> list, yje<q16<String, i2o>> yjeVar);

    @kg80("MobileLiveBetX/MobileMakeBetMulti")
    Object d(@xpv("X-Auth") String str, @jb8 qw40 qw40Var, yje<List<q16<gi7, i2o>>> yjeVar);

    @kg80("MobileLiveBetX/MobileMakeBetBid")
    Object e(@xpv("X-Auth") String str, @jb8 zt6 zt6Var, yje<q16<gi7, i2o>> yjeVar);

    @kg80("MobileLiveBetX/MobileMakeBetBuilder")
    Object f(@xpv("X-Auth") String str, @jb8 zt6 zt6Var, yje<q16<gi7, i2o>> yjeVar);
}
