package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/s5e0;", "La/yx5;", "<init>", "()V", "a/jh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class s5e0 extends yx5 {
    public final phf0 K1;
    public fiu0 L1;
    public final boolean M1;
    public final s0r N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(s5e0.class, "teamId", "getTeamId()Ljava/lang/String;", 0), new j0d0(s5e0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final jh70 P1 = new jh70();

    public s5e0() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("TEAM_ID");
        this.M1 = true;
        this.N1 = ltt0.o(this, r5e0.f29881a);
        this.O1 = xbc.b0(this, sre0.f32672a.b(a6e0.class), new p7d0(this, (byte) 18));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(Q1[1], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(526458541, true, new nrc0(this, (byte) 18)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(e5e0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            e5e0 e5e0Var = (e5e0) (ze3Var instanceof e5e0 ? ze3Var : null);
            if (e5e0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                String strN = this.K1.n(this, Q1[0]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = e5e0Var.f7231a;
                duj dujVar = e5e0Var.b;
                m1e m1eVar = e5e0Var.c;
                gii0 gii0Var = e5e0Var.d;
                knf0 knf0Var = e5e0Var.e;
                ctf0 ctf0Var = e5e0Var.f;
                ocl oclVar = e5e0Var.g;
                m1eVar.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                ctf0Var.getClass();
                ru ruVar = new ru();
                ruVar.e = ctf0Var;
                ruVar.f31100a = cadVar;
                ruVar.c = i1w0VarF;
                ruVar.d = strN;
                ruVar.f = gii0Var;
                ruVar.g = knf0Var;
                ruVar.i = oclVar;
                ruVar.h = m1eVar;
                ruVar.b = dujVar;
                ruVar.j = new ppi(ruVar, (byte) 19);
                this.L1 = new fiu0(Collections.singletonMap(a6e0.class, (ppi) ruVar.j));
                return;
            }
        }
        jf4.n(b1j.i(e5e0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.M1;
    }
}
