package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/j3a0;", "La/yx5;", "<init>", "()V", "a/jh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class j3a0 extends yx5 {
    public final s0r K1;
    public coi L1;
    public final phf0 M1;
    public final a8z N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(j3a0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(j3a0.class, "playerId", "getPlayerId()Ljava/lang/String;", 0)};
    public static final jh70 P1 = new jh70();

    public j3a0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, i3a0.f14089a);
        this.M1 = new phf0("PLAYER_ID");
        this.N1 = xbc.a0(this, sre0.f32672a.b(u3a0.class), null, new pl70(this, (byte) 29), 14);
        this.O1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(Q1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(-31405000, true, new cz90(this, (byte) 4)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(k3a0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            k3a0 k3a0Var = (k3a0) (ze3Var instanceof k3a0 ? ze3Var : null);
            if (k3a0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                String strN = this.M1.n(this, Q1[1]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = k3a0Var.f17608a;
                gii0 gii0Var = k3a0Var.b;
                duj dujVar = k3a0Var.e;
                m1e m1eVar = k3a0Var.c;
                ocl oclVar = k3a0Var.d;
                ctf0 ctf0Var = k3a0Var.f;
                knf0 knf0Var = k3a0Var.g;
                gii0Var.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                this.L1 = (coi) new doi(cadVar, gii0Var, dujVar, oclVar, m1eVar, i1w0VarF, ctf0Var, strN, knf0Var).j.get();
                return;
            }
        }
        jf4.n(b1j.i(k3a0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
