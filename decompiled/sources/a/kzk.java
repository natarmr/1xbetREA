package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ0\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0011\u0010\nJ0\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0012\u0010\nJ0\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0013\u0010\n¨\u0006\u0014À\u0006\u0003"}, d2 = {"La/kzk;", "", "", "auth", "La/iv5;", "request", "La/q16;", "La/y0l;", "La/i2o;", "b", "(Ljava/lang/String;La/iv5;La/yje;)Ljava/lang/Object;", "La/uv5;", "e", "(Ljava/lang/String;La/uv5;La/yje;)Ljava/lang/Object;", "La/c320;", "c", "(Ljava/lang/String;La/c320;La/yje;)Ljava/lang/Object;", "d", "a", "f", "domino"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface kzk {
    @kg80("Games/Main/Domino/SkipStep")
    Object a(@xpv("X-Auth") String str, @jb8 iv5 iv5Var, yje<? super q16<y0l, ? extends i2o>> yjeVar);

    @kg80("Games/Main/Domino/GetActiveGame")
    Object b(@xpv("X-Auth") String str, @jb8 iv5 iv5Var, yje<? super q16<y0l, ? extends i2o>> yjeVar);

    @kg80("Games/Main/Domino/MakeAction")
    Object c(@xpv("X-Auth") String str, @jb8 c320 c320Var, yje<? super q16<y0l, ? extends i2o>> yjeVar);

    @kg80("Games/Main/Domino/TakeFromBank")
    Object d(@xpv("X-Auth") String str, @jb8 iv5 iv5Var, yje<? super q16<y0l, ? extends i2o>> yjeVar);

    @kg80("Games/Main/Domino/MakeBetGame")
    Object e(@xpv("X-Auth") String str, @jb8 uv5 uv5Var, yje<? super q16<y0l, ? extends i2o>> yjeVar);

    @kg80("Games/Main/Domino/Surrender")
    Object f(@xpv("X-Auth") String str, @jb8 iv5 iv5Var, yje<? super q16<y0l, ? extends i2o>> yjeVar);
}
