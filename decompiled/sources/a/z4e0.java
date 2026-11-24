package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JH\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"La/z4e0;", "", "", "acceptHeader", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "teamId", "", "refId", "countryId", "La/dx5;", "La/i5e0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILa/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface z4e0 {
    @ofr("/statisticGame/v2/FIFARatingYearHistory")
    Object a(@xpv("Accept") String str, @nkd0("lng") String str2, @nkd0(ParameterNames.ID) String str3, @nkd0("ref") int i, @nkd0("country") int i2, yje<? super dx5<i5e0>> yjeVar);
}
