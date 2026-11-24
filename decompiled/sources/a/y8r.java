package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ0\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u000f¨\u0006\u0012À\u0006\u0003"}, d2 = {"La/y8r;", "", "", "auth", "La/l9r;", "request", "La/nz5;", "La/o9r;", "La/l5t;", "a", "(Ljava/lang/String;La/l9r;La/yje;)Ljava/lang/Object;", "La/x8r;", "c", "(Ljava/lang/String;La/x8r;La/yje;)Ljava/lang/Object;", "b", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/i9r;", "d", "tile_matching"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface y8r {
    @kg80("/Games/FruitBlast/MakeBetGame")
    Object a(@xpv("X-Auth") String str, @jb8 l9r l9rVar, yje<? super nz5<o9r, ? extends l5t>> yjeVar);

    @ofr("/Games/FruitBlast/GetActiveGame")
    Object b(@xpv("X-Auth") String str, yje<? super nz5<o9r, ? extends l5t>> yjeVar);

    @kg80("/Games/FruitBlast/MakeAction")
    Object c(@xpv("X-Auth") String str, @jb8 x8r x8rVar, yje<? super nz5<o9r, ? extends l5t>> yjeVar);

    @ofr("/Games/FruitBlast/GetCoef")
    Object d(@xpv("X-Auth") String str, yje<? super nz5<i9r, ? extends l5t>> yjeVar);
}
