package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001JX\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJJ\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00110\u000f2\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u001a\u001a\u00020\u00162\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0019\u001a\u00020\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u0018¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"La/qlt;", "", "", "acceptHeader", "", "partnerId", "groupId", "whence", "countryId", "language", "La/dx5;", "", "La/s52;", "c", "(Ljava/lang/String;IIIILjava/lang/String;La/yje;)Ljava/lang/Object;", "La/q16;", "La/gm90;", "La/i2o;", "b", "(Ljava/lang/String;IIILa/yje;)Ljava/lang/Object;", "", "lastUpdate", "La/plt;", "d", "(Ljava/lang/String;JILjava/lang/String;La/yje;)Ljava/lang/Object;", "regionId", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface qlt {
    @ofr("RestCoreService/v1/mb/GetGeoCityFullInfo")
    Object a(@nkd0("lng") String str, @nkd0("lastUpdate") long j, @nkd0("regionId") int i, @xpv("Accept") String str2, yje<? super plt> yjeVar);

    @ofr("Account/v1/GetPhoneMasks")
    Object b(@nkd0("language") String str, @nkd0("partner") int i, @nkd0("group") int i2, @nkd0("whence") int i3, yje<? super q16<? extends List<gm90>, ? extends i2o>> yjeVar);

    @ofr("RestCoreService/v1/mb/GetAllowedCountries")
    Object c(@xpv("Accept") String str, @nkd0("ref") int i, @nkd0("group") int i2, @nkd0("whence") int i3, @nkd0("country") int i4, @nkd0("lng") String str2, yje<? super dx5<? extends List<s52>>> yjeVar);

    @ofr("RestCoreService/v1/mb/GetGeoRegionFullInfo")
    Object d(@nkd0("lng") String str, @nkd0("lastUpdate") long j, @nkd0("countryId") int i, @xpv("Accept") String str2, yje<? super plt> yjeVar);
}
