package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zfn0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44308a;
    public final /* synthetic */ bgn0 b;

    public /* synthetic */ zfn0(bgn0 bgn0Var, byte b) {
        this.f44308a = b;
        this.b = bgn0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44308a;
        bgn0 bgn0Var = this.b;
        switch (b) {
            case 0:
                j6m0 j6m0Var = bgn0.q2;
                ComponentCallbacks2 application = bgn0Var.n0().getApplication();
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
                        return new ivi(ign0Var.f14743a, (SuccessBetAlertModel) bgn0Var.l2.n(bgn0Var, bgn0.r2[1]));
                    }
                }
                jf4.n(b1j.i(ign0.class, "Cannot create dependency "));
                return null;
            case 1:
                j6m0 j6m0Var2 = bgn0.q2;
                return new q0h0((hvi) ((ivi) bgn0Var.o2.getValue()).c.get());
            case 2:
                j6m0 j6m0Var3 = bgn0.q2;
                bgn0Var.P0().x(tfn0.f33875a);
                return Unit.f46060a;
            case 3:
                j6m0 j6m0Var4 = bgn0.q2;
                bgn0Var.P0().x(sfn0.f32126a);
                bgn0Var.y0();
                return Unit.f46060a;
            default:
                j6m0 j6m0Var5 = bgn0.q2;
                bgn0Var.P0().x(rfn0.f30397a);
                bgn0Var.y0();
                return Unit.f46060a;
        }
    }
}
