package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJH\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0015\u0010\u0013J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0016H§@¢\u0006\u0004\b\u001a\u0010\u0019¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"La/iwu0;", "", "", "auth", "La/lg5;", "request", "La/dx5;", "La/og5;", "c", "(Ljava/lang/String;La/lg5;La/yje;)Ljava/lang/Object;", "", "productId", "balanceId", "", "amount", "La/fk9;", "cachingTag", "La/yyu0;", "e", "(Ljava/lang/String;JJDLa/fk9;La/yje;)Ljava/lang/Object;", "La/czu0;", "b", "La/dq40;", "La/gq40;", "d", "(Ljava/lang/String;La/dq40;La/yje;)Ljava/lang/Object;", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface iwu0 {
    @kg80("/SeamWalletService/TransferMoneyFromPartnerAuth")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object a(@xpv("X-Auth") String str, @jb8 dq40 dq40Var, yje<? super dx5<gq40>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("SeamWalletService/ConverterFrom")
    Object b(@xpv("X-Auth") String str, @nkd0("productId") long j, @nkd0("currencyPlayerId") long j2, @nkd0("amount") double d, @doo0 fk9 fk9Var, yje<? super dx5<czu0>> yjeVar);

    @kg80("SeamWalletService/GetBalanceInPartnerAuth")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object c(@xpv("X-Auth") String str, @jb8 lg5 lg5Var, yje<? super dx5<og5>> yjeVar);

    @kg80("/SeamWalletService/TransferMoneyToPartnerAuth")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object d(@xpv("X-Auth") String str, @jb8 dq40 dq40Var, yje<? super dx5<gq40>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("SeamWalletService/ConverterTo")
    Object e(@xpv("X-Auth") String str, @nkd0("productId") long j, @nkd0("currencyPlayerId") long j2, @nkd0("amount") double d, @doo0 fk9 fk9Var, yje<? super dx5<yyu0>> yjeVar);
}
