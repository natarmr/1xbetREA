package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/l0n0;", "La/yx5;", "<init>", "()V", "a/s2m0", "La/u2n0;", "uiState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class l0n0 extends yx5 {
    public avi K1;
    public rl70 L1;
    public final s0r M1;
    public final a8z N1;
    public final yzn0 O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(l0n0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(l0n0.class, "subSectionType", "getSubSectionType()Lorg/xplatform/feature/office/test_section/impl/presentation/sub_section/models/SubSectionType;", 0)};
    public static final s2m0 P1 = new s2m0();

    public l0n0() {
        super(R.layout.compose_fragment);
        this.M1 = ltt0.o(this, k0n0.f17478a);
        this.N1 = xbc.a0(this, sre0.f32672a.b(a3n0.class), null, new i0n0(this, (byte) 0), 14);
        this.O1 = new yzn0("sub_section_params_key");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        sj3.A0(this, "KEY_PICKER_MODEL_REQUEST", new j0n0(this, (byte) 0));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(h0n0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            h0n0 h0n0Var = (h0n0) (ze3Var instanceof h0n0 ? ze3Var : null);
            if (h0n0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                o2n0 o2n0Var = (o2n0) this.O1.n(this, Q1[1]);
                i1w0VarF.getClass();
                mne mneVar = h0n0Var.f12245a;
                ctf0 ctf0Var = h0n0Var.b;
                epi0 epi0Var = h0n0Var.c;
                pp90 pp90Var = h0n0Var.d;
                n660 n660Var = h0n0Var.e;
                bzt bztVar = h0n0Var.f;
                gqc gqcVar = h0n0Var.g;
                ljt0 ljt0Var = h0n0Var.h;
                j1q0 j1q0Var = h0n0Var.i;
                ntu ntuVar = h0n0Var.j;
                rl70 rl70Var = h0n0Var.k;
                rjo rjoVar = h0n0Var.l;
                bot botVar = h0n0Var.m;
                bbw0 bbw0Var = h0n0Var.n;
                sue sueVar = h0n0Var.o;
                pp90Var.getClass();
                sueVar.getClass();
                ctf0Var.getClass();
                j1q0Var.getClass();
                this.K1 = (avi) ((n5d0) new cr(epi0Var, pp90Var, sueVar, i1w0VarF, o2n0Var, mneVar, ctf0Var, n660Var, bztVar, gqcVar, ljt0Var, j1q0Var, ntuVar, rl70Var, rjoVar, botVar, bbw0Var).r).get();
                this.L1 = rl70Var;
                return;
            }
        }
        jf4.n(b1j.i(h0n0.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.M1.n(Q1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(-258750055, true, new j0n0(this, (byte) 1)));
    }
}
