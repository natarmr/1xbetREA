package a;

import android.os.Looper;
import com.huawei.hms.support.api.entity.auth.AuthCode;

/* JADX INFO: loaded from: classes.dex */
public final class bil implements cil {
    @Override // a.cil
    public final ivn c(zhl zhlVar, androidx.media3.common.b bVar) {
        if (bVar.t == null) {
            return null;
        }
        return new ivn(new xhl(AuthCode.StatusCode.WAITING_CONNECT, new rft0()));
    }

    @Override // a.cil
    public final int d(androidx.media3.common.b bVar) {
        return bVar.t != null ? 1 : 0;
    }

    @Override // a.cil
    public final void a(Looper looper, a4a0 a4a0Var) {
    }
}
