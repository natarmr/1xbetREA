package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJH\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"La/wf10;", "", "", "auth", "language", "La/fk9;", "cachingTag", "La/dx5;", "La/zi10;", "a", "(Ljava/lang/String;Ljava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;", "", "refId", "countryId", "La/di10;", "b", "(Ljava/lang/String;IILjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;", "La/ui10;", "c", "(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface wf10 {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("loyaltyCashback/v5/cashback")
    Object a(@xpv("X-Auth") String str, @nkd0(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL) String str2, @doo0 fk9 fk9Var, yje<? super dx5<zi10>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("loyaltyCashback/v5/program")
    Object b(@xpv("X-Auth") String str, @nkd0("refId") int i, @nkd0("countryId") int i2, @nkd0(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL) String str2, @doo0 fk9 fk9Var, yje<? super dx5<di10>> yjeVar);

    @kg80("loyaltyCashback/v5/cashback")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object c(@xpv("X-Auth") String str, @nkd0(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL) String str2, yje<? super dx5<ui10>> yjeVar);
}
