package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ0\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"La/kof0;", "", "", "auth", "La/dqf0;", "request", "La/q16;", "La/grf0;", "La/i2o;", "a", "(Ljava/lang/String;La/dqf0;La/yje;)Ljava/lang/Object;", "La/asf0;", "e", "(Ljava/lang/String;La/asf0;La/yje;)Ljava/lang/Object;", "La/sqf0;", "b", "(Ljava/lang/String;La/sqf0;La/yje;)Ljava/lang/Object;", "La/iqf0;", "c", "(Ljava/lang/String;La/iqf0;La/yje;)Ljava/lang/Object;", "La/nqf0;", "body", "d", "(Ljava/lang/String;La/nqf0;La/yje;)Ljava/lang/Object;", "resident"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface kof0 {
    @kg80("Games/Main/Resident/GetActiveGame")
    Object a(@xpv("X-Auth") String str, @jb8 dqf0 dqf0Var, yje<? super q16<grf0, ? extends i2o>> yjeVar);

    @kg80("Games/Main/Resident/MakeAction")
    Object b(@xpv("X-Auth") String str, @jb8 sqf0 sqf0Var, yje<? super q16<grf0, ? extends i2o>> yjeVar);

    @kg80("Games/Main/Resident/GetCurrentWinGame")
    Object c(@xpv("X-Auth") String str, @jb8 iqf0 iqf0Var, yje<? super q16<grf0, ? extends i2o>> yjeVar);

    @kg80("Games/Main/Resident/IncreaseBetSum")
    Object d(@xpv("X-Auth") String str, @jb8 nqf0 nqf0Var, yje<? super q16<grf0, ? extends i2o>> yjeVar);

    @kg80("Games/Main/Resident/MakeBetGame")
    Object e(@xpv("X-Auth") String str, @jb8 asf0 asf0Var, yje<? super q16<grf0, ? extends i2o>> yjeVar);
}
