package a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/sap0;", "La/yx5;", "<init>", "()V", "a/j6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class sap0 extends yx5 {
    public final boolean K1;
    public fiu0 L1;
    public wdk0 M1;
    public final a8z N1;
    public final a8z O1;
    public final qdz P1;
    public final khf0 Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(sap0.class, "params", "getParams()Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsResultsParams;", 0)};
    public static final j6m0 R1 = new j6m0((byte) 14);

    public sap0() {
        super(R.layout.compose_fragment);
        this.K1 = true;
        this.N1 = xbc.b0(this, sre0.f32672a.b(zap0.class), new rap0(this, (byte) 0));
        this.O1 = maz.a(wez.b, new rap0(this, (byte) 1));
        this.P1 = new qdz();
        this.Q1 = new khf0("TEAM_DETAILS_RESULTS_PARAMS");
    }

    @Override // a.yx5
    public final void C0() {
        lwi lwiVar = (lwi) this.O1.getValue();
        this.L1 = new fiu0(Collections.singletonMap(zap0.class, lwiVar.o));
        this.M1 = lwiVar.n;
    }

    public final k3t0 G0() {
        return (k3t0) this.N1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        h97.t(composeView, new owp0(this), new ugd(-642809813, true, new l7p0(this, (byte) 2)));
        return composeView;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.K1;
    }
}
