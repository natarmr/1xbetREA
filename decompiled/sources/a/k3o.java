package a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/k3o;", "La/yx5;", "<init>", "()V", "a/nek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class k3o extends yx5 {
    public zfi K1;
    public ujd L1;
    public wdk0 M1;
    public final boolean N1;
    public final a8z O1;
    public final khf0 P1;
    public final a8z Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(k3o.class, "params", "getParams()Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;", 0)};
    public static final nek R1 = new nek();

    public k3o() {
        super(R.layout.compose_fragment);
        this.N1 = true;
        this.O1 = xbc.a0(this, sre0.f32672a.b(d4o.class), null, new i3o(this, (byte) 0), 14);
        this.P1 = new khf0("params_key");
        this.Q1 = maz.a(wez.b, new i3o(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new i3o(this, (byte) 2));
        sj3.s0(this, "REQUEST_TIME_FILTER", new j3o(this, (byte) 1));
        wdk0 wdk0Var = this.M1;
        if (wdk0Var != null) {
            wdk0.l(wdk0Var, this, this.N1);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // a.yx5
    public final void C0() {
        agi agiVar = (agi) this.Q1.getValue();
        this.K1 = (zfi) agiVar.y.get();
        ujd ujdVarD = agiVar.q.d();
        x1x.x(ujdVarD);
        this.L1 = ujdVarD;
        this.M1 = agiVar.v;
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        pkd.h(composeView, new owp0(this), null, new ugd(1310044435, true, new mxm(this, (byte) 28)));
        return composeView;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ujd ujdVar = this.L1;
        if (ujdVar != null) {
            ujdVar.c(this, new cr2(), new j3o(this, (byte) 0));
        } else {
            Intrinsics.h("gameCardFragmentDelegate");
            throw null;
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.N1;
    }
}
