package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ>\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0015\u0010\u0016JT\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u00052\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"La/gir0;", "", "", "lng", "curISO", "", "totoType", "La/dx5;", "La/clr0;", "c", "(Ljava/lang/String;Ljava/lang/String;ILa/yje;)Ljava/lang/Object;", "ref", "whence", "groupId", "La/omr0;", "a", "(IILjava/lang/String;ILa/yje;)Ljava/lang/Object;", "auth", "La/zkr0;", "totoBetRequest", "La/nu;", "d", "(Ljava/lang/String;La/zkr0;La/yje;)Ljava/lang/Object;", "gr", "country", "docType", "La/swo0;", "b", "(IILjava/lang/String;IILjava/lang/Integer;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface gir0 {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/toto2/Mobile/v1/types")
    Object a(@nkd0("ref") int i, @nkd0("whence") int i2, @nkd0("lng") String str, @nkd0("gr") int i3, yje<dx5<omr0>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/toto2/Mobile/v1/taxStatus")
    Object b(@nkd0("ref") int i, @nkd0("whence") int i2, @nkd0("lng") String str, @nkd0("gr") int i3, @nkd0("country") int i4, @nkd0("docType") Integer num, yje<dx5<swo0>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/toto2/Mobile/v1/activeTirag")
    Object c(@nkd0("lng") String str, @nkd0("curISO") String str2, @nkd0("totoType") int i, yje<dx5<clr0>> yjeVar);

    @kg80("/toto2/Mobile/v1/makeBet")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object d(@xpv("X-Auth") String str, @jb8 zkr0 zkr0Var, yje<dx5<nu>> yjeVar);
}
