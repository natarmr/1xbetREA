package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J>\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJX\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\b2\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001c\u0010\u001dJn\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00110\b2\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\"\u0010#J*\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\b2\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b%\u0010&J\\\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\b2\b\b\u0001\u0010\u0016\u001a\u00020'2\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b)\u0010*¨\u0006+À\u0006\u0003"}, d2 = {"La/ufc0;", "", "", "lng", "", "coefTypeId", "auth", "acceptHeader", "La/dx5;", "La/phc0;", "c", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "partner", "group", "", "userId", "coefView", "", "La/jsc0;", "d", "(IILjava/lang/String;JILjava/lang/String;La/yje;)Ljava/lang/Object;", "La/ooc0;", "request", "language", "La/e8c0;", "f", "(La/ooc0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/j7c0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "whence", "country", "category", "La/htj0;", "a", "(IILjava/lang/String;IIILjava/lang/Long;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/btj0;", "g", "(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/osj0;", "La/ysj0;", "e", "(La/osj0;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface ufc0 {
    @ofr("PromotionsShowcase/v1/showcase")
    Object a(@nkd0("ref") int i, @nkd0("gr") int i2, @nkd0("lng") String str, @nkd0("whence") int i3, @nkd0("country") int i4, @nkd0("cfView") int i5, @nkd0("category") Long l, @xpv("Accept") String str2, yje<? super dx5<? extends List<htj0>>> yjeVar);

    @kg80("RestCoreService/v1/mb/CalculatePoints")
    Object b(@xpv("X-Auth") String str, @xpv("X-Language") String str2, @xpv("Accept") String str3, yje<? super dx5<j7c0>> yjeVar);

    @ofr("RestCoreService/v1/mb/CheckPromoCode")
    Object c(@nkd0("lng") String str, @nkd0("coefView") int i, @xpv("X-Auth") String str2, @xpv("Accept") String str3, yje<? super dx5<phc0>> yjeVar);

    @ofr("RestCoreService/v1/mb/GetPromoShop")
    Object d(@nkd0("ref") int i, @nkd0("gr") int i2, @nkd0("lng") String str, @nkd0("userId") long j, @nkd0("coefView") int i3, @xpv("Accept") String str2, yje<? super dx5<? extends List<jsc0>>> yjeVar);

    @kg80("PromotionsShowcase/v1/showcase")
    Object e(@jb8 osj0 osj0Var, @xpv("X-Auth") String str, @xpv("X-Language") String str2, @xpv("X-Country") int i, @xpv("X-Group") int i2, @xpv("X-Whence") int i3, @xpv("Accept") String str3, yje<? super dx5<ysj0>> yjeVar);

    @kg80("RestCoreService/v1/mb/BuyPromoCode")
    Object f(@jb8 ooc0 ooc0Var, @xpv("X-Auth") String str, @xpv("X-Language") String str2, @xpv("Accept") String str3, yje<? super dx5<e8c0>> yjeVar);

    @ofr("PromotionsShowcase/v1/showcase/categories")
    Object g(@xpv("Accept") String str, @nkd0("lng") String str2, yje<? super dx5<btj0>> yjeVar);
}
