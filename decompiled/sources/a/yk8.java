package a;

import java.util.List;
import kotlin.Metadata;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JT\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0005H§@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"La/yk8;", "", "", "token", "language", "", "partner", "group", "whence", "La/q16;", "", "La/ik8;", "La/i2o;", "c", "(Ljava/lang/String;Ljava/lang/String;IIILa/yje;)Ljava/lang/Object;", "auth", "La/z4a;", "body", "Lokhttp3/ResponseBody;", "a", "(Ljava/lang/String;La/z4a;La/yje;)Ljava/lang/Object;", "La/blc;", "b", "(Ljava/lang/String;La/blc;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface yk8 {
    @kg80("Account/v1/Bonus/CancelRoleplayingBonus")
    Object a(@xpv("X-Auth") String str, @jb8 z4a z4aVar, yje<? super ResponseBody> yjeVar);

    @kg80("Account/v1/Bonus/claimRoleplayingBonus")
    Object b(@xpv("X-Auth") String str, @jb8 blc blcVar, yje<? super ResponseBody> yjeVar);

    @ofr("Account/v1/Bonus/GetRoleplayingBonus")
    Object c(@xpv("X-Auth") String str, @nkd0("language") String str2, @nkd0("partner") int i, @nkd0("group") int i2, @nkd0("whence") int i3, yje<? super q16<? extends List<ik8>, ? extends i2o>> yjeVar);
}
