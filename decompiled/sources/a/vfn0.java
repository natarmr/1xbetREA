package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vfn0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37342a;
    public final /* synthetic */ wfn0 b;

    public /* synthetic */ vfn0(wfn0 wfn0Var, byte b) {
        this.f37342a = b;
        this.b = wfn0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f37342a;
        wfn0 wfn0Var = this.b;
        switch (b) {
            case 0:
                s2m0 s2m0Var = wfn0.e2;
                ComponentCallbacks2 application = wfn0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(ign0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof ign0)) {
                        ze3Var = null;
                    }
                    ign0 ign0Var = (ign0) ze3Var;
                    if (ign0Var != null) {
                        return new ivi(ign0Var.f14743a, (SuccessBetAlertModel) wfn0Var.Z1.n(wfn0Var, wfn0.f2[1]));
                    }
                }
                jf4.n(b1j.i(ign0.class, "Cannot create dependency "));
                return null;
            case 1:
                s2m0 s2m0Var2 = wfn0.e2;
                return new q0h0((hvi) ((ivi) wfn0Var.c2.getValue()).c.get());
            case 2:
                s2m0 s2m0Var3 = wfn0.e2;
                ((k3t0) wfn0Var.d2.getValue()).x(tfn0.f33875a);
                return Unit.f46060a;
            case 3:
                s2m0 s2m0Var4 = wfn0.e2;
                ((k3t0) wfn0Var.d2.getValue()).x(sfn0.f32126a);
                wfn0Var.y0();
                return Unit.f46060a;
            default:
                s2m0 s2m0Var5 = wfn0.e2;
                ((k3t0) wfn0Var.d2.getValue()).x(rfn0.f30397a);
                wfn0Var.y0();
                return Unit.f46060a;
        }
    }
}
