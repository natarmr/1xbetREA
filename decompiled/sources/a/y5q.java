package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007JB\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"La/y5q;", "", "", "lng", "", "La/jcq;", "c", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "", "instrumentId", "region", "casse", "cfView", "La/rbq;", "b", "(IIIILjava/lang/String;La/yje;)Ljava/lang/Object;", "auth", "La/nbq;", "betData", "La/q16;", "La/fi7;", "La/i2o;", "a", "(Ljava/lang/String;La/nbq;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface y5q {
    @kg80("/MobileLiveBetX/MobileMakeBet")
    Object a(@xpv("X-Auth") String str, @jb8 nbq nbqVar, yje<? super q16<fi7, ? extends i2o>> yjeVar);

    @ofr("/FinFeed/GetPlotsBinaryStakes_3")
    Object b(@nkd0("instrument") int i, @nkd0("region") int i2, @nkd0("casse") int i3, @nkd0("cfView") int i4, @nkd0("lng") String str, yje<? super rbq> yjeVar);

    @ofr("/FinFeed/GetInstruments_2")
    Object c(@nkd0("lng") String str, yje<? super List<jcq>> yjeVar);
}
