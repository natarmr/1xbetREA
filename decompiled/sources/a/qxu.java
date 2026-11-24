package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jt\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\u00062\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011JJ\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"La/qxu;", "", "", "refId", "groupId", "countryId", "", "betSum", "coef", "", "currencyId", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "taxMode", "docType", "La/dx5;", "La/pxu;", "a", "(IIILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;La/yje;)Ljava/lang/Object;", "La/two0;", "b", "(IIILjava/lang/String;Ljava/lang/Integer;La/yje;)Ljava/lang/Object;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface qxu {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/TaxService/v1/GetTax")
    Object a(@nkd0("ref") int i, @nkd0("gr") int i2, @nkd0("country") int i3, @nkd0("betSum") String str, @nkd0("cf") String str2, @nkd0("currency") long j, @nkd0("lng") String str3, @nkd0("taxMode") Integer num, @nkd0("docType") Integer num2, yje<? super dx5<pxu>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/TaxService/v1/TaxStatus")
    Object b(@nkd0("ref") int i, @nkd0("gr") int i2, @nkd0("country") int i3, @nkd0("lng") String str, @nkd0("docType") Integer num, yje<? super dx5<two0>> yjeVar);
}
