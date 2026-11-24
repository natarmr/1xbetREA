package a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/h9p0;", "La/yx5;", "<init>", "()V", "a/y2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class h9p0 extends yx5 {
    public final e9o0 K1;
    public final boolean L1;
    public fiu0 M1;
    public ujd N1;
    public wdk0 O1;
    public poq0 P1;
    public final a8z Q1;
    public final a8z R1;
    public final qdz S1;
    public final khf0 U1;
    public static final /* synthetic */ iiy[] W1 = {new ez40(h9p0.class, "params", "getParams()Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;", 0)};
    public static final y2m0 V1 = new y2m0((byte) 14);

    public h9p0() {
        super(R.layout.compose_fragment);
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
        this.L1 = true;
        this.Q1 = xbc.b0(this, sre0.f32672a.b(wbp0.class), new g9p0(this, (byte) 0));
        this.R1 = maz.a(wez.b, new g9p0(this, (byte) 1));
        this.S1 = new qdz();
        this.U1 = new khf0("TEAM_DETAILS_PARAMS");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        sj3.s0(this, "TEAM_DETAILS_DISCIPLINE_DIALOG_RESULT_KEY", new f9p0(this, (byte) 0));
    }

    @Override // a.yx5
    public final void C0() {
        kwi kwiVar = (kwi) this.R1.getValue();
        this.M1 = new fiu0(Collections.singletonMap(wbp0.class, kwiVar.B));
        ujd ujdVarD = kwiVar.o.d();
        x1x.x(ujdVarD);
        this.N1 = ujdVarD;
        this.O1 = kwiVar.A;
        this.P1 = kwiVar.y;
    }

    public final k3t0 G0() {
        return (k3t0) this.Q1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        wdk0 wdk0Var = this.O1;
        if (wdk0Var == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        wdk0.l(wdk0Var, this, this.L1);
        pkd.h(composeView, new owp0(this), null, new ugd(2064933858, true, new l7p0(this, (byte) 1)));
        return composeView;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ujd ujdVar = this.N1;
        if (ujdVar != null) {
            ujdVar.c(this, new ls2(), new f9p0(this, (byte) 1));
        } else {
            Intrinsics.h("composeGameCardFragmentDelegate");
            throw null;
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.L1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
