package a;

import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/uy80;", "La/yx5;", "<init>", "()V", "a/jh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class uy80 extends yx5 {
    public fiu0 K1;
    public wdk0 L1;
    public poq0 M1;
    public final boolean N1;
    public final a8z O1;
    public final qdz P1;
    public final phf0 Q1;
    public final r34 R1;
    public final cgx0 S1;
    public final s0r U1;
    public final a8z V1;
    public static final /* synthetic */ iiy[] X1 = {new ez40(uy80.class, "selectedTeamName", "getSelectedTeamName()Ljava/lang/String;", 0), new ez40(uy80.class, "selectedFeedId", "getSelectedFeedId()J", 0), new ez40(uy80.class, "fromDeepLink", "getFromDeepLink()Z", 0), new j0d0(uy80.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final jh70 W1 = new jh70();

    public uy80() {
        super(R.layout.compose_fragment);
        this.N1 = true;
        this.O1 = xbc.b0(this, sre0.f32672a.b(gz80.class), new sy80(this, (byte) 0));
        this.P1 = new qdz();
        this.Q1 = new phf0("selected_team_name");
        this.R1 = new r34("selected_feed_id");
        this.S1 = new cgx0("from_deep_link");
        this.U1 = ltt0.o(this, ty80.f34741a);
        this.V1 = maz.a(wez.b, new sy80(this, (byte) 1));
    }

    @Override // a.yx5
    public final void C0() {
        hni hniVar = (hni) this.V1.getValue();
        this.K1 = new fiu0(Collections.singletonMap(gz80.class, hniVar.z));
        this.L1 = hniVar.y;
        this.M1 = hniVar.t;
    }

    @Override // a.yx5
    public final void D0() {
        Object objN = this.U1.n(X1[3], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(-938822697, true, new ds60(this, (byte) 20)));
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.N1;
    }
}
