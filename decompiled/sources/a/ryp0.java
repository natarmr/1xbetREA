package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ryp0;", "La/yx5;", "<init>", "()V", "a/j6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ryp0 extends yx5 {
    public wwi K1;
    public final s0r L1;
    public final a8z M1;
    public final phf0 N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(ryp0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(ryp0.class, "playerId", "getPlayerId()Ljava/lang/String;", 0)};
    public static final j6m0 P1 = new j6m0((byte) 17);

    public ryp0() {
        super(R.layout.compose_fragment);
        this.L1 = ltt0.o(this, qyp0.f29546a);
        this.M1 = xbc.a0(this, sre0.f32672a.b(nzp0.class), null, new nxo0(this, (byte) 27), 14);
        this.N1 = new phf0("player_id");
        this.O1 = true;
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(syp0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            syp0 syp0Var = (syp0) (ze3Var instanceof syp0 ? ze3Var : null);
            if (syp0Var != null) {
                String strN = this.N1.n(this, Q1[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                strN.getClass();
                i1w0VarF.getClass();
                cad cadVar = syp0Var.f33033a;
                ocl oclVar = syp0Var.b;
                gii0 gii0Var = syp0Var.c;
                m1e m1eVar = syp0Var.d;
                knf0 knf0Var = syp0Var.e;
                duj dujVar = syp0Var.f;
                ctf0 ctf0Var = syp0Var.g;
                typ0 typ0Var = syp0Var.h;
                kuy kuyVar = syp0Var.i;
                gii0Var.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                ctf0Var.getClass();
                typ0Var.getClass();
                kuyVar.getClass();
                this.K1 = (wwi) ((n5d0) new nc0(cadVar, strN, i1w0VarF, oclVar, gii0Var, m1eVar, knf0Var, dujVar, ctf0Var, typ0Var, kuyVar).n).get();
                return;
            }
        }
        jf4.n(b1j.i(syp0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-1629638715, true, new l7p0(this, (byte) 12)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
