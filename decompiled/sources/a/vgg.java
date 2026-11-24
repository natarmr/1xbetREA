package a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/vgg;", "La/yx5;", "<init>", "()V", "a/qud", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vgg extends yx5 {
    public ib50 K1;
    public cog L1;
    public final khf0 M1;
    public final a8z N1;
    public final kiu0 O1;
    public final boolean P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(vgg.class, "params", "getParams()Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;", 0)};
    public static final qud Q1 = new qud();

    public vgg() {
        super(R.layout.compose_fragment);
        this.M1 = new khf0("params_key");
        tgg tggVar = new tgg(this, (byte) 1);
        wez wezVar = wez.b;
        this.N1 = maz.a(wezVar, tggVar);
        tgg tggVar2 = new tgg(this, (byte) 2);
        a8z a8zVarA = maz.a(wezVar, new q7g(new q7g(this, (byte) 12), (byte) 13));
        this.O1 = agc.G(this, sre0.f32672a.b(aig.class), new r7g(a8zVarA, (byte) 12), new r7g(a8zVarA, (byte) 13), tggVar2);
        this.P1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new tgg(this, (byte) 0));
    }

    @Override // a.yx5
    public final void C0() {
        iei ieiVar = (iei) this.N1.getValue();
        this.K1 = ieiVar.f14634a;
        this.L1 = (cog) ieiVar.g.get();
        sj3.s0(this, "REQUEST_CHAMPS_TIME_FILTER_RESULT_KEY", new ugg(this, (byte) 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        h97.t(composeView, new owp0(this), new ugd(-1248230379, true, new sgg(this, (byte) 0)));
        return composeView;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.P1;
    }
}
