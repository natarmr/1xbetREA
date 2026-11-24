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
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampInfoParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/y9t0;", "La/yx5;", "<init>", "()V", "a/sxs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y9t0 extends yx5 {
    public final e9o0 K1;
    public final boolean L1;
    public fiu0 M1;
    public final a8z N1;
    public final qdz O1;
    public final khf0 P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(y9t0.class, "params", "getParams()Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampInfoParams;", 0)};
    public static final sxs0 Q1 = new sxs0((byte) 2);

    public y9t0() {
        super(R.layout.compose_fragment);
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
        this.L1 = true;
        this.N1 = xbc.b0(this, sre0.f32672a.b(dat0.class), new x9t0(this, (byte) 0));
        this.O1 = new qdz();
        this.P1 = new khf0("UNIVERSAL_CHAMP_PARAMS");
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(z9t0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            z9t0 z9t0Var = (z9t0) (ze3Var instanceof z9t0 ? ze3Var : null);
            if (z9t0Var != null) {
                UniversalChampInfoParams universalChampInfoParams = (UniversalChampInfoParams) this.P1.n(this, R1[0]);
                cad cadVar = z9t0Var.f44038a;
                pyg pygVar = z9t0Var.b;
                ctf0 ctf0Var = z9t0Var.c;
                g2v g2vVar = z9t0Var.d;
                m1e m1eVar = z9t0Var.e;
                zr1 zr1Var = z9t0Var.f;
                ih5 ih5Var = z9t0Var.g;
                gii0 gii0Var = z9t0Var.h;
                vby vbyVar = z9t0Var.i;
                pygVar.getClass();
                ctf0Var.getClass();
                m1eVar.getClass();
                gii0Var.getClass();
                vbyVar.getClass();
                this.M1 = new fiu0(Collections.singletonMap(dat0.class, (yxi) new pwi(cadVar, pygVar, ctf0Var, universalChampInfoParams, g2vVar, m1eVar, zr1Var, ih5Var, gii0Var, vbyVar).k));
                return;
            }
        }
        jf4.n(b1j.i(z9t0.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        pkd.h(composeView, new owp0(this), null, new ugd(-629471688, true, new p6r0(this, (byte) 27)));
        return composeView;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.L1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
