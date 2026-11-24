package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.support.feature.result.CommonConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JH\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"La/p9c0;", "", "", "token", "language", "", Payload.SOURCE, CommonConstant.KEY_COUNTRY_CODE, "La/ypt0;", "request", "La/dx5;", "La/bqt0;", "a", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;La/ypt0;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface p9c0 {
    @kg80("promocode/UsePromocode")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object a(@xpv("X-Auth") String str, @xpv("X-Language") String str2, @xpv("X-Whence") int i, @xpv("X-FCountry") String str3, @jb8 ypt0 ypt0Var, yje<? super dx5<bqt0>> yjeVar);
}
