package a;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001Jt\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\u00042\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0003\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\u0014\b\u0001\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0003\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0017\u0010\u0018J6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\u0014\b\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0003\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u001b\u0010\u0018J`\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00102\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0007\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"La/cq0;", "", "", "partitionId", "", "whence", "countryId", "countryIdBlocking", "ref", "", "language", "groupId", "", "test", "La/fk9;", "cachingTag", "La/dx5;", "La/qh1;", "c", "(JILjava/lang/Integer;IILjava/lang/String;ILjava/lang/Boolean;La/fk9;La/yje;)Ljava/lang/Object;", "", "params", "La/wf0;", "b", "(Ljava/util/Map;La/fk9;La/yje;)Ljava/lang/Object;", "paramsMap", "La/dp0;", "d", "La/up1;", "a", "(Ljava/lang/Long;IILjava/lang/String;ILjava/lang/Integer;La/fk9;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface cq0 {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/ContentAggregator/v2/Games/GetSortingOptions")
    Object a(@nkd0("partId") Long l, @nkd0("whence") int i, @nkd0("ref") int i2, @nkd0("lng") String str, @nkd0("fcountry") int i3, @nkd0("country") Integer num, @doo0 fk9 fk9Var, yje<dx5<up1>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/ContentAggregator/v2/GetLobbyMobile")
    Object b(@okd0 Map<String, Object> map, @doo0 fk9 fk9Var, yje<dx5<wf0>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/ContentAggregator/v2/Categories/GetPromotedCategories")
    Object c(@nkd0("partId") long j, @nkd0("whence") int i, @nkd0("country") Integer num, @nkd0("fcountry") int i2, @nkd0("ref") int i3, @nkd0("lng") String str, @nkd0("gr") int i4, @nkd0("test") Boolean bool, @doo0 fk9 fk9Var, yje<dx5<qh1>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/ContentAggregator/v2/GetFilterGroupsForPartition")
    Object d(@okd0 Map<String, Object> map, @doo0 fk9 fk9Var, yje<dx5<dp0>> yjeVar);
}
