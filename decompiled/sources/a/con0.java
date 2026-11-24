package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.swipex.impl.presentation.dialogs.confirmation.models.SwipeActionConfirmationParams;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class con0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4710a;
    public final /* synthetic */ don0 b;

    public /* synthetic */ con0(don0 don0Var, byte b) {
        this.f4710a = b;
        this.b = don0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f4710a;
        don0 don0Var = this.b;
        switch (b) {
            case 0:
                m6m0 m6m0Var = don0.n2;
                ComponentCallbacks2 application = don0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(lon0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof lon0)) {
                        ze3Var = null;
                    }
                    lon0 lon0Var = (lon0) ze3Var;
                    if (lon0Var != null) {
                        return new ovi(lon0Var.f20402a, (SwipeActionConfirmationParams) don0Var.k2.n(don0Var, don0.o2[0]));
                    }
                }
                jf4.n(b1j.i(lon0.class, "Cannot create dependency "));
                return null;
            case 1:
                return new q0h0((nvi) ((ovi) don0Var.l2.getValue()).c.get());
            case 2:
                m6m0 m6m0Var2 = don0.n2;
                don0Var.Q0().x(gon0.f11639a);
                return Unit.f46060a;
            case 3:
                m6m0 m6m0Var3 = don0.n2;
                don0Var.Q0().x(hon0.f13402a);
                return Unit.f46060a;
            default:
                m6m0 m6m0Var4 = don0.n2;
                don0Var.Q0().x(ion0.f15126a);
                return Unit.f46060a;
        }
    }
}
