package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/k7e0;", "La/yx5;", "<init>", "()V", "a/nh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class k7e0 extends yx5 {
    public final phf0 K1;
    public final r34 L1;
    public final phf0 M1;
    public final s0r N1;
    public j2m0 O1;
    public fiu0 P1;
    public final a8z Q1;
    public final boolean R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(k7e0.class, "stageId", "getStageId()Ljava/lang/String;", 0), new ez40(k7e0.class, "sportId", "getSportId()J", 0), new ez40(k7e0.class, "title", "getTitle()Ljava/lang/String;", 0), new j0d0(k7e0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final nh70 S1 = new nh70();

    public k7e0() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("stage_id_bundle_key");
        this.L1 = new r34("sport_id_bundle_key");
        this.M1 = new phf0("title_bundle_key");
        this.N1 = ltt0.o(this, j7e0.f16037a);
        this.Q1 = xbc.b0(this, sre0.f32672a.b(umo0.class), new p7d0(this, (byte) 19));
        this.R1 = true;
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(m7e0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            m7e0 m7e0Var = (m7e0) (ze3Var instanceof m7e0 ? ze3Var : null);
            if (m7e0Var != null) {
                iiy[] iiyVarArr = U1;
                TypeStageId.Game game = new TypeStageId.Game(this.K1.n(this, iiyVarArr[0]));
                Long lN = this.L1.n(this, iiyVarArr[1]);
                String strN = this.M1.n(this, iiyVarArr[2]);
                i1w0 i1w0VarF = a4n0.f(this);
                strN.getClass();
                i1w0VarF.getClass();
                cad cadVar = m7e0Var.f21316a;
                ugf0 ugf0Var = m7e0Var.k;
                r9u r9uVar = m7e0Var.f;
                pru pruVar = m7e0Var.e;
                gii0 gii0Var = m7e0Var.b;
                m1e m1eVar = m7e0Var.c;
                wyu wyuVar = m7e0Var.d;
                sjl0 sjl0Var = m7e0Var.g;
                l2m0 l2m0Var = m7e0Var.h;
                knf0 knf0Var = m7e0Var.i;
                ctf0 ctf0Var = m7e0Var.j;
                ilp0 ilp0Var = m7e0Var.l;
                ocl oclVar = m7e0Var.m;
                uyu uyuVar = m7e0Var.o;
                pmi0 pmi0Var = m7e0Var.n;
                r9uVar.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                wyuVar.getClass();
                sjl0Var.getClass();
                l2m0Var.getClass();
                knf0Var.getClass();
                ctf0Var.getClass();
                yhi yhiVar = new yhi(cadVar, ugf0Var, ilp0Var, pmi0Var, game, lN, strN, (Long) 0L, i1w0VarF, pruVar, r9uVar, gii0Var, m1eVar, wyuVar, l2m0Var, knf0Var, ctf0Var, oclVar, uyuVar);
                this.O1 = new j2m0();
                iyk iykVar = new iyk(2);
                iykVar.b(ghv.class, (omi) yhiVar.t);
                iykVar.b(umo0.class, (omi) yhiVar.v);
                this.P1 = new fiu0(iykVar.a());
                return;
            }
        }
        jf4.n(b1j.i(m7e0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarC = ((i3t0) G0()).C();
        s9c0 s9c0Var = new s9c0(this, null, (byte) 22);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new g4e0((i89) gmqVarC, clzVarW, s9c0Var, (yje) null, (byte) 0), 3);
    }

    public final k3t0 G0() {
        return (k3t0) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        G0().x(d2m0.f5363a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        G0().x(c2m0.f3632a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.N1.n(U1[3], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(-1775744087, true, new nrc0(this, (byte) 21)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getR1() {
        return this.R1;
    }
}
