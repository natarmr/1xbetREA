package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J6\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0003H§@¢\u0006\u0004\b\b\u0010\tJ6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0003H§@¢\u0006\u0004\b\u000b\u0010\tJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0001\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003H§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"La/e9m0;", "", "", "", "paramsMap", "acceptHeader", "La/dx5;", "La/bqs;", "b", "(Ljava/util/Map;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/drj0;", "a", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "La/rhm0;", "c", "(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "statistic_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface e9m0 {
    @ofr("/statisticGame/v2/ShortGame")
    Object a(@okd0 Map<String, Object> map, @xpv("Accept") String str, yje<dx5<drj0>> yjeVar);

    @ofr("/statisticGame/v2/Game")
    Object b(@okd0 Map<String, Object> map, @xpv("Accept") String str, yje<dx5<bqs>> yjeVar);

    @ofr("/statisticGame/v2/Dictionaries/LastUpdates")
    Object c(@nkd0("lng") String str, @xpv("Accept") String str2, yje<dx5<rhm0>> yjeVar);
}
