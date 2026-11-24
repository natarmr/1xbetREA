package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J:\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJD\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011JD\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u000e\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"La/nth0;", "", "", "auth", "appGuid", "lng", "La/q16;", "La/vrh0;", "La/i2o;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "", "version", "La/fof0;", "request", "", "d", "(Ljava/lang/String;Ljava/lang/String;ILa/fof0;La/yje;)Ljava/lang/Object;", "La/iof0;", "a", "(Ljava/lang/String;Ljava/lang/String;ILa/iof0;La/yje;)Ljava/lang/Object;", "La/rx5;", "La/pzc0;", "b", "(Ljava/lang/String;Ljava/lang/String;La/rx5;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface nth0 {
    @kg80("/UserAuth/ResetSession")
    Object a(@xpv("X-Auth") String str, @xpv("AppGuid") String str2, @nkd0("v") int i, @jb8 iof0 iof0Var, yje<? super q16<Boolean, ? extends i2o>> yjeVar);

    @kg80("Account/v1/GetPromotion")
    Object b(@xpv("X-Auth") String str, @xpv("AppGuid") String str2, @jb8 rx5 rx5Var, yje<? super q16<pzc0, ? extends i2o>> yjeVar);

    @ofr("Account/v2/GetSecurityUser")
    Object c(@xpv("X-Auth") String str, @xpv("AppGuid") String str2, @nkd0("r.language") String str3, yje<? super q16<vrh0, ? extends i2o>> yjeVar);

    @kg80("UserAuth/ResetAllSessions")
    Object d(@xpv("X-Auth") String str, @xpv("AppGuid") String str2, @nkd0("v") int i, @jb8 fof0 fof0Var, yje<? super q16<Boolean, ? extends i2o>> yjeVar);
}
