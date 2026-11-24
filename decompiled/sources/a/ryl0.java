package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ryl0;", "La/yx5;", "<init>", "()V", "a/zie0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ryl0 extends yx5 {
    public fiu0 K1;
    public j2m0 L1;
    public final khf0 M1;
    public final r34 N1;
    public final phf0 O1;
    public final r34 P1;
    public final s0r Q1;
    public final a8z R1;
    public final boolean S1;
    public static final /* synthetic */ iiy[] V1 = {new ez40(ryl0.class, "stageId", "getStageId()Lorg/xplatform/statistic/stage/api/domain/TypeStageId;", 0), new ez40(ryl0.class, "sportId", "getSportId()J", 0), new ez40(ryl0.class, "teamId", "getTeamId()Ljava/lang/String;", 0), new ez40(ryl0.class, "globalChampId", "getGlobalChampId()J", 0), new j0d0(ryl0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final zie0 U1 = new zie0();

    public ryl0() {
        super(R.layout.compose_fragment);
        this.M1 = new khf0("STAGE_ID_BUNDLE_KEY");
        this.N1 = new r34("SPORT_ID_BUNDLE_KEY");
        this.O1 = new phf0("TEAM_ID_BUNDLE_KEY");
        this.P1 = new r34("GLOBAL_CHAMP_ID_BUNDLE_KEY");
        this.Q1 = ltt0.o(this, oyl0.f26063a);
        this.R1 = xbc.b0(this, sre0.f32672a.b(umo0.class), new goi0(this, (byte) 22));
        this.S1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        j2m0 j2m0Var = this.L1;
        if (j2m0Var == null) {
            Intrinsics.h("stageTableDelegate");
            throw null;
        }
        if (bundle != null) {
            j2m0Var.j = bundle.getInt("table_scroll_position", 0);
            j2m0Var.k = bundle.getInt("table_scroll_offset", 0);
            j2m0Var.l = bundle.getInt("shadows_scroll_position", 0);
            j2m0Var.m = bundle.getInt("shadows_scroll_offset", 0);
            j2m0Var.n = false;
        }
        Object objN = this.Q1.n(V1[4], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(1165307620, true, new edk0(this, (byte) 20)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(h2m0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            h2m0 h2m0Var = (h2m0) (ze3Var instanceof h2m0 ? ze3Var : null);
            if (h2m0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = V1;
                this.K1 = h2m0.a(h2m0Var, (TypeStageId) this.M1.n(this, iiyVarArr[0]), this.N1.n(this, iiyVarArr[1]).longValue(), i1w0VarF, this.P1.n(this, iiyVarArr[3]).longValue()).i();
                this.L1 = new j2m0();
                return;
            }
        }
        jf4.n(b1j.i(h2m0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarC = ((i3t0) G0()).C();
        ssl0 ssl0Var = new ssl0(this, (yje) null, (byte) 2);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zol0((i89) gmqVarC, clzVarW, ssl0Var, (yje) null, (byte) 0), 3);
    }

    public final k3t0 G0() {
        return (k3t0) this.R1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void f0(Bundle bundle) {
        j2m0 j2m0Var = this.L1;
        if (j2m0Var == null) {
            Intrinsics.h("stageTableDelegate");
            throw null;
        }
        j2m0Var.e();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("table_scroll_position", j2m0Var.j);
        bundle2.putInt("table_scroll_offset", j2m0Var.k);
        bundle2.putInt("shadows_scroll_position", j2m0Var.l);
        bundle2.putInt("shadows_scroll_offset", j2m0Var.m);
        bundle.putAll(bundle2);
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

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getS1() {
        return this.S1;
    }
}
