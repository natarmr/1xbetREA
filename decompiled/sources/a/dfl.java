package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ0\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"La/dfl;", "", "", "token", "La/lgl;", "request", "La/q16;", "La/ygl;", "La/i2o;", "d", "(Ljava/lang/String;La/lgl;La/yje;)Ljava/lang/Object;", "La/zel;", "a", "(Ljava/lang/String;La/zel;La/yje;)Ljava/lang/Object;", "La/cfl;", "c", "(Ljava/lang/String;La/cfl;La/yje;)Ljava/lang/Object;", "La/hfl;", "b", "(Ljava/lang/String;La/hfl;La/yje;)Ljava/lang/Object;", "dragons_gold"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface dfl {
    @kg80("Games/Main/Apple/MakeAction")
    Object a(@xpv("Authorization") String str, @jb8 zel zelVar, yje<? super q16<ygl, ? extends i2o>> yjeVar);

    @kg80("Games/Main/Apple/GetCurrentWinGame")
    Object b(@xpv("Authorization") String str, @jb8 hfl hflVar, yje<? super q16<ygl, ? extends i2o>> yjeVar);

    @kg80("Games/Main/Apple/GetActiveGame")
    Object c(@xpv("Authorization") String str, @jb8 cfl cflVar, yje<? super q16<ygl, ? extends i2o>> yjeVar);

    @kg80("Games/Main/Apple/MakeBetGame")
    Object d(@xpv("Authorization") String str, @jb8 lgl lglVar, yje<? super q16<ygl, ? extends i2o>> yjeVar);
}
