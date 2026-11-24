package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JD\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000b\u0010\fJ6\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00020\t2\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"La/lk9;", "", "", "", "subSportIds", "", "tourType", "month", "year", "La/dx5;", "La/gag;", "a", "(Ljava/util/List;IIILa/yje;)Ljava/lang/Object;", "La/r4g;", "b", "(Ljava/util/List;ILa/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface lk9 {
    @ofr("cyberstatistic/v2/calendar")
    Object a(@nkd0("subSportId") List<Long> list, @nkd0("tourType") int i, @nkd0("month") int i2, @nkd0("year") int i3, yje<? super dx5<gag>> yjeVar);

    @ofr("cyberstatistic/v2/calendar/available-dates")
    Object b(@nkd0("subSportId") List<Long> list, @nkd0("tourType") int i, yje<? super dx5<? extends List<r4g>>> yjeVar);
}
