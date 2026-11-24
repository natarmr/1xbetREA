package a;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ef2;", "La/yx5;", "<init>", "()V", "a/hfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ef2 extends yx5 {
    public final a8z K1;
    public final v62 L1;
    public final a8z M1;
    public final a8z N1;
    public final n0o0 O1;
    public final s0r P1;
    public final a8z Q1;
    public final a8z R1;
    public final a8z S1;
    public final a8z U1;
    public static final /* synthetic */ iiy[] W1 = {new j0d0(ef2.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final hfk0 V1 = new hfk0((byte) 20);

    public ef2() {
        super(R.layout.compose_fragment);
        t32 t32Var = new t32((byte) 6);
        wez wezVar = wez.b;
        this.K1 = maz.a(wezVar, t32Var);
        this.L1 = new v62(this, (byte) 3);
        this.M1 = maz.a(wezVar, new af2(this, (byte) 6));
        this.N1 = maz.a(wezVar, new af2(this, (byte) 7));
        this.O1 = maz.b(new af2(this, (byte) 8));
        this.P1 = ltt0.o(this, cf2.f4238a);
        tre0 tre0Var = sre0.f32672a;
        this.Q1 = xbc.a0(this, tre0Var.b(of2.class), null, new af2(this, (byte) 9), 14);
        this.R1 = xbc.a0(this, tre0Var.b(k4g0.class), null, new af2(this, (byte) 10), 14);
        this.S1 = xbc.a0(this, tre0Var.b(hd2.class), null, new af2(this, (byte) 11), 14);
        this.U1 = xbc.a0(this, tre0Var.b(zb2.class), null, new af2(this, (byte) 12), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        n0().k().a(K(), this.L1);
        Object objN = this.P1.n(W1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(1564160303, true, new fa2((Object) this, (byte) 4)));
        sj3.s0(this, "SELECT_DATE_TIME_REQUEST_KEY", new m51(this, (byte) 18));
    }

    public final void G0(e2d e2dVar, fet fetVar, int i) {
        int i2;
        e2d e2dVar2 = e2dVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(1507083704);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(e2dVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.i(this) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            boolean zI = fetVar2.i(this);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new af2(this, b);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar2.i(this);
            Object objP2 = fetVar2.P();
            byte b2 = 3;
            if (zI2 || objP2 == cl5Var) {
                objP2 = new af2(this, b2);
                fetVar2.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar2, 0, 4);
            fetVar2 = fetVar2;
            pz40 pz40VarY = ((i3t0) J0()).y(fetVar2);
            qdz qdzVar = (qdz) this.K1.getValue();
            k3t0 k3t0VarJ0 = J0();
            boolean zI3 = fetVar2.i(k3t0VarJ0);
            Object objP3 = fetVar2.P();
            if (zI3 || objP3 == cl5Var) {
                ln1 ln1Var = new ln1(1, k3t0VarJ0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                fetVar2.o0(ln1Var);
                objP3 = ln1Var;
            }
            Function1 function1 = (Function1) ((jhy) objP3);
            int i3 = (i2 << 9) & 7168;
            pz40VarY.getClass();
            qdzVar.getClass();
            function1.getClass();
            ic2 ic2Var = (ic2) pz40VarY.getValue();
            if (ic2Var != null) {
                boolean z = ic2Var instanceof ec2;
                jm40 jm40Var = jm40.b;
                if (z) {
                    fetVar2.e0(452102141);
                    ec2 ec2Var = (ec2) ic2Var;
                    tke.C(jm40Var, ec2Var.f7545a, ec2Var.b, qdzVar, e2dVar2, function1, fetVar2, (i3 << 3) & 57344);
                    fetVar2.r(false);
                    e2dVar2 = e2dVar;
                } else if (ic2Var instanceof fc2) {
                    fetVar2.e0(452515836);
                    fc2 fc2Var = (fc2) ic2Var;
                    e2dVar2 = e2dVar;
                    hp4.n(jm40Var, fc2Var.f9288a, fc2Var.b, qdzVar, e2dVar2, function1, fetVar2, (i3 << 3) & 57344);
                    fetVar2.r(false);
                } else if (ic2Var instanceof gc2) {
                    fetVar2.e0(452931515);
                    gc2 gc2Var = (gc2) ic2Var;
                    e2dVar2 = e2dVar;
                    jd8.I(jm40Var, gc2Var.f11038a, gc2Var.b, qdzVar, e2dVar2, function1, fetVar2, (i3 << 3) & 57344);
                    fetVar2.r(false);
                } else if (ic2Var instanceof hc2) {
                    fetVar2.e0(453345086);
                    hc2 hc2Var = (hc2) ic2Var;
                    e2dVar2 = e2dVar;
                    kc5.z0(jm40Var, hc2Var.f12798a, hc2Var.b, qdzVar, e2dVar2, function1, fetVar2, (i3 << 3) & 57344);
                    fetVar2.r(false);
                }
            }
            throw b1j.f(1122960817, fetVar2, false);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bf2(this, e2dVar2, i, (byte) 0);
        }
    }

    public final void H0(e2d e2dVar, fet fetVar, int i) {
        int i2;
        e2d e2dVar2 = e2dVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-734810428);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(e2dVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.i(this) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            boolean zI = fetVar2.i(this);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new af2(this, b);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar2.i(this);
            Object objP2 = fetVar2.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new af2(this, (byte) 5);
                fetVar2.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar2, 0, 4);
            fetVar2 = fetVar2;
            pz40 pz40VarY = ((i3t0) K0()).y(fetVar2);
            qdz qdzVar = (qdz) this.K1.getValue();
            k3t0 k3t0VarK0 = K0();
            boolean zI3 = fetVar2.i(k3t0VarK0);
            Object objP3 = fetVar2.P();
            if (zI3 || objP3 == cl5Var) {
                objP3 = new ln1(1, k3t0VarK0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                fetVar2.o0(objP3);
            }
            Function1 function1 = (Function1) ((jhy) objP3);
            int i3 = (i2 << 9) & 7168;
            pz40VarY.getClass();
            qdzVar.getClass();
            function1.getClass();
            fd2 fd2Var = (fd2) pz40VarY.getValue();
            if (fd2Var != null) {
                boolean z = fd2Var instanceof bd2;
                jm40 jm40Var = jm40.b;
                if (z) {
                    fetVar2.e0(862508064);
                    bd2 bd2Var = (bd2) fd2Var;
                    x8f.D(jm40Var, bd2Var.f2379a, bd2Var.b, qdzVar, e2dVar2, function1, fetVar2, 57344 & (i3 << 3));
                    fetVar2.r(false);
                    e2dVar2 = e2dVar;
                } else if (fd2Var instanceof cd2) {
                    fetVar2.e0(862915807);
                    cd2 cd2Var = (cd2) fd2Var;
                    e2dVar2 = e2dVar;
                    kc5.j0(jm40Var, cd2Var.f4140a, cd2Var.b, qdzVar, e2dVar2, function1, fetVar2, 57344 & (i3 << 3));
                    fetVar2.r(false);
                } else if (fd2Var instanceof dd2) {
                    fetVar2.e0(863325534);
                    dd2 dd2Var = (dd2) fd2Var;
                    e2dVar2 = e2dVar;
                    dj8.y(jm40Var, dd2Var.f5874a, dd2Var.b, qdzVar, e2dVar2, function1, fetVar2, 57344 & (i3 << 3));
                    fetVar2.r(false);
                } else if (fd2Var instanceof ed2) {
                    fetVar2.e0(863733153);
                    ed2 ed2Var = (ed2) fd2Var;
                    e2dVar2 = e2dVar;
                    j47.m0(jm40Var, ed2Var.f7596a, ed2Var.b, qdzVar, e2dVar2, function1, fetVar2, 57344 & (i3 << 3));
                    fetVar2.r(false);
                }
            }
            throw b1j.f(1413294457, fetVar2, false);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bf2(this, e2dVar2, i, (byte) 2);
        }
    }

    public final void I0(e2d e2dVar, fet fetVar, int i) {
        int i2;
        e2d e2dVar2;
        vne vneVar;
        ef2 ef2Var = this;
        fetVar.g0(-709061624);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(e2dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ef2Var) ? 32 : 16;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            a8z a8zVar = ef2Var.R1;
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar2 = (vne) objP;
            boolean zI = fetVar.i(ef2Var);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                vneVar = vneVar2;
                Object ln1Var = new ln1(1, ef2Var, ef2.class, "handleSearchSideEffect", "handleSearchSideEffect(Lorg/xplatform/results/impl/presentation/alt_search/models/ResultSearchSideEffect;)V", 0, (byte) 22);
                fetVar.o0(ln1Var);
                objP2 = ln1Var;
            } else {
                vneVar = vneVar2;
            }
            Function1 function1 = (Function1) ((jhy) objP2);
            Unit unit = Unit.f46060a;
            boolean zI2 = fetVar.i(vneVar) | fetVar.i(k3t0Var) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == obj) {
                objP3 = new et(vneVar, k3t0Var, function1, (byte) 1);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            b4g0 b4g0Var = (b4g0) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar).getValue();
            qdz qdzVar = (qdz) ef2Var.K1.getValue();
            Object obj2 = (k3t0) a8zVar.getValue();
            boolean zI3 = fetVar.i(obj2);
            Object objP4 = fetVar.P();
            if (zI3 || objP4 == obj) {
                objP4 = new ln1(1, obj2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 23);
                fetVar.o0(objP4);
            }
            e2dVar2 = e2dVar;
            cjx.B(null, b4g0Var, e2dVar2, qdzVar, (Function1) ((jhy) objP4), fetVar, (i3 << 6) & 896);
        } else {
            ef2Var = ef2Var;
            e2dVar2 = e2dVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bf2(ef2Var, e2dVar2, i, (byte) 1);
        }
    }

    public final k3t0 J0() {
        return (k3t0) this.U1.getValue();
    }

    public final k3t0 K0() {
        return (k3t0) this.S1.getValue();
    }

    public final k3t0 L0() {
        return (k3t0) this.Q1.getValue();
    }

    public final void M0(String str) {
        wdk0 wdk0Var = (wdk0) ((e8i) this.O1.getValue()).e.e;
        x1x.y(wdk0Var);
        wdk0.k(wdk0Var, new xdk0(rek0.b, str, null, null, null, null, 124), this, null, null, false, null, 1020);
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        hxm0.m(q0());
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        hxm0.n(q0());
        super.e0();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getK1() {
        return true;
    }
}
