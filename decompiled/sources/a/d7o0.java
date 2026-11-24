package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.championships.regular.presentation.CyberChampParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/d7o0;", "La/yx5;", "<init>", "()V", "a/s9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class d7o0 extends yx5 {
    public final e9o0 K1;
    public final boolean L1;
    public zvi M1;
    public wdk0 N1;
    public final khf0 O1;
    public final a8z P1;
    public final qdz Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(d7o0.class, "params", "getParams()Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;", 0)};
    public static final s9m0 R1 = new s9m0();

    public d7o0() {
        super(R.layout.compose_fragment);
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
        this.L1 = true;
        this.O1 = new khf0("params");
        this.P1 = xbc.a0(this, sre0.f32672a.b(m7o0.class), null, new c7o0(this, (byte) 0), 14);
        this.Q1 = new qdz();
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(e7o0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            e7o0 e7o0Var = (e7o0) (ze3Var instanceof e7o0 ? ze3Var : null);
            if (e7o0Var != null) {
                CyberChampParams cyberChampParams = (CyberChampParams) this.O1.n(this, S1[0]);
                m1e m1eVar = e7o0Var.f7337a;
                gii0 gii0Var = e7o0Var.b;
                mne mneVar = e7o0Var.c;
                oeg0 oeg0Var = e7o0Var.d;
                g2v g2vVar = e7o0Var.e;
                ctf0 ctf0Var = e7o0Var.f;
                pyg pygVar = e7o0Var.g;
                wdk0 wdk0Var = e7o0Var.h;
                wgu wguVar = e7o0Var.i;
                pmi pmiVar = e7o0Var.j;
                pru pruVar = e7o0Var.k;
                ih5 ih5Var = e7o0Var.l;
                zr1 zr1Var = e7o0Var.m;
                epi0 epi0Var = e7o0Var.n;
                m1eVar.getClass();
                gii0Var.getClass();
                oeg0Var.getClass();
                ctf0Var.getClass();
                wdk0Var.getClass();
                wguVar.getClass();
                pygVar.getClass();
                this.M1 = (zvi) ((n5d0) new qv2(pygVar, epi0Var, cyberChampParams, m1eVar, mneVar, g2vVar, ctf0Var, wdk0Var, wguVar, pmiVar, pruVar, ih5Var, zr1Var).n).get();
                this.N1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(e7o0.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        pkd.h(composeView, new owp0(this), null, new ugd(-1192442661, true, new abn0(this, (byte) 12)));
        return composeView;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getR1() {
        return this.L1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
