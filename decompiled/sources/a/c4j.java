package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JR\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0003\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000e\u0010\u000fJR\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0003\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u0010\u0010\u000fJ^\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"La/c4j;", "", "", "token", "", "accountId", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "", "whence", "fcountry", "La/fk9;", "cachingTag", "La/dx5;", "La/u85;", "d", "(Ljava/lang/String;JLjava/lang/String;IILa/fk9;La/yje;)Ljava/lang/Object;", "b", "dateFrom", "La/f7w;", "a", "(Ljava/lang/String;JLjava/lang/String;IILjava/lang/Long;La/fk9;La/yje;)Ljava/lang/Object;", "La/cnt0;", "params", "", "c", "(Ljava/lang/String;La/cnt0;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface c4j {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MobileS/HistoryTasks")
    Object a(@xpv("X-Auth") String str, @nkd0("accId") long j, @nkd0("lng") String str2, @nkd0("whence") int i, @nkd0("fcountry") int i2, @nkd0("dtfrom") Long l, @doo0 fk9 fk9Var, yje<? super dx5<f7w>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MobileS/ActiveTasks")
    Object b(@xpv("X-Auth") String str, @nkd0("accId") long j, @nkd0("lng") String str2, @nkd0("whence") int i, @nkd0("fcountry") int i2, @doo0 fk9 fk9Var, yje<? super dx5<u85>> yjeVar);

    @kg80("MobileS/UpdateStatus")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object c(@xpv("X-Auth") String str, @jb8 cnt0 cnt0Var, yje<? super Unit> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MobileS/AvailableTasks")
    Object d(@xpv("X-Auth") String str, @nkd0("accId") long j, @nkd0("lng") String str2, @nkd0("whence") int i, @nkd0("fcountry") int i2, @doo0 fk9 fk9Var, yje<? super dx5<u85>> yjeVar);
}
