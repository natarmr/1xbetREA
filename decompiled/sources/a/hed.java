package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/hed;", "La/yx5;", "<init>", "()V", "a/gl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hed extends yx5 {
    public fiu0 K1;
    public final s0r L1;
    public final a8z M1;
    public final phf0 N1;
    public final r34 O1;
    public final boolean P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(hed.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(hed.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(hed.class, "sportId", "getSportId()J", 0)};
    public static final gl5 Q1 = new gl5((byte) 28);

    public hed() {
        super(R.layout.compose_fragment);
        this.L1 = ltt0.o(this, ged.f11149a);
        this.M1 = xbc.b0(this, sre0.f32672a.b(kfd.class), new h8a(this, (byte) 24));
        this.N1 = new phf0("GAME_ID");
        this.O1 = new r34("SPORT_ID");
        this.P1 = true;
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ied.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ied iedVar = (ied) (ze3Var instanceof ied ? ze3Var : null);
            if (iedVar != null) {
                iiy[] iiyVarArr = R1;
                String strN = this.N1.n(this, iiyVarArr[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                Long lN = this.O1.n(this, iiyVarArr[2]);
                strN.getClass();
                i1w0VarF.getClass();
                cad cadVar = iedVar.f14627a;
                duj dujVar = iedVar.b;
                gii0 gii0Var = iedVar.c;
                m1e m1eVar = iedVar.d;
                ocl oclVar = iedVar.e;
                knf0 knf0Var = iedVar.f;
                kki kkiVarA = ((daf) iedVar.g.f30839a).j().a(i1w0VarF);
                j1q0 j1q0Var = iedVar.h;
                ctf0 ctf0Var = iedVar.i;
                vjp vjpVar = iedVar.j;
                r9u r9uVar = iedVar.k;
                gii0Var.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                j1q0Var.getClass();
                ctf0Var.getClass();
                r9uVar.getClass();
                this.K1 = new fiu0(Collections.singletonMap(kfd.class, (pai) new nc0(cadVar, kkiVarA, dujVar, gii0Var, strN, m1eVar, i1w0VarF, lN, oclVar, knf0Var, ctf0Var, vjpVar, r9uVar).n));
                return;
            }
        }
        jf4.n(b1j.i(ied.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.L1.n(R1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(947385094, true, new cnc(this, (byte) 6)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getP1() {
        return this.P1;
    }
}
