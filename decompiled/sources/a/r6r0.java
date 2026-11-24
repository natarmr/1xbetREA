package a;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/r6r0;", "La/yx5;", "<init>", "()V", "a/s2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class r6r0 extends yx5 {
    public pxi K1;
    public ujd L1;
    public wdk0 M1;
    public final yzn0 N1;
    public final a8z O1;
    public final s0r P1;
    public final a8z Q1;
    public final boolean R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(r6r0.class, "screenType", "getScreenType()Lorg/xplatform/feed/presentation/models/TopGamesScreenType;", 0), new j0d0(r6r0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final s2m0 S1 = new s2m0();

    public r6r0() {
        super(R.layout.compose_fragment);
        this.N1 = new yzn0("SCREEN_TYPE_KEY");
        this.O1 = maz.a(wez.b, new o6r0(this, (byte) 0));
        this.P1 = ltt0.o(this, q6r0.f28215a);
        this.Q1 = xbc.a0(this, sre0.f32672a.b(g7r0.class), null, new o6r0(this, (byte) 1), 14);
        this.R1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ujd ujdVar = this.L1;
        if (ujdVar == null) {
            Intrinsics.h("composeGameCardFragmentDelegate");
            throw null;
        }
        ujdVar.c(this, new fs2(), new nop0((Object) this, (byte) 26));
        qcc.X(this, new o6r0(this, (byte) 2));
        Object objN = this.P1.n(U1[1], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(-495474174, true, new p6r0(this, (byte) 0)));
    }

    @Override // a.yx5
    public final void C0() {
        qxi qxiVar = (qxi) this.O1.getValue();
        this.K1 = (pxi) qxiVar.s.get();
        ujd ujdVarD = qxiVar.j.d();
        x1x.x(ujdVarD);
        this.L1 = ujdVarD;
        this.M1 = qxiVar.r;
    }

    public final k3t0 G0() {
        return (k3t0) this.Q1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        hxm0.m(q0());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(q0());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        wdk0 wdk0Var = this.M1;
        if (wdk0Var != null) {
            wdk0.l(wdk0Var, this, this.R1);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        if (this.M1 == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        vcc.C(this, "request_key_notification_updated");
        this.j1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.R1;
    }
}
