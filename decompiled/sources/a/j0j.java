package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\f\u0010\nJ0\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"La/j0j;", "", "", "auth", "La/m16;", "baseRequest", "La/u2t;", "", "La/r7j;", "a", "(Ljava/lang/String;La/m16;La/yje;)Ljava/lang/Object;", "La/e0j;", "c", "La/v7j;", "La/e8j;", "b", "(Ljava/lang/String;La/v7j;La/yje;)Ljava/lang/Object;", "daily_tournament"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface j0j {
    @kg80("/DayTournAuth/DayTourn/GetDayTournUser")
    Object a(@xpv("X-Auth") String str, @jb8 m16 m16Var, yje<? super u2t<? extends List<r7j>>> yjeVar);

    @kg80("/DayTournAuth/DayTourn/GetDayTourn")
    Object b(@xpv("X-Auth") String str, @jb8 v7j v7jVar, yje<? super u2t<? extends List<e8j>>> yjeVar);

    @kg80("/DayTournAuth/DayTourn/GetDayTournPrizes")
    Object c(@xpv("X-Auth") String str, @jb8 m16 m16Var, yje<? super u2t<e0j>> yjeVar);
}
