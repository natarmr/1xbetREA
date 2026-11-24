package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.presentation.rules.VirtualSportRulesParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/rsu0;", "La/yx5;", "<init>", "()V", "a/sxs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rsu0 extends yx5 {
    public final boolean K1;
    public fiu0 L1;
    public final a8z M1;
    public final khf0 N1;
    public static final /* synthetic */ iiy[] P1 = {new ez40(rsu0.class, "screenParams", "getScreenParams()Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;", 0)};
    public static final sxs0 O1 = new sxs0((byte) 10);

    public rsu0() {
        super(R.layout.compose_fragment);
        this.K1 = true;
        this.M1 = xbc.b0(this, sre0.f32672a.b(ztu0.class), new rbt0(this, (byte) 16));
        this.N1 = new khf0("screen_params");
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ssu0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ssu0 ssu0Var = (ssu0) (ze3Var instanceof ssu0 ? ze3Var : null);
            if (ssu0Var != null) {
                VirtualSportRulesParams virtualSportRulesParams = (VirtualSportRulesParams) this.N1.n(this, P1[0]);
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = ssu0Var.f32744a;
                vby vbyVar = ssu0Var.b;
                ctf0 ctf0Var = ssu0Var.c;
                gii0 gii0Var = ssu0Var.d;
                m1e m1eVar = ssu0Var.e;
                g2v g2vVar = ssu0Var.f;
                knf0 knf0Var = ssu0Var.g;
                vbyVar.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                ru ruVar = new ru();
                ruVar.f31100a = i1w0VarF;
                ruVar.b = virtualSportRulesParams;
                ruVar.e = ctf0Var;
                ruVar.h = m1eVar;
                ruVar.c = cadVar;
                ruVar.d = g2vVar;
                ruVar.f = vbyVar;
                ruVar.g = gii0Var;
                ruVar.i = knf0Var;
                ruVar.j = new yxi(ruVar, (byte) 24);
                this.L1 = new fiu0(Collections.singletonMap(ztu0.class, (yxi) ruVar.j));
                return;
            }
        }
        jf4.n(b1j.i(ssu0.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        h97.t(composeView, new owp0(this), new ugd(-2037648366, true, new ggt0(this, (byte) 12)));
        return composeView;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.K1;
    }
}
