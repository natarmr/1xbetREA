package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J6\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"La/d7t;", "", "", "auth", "La/d9t;", "request", "La/nz5;", "", "La/z9t;", "La/l5t;", "a", "(Ljava/lang/String;La/d9t;La/yje;)Ljava/lang/Object;", "La/r9t;", "La/r7t;", "b", "(Ljava/lang/String;La/r9t;La/yje;)Ljava/lang/Object;", "games_mania"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface d7t {
    @kg80("Games/Gambling/Mania/GetCard")
    Object a(@xpv("X-Auth") String str, @jb8 d9t d9tVar, yje<? super nz5<? extends List<z9t>, ? extends l5t>> yjeVar);

    @kg80("Games/Gambling/Mania/ApplyGame")
    Object b(@xpv("X-Auth") String str, @jb8 r9t r9tVar, yje<? super nz5<r7t, ? extends l5t>> yjeVar);
}
