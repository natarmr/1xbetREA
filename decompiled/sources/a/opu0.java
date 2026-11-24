package a;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/opu0;", "La/yx5;", "<init>", "()V", "a/uxs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class opu0 extends yx5 {
    public final e9o0 K1;
    public dzi L1;
    public ujd M1;
    public wdk0 N1;
    public final boolean O1;
    public final khf0 P1;
    public final a8z Q1;
    public final a8z R1;
    public final s0r S1;
    public final qdz U1;
    public final d930 V1;
    public static final /* synthetic */ iiy[] X1 = {new ez40(opu0.class, "params", "getParams()Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;", 0), new j0d0(opu0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final uxs0 W1 = new uxs0((byte) 9);

    public opu0() {
        super(R.layout.compose_fragment);
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
        this.O1 = true;
        this.P1 = new khf0("params_key");
        this.Q1 = maz.a(wez.b, new kpu0(this, (byte) 1));
        this.R1 = xbc.a0(this, sre0.f32672a.b(dqu0.class), null, new kpu0(this, (byte) 2), 14);
        this.S1 = ltt0.o(this, mpu0.f22195a);
        this.U1 = new qdz();
        this.V1 = new d930((byte) 1);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new kpu0(this, (byte) 0));
        wdk0 wdk0Var = this.N1;
        if (wdk0Var != null) {
            wdk0.l(wdk0Var, this, this.O1);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // a.yx5
    public final void C0() {
        ezi eziVar = (ezi) this.Q1.getValue();
        this.L1 = (dzi) eziVar.B.get();
        ujd ujdVarD = eziVar.q.d();
        x1x.x(ujdVarD);
        this.M1 = ujdVarD;
        this.N1 = eziVar.A;
    }

    @Override // a.yx5
    public final void D0() {
        Object objN = this.S1.n(X1[1], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(1950684753, true, new ggt0(this, (byte) 9)));
    }

    public final k3t0 G0() {
        return (k3t0) this.R1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ujd ujdVar = this.M1;
        if (ujdVar != null) {
            ujdVar.c(this, new ls2(), new lpu0(this, (byte) 0));
        } else {
            Intrinsics.h("composeGameCardFragmentDelegate");
            throw null;
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getQ1() {
        return this.O1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
