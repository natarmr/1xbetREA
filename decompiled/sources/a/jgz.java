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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/jgz;", "La/yx5;", "<init>", "()V", "a/tqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jgz extends yx5 {
    public fiu0 K1;
    public wdk0 L1;
    public final khf0 M1;
    public final a8z N1;
    public final a8z O1;
    public final boolean P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(jgz.class, "params", "getParams()Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;", 0)};
    public static final tqt Q1 = new tqt();

    public jgz() {
        super(R.layout.compose_fragment);
        this.M1 = new khf0("params_key");
        this.N1 = maz.a(wez.b, new igz(this, (byte) 0));
        this.O1 = xbc.b0(this, sre0.f32672a.b(eiz.class), new igz(this, (byte) 1));
        this.P1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        sj3.s0(this, "REQUEST_DISCIPLINE_RESULT_KEY", new hgz(this, (byte) 0));
        sj3.s0(this, "REQUEST_TYPE_RESULT_KEY", new hgz(this, (byte) 3));
        sj3.s0(this, "REQUEST_TIME_FILTER_RESULT_KEY", new hgz(this, (byte) 4));
        sj3.s0(this, "REQUEST_TYPE_REGION_RESULT_KEY", new hgz(this, (byte) 5));
        sj3.s0(this, "REQUEST_TEAMS_TYPE_RESULT_KEY", new hgz(this, (byte) 6));
    }

    @Override // a.yx5
    public final void C0() {
        nji njiVar = (nji) this.N1.getValue();
        this.K1 = new fiu0(Collections.singletonMap(eiz.class, njiVar.k));
        this.L1 = njiVar.j;
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        pkd.h(composeView, new owp0(this), null, new ugd(1655441669, true, new g2z(this, (byte) 2)));
        return composeView;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getP1() {
        return this.P1;
    }
}
