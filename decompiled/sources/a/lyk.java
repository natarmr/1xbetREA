package a;

import com.huawei.hms.support.feature.result.CommonConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"La/lyk;", "", "", "sing", "", "projectId", "La/jo;", "a", "(Ljava/lang/String;ILa/yje;)Ljava/lang/Object;", "groupId", CommonConstant.KEY_COUNTRY_CODE, "La/dx5;", "La/q930;", "b", "(ILjava/lang/String;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface lyk {
    @ofr("ru/redirect/api/getactualdomain?id=2")
    Object a(@nkd0("sign") String str, @nkd0("project_id") int i, yje<? super jo> yjeVar);

    @ofr("ActualDomain/v1/actual-domains/match-domain")
    Object b(@nkd0("projectId") int i, @nkd0("geo") String str, yje<? super dx5<q930>> yjeVar);
}
