package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\b¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"La/mk10;", "", "", "token", "acceptHeader", "La/dx5;", "La/bav0;", "b", "(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/jzk0;", "request", "c", "(Ljava/lang/String;Ljava/lang/String;La/jzk0;La/yje;)Ljava/lang/Object;", "La/vxk0;", "a", "lucky_wheel"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface mk10 {
    @kg80("Games/LuckyWheel/v2/Spins/Bulk")
    Object a(@xpv("X-Auth") String str, @xpv("Accept") String str2, yje<? super dx5<vxk0>> yjeVar);

    @ofr("Games/LuckyWheel/v2/Spins")
    Object b(@xpv("X-Auth") String str, @xpv("Accept") String str2, yje<? super dx5<bav0>> yjeVar);

    @kg80("Games/LuckyWheel/v2/Spins")
    Object c(@xpv("X-Auth") String str, @xpv("Accept") String str2, @jb8 jzk0 jzk0Var, yje<? super dx5<bav0>> yjeVar);
}
