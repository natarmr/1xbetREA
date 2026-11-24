package a;

import kotlin.Metadata;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\b¨\u0006\nÀ\u0006\u0003"}, d2 = {"La/nmj0;", "", "", "auth", "La/knj0;", "request", "Lokhttp3/ResponseBody;", "b", "(Ljava/lang/String;La/knj0;La/yje;)Ljava/lang/Object;", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface nmj0 {
    @kg80("PDFCuponGeneratorService/GetPromoPNGCouponForMobile")
    Object a(@xpv("X-Auth") String str, @jb8 knj0 knj0Var, yje<ResponseBody> yjeVar);

    @kg80("PDFGeneratorService/GetPDFCouponForMobileWithHeaders")
    Object b(@xpv("X-Auth") String str, @jb8 knj0 knj0Var, yje<ResponseBody> yjeVar);
}
