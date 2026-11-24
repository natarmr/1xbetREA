package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J>\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0011\u0010\u000e¨\u0006\u0012À\u0006\u0003"}, d2 = {"La/n0b;", "", "", "auth", "language", "", "whence", "La/boi0;", "requestBody", "La/dx5;", "La/h0b;", "a", "(Ljava/lang/String;Ljava/lang/String;ILa/boi0;La/yje;)Ljava/lang/Object;", "c", "(Ljava/lang/String;Ljava/lang/String;ILa/yje;)Ljava/lang/Object;", "d", "(Ljava/lang/String;ILa/yje;)Ljava/lang/Object;", "b", "cashback"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface n0b {
    @kg80("Games/Cashback/v1/Cashback/Set")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object a(@xpv("X-Auth") String str, @xpv("X-Language") String str2, @xpv("X-Whence") int i, @jb8 boi0 boi0Var, yje<? super dx5<h0b>> yjeVar);

    @kg80("Games/Cashback/v1/Cashback/Pay")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object b(@xpv("X-Auth") String str, @xpv("X-Language") String str2, @xpv("X-Whence") int i, yje<? super dx5<h0b>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("Games/Cashback/v1/Cashback")
    Object c(@xpv("X-Auth") String str, @xpv("X-Language") String str2, @xpv("X-Whence") int i, yje<? super dx5<h0b>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("Games/Cashback/v1/Cashback/Settings")
    Object d(@xpv("X-Language") String str, @xpv("X-Whence") int i, yje<? super dx5<h0b>> yjeVar);
}
