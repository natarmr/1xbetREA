package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/srd0;", "La/yx5;", "<init>", "()V", "a/nh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class srd0 extends yx5 {
    public wqi K1;
    public final s0r L1;
    public final a8z M1;
    public final boolean N1;
    public final phf0 O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(srd0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(srd0.class, "gameId", "getGameId()Ljava/lang/String;", 0)};
    public static final nh70 P1 = new nh70();

    public srd0() {
        super(R.layout.compose_fragment);
        this.L1 = ltt0.o(this, rrd0.f30979a);
        this.M1 = xbc.a0(this, sre0.f32672a.b(esd0.class), null, new p7d0(this, (byte) 7), 14);
        this.N1 = true;
        this.O1 = new phf0("GAME_ID");
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(trd0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            trd0 trd0Var = (trd0) (ze3Var instanceof trd0 ? ze3Var : null);
            if (trd0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                String strN = this.O1.n(this, Q1[1]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = trd0Var.f34419a;
                gii0 gii0Var = trd0Var.b;
                duj dujVar = trd0Var.c;
                ctf0 ctf0Var = trd0Var.d;
                ocl oclVar = trd0Var.e;
                knf0 knf0Var = trd0Var.f;
                m1e m1eVar = trd0Var.g;
                gii0Var.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                m1eVar.getClass();
                this.K1 = (wqi) new doi(cadVar, i1w0VarF, gii0Var, strN, dujVar, ctf0Var, oclVar, knf0Var, m1eVar).j.get();
                return;
            }
        }
        jf4.n(b1j.i(trd0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-523080133, true, new nrc0(this, (byte) 10)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.N1;
    }
}
