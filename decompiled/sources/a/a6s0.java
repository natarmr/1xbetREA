package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/a6s0;", "La/yx5;", "<init>", "()V", "a/j6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class a6s0 extends yx5 {
    public final s0r K1;
    public fiu0 L1;
    public ii M1;
    public final r34 N1;
    public final phf0 O1;
    public final r34 P1;
    public final boolean Q1;
    public final a8z R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(a6s0.class, "viewBinding", "getViewBinding()Lorg/xplatform/aggregator/impl/databinding/AggregatorTournamentStagePrizesFragmentBinding;", 0), new ez40(a6s0.class, "tournamentId", "getTournamentId()J", 0), new ez40(a6s0.class, "tournamentTitle", "getTournamentTitle()Ljava/lang/String;", 0), new ez40(a6s0.class, "stageTournamentID", "getStageTournamentID()J", 0)};
    public static final j6m0 S1 = new j6m0((byte) 26);

    public a6s0() {
        super(R.layout.aggregator_tournament_stage_prizes_fragment);
        this.K1 = ltt0.o(this, z5s0.f43835a);
        this.N1 = new r34("PRIZE_TOURNAMENT_ITEM");
        this.O1 = new phf0("PRIZE_TOURNAMENT_TITLE");
        this.P1 = new r34("PRIZE_STAGE_TOURNAMENT_ID");
        this.Q1 = true;
        this.R1 = xbc.b0(this, sre0.f32672a.b(n6s0.class), new qir0(this, (byte) 11));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(U1[0], this);
        objN.getClass();
        pkd.h(((yw1) objN).b, new owp0(K()), null, new ugd(-177189762, true, new iob0((Object) this, (byte) 12)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(p3s0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            p3s0 p3s0Var = (p3s0) (ze3Var instanceof p3s0 ? ze3Var : null);
            if (p3s0Var != null) {
                iiy[] iiyVarArr = U1;
                cr crVarA = p3s0Var.a(this.N1.n(this, iiyVarArr[1]).longValue(), this.O1.n(this, iiyVarArr[2]));
                this.L1 = crVarA.i();
                this.M1 = (ii) crVarA.p;
                return;
            }
        }
        jf4.n(b1j.i(p3s0.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.R1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        G0().x(new t5s0(this.P1.n(this, U1[3]).longValue()));
        n0().r().u0("REQUEST_KEY_TOURNAMENT_ACTION", K(), new b0l0(this, (byte) 23));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.Q1;
    }
}
