package a;

import org.xplatform.core.navigation.authorization.screen.Authorization$Registration$Screen;
import org.xplatform.registration_default.api.presentation.model.RegistrationDefaultScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final class dmt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pru f6335a;

    public /* synthetic */ dmt(pru pruVar) {
        this.f6335a = pruVar;
    }

    public Authorization$Registration$Screen a(RegistrationDefaultScreenParams registrationDefaultScreenParams) {
        int iOrdinal = this.f6335a.a().N.q.ordinal();
        if (iOrdinal == 0) {
            dxe0.Y1.getClass();
            return new Authorization$Registration$Screen(dxe0.a2, new ex60(registrationDefaultScreenParams, (byte) 18));
        }
        if (iOrdinal == 1) {
            iaf0.Z1.getClass();
            return new Authorization$Registration$Screen(iaf0.b2, new e9d0((byte) 10));
        }
        if (iOrdinal == 2) {
            z3f0.Y1.getClass();
            return new Authorization$Registration$Screen(z3f0.a2, new e9d0((byte) 9));
        }
        t9f.b();
        return null;
    }

    public kg b() {
        return this.f6335a.a().g.e;
    }

    public dmt(pru pruVar, eke0 eke0Var, gne0 gne0Var, eke0 eke0Var2) {
        this.f6335a = pruVar;
    }
}
