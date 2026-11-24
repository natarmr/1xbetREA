package a;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.List;
import kotlin.Metadata;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001JN\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\f\u0010\rJX\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"La/rn6;", "", "", "cfView", "gr", "ref", "whence", "Lokhttp3/RequestBody;", "request", "La/dx5;", "", "La/bg7;", "b", "(IIIILokhttp3/RequestBody;La/yje;)Ljava/lang/Object;", "", "userId", "c", "(IIIJILokhttp3/RequestBody;La/yje;)Ljava/lang/Object;", "", "auth", "La/yg20;", RemoteMessageConst.DATA, "La/q16;", "La/bh20;", "La/i2o;", "a", "(Ljava/lang/String;La/yg20;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface rn6 {
    @kg80("MobileLiveBetX/MobileMakeBetAlternative")
    Object a(@xpv("X-Auth") String str, @jb8 yg20 yg20Var, yje<q16<bh20, i2o>> yjeVar);

    @kg80("alterbuilder/v3/calcEventGroups")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object b(@nkd0("cfView") int i, @nkd0("gr") int i2, @nkd0("ref") int i3, @nkd0("whence") int i4, @jb8 RequestBody requestBody, yje<dx5<List<bg7>>> yjeVar);

    @kg80("alterbuilder/v3/calcEventGroups")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object c(@nkd0("cfView") int i, @nkd0("gr") int i2, @nkd0("ref") int i3, @nkd0("userId") long j, @nkd0("whence") int i4, @jb8 RequestBody requestBody, yje<dx5<List<bg7>>> yjeVar);
}
