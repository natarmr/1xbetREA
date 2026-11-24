package a;

import java.util.Date;
import org.xplatform.authenticator.impl.ui.dialogs.authenticator_filter.AuthenticatorFilterViewModel$ViewModelState;
import org.xplatform.authenticator.impl.ui.dialogs.authenticator_filter.models.AuthenticatorFilterDialogSettings;
import org.xplatform.authenticator.impl.util.NotificationPeriodInfo;
import org.xplatform.authenticator.impl.util.NotificationTypeInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class cq4 extends w46 {
    public final ctf0 b;
    public final zj2 c;
    public final ol60 d;
    public final xae0 e;

    public cq4(vzg0 vzg0Var, mne mneVar, ctf0 ctf0Var, AuthenticatorFilterDialogSettings authenticatorFilterDialogSettings) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        NotificationPeriodInfo notificationPeriodInfo = authenticatorFilterDialogSettings.b;
        NotificationTypeInfo notificationTypeInfo = authenticatorFilterDialogSettings.f46353a;
        c860 c860Var = notificationTypeInfo.f46355a;
        q760 q760Var = q760.ALL_TIME;
        zj2 zj2Var = new zj2(vzg0Var, "UI_STATE_SAVED_STATE_KEY", new AuthenticatorFilterViewModel$ViewModelState(c860Var, notificationPeriodInfo, q760Var));
        this.c = zj2Var;
        this.d = new ol60(3);
        this.e = vtb.h0(new c00(zj2Var, this, (byte) 14), d5c.S(jiu0.a(this), mneVar.b), kpj0.b, z6t0.a(new AuthenticatorFilterViewModel$ViewModelState(notificationTypeInfo.f46355a, notificationPeriodInfo, q760Var), ctf0Var));
    }

    public static String w(long j) {
        return rdj.c(rdj.f30294a, sdj.UNIVERSAL, new Date(j), null, 60);
    }

    public final void x(q760 q760Var) {
        q760Var.getClass();
        if (q760Var == q760.CUSTOM) {
            this.d.f(new yp4(0L, new Date().getTime() / 1000));
            return;
        }
        zj2 zj2Var = this.c;
        zj2Var.getClass();
        AuthenticatorFilterViewModel$ViewModelState authenticatorFilterViewModel$ViewModelState = (AuthenticatorFilterViewModel$ViewModelState) zj2Var.getValue();
        authenticatorFilterViewModel$ViewModelState.getClass();
        zj2Var.f(AuthenticatorFilterViewModel$ViewModelState.a(authenticatorFilterViewModel$ViewModelState, null, NotificationPeriodInfo.a(authenticatorFilterViewModel$ViewModelState.b, q760Var, null, 0L, 2), 5));
    }
}
