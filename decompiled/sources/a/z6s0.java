package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Pair;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/z6s0;", "La/yx5;", "<init>", "()V", "a/m6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class z6s0 extends yx5 {
    public final s0r K1;
    public fiu0 L1;
    public ii M1;
    public final r34 N1;
    public final phf0 O1;
    public final phf0 P1;
    public final boolean Q1;
    public final a8z R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(z6s0.class, "viewBinding", "getViewBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentTournamentStagesBinding;", 0), new ez40(z6s0.class, "tournamentId", "getTournamentId()J", 0), new ez40(z6s0.class, "tournamentTitle", "getTournamentTitle()Ljava/lang/String;", 0), new ez40(z6s0.class, "tournamentType", "getTournamentType()Ljava/lang/String;", 0)};
    public static final m6m0 S1 = new m6m0((byte) 26);

    public z6s0() {
        super(R.layout.fragment_tournament_stages);
        this.K1 = ltt0.o(this, y6s0.f42115a);
        this.N1 = new r34("STAGE_TOURNAMENT_ITEM");
        this.O1 = new phf0("STAGE_TOURNAMENT_TITLE");
        this.P1 = new phf0("TOURNAMENT_TYPE");
        this.Q1 = true;
        this.R1 = xbc.b0(this, sre0.f32672a.b(l7s0.class), new w6s0(this, (byte) 0));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(U1[0], this);
        objN.getClass();
        pkd.h(((f6r) objN).b, new owp0(K()), null, new ugd(-567135281, true, new iob0((Object) this, (byte) 13)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(v6s0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            v6s0 v6s0Var = (v6s0) (ze3Var instanceof v6s0 ? ze3Var : null);
            if (v6s0Var != null) {
                iiy[] iiyVarArr = U1;
                crm0 crm0Var = new crm0(this.N1.n(this, iiyVarArr[1]).longValue(), this.O1.n(this, iiyVarArr[2]), this.P1.n(this, iiyVarArr[3]));
                ehf0 ehf0Var = v6s0Var.f36891a;
                cad cadVar = v6s0Var.b;
                s91 s91Var = v6s0Var.c;
                oeg0 oeg0Var = v6s0Var.d;
                ctf0 ctf0Var = v6s0Var.e;
                qu quVar = v6s0Var.f;
                zr1 zr1Var = v6s0Var.g;
                r2v r2vVar = v6s0Var.h;
                ytt yttVar = v6s0Var.i;
                bzt bztVar = v6s0Var.j;
                ii iiVar = v6s0Var.k;
                wiu wiuVar = v6s0Var.l;
                s91Var.getClass();
                oeg0Var.getClass();
                ctf0Var.getClass();
                iiVar.getClass();
                this.L1 = new fiu0(Collections.singletonMap(l7s0.class, (yxi) new qv2(cadVar, ehf0Var, crm0Var, s91Var, oeg0Var, ctf0Var, quVar, zr1Var, r2vVar, yttVar, bztVar, iiVar, wiuVar).n));
                this.M1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(v6s0.class, "Cannot create dependency "));
    }

    public final void G0(s9s0 s9s0Var) {
        n0().r().t0(i120.V(new Pair("STAGE_TOURNAMENT_PAGE_ITEM", s9s0Var)), "REQUEST_KEY_CLOSE_OTHER_TOURNAMENTS_FRAGMENTS");
        ((k3t0) this.R1.getValue()).x(q6s0.f28217a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        n0().r().u0("REQUEST_KEY_TOURNAMENT_ACTION", K(), new b0l0(this, (byte) 24));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getW1() {
        return this.Q1;
    }
}
