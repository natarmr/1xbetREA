package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\rH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"La/gr30;", "", "", "auth", "La/ss30;", "request", "La/u2t;", "La/et30;", "a", "(Ljava/lang/String;La/ss30;La/yje;)Ljava/lang/Object;", "La/kt30;", "b", "(Ljava/lang/String;La/kt30;La/yje;)Ljava/lang/Object;", "La/xs30;", "c", "(Ljava/lang/String;La/xs30;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface gr30 {
    @kg80("/Games/PromoBonus/Memory/GetActiveGame")
    Object a(@xpv("X-Auth") String str, @jb8 ss30 ss30Var, yje<? super u2t<et30>> yjeVar);

    @kg80("/Games/PromoBonus/Memory/StartGame")
    Object b(@xpv("X-Auth") String str, @jb8 kt30 kt30Var, yje<? super u2t<et30>> yjeVar);

    @kg80("/Games/PromoBonus/Memory/MakeStep")
    Object c(@xpv("X-Auth") String str, @jb8 xs30 xs30Var, yje<? super u2t<et30>> yjeVar);
}
