package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J:\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"La/gc8;", "", "", "partnerId", "", "language", "countryId", "La/q16;", "La/cd8;", "La/i2o;", "b", "(ILjava/lang/String;ILa/yje;)Ljava/lang/Object;", "auth", "La/vqt0;", "a", "(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/tob;", "request", "La/qob;", "c", "(Ljava/lang/String;ILa/tob;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface gc8 {
    @ofr("Account/v1/Bonus/GetUserBonusData")
    Object a(@xpv("X-Auth") String str, @nkd0("language") String str2, yje<? super q16<vqt0, ? extends i2o>> yjeVar);

    @ofr("Account/v2/Bonus/GetBonusAgreements")
    Object b(@nkd0("partner") int i, @nkd0("language") String str, @nkd0("countryId") int i2, yje<? super q16<cd8, ? extends i2o>> yjeVar);

    @kg80("Account/v1/Bonus/ChangeUserBonusAgreement")
    Object c(@xpv("X-Auth") String str, @nkd0("countryId") int i, @jb8 tob tobVar, yje<? super qob> yjeVar);
}
