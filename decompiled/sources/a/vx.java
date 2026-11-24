package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/vx;", "La/yx5;", "<init>", "()V", "a/hfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vx extends yx5 {
    public final boolean K1;
    public final s0r L1;
    public fiu0 M1;
    public final a8z N1;
    public final r34 O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(vx.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(vx.class, "gameId", "getGameId()J", 0)};
    public static final hfk0 P1 = new hfk0((byte) 11);

    public vx() {
        super(R.layout.compose_fragment);
        this.K1 = true;
        this.L1 = ltt0.o(this, ux.f36416a);
        this.N1 = xbc.b0(this, sre0.f32672a.b(ez.class), new nc(this, (byte) 7));
        this.O1 = new r34("GAME_ID");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(1673198985, true, new tx(this, (byte) 0)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(wx.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            wx wxVar = (wx) (ze3Var instanceof wx ? ze3Var : null);
            if (wxVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                Long lN = this.O1.n(this, Q1[1]);
                i1w0VarF.getClass();
                cad cadVar = wxVar.f39908a;
                btt0 btt0Var = wxVar.b;
                knf0 knf0Var = wxVar.c;
                ocl oclVar = wxVar.d;
                gii0 gii0Var = wxVar.e;
                duj dujVar = wxVar.f;
                r9u r9uVar = wxVar.h;
                m1e m1eVar = wxVar.i;
                ctf0 ctf0Var = wxVar.g;
                btt0Var.getClass();
                knf0Var.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                r9uVar.getClass();
                m1eVar.getClass();
                this.M1 = new fiu0(Collections.singletonMap(ez.class, (t5i) new daf(cadVar, i1w0VarF, btt0Var, knf0Var, oclVar, ctf0Var, gii0Var, dujVar, r9uVar, m1eVar, lN).m));
                return;
            }
        }
        jf4.n(b1j.i(wx.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        ((k3t0) this.N1.getValue()).x(kx.f19027a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        ((k3t0) this.N1.getValue()).x(lx.f20788a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.K1;
    }
}
