package a;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/crk;", "La/yx5;", "<init>", "()V", "a/xak", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class crk extends yx5 {
    public qei K1;
    public ujd L1;
    public pru M1;
    public wdk0 N1;
    public final boolean O1;
    public final khf0 P1;
    public final n0o0 Q1;
    public final a8z R1;
    public final a8z S1;
    public final s0r U1;
    public final qdz V1;
    public static final /* synthetic */ iiy[] X1 = {new ez40(crk.class, "params", "getParams()Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;", 0), new j0d0(crk.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final xak W1 = new xak((byte) 2);

    public crk() {
        super(R.layout.compose_fragment);
        this.O1 = true;
        this.P1 = new khf0("params_key");
        this.Q1 = maz.b(new yqk(this, (byte) 1));
        this.R1 = maz.a(wez.b, new yqk(this, (byte) 2));
        this.S1 = xbc.a0(this, sre0.f32672a.b(atk.class), null, new yqk(this, (byte) 3), 14);
        this.U1 = ltt0.o(this, ark.f1349a);
        this.V1 = new qdz();
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new yqk(this, (byte) 0));
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
        rei reiVar = (rei) this.R1.getValue();
        this.K1 = (qei) reiVar.G.get();
        ujd ujdVarD = reiVar.u.d();
        x1x.x(ujdVarD);
        this.L1 = ujdVarD;
        this.M1 = reiVar.m;
        this.N1 = reiVar.E;
    }

    @Override // a.yx5
    public final void D0() {
        Object objN = this.U1.n(X1[1], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(-1147078224, true, new yfg(this, (byte) 27)));
    }

    public final k3t0 G0() {
        return (k3t0) this.S1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ujd ujdVar = this.L1;
        if (ujdVar != null) {
            ujdVar.c(this, new ls2(), new zqk(this, (byte) 0));
        } else {
            Intrinsics.h("composeGameCardFragmentDelegate");
            throw null;
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return new e9o0(((n2o) this.Q1.getValue()) == n2o.HEADER_FOCUS ? R.attr.uikitBackground : R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
    }
}
