package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\\\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0005H§@¢\u0006\u0004\b\r\u0010\u000eJH\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"La/wb7;", "", "", "auth", "acceptHeader", "", "refId", "whence", "language", "couponNumber", "coefView", "La/dx5;", "La/lor0;", "c", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILa/yje;)Ljava/lang/Object;", "curIso", "La/p0y;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface wb7 {
    @ofr("/toto2/Mobile/v1/couponInfo")
    Object c(@xpv("X-Auth") String str, @xpv("Accept") String str2, @nkd0("ref") int i, @nkd0("whence") int i2, @nkd0("lng") String str3, @nkd0("couponNumber") String str4, @nkd0("coefViewType") int i3, yje<? super dx5<lor0>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/toto/JackpotMobile/v1/couponInfo")
    Object d(@xpv("X-Auth") String str, @nkd0("lng") String str2, @nkd0("couponNumber") String str3, @nkd0("curIso") String str4, @nkd0("coefViewType") int i, yje<? super dx5<p0y>> yjeVar);
}
