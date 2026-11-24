package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JF\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"La/exa0;", "", "", "auth", "language", "", "timeZone", "", "supportedPopUpTypes", "La/dx5;", "", "La/dxa0;", "b", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/Integer;La/yje;)Ljava/lang/Object;", "La/l5k;", "request", "La/o5k;", "a", "(Ljava/lang/String;La/l5k;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface exa0 {
    @kg80("MesCore/v1/PopUp/DelPopUps")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object a(@xpv("X-Auth") String str, @jb8 l5k l5kVar, yje<? super dx5<o5k>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("MesCore/v1/PopUp/GetPopUps")
    Object b(@xpv("X-Auth") String str, @nkd0("lng") String str2, @nkd0("tz") double d, @nkd0("SupportedPopUpTypes") Integer num, yje<? super dx5<? extends List<dxa0>>> yjeVar);
}
