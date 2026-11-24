package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJ>\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0015\u0010\u0016JH\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"La/nqr0;", "", "", "whence", "", "lng", "groupId", "La/dx5;", "La/jsr0;", "b", "(ILjava/lang/String;ILa/yje;)Ljava/lang/Object;", "curISO", "totoType", "La/nrr0;", "c", "(ILjava/lang/String;Ljava/lang/String;ILa/yje;)Ljava/lang/Object;", "token", "refId", "La/qpr0;", "totoJackpotBetRequest", "La/tpr0;", "d", "(Ljava/lang/String;IILa/qpr0;La/yje;)Ljava/lang/Object;", "currencyIso", "jackpotType", "pageNum", "pageSize", "La/gqr0;", "a", "(Ljava/lang/String;Ljava/lang/String;IIILa/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface nqr0 {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/toto/JackpotMobile/v1/tirags")
    Object a(@nkd0("lng") String str, @nkd0("curISO") String str2, @nkd0("jackpotType") int i, @nkd0("pageNum") int i2, @nkd0("pageSize") int i3, yje<? super dx5<gqr0>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/toto/JackpotMobile/v1/types")
    Object b(@nkd0("whence") int i, @nkd0("lng") String str, @nkd0("gr") int i2, yje<? super dx5<jsr0>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/toto/JackpotMobile/v1/activeTirag")
    Object c(@nkd0("whence") int i, @nkd0("lng") String str, @nkd0("curISO") String str2, @nkd0("jackpotType") int i2, yje<? super dx5<nrr0>> yjeVar);

    @kg80("/toto/JackpotMobile/v1/makeBet")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object d(@xpv("X-Auth") String str, @nkd0("ref") int i, @nkd0("whence") int i2, @jb8 qpr0 qpr0Var, yje<? super dx5<tpr0>> yjeVar);
}
