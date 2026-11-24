package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001Jz\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0003\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0012Jf\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"La/bor0;", "", "", "auth", "", "refId", "whence", "", "accountId", "dateFrom", "dateTo", "coefView", "language", "sort", "acceptHeader", "La/dx5;", "La/sor0;", "b", "(Ljava/lang/String;IIJJJLjava/lang/String;Ljava/lang/String;ILjava/lang/String;La/yje;)Ljava/lang/Object;", "jackpotTypes", "La/s2y;", "a", "(Ljava/lang/String;JJJIIILjava/lang/String;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface bor0 {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/toto/JackpotMobile/v1/betHistory")
    Object a(@xpv("X-Auth") String str, @nkd0("accountId") long j, @nkd0("dateFrom") long j2, @nkd0("dateTo") long j3, @nkd0("coefViewType") int i, @nkd0("sort") int i2, @nkd0("jackpotTypes") int i3, @nkd0("lng") String str2, yje<? super dx5<s2y>> yjeVar);

    @ofr("/toto2/Mobile/v1/betHistory")
    Object b(@xpv("X-Auth") String str, @nkd0("ref") int i, @nkd0("whence") int i2, @nkd0("accountId") long j, @nkd0("dateFrom") long j2, @nkd0("dateTo") long j3, @nkd0("coefViewType") String str2, @nkd0("lng") String str3, @nkd0("sort") int i3, @xpv("Accept") String str4, yje<? super dx5<sor0>> yjeVar);
}
