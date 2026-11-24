package a;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JN\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0005H§@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"La/z2c0;", "", "", "auth", "lng", "", "partnerId", "groupId", "whence", "La/q16;", "La/r2c0;", "La/i2o;", "a", "(Ljava/lang/String;Ljava/lang/String;IIILa/yje;)Ljava/lang/Object;", "authToken", "La/jnt0;", "request", "", "b", "(Ljava/lang/String;La/jnt0;La/yje;)Ljava/lang/Object;", "xplatform.android:onexuser"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface z2c0 {
    @ofr("Account/v1/Mb/UserData")
    Object a(@xpv("X-Auth") String str, @nkd0("Language") String str2, @nkd0("partner") int i, @nkd0("group") int i2, @nkd0("Whence") int i3, yje<? super q16<r2c0, ? extends i2o>> yjeVar);

    @kg80("/UserDevice/v1/MobileDevice/UpdateUserData")
    @dtv({"Accept: application/vnd.xenvelop+json"})
    Object b(@xpv("X-Auth") String str, @jb8 jnt0 jnt0Var, yje<? super Unit> yjeVar);
}
