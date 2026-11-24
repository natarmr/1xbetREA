package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/q7a0;", "La/yx5;", "<init>", "()V", "a/fl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class q7a0 extends yx5 {
    public final phf0 K1;
    public final s0r L1;
    public fiu0 M1;
    public final a8z N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(q7a0.class, "playerId", "getPlayerId()Ljava/lang/String;", 0), new j0d0(q7a0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final fl70 P1 = new fl70();

    public q7a0() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("player_id");
        this.L1 = ltt0.o(this, p7a0.f26497a);
        this.N1 = xbc.b0(this, sre0.f32672a.b(z7a0.class), new l3a0(this, (byte) 6));
        this.O1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(Q1[1], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(595810686, true, new cz90(this, (byte) 9)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(o7a0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            o7a0 o7a0Var = (o7a0) (ze3Var instanceof o7a0 ? ze3Var : null);
            if (o7a0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                String strN = this.K1.n(this, Q1[0]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = o7a0Var.f24777a;
                duj dujVar = o7a0Var.b;
                ocl oclVar = o7a0Var.c;
                ctf0 ctf0Var = o7a0Var.d;
                gii0 gii0Var = o7a0Var.e;
                m1e m1eVar = o7a0Var.f;
                knf0 knf0Var = o7a0Var.g;
                ctf0Var.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                ru ruVar = new ru();
                ruVar.e = ctf0Var;
                ruVar.f31100a = cadVar;
                ruVar.c = gii0Var;
                ruVar.d = knf0Var;
                ruVar.h = m1eVar;
                ruVar.f = i1w0VarF;
                ruVar.b = dujVar;
                ruVar.g = strN;
                ruVar.i = oclVar;
                ruVar.j = new eni(ruVar, (byte) 14);
                this.M1 = new fiu0(Collections.singletonMap(z7a0.class, (eni) ruVar.j));
                return;
            }
        }
        jf4.n(b1j.i(o7a0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
