package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ0\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"La/w37;", "", "", "auth", "La/dwe;", "request", "La/q16;", "La/eug0;", "La/i2o;", "c", "(Ljava/lang/String;La/dwe;La/yje;)Ljava/lang/Object;", "La/d0f;", "b", "(Ljava/lang/String;La/d0f;La/yje;)Ljava/lang/Object;", "d", "La/ctt;", "La/c57;", "a", "(Ljava/lang/String;La/ctt;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface w37 {
    @kg80("/BetHistory/Mobile/GetBetInfoHistoryByBetIds")
    Object a(@xpv("X-Auth") String str, @jb8 ctt cttVar, yje<? super c57> yjeVar);

    @kg80("/MobileLiveBetX/MobileMakeSaleBet")
    Object b(@xpv("X-Auth") String str, @jb8 d0f d0fVar, yje<? super q16<eug0, ? extends i2o>> yjeVar);

    @kg80("/MobileLiveBetX/MobileRemoveAutoSaleBetRule")
    Object c(@xpv("X-Auth") String str, @jb8 dwe dweVar, yje<? super q16<eug0, ? extends i2o>> yjeVar);

    @kg80("/MobileLiveBetX/MobileAddAutoSaleBetRule")
    Object d(@xpv("X-Auth") String str, @jb8 d0f d0fVar, yje<? super q16<eug0, ? extends i2o>> yjeVar);
}
