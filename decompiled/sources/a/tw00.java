package a;

import android.content.Intent;
import com.yandex.authsdk.YandexAuthToken;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tw00 extends bsr0 {
    public final uw00 h;

    public tw00(uw00 uw00Var) {
        this.h = uw00Var;
    }

    @Override // a.bsr0
    public final Object i0(int i, Intent intent) {
        Object g0g0Var = null;
        if (intent == null || i != -1) {
            e0g0 e0g0Var = j0g0.b;
        } else {
            uw00 uw00Var = this.h;
            YandexAuthToken yandexAuthTokenK = uw00Var.k(intent);
            if (yandexAuthTokenK != null) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = yandexAuthTokenK;
            } else {
                d2w0 d2w0VarL = uw00Var.l(intent);
                if (d2w0VarL != null) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(d2w0VarL);
                } else {
                    e0g0 e0g0Var4 = j0g0.b;
                }
            }
        }
        return new j0g0(g0g0Var);
    }
}
