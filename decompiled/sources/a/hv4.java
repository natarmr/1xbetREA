package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\tH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"La/hv4;", "", "", "auth", "La/cx4;", "request", "La/c57;", "a", "(Ljava/lang/String;La/cx4;La/yje;)Ljava/lang/Object;", "La/ov4;", "La/q16;", "La/uv4;", "La/i2o;", "b", "(Ljava/lang/String;La/ov4;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface hv4 {
    @kg80("/BetHistory/Mobile/GetAutoBetInfoHistoryByDates")
    Object a(@xpv("X-Auth") String str, @jb8 cx4 cx4Var, yje<? super c57> yjeVar);

    @kg80("MobileLiveBetX/MobileCancelBetBidWeb")
    Object b(@xpv("X-Auth") String str, @jb8 ov4 ov4Var, yje<? super q16<uv4, ? extends i2o>> yjeVar);
}
