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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/m7p0;", "La/yx5;", "<init>", "()V", "a/s9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class m7p0 extends yx5 {
    public fiu0 K1;
    public final boolean L1;
    public final a8z M1;
    public final a8z N1;
    public final khf0 O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(m7p0.class, "params", "getParams()Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsAchievementParams;", 0)};
    public static final s9m0 P1 = new s9m0();

    public m7p0() {
        super(R.layout.compose_fragment);
        this.L1 = true;
        this.M1 = xbc.b0(this, sre0.f32672a.b(t7p0.class), new k7p0(this, (byte) 0));
        this.N1 = maz.a(wez.b, new k7p0(this, (byte) 1));
        this.O1 = new khf0("TEAM_DETAILS_ACHIEVEMENT_PARAMS");
    }

    @Override // a.yx5
    public final void C0() {
        this.K1 = new fiu0(Collections.singletonMap(t7p0.class, ((jwi) this.N1.getValue()).h));
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        pkd.h(composeView, new owp0(this), null, new ugd(-1239373277, true, new l7p0(this, (byte) 0)));
        return composeView;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.L1;
    }
}
