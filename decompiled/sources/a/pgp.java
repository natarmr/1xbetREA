package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/pgp;", "La/yx5;", "<init>", "()V", "a/ddk", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class pgp extends yx5 {
    public fiu0 K1;
    public final s0r L1;
    public final a8z M1;
    public final phf0 N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(pgp.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(pgp.class, "gameId", "getGameId()Ljava/lang/String;", 0)};
    public static final ddk P1 = new ddk();

    public pgp() {
        super(R.layout.compose_fragment);
        this.L1 = ltt0.o(this, ogp.f25232a);
        this.M1 = xbc.b0(this, sre0.f32672a.b(wgp.class), new ntl(this, (byte) 28));
        this.N1 = new phf0("GAME_ID");
        this.O1 = true;
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(qgp.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            qgp qgpVar = (qgp) (ze3Var instanceof qgp ? ze3Var : null);
            if (qgpVar != null) {
                String strN = this.N1.n(this, Q1[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                strN.getClass();
                i1w0VarF.getClass();
                cad cadVar = qgpVar.f28697a;
                duj dujVar = qgpVar.b;
                gii0 gii0Var = qgpVar.c;
                m1e m1eVar = qgpVar.d;
                ctf0 ctf0Var = qgpVar.h;
                ocl oclVar = qgpVar.e;
                knf0 knf0Var = qgpVar.f;
                kki kkiVarA = ((daf) qgpVar.g.f30839a).j().a(i1w0VarF);
                vjp vjpVar = qgpVar.i;
                r9u r9uVar = qgpVar.j;
                gii0Var.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                r9uVar.getClass();
                this.K1 = new fiu0(Collections.singletonMap(wgp.class, (yei) new qv2(cadVar, kkiVarA, dujVar, gii0Var, strN, m1eVar, i1w0VarF, ctf0Var, oclVar, knf0Var, vjpVar, r9uVar).n));
                return;
            }
        }
        jf4.n(b1j.i(qgp.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(701328650, true, new f5o(this, (byte) 17)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
