package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/lmv0;", "La/yx5;", "<init>", "()V", "a/wxs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lmv0 extends yx5 {
    public final phf0 K1;
    public final s0r L1;
    public fiu0 M1;
    public final a8z N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(lmv0.class, "playerId", "getPlayerId()Ljava/lang/String;", 0), new j0d0(lmv0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final wxs0 P1 = new wxs0((byte) 16);

    public lmv0() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("player_id");
        this.L1 = ltt0.o(this, kmv0.f18560a);
        this.N1 = xbc.b0(this, sre0.f32672a.b(tmv0.class), new jmv0(this, (byte) 0));
        this.O1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(Q1[1], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(438830631, true, new ggt0(this, (byte) 23)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(imv0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            imv0 imv0Var = (imv0) (ze3Var instanceof imv0 ? ze3Var : null);
            if (imv0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                String strN = this.K1.n(this, Q1[0]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = imv0Var.f15045a;
                duj dujVar = imv0Var.b;
                gii0 gii0Var = imv0Var.c;
                m1e m1eVar = imv0Var.d;
                ocl oclVar = imv0Var.e;
                ctf0 ctf0Var = imv0Var.f;
                knf0 knf0Var = imv0Var.g;
                gii0Var.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                this.M1 = new fiu0(Collections.singletonMap(tmv0.class, (kzi) new tzi(cadVar, gii0Var, dujVar, oclVar, m1eVar, i1w0VarF, ctf0Var, strN, knf0Var).k));
                return;
            }
        }
        jf4.n(b1j.i(imv0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
