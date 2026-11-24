package a;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/i0p0;", "La/yx5;", "<init>", "()V", "a/j6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class i0p0 extends yx5 {
    public final boolean K1;
    public final a8z L1;
    public final khf0 M1;
    public final s0r N1;
    public final n0o0 O1;
    public dwi P1;
    public ewi Q1;
    public fwi R1;
    public ujd S1;
    public ii U1;
    public wdk0 V1;
    public final a8z W1;
    public final a8z X1;
    public final a8z Y1;
    public static final /* synthetic */ iiy[] a2 = {new ez40(i0p0.class, "params", "getParams()Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;", 0), new j0d0(i0p0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final j6m0 Z1 = new j6m0((byte) 13);

    public i0p0() {
        super(R.layout.compose_fragment);
        this.K1 = true;
        this.L1 = maz.a(wez.b, new fno0((byte) 8));
        this.M1 = new khf0("TEAM_BET_PARAMS_KEY");
        this.N1 = ltt0.o(this, h0p0.f12246a);
        this.O1 = maz.b(new d0p0(this, (byte) 1));
        tre0 tre0Var = sre0.f32672a;
        this.W1 = xbc.a0(this, tre0Var.b(pyo0.class), null, new d0p0(this, (byte) 2), 14);
        this.X1 = xbc.a0(this, tre0Var.b(b0p0.class), null, new d0p0(this, (byte) 3), 14);
        this.Y1 = xbc.a0(this, tre0Var.b(i3p0.class), null, new d0p0(this, (byte) 4), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new d0p0(this, (byte) 0));
        ccq0.V(this, "REQUEST_COUPON_EVENT", new d0p0(this, (byte) 5));
        Object objN = this.N1.n(a2[1], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(-1035817829, true, new abn0(this, (byte) 25)));
    }

    @Override // a.yx5
    public final void C0() {
        gwi gwiVar = (gwi) this.O1.getValue();
        this.P1 = (dwi) gwiVar.E.get();
        this.Q1 = (ewi) gwiVar.F.get();
        this.R1 = (fwi) gwiVar.H.get();
        ujd ujdVarD = gwiVar.s.d();
        x1x.x(ujdVarD);
        this.S1 = ujdVarD;
        this.U1 = gwiVar.C;
        this.V1 = gwiVar.D;
    }

    public final void G0(e2d e2dVar, fet fetVar, int i) {
        int i2;
        e2d e2dVar2;
        i0p0 i0p0Var = this;
        fetVar.g0(-440040802);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(e2dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(i0p0Var) ? 32 : 16;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            k3t0 k3t0VarI0 = i0p0Var.I0();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            boolean zI = fetVar.i(i0p0Var);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                Object tfo0Var = new tfo0(1, i0p0Var, i0p0.class, "handleEventsSideEffect", "handleEventsSideEffect(Lorg/xplatform/favorites/impl/presentation/teambet/presentation/events/models/TeamBetEventsSideEffect;)V", 0, (byte) 28);
                fetVar.o0(tfo0Var);
                objP2 = tfo0Var;
            }
            Function1 function1 = (Function1) ((jhy) objP2);
            Unit unit = Unit.f46060a;
            boolean zI2 = fetVar.i(vneVar) | fetVar.i(k3t0VarI0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == obj) {
                objP3 = new ggc0(vneVar, k3t0VarI0, function1, (byte) 12);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            pz40 pz40VarY = ((i3t0) i0p0Var.I0()).y(fetVar);
            n0q n0qVar = o7k0.c;
            bdz bdzVar = (bdz) i0p0Var.L1.getValue();
            Object objI0 = i0p0Var.I0();
            boolean zI3 = fetVar.i(objI0);
            Object objP4 = fetVar.P();
            if (zI3 || objP4 == obj) {
                Object tfo0Var2 = new tfo0(1, objI0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 29);
                fetVar.o0(tfo0Var2);
                objP4 = tfo0Var2;
            }
            e2dVar2 = e2dVar;
            cy2.s(n0qVar, bdzVar, e2dVar2, pz40VarY, (Function1) ((jhy) objP4), fetVar, ((i3 << 6) & 896) | 6);
        } else {
            i0p0Var = i0p0Var;
            e2dVar2 = e2dVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0p0(i0p0Var, e2dVar2, i, (byte) 1);
        }
    }

    public final void H0(e2d e2dVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(983617177);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(e2dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(this) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            a8z a8zVar = this.Y1;
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
            int i3 = i2;
            n0q n0qVar = o7k0.c;
            bdz bdzVar = (bdz) this.L1.getValue();
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            boolean zI = fetVar.i(k3t0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new g0p0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 0);
                fetVar.o0(objP);
            }
            dwi0.C(n0qVar, bdzVar, e2dVar, pz40VarY, (Function1) ((jhy) objP), fetVar, ((i3 << 6) & 896) | 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0p0(this, e2dVar, i, (byte) 0);
        }
    }

    public final k3t0 I0() {
        return (k3t0) this.X1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ujd ujdVar = this.S1;
        if (ujdVar == null) {
            Intrinsics.h("gameCardFragmentDelegate");
            throw null;
        }
        ujdVar.c(this, new cq2(), new ttn0(this, (byte) 18));
        wdk0 wdk0Var = this.V1;
        if (wdk0Var != null) {
            wdk0.l(wdk0Var, this, this.K1);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        if (this.V1 == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        vcc.C(this, "request_key_notification_updated");
        this.j1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getQ1() {
        return this.K1;
    }
}
