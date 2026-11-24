package a;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J:\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"La/ppn;", "", "", "auth", "appGuid", "La/pqn;", "body", "La/q16;", "La/sqn;", "La/i2o;", "a", "(Ljava/lang/String;Ljava/lang/String;La/pqn;La/yje;)Ljava/lang/Object;", "La/wqn;", "", "b", "(Ljava/lang/String;Ljava/lang/String;La/wqn;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface ppn {
    @kg80("Account/v1/Mb/ChangeUser")
    Object a(@xpv("X-Auth") String str, @xpv("AppGuid") String str2, @jb8 pqn pqnVar, yje<? super q16<sqn, ? extends i2o>> yjeVar);

    @kg80("Account/v1/Mb/ChangeUserSettings")
    Object b(@xpv("X-Auth") String str, @xpv("AppGuid") String str2, @jb8 wqn wqnVar, yje<? super q16<Unit, ? extends i2o>> yjeVar);
}
