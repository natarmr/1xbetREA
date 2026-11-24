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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/afg;", "La/yx5;", "<init>", "()V", "a/std", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class afg extends yx5 {
    public final e9o0 K1;
    public cei L1;
    public ujd M1;
    public final boolean N1;
    public final khf0 O1;
    public final a8z P1;
    public final a8z Q1;
    public final qdz R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(afg.class, "params", "getParams()Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;", 0)};
    public static final std S1 = new std();

    public afg() {
        super(R.layout.compose_fragment);
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
        this.N1 = true;
        this.O1 = new khf0("params");
        this.P1 = xbc.a0(this, sre0.f32672a.b(jfg.class), null, new zeg(this, (byte) 0), 14);
        this.Q1 = maz.a(wez.b, new zeg(this, (byte) 1));
        this.R1 = new qdz();
    }

    @Override // a.yx5
    public final void C0() {
        dei deiVar = (dei) this.Q1.getValue();
        this.L1 = (cei) deiVar.n.get();
        ujd ujdVarD = deiVar.i.d();
        x1x.x(ujdVarD);
        this.M1 = ujdVarD;
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        pkd.h(composeView, new owp0(this), null, new ugd(-893531170, true, new cnc(this, (byte) 29)));
        return composeView;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ujd ujdVar = this.M1;
        if (ujdVar != null) {
            ujdVar.c(this, new ls2(), new yeg(this, (byte) 0));
        } else {
            Intrinsics.h("composeGameCardFragmentDelegate");
            throw null;
        }
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
