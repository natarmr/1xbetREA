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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/xm;", "La/yx5;", "<init>", "()V", "a/jdk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xm extends yx5 {
    public fiu0 K1;
    public final boolean L1;
    public final a8z M1;
    public final a8z N1;
    public final khf0 O1;
    public final qdz P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(xm.class, "params", "getParams()Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;", 0)};
    public static final jdk0 Q1 = new jdk0();

    public xm() {
        super(R.layout.compose_fragment);
        this.L1 = true;
        this.M1 = maz.a(wez.b, new wm(this, (byte) 0));
        this.N1 = xbc.b0(this, sre0.f32672a.b(qn.class), new wm(this, (byte) 1));
        this.O1 = new khf0("ACTIVE_TEAMS_LIST_PARAMS");
        this.P1 = new qdz();
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new wm(this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        this.K1 = new fiu0(Collections.singletonMap(qn.class, ((w5i) this.M1.getValue()).j));
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        pkd.h(composeView, new owp0(this), null, new ugd(1107260996, true, new iob0((Object) this, (byte) 27)));
        return composeView;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.L1;
    }
}
