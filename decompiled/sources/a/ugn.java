package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J>\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"La/ugn;", "", "", "playerId", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "", "refId", "countryId", "La/dx5;", "La/zgn;", "a", "(Ljava/lang/String;Ljava/lang/String;IILa/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface ugn {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/statisticGame/v2/PlayerRankingsBreakdowns")
    Object a(@nkd0(ParameterNames.ID) String str, @nkd0("lng") String str2, @nkd0("ref") int i, @nkd0("fcountry") int i2, yje<dx5<zgn>> yjeVar);
}
