package a;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"La/gkd0;", "", "La/eyc;", RemoteMessageConst.DATA, "La/q16;", "La/i2o;", "a", "(La/eyc;La/yje;)Ljava/lang/Object;", "", "auth", "La/lzn0;", "La/o3u0;", "b", "(Ljava/lang/String;La/lzn0;La/yje;)Ljava/lang/Object;", "La/y4c;", "c", "(La/y4c;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface gkd0 {
    @kg80("/UserAuth/SendAuthByQrCode")
    Object a(@jb8 eyc eycVar, yje<? super q16<? extends Object, ? extends i2o>> yjeVar);

    @kg80("Account/v1.1/SetQrAuth")
    Object b(@xpv("X-Auth") String str, @jb8 lzn0 lzn0Var, yje<? super q16<o3u0, ? extends i2o>> yjeVar);

    @kg80("Account/v1/CheckQuestion")
    Object c(@jb8 y4c y4cVar, yje<? super q16<o3u0, ? extends i2o>> yjeVar);
}
