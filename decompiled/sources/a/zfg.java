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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/zfg;", "La/yx5;", "<init>", "()V", "a/kud", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zfg extends yx5 {
    public final e9o0 K1;
    public fiu0 L1;
    public wdk0 M1;
    public final boolean N1;
    public final khf0 O1;
    public final a8z P1;
    public final a8z Q1;
    public final qdz R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(zfg.class, "params", "getParams()Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;", 0)};
    public static final kud S1 = new kud();

    public zfg() {
        super(R.layout.compose_fragment);
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
        this.N1 = true;
        this.O1 = new khf0("params");
        this.P1 = xbc.b0(this, sre0.f32672a.b(igg.class), new xfg(this, (byte) 0));
        this.Q1 = maz.a(wez.b, new xfg(this, (byte) 1));
        this.R1 = new qdz();
    }

    @Override // a.yx5
    public final void C0() {
        gei geiVar = (gei) this.Q1.getValue();
        this.L1 = new fiu0(Collections.singletonMap(igg.class, geiVar.q));
        this.M1 = geiVar.p;
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        pkd.h(composeView, new owp0(this), null, new ugd(-47183021, true, new yfg(this, (byte) 0)));
        return composeView;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getQ1() {
        return this.N1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
