package a;

import android.widget.ProgressBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hmg0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13305a;
    public final /* synthetic */ lmg0 b;

    public /* synthetic */ hmg0(lmg0 lmg0Var, byte b) {
        this.f13305a = b;
        this.b = lmg0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13305a;
        yje yjeVar = null;
        lmg0 lmg0Var = this.b;
        switch (b) {
            case 0:
                eke0 eke0Var = lmg0.Y1;
                lmg0Var.I0();
                return Unit.f46060a;
            case 1:
                eke0 eke0Var2 = lmg0.Y1;
                umg0 umg0Var = (umg0) lmg0Var.O1.getValue();
                sac.V(jiu0.a(umg0Var), smg0.f32445a, null, null, new rmg0(umg0Var, yjeVar, (byte) 1), 14);
                e1i e1iVarB = lmg0Var.G0().d.b("REFRESH_BUTTON");
                if (e1iVarB != null) {
                    e1iVarB.setEnabled(false);
                }
                lmg0Var.G0().g.g();
                siq fixedWebView = lmg0Var.G0().g.getFixedWebView();
                if (fixedWebView != null) {
                    fixedWebView.setVisibility(8);
                }
                lmg0Var.G0().c.setVisibility(8);
                ((ProgressBar) lmg0Var.G0().f.b).setVisibility(0);
                lmg0Var.G0().b.setVisibility(8);
                return Unit.f46060a;
            case 2:
                fiu0 fiu0Var = lmg0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                z7z z7zVar = lmg0Var.M1;
                if (z7zVar == null) {
                    Intrinsics.h("lottieConfigurator");
                    throw null;
                }
                Object obj = z7zVar.get();
                obj.getClass();
                return sa10.b((sa10) obj, pb10.g, R.string.data_retrieval_error, 0, null, 28);
        }
    }
}
