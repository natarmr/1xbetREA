package a;

import android.content.ComponentCallbacks2;
import kotlin.jvm.functions.Function0;
import org.xplatform.authenticator.impl.ui.dialogs.authenticator_filter.models.AuthenticatorFilterDialogSettings;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class up4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36045a;
    public final /* synthetic */ vp4 b;

    public /* synthetic */ up4(vp4 vp4Var, byte b) {
        this.f36045a = b;
        this.b = vp4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f36045a;
        vp4 vp4Var = this.b;
        switch (b) {
            case 0:
                jdk0 jdk0Var = vp4.n2;
                ComponentCallbacks2 application = vp4Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(wp4.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof wp4)) {
                        ze3Var = null;
                    }
                    wp4 wp4Var = (wp4) ze3Var;
                    if (wp4Var != null) {
                        i1w0 i1w0VarF = a4n0.f(vp4Var);
                        AuthenticatorFilterDialogSettings authenticatorFilterDialogSettings = (AuthenticatorFilterDialogSettings) vp4Var.m2.n(vp4Var, vp4.o2[0]);
                        i1w0VarF.getClass();
                        mne mneVar = wp4Var.b;
                        ctf0 ctf0Var = wp4Var.f39526a;
                        ctf0Var.getClass();
                        return new d9i(mneVar, authenticatorFilterDialogSettings, ctf0Var);
                    }
                }
                jf4.n(b1j.i(wp4.class, "Cannot create dependency "));
                return null;
            default:
                return (c9i) ((d9i) vp4Var.k2.getValue()).d.get();
        }
    }
}
