package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JD\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\n0\b2\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"La/wgt;", "", "", "countryId", "", "language", "groupId", "refId", "La/q16;", "La/jdq;", "La/i2o;", "a", "(ILjava/lang/String;IILa/yje;)Ljava/lang/Object;", "La/muw;", "request", "", "La/aht;", "b", "(La/muw;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface wgt {
    @ofr("LivebetAdvice/GetFilters")
    Object a(@nkd0("country") int i, @nkd0("lng") String str, @nkd0("group") int i2, @nkd0("partner") int i3, yje<? super q16<jdq, ? extends i2o>> yjeVar);

    @kg80("LivebetAdvice/GetBetAdvice")
    Object b(@jb8 muw muwVar, yje<? super q16<? extends List<aht>, ? extends i2o>> yjeVar);
}
