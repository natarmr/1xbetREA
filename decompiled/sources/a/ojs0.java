package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ojs0;", "La/yx5;", "<init>", "()V", "a/m6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ojs0 extends yx5 {
    public fiu0 K1;
    public final s0r L1;
    public final a8z M1;
    public final phf0 N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(ojs0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(ojs0.class, "playerId", "getPlayerId()Ljava/lang/String;", 0)};
    public static final m6m0 P1 = new m6m0((byte) 28);

    public ojs0() {
        super(R.layout.compose_fragment);
        this.L1 = ltt0.o(this, njs0.f23651a);
        this.M1 = xbc.b0(this, sre0.f32672a.b(zjs0.class), new qir0(this, (byte) 18));
        this.N1 = new phf0("player_id");
        this.O1 = true;
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(mjs0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            mjs0 mjs0Var = (mjs0) (ze3Var instanceof mjs0 ? ze3Var : null);
            if (mjs0Var != null) {
                String strN = this.N1.n(this, Q1[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                strN.getClass();
                i1w0VarF.getClass();
                cad cadVar = mjs0Var.f21912a;
                gii0 gii0Var = mjs0Var.b;
                duj dujVar = mjs0Var.c;
                ocl oclVar = mjs0Var.d;
                ctf0 ctf0Var = mjs0Var.f;
                m1e m1eVar = mjs0Var.e;
                knf0 knf0Var = mjs0Var.g;
                gii0Var.getClass();
                ctf0Var.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                ru ruVar = new ru();
                ruVar.b = dujVar;
                ruVar.f31100a = gii0Var;
                ruVar.c = knf0Var;
                ruVar.d = cadVar;
                ruVar.h = m1eVar;
                ruVar.f = i1w0VarF;
                ruVar.g = oclVar;
                ruVar.i = strN;
                ruVar.e = ctf0Var;
                ruVar.j = new yxi(ruVar, (byte) 7);
                this.K1 = new fiu0(Collections.singletonMap(zjs0.class, (yxi) ruVar.j));
                return;
            }
        }
        jf4.n(b1j.i(mjs0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-1320007072, true, new p6r0(this, (byte) 20)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
