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
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampResultsParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/obt0;", "La/yx5;", "<init>", "()V", "a/wxs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class obt0 extends yx5 {
    public final e9o0 K1;
    public final boolean L1;
    public fiu0 M1;
    public wdk0 N1;
    public final a8z O1;
    public final qdz P1;
    public final khf0 Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(obt0.class, "params", "getParams()Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampResultsParams;", 0)};
    public static final wxs0 R1 = new wxs0((byte) 2);

    public obt0() {
        super(R.layout.compose_fragment);
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
        this.L1 = true;
        this.O1 = xbc.b0(this, sre0.f32672a.b(wbt0.class), new nbt0(this, (byte) 0));
        this.P1 = new qdz();
        this.Q1 = new khf0("UNIVERSAL_CHAMP_PARAMS");
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(pbt0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            pbt0 pbt0Var = (pbt0) (ze3Var instanceof pbt0 ? ze3Var : null);
            if (pbt0Var != null) {
                UniversalChampResultsParams universalChampResultsParams = (UniversalChampResultsParams) this.Q1.n(this, S1[0]);
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = pbt0Var.f26725a;
                pyg pygVar = pbt0Var.b;
                roi0 roi0Var = pbt0Var.c;
                rrc rrcVar = pbt0Var.d;
                epi0 epi0Var = pbt0Var.e;
                ctf0 ctf0Var = pbt0Var.f;
                g2v g2vVar = pbt0Var.g;
                m1e m1eVar = pbt0Var.h;
                wdk0 wdk0Var = pbt0Var.i;
                pmi pmiVar = pbt0Var.j;
                wiu wiuVar = pbt0Var.k;
                pru pruVar = pbt0Var.l;
                knf0 knf0Var = pbt0Var.m;
                gii0 gii0Var = pbt0Var.n;
                pygVar.getClass();
                ctf0Var.getClass();
                m1eVar.getClass();
                wdk0Var.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                this.M1 = new fiu0(Collections.singletonMap(wbt0.class, (msi) new cr(cadVar, pygVar, roi0Var, rrcVar, epi0Var, i1w0VarF, ctf0Var, universalChampResultsParams, g2vVar, m1eVar, wdk0Var, pmiVar, wiuVar, pruVar, knf0Var, gii0Var).r));
                this.N1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(pbt0.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        pkd.h(composeView, new owp0(this), null, new ugd(-26511614, true, new p6r0(this, (byte) 29)));
        return composeView;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.L1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
