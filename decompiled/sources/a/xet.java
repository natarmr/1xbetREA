package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ0\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u000f¨\u0006\u0012À\u0006\u0003"}, d2 = {"La/xet;", "", "", "auth", "La/jft;", "request", "La/q16;", "La/mft;", "La/i2o;", "a", "(Ljava/lang/String;La/jft;La/yje;)Ljava/lang/Object;", "La/wet;", "d", "(Ljava/lang/String;La/wet;La/yje;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/aft;", "c", "tile_matching"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface xet {
    @kg80("/Games/Main/Odyssey/MakeBetGame")
    Object a(@xpv("Authorization") String str, @jb8 jft jftVar, yje<? super q16<mft, ? extends i2o>> yjeVar);

    @kg80("/Games/Main/Odyssey/GetActiveGame")
    Object b(@xpv("Authorization") String str, @jb8 String str2, yje<? super q16<mft, ? extends i2o>> yjeVar);

    @kg80("/Games/Main/Odyssey/GetCoef")
    Object c(@xpv("Authorization") String str, @jb8 String str2, yje<? super q16<aft, ? extends i2o>> yjeVar);

    @kg80("/Games/Main/Odyssey/MakeAction")
    Object d(@xpv("Authorization") String str, @jb8 wet wetVar, yje<? super q16<mft, ? extends i2o>> yjeVar);
}
