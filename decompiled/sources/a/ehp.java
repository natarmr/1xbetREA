package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/ehp;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ehp extends yx5 {
    public fiu0 K1;
    public final a8z L1;

    public ehp() {
        super(R.layout.feature_toggles_fragment);
        this.L1 = xbc.b0(this, sre0.f32672a.b(khp.class), new ntl(this, (byte) 29));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fhp.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fhp fhpVar = (fhp) (ze3Var instanceof fhp ? ze3Var : null);
            if (fhpVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = fhpVar.f9553a;
                ctf0 ctf0Var = fhpVar.b;
                dot dotVar = fhpVar.c;
                dot dotVar2 = fhpVar.d;
                ctf0Var.getClass();
                esg0 esg0Var = new esg0();
                esg0Var.f8326a = ctf0Var;
                esg0Var.b = cadVar;
                esg0Var.c = dotVar;
                esg0Var.d = dotVar2;
                esg0Var.e = i1w0VarF;
                esg0Var.f = new ugi(esg0Var, (byte) 0);
                this.K1 = new fiu0(Collections.singletonMap(khp.class, (ugi) esg0Var.f));
                return;
            }
        }
        jf4.n(b1j.i(fhp.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        h97.t((ComposeView) view, new owp0(this), new ugd(114742370, true, new f5o(this, (byte) 19)));
    }
}
