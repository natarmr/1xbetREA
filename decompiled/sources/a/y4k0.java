package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.statistic.team.impl.team_statistic.domain.models.TypeParam;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/y4k0;", "La/yx5;", "<init>", "()V", "a/gne0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y4k0 extends yx5 {
    public final boolean K1;
    public final phf0 L1;
    public final r34 M1;
    public final zz2 N1;
    public final zz2 O1;
    public final s0r P1;
    public fiu0 Q1;
    public final a8z R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(y4k0.class, "teamId", "getTeamId()Ljava/lang/String;", 0), new ez40(y4k0.class, "sportId", "getSportId()J", 0), new ez40(y4k0.class, "eventId", "getEventId()I", 0), new ez40(y4k0.class, "teamClId", "getTeamClId()I", 0), new j0d0(y4k0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final gne0 S1 = new gne0((byte) 22);
    public static final String V1 = y4k0.class.getSimpleName();

    public y4k0() {
        super(R.layout.compose_fragment);
        this.K1 = true;
        this.L1 = new phf0("TEAM_ID");
        this.M1 = new r34("SPORT_ID");
        this.N1 = new zz2("EVENT_ID");
        this.O1 = new zz2("TEAM_CL_ID");
        this.P1 = ltt0.o(this, x4k0.f40269a);
        this.R1 = xbc.b0(this, sre0.f32672a.b(k5k0.class), new goi0(this, (byte) 7));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(zrp0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            zrp0 zrp0Var = (zrp0) (ze3Var instanceof zrp0 ? ze3Var : null);
            if (zrp0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = U1;
                this.Q1 = zrp0Var.a(i1w0VarF, new TypeParam.Team(this.L1.n(this, iiyVarArr[0])), this.M1.n(this, iiyVarArr[1]).longValue(), V1, this.N1.n(this, iiyVarArr[2]).intValue(), this.O1.n(this, iiyVarArr[3]).intValue()).e();
                return;
            }
        }
        jf4.n(b1j.i(zrp0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        Object objN = this.P1.n(U1[4], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(-1621809626, true, new uph0(this, (byte) 28)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.K1;
    }
}
