package a;

import com.huawei.hms.support.feature.result.CommonConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JT\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"La/gzb;", "", "", "partnerId", "groupId", "whence", "countryId", "", "region", "", "language", "La/dx5;", "La/fzb;", "a", "(IIIILjava/lang/Long;Ljava/lang/String;La/yje;)Ljava/lang/Object;", CommonConstant.KEY_COUNTRY_CODE, "La/zo10;", "b", "(Ljava/lang/Long;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface gzb {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("RestCoreService/v1/Mb/GetCheckBlock")
    Object a(@nkd0("ref") int i, @nkd0("gr") int i2, @nkd0("whence") int i3, @nkd0("country") int i4, @nkd0("region") Long l, @nkd0("lng") String str, yje<? super dx5<fzb>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("BlockService/v2/m-block")
    Object b(@nkd0("region") Long l, @nkd0(CommonConstant.KEY_COUNTRY_CODE) String str, yje<? super dx5<zo10>> yjeVar);
}
