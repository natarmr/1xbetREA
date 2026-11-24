package a;

import kotlin.Metadata;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J8\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"La/boe0;", "", "", "authToken", "", "dateFrom", "dateTo", "La/dx5;", "La/nne0;", "a", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;La/yje;)Ljava/lang/Object;", "La/eto0;", "c", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/r5k;", "deleteReferralRequest", "Lokhttp3/ResponseBody;", "b", "(Ljava/lang/String;La/r5k;La/yje;)Ljava/lang/Object;", "La/tu40;", "moveMoneyRequest", "d", "(Ljava/lang/String;La/tu40;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface boe0 {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("RestCoreService/v1/Mb/getReferralNetworkInfo")
    Object a(@xpv("X-Auth") String str, @nkd0("dateFrom") Integer num, @nkd0("dateTo") Integer num2, yje<? super dx5<nne0>> yjeVar);

    @kg80("RestCoreService/v1/Mb/deleteChild")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object b(@xpv("X-Auth") String str, @jb8 r5k r5kVar, yje<? super ResponseBody> yjeVar);

    @kg80("RestCoreService/v1/Mb/takePart")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object c(@xpv("X-Auth") String str, yje<? super dx5<eto0>> yjeVar);

    @kg80("/RestCoreService/v1/Mb/moneyMove")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object d(@xpv("X-Auth") String str, @jb8 tu40 tu40Var, yje<? super ResponseBody> yjeVar);
}
