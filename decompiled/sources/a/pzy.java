package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/pzy;", "La/yx5;", "<init>", "()V", "a/sqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class pzy extends yx5 {
    public fiu0 K1;
    public final s0r L1;
    public final a8z M1;
    public final phf0 N1;
    public final r34 O1;
    public final boolean P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(pzy.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(pzy.class, "playerId", "getPlayerId()Ljava/lang/String;", 0), new ez40(pzy.class, "sportId", "getSportId()J", 0)};
    public static final sqt Q1 = new sqt();

    public pzy() {
        super(R.layout.compose_fragment);
        this.L1 = ltt0.o(this, ozy.f26120a);
        this.M1 = xbc.b0(this, sre0.f32672a.b(wzy.class), new y2x(this, (byte) 21));
        this.N1 = new phf0("player_id");
        this.O1 = new r34("sport_id");
        this.P1 = true;
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(qzy.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            qzy qzyVar = (qzy) (ze3Var instanceof qzy ? ze3Var : null);
            if (qzyVar != null) {
                iiy[] iiyVarArr = R1;
                String strN = this.N1.n(this, iiyVarArr[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                Long lN = this.O1.n(this, iiyVarArr[2]);
                strN.getClass();
                i1w0VarF.getClass();
                cad cadVar = qzyVar.f29599a;
                duj dujVar = qzyVar.b;
                gii0 gii0Var = qzyVar.c;
                m1e m1eVar = qzyVar.d;
                ocl oclVar = qzyVar.e;
                knf0 knf0Var = qzyVar.f;
                kki kkiVarA = ((daf) qzyVar.g.f30839a).j().a(i1w0VarF);
                r9u r9uVar = qzyVar.h;
                gii0Var.getClass();
                m1eVar.getClass();
                r9uVar.getClass();
                knf0Var.getClass();
                this.K1 = new fiu0(Collections.singletonMap(wzy.class, (tii) new daf(cadVar, kkiVarA, dujVar, gii0Var, strN, m1eVar, i1w0VarF, lN, oclVar, r9uVar, knf0Var).m));
                return;
            }
        }
        jf4.n(b1j.i(qzy.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.L1.n(R1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-745924332, true, new xxv(this, (byte) 25)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getP1() {
        return this.P1;
    }
}
