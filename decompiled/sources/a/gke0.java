package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/gke0;", "La/yx5;", "<init>", "()V", "a/eke0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gke0 extends yx5 {
    public final s0r K1;
    public fiu0 L1;
    public final phf0 M1;
    public final kiu0 N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(gke0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(gke0.class, "refereeId", "getRefereeId()Ljava/lang/String;", 0)};
    public static final eke0 P1 = new eke0();

    public gke0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, fke0.f9687a);
        this.M1 = new phf0("referee_id");
        tie0 tie0Var = new tie0(this, (byte) 2);
        a8z a8zVarA = maz.a(wez.b, new lce0(new lce0(this, (byte) 1), (byte) 2));
        this.N1 = agc.G(this, sre0.f32672a.b(qke0.class), new wbe0(a8zVarA, (byte) 4), new wbe0(a8zVarA, (byte) 5), tie0Var);
        this.O1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(Q1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(279261740, true, new dke0(this, (byte) 0)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(cke0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            cke0 cke0Var = (cke0) (ze3Var instanceof cke0 ? ze3Var : null);
            if (cke0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                String strN = this.M1.n(this, Q1[1]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = cke0Var.f4502a;
                duj dujVar = cke0Var.b;
                gii0 gii0Var = cke0Var.c;
                ctf0 ctf0Var = cke0Var.d;
                ocl oclVar = cke0Var.e;
                m1e m1eVar = cke0Var.f;
                knf0 knf0Var = cke0Var.g;
                gii0Var.getClass();
                ctf0Var.getClass();
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
                ruVar.j = new ppi(ruVar, (byte) 23);
                this.L1 = new fiu0(Collections.singletonMap(qke0.class, (ppi) ruVar.j));
                return;
            }
        }
        jf4.n(b1j.i(cke0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
