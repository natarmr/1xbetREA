package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"La/uac0;", "", "", "acceptHeader", "auth", "La/yac0;", "promoCmsConfirmRequest", "La/dx5;", "La/bbc0;", "a", "(Ljava/lang/String;Ljava/lang/String;La/yac0;La/yje;)Ljava/lang/Object;", "promotionId", "La/ibc0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface uac0 {
    @kg80("PromoServiceUser/v4/confirmations/Confirm")
    Object a(@xpv("Accept") String str, @xpv("Authorization") String str2, @jb8 yac0 yac0Var, yje<? super dx5<bbc0>> yjeVar);

    @ofr("PromoServiceUser/v5/Promotions/GetPromotionInfo")
    Object b(@xpv("Accept") String str, @xpv("Authorization") String str2, @nkd0("promotionId") String str3, yje<? super dx5<ibc0>> yjeVar);
}
