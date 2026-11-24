package a;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0016\u0010\u0017J:\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\n0\u001c2\b\b\u0001\u0010\u0018\u001a\u00020\u00122\b\b\u0001\u0010\u0019\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001e\u0010\u001fJ:\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\n0\u001c2\b\b\u0001\u0010\u0018\u001a\u00020\u00122\b\b\u0001\u0010\u0019\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\b \u0010\u001fJ2\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\n0\u001c2\u0014\b\u0001\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120!H§@¢\u0006\u0004\b$\u0010%J2\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\n0\u001c2\u0014\b\u0001\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120!H§@¢\u0006\u0004\b&\u0010%J8\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00060\u00040\n2\u0014\b\u0001\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120!H§@¢\u0006\u0004\b(\u0010%¨\u0006)À\u0006\u0003"}, d2 = {"La/vre;", "", "La/iit0;", "request", "La/q16;", "La/oit0;", "La/i2o;", "f", "(La/iit0;La/yje;)Ljava/lang/Object;", "La/fit0;", "", "d", "(La/fit0;La/yje;)Ljava/lang/Object;", "La/sht0;", "La/wht0;", "i", "(La/sht0;La/yje;)Ljava/lang/Object;", "La/byg0;", "", "e", "(La/byg0;La/yje;)Ljava/lang/Object;", "La/xxg0;", "c", "(La/xxg0;La/yje;)Ljava/lang/Object;", "gameIds", "language", "", "whence", "La/dx5;", "La/s5t;", "j", "(Ljava/lang/String;Ljava/lang/String;ILa/yje;)Ljava/lang/Object;", "b", "", "params", "La/zg7;", "a", "(Ljava/util/Map;La/yje;)Ljava/lang/Object;", "h", "La/fm00;", "g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface vre {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLine/mobile/v3/betsOnFavoriteEvents")
    Object a(@okd0 Map<String, String> map, yje<dx5<List<zg7>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLive/mobile/v3/gamesForCoupon")
    Object b(@nkd0(encoded = true, value = "gameIds") String str, @nkd0("lng") String str2, @nkd0("whence") int i, yje<dx5<List<s5t>>> yjeVar);

    @kg80("MobileLiveBetX/MobileSaveCoupon")
    Object c(@jb8 xxg0 xxg0Var, yje<q16<String, i2o>> yjeVar);

    @kg80("MobileLiveBetX/MobileUpdateCouponMulti")
    Object d(@jb8 fit0 fit0Var, yje<q16<List<oit0>, i2o>> yjeVar);

    @kg80("MobileLiveBetX/MobileSaveCoupon")
    Object e(@jb8 byg0 byg0Var, yje<q16<String, i2o>> yjeVar);

    @kg80("MobileLiveBetX/MobileUpdateCoupon")
    Object f(@jb8 iit0 iit0Var, yje<q16<oit0, i2o>> yjeVar);

    @ofr("MobileLiveBetX/GetBets")
    Object g(@okd0 Map<String, String> map, yje<List<q16<fm00, i2o>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLive/mobile/v3/betsOnFavoriteEvents")
    Object h(@okd0 Map<String, String> map, yje<dx5<List<zg7>>> yjeVar);

    @kg80("MobileLiveBetX/MobileUpdateCouponBuilder")
    Object i(@jb8 sht0 sht0Var, yje<q16<wht0, i2o>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MainFeedLine/mobile/v3/gamesForCoupon")
    Object j(@nkd0(encoded = true, value = "gameIds") String str, @nkd0("lng") String str2, @nkd0("whence") int i, yje<dx5<List<s5t>>> yjeVar);
}
