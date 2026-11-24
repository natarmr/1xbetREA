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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/lb40;", "La/yx5;", "<init>", "()V", "a/htz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lb40 extends yx5 {
    public fiu0 K1;
    public final a8z L1;
    public final a8z M1;
    public final boolean N1;
    public final khf0 O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(lb40.class, "params", "getParams()Lorg/xplatform/cyber/section/api/meta_heroes/presentation/MetaHeroesParams;", 0)};
    public static final htz P1 = new htz();

    public lb40() {
        super(R.layout.compose_fragment);
        this.L1 = maz.a(wez.b, new ib40(this, (byte) 0));
        this.M1 = xbc.b0(this, sre0.f32672a.b(bd40.class), new ib40(this, (byte) 1));
        this.N1 = true;
        this.O1 = new khf0("META_HEROES_PARAMS");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        sj3.s0(this, "REQUEST_ROLE_RESULT_KEY", new jb40(this, (byte) 0));
    }

    @Override // a.yx5
    public final void C0() {
        this.K1 = new fiu0(Collections.singletonMap(bd40.class, ((sli) this.L1.getValue()).q));
    }

    public final k3t0 G0() {
        return (k3t0) this.M1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        pkd.h(composeView, new owp0(this), null, new ugd(-1445343753, true, new b120(this, (byte) 28)));
        return composeView;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.N1;
    }
}
