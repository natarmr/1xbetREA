package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public abstract class icp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f14546a = new zfn(new ccp0((byte) 1), (byte) 0);
    public static final zfn b = new zfn(new ccp0((byte) 3), (byte) 0);

    public static final void a(mm40 mm40Var, vdp0 vdp0Var, Function2 function2, fet fetVar, int i, int i2) {
        boolean z;
        mm40 mm40VarW;
        mm40 mm40VarW2;
        Unit unit;
        boolean z2;
        mm40 mm40VarW3;
        boolean z3;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        yx7 yx7Var = gqw0.k;
        function2.getClass();
        int i3 = i2 & 1;
        jm40 jm40Var = jm40.b;
        mm40 mm40Var2 = i3 != 0 ? jm40Var : mm40Var;
        boolean z4 = vdp0Var instanceof wcp0;
        zfn zfnVar = f14546a;
        pcy pcyVar = e7z.u1;
        if (z4) {
            fetVar.e0(2147334110);
            wcp0 wcp0Var = (wcp0) vdp0Var;
            w6n w6nVar = (w6n) fetVar.k(eap.b);
            if (w6nVar == null) {
                w6nVar = w6n.e;
            }
            ycl yclVar = (ycl) fetVar.k(zfnVar);
            float f = ((ycl) fetVar.k(b)).f42389a;
            if (!(wcp0Var instanceof pcp0)) {
                if (wcp0Var instanceof ucp0) {
                    fetVar.e0(8225512);
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(276813387, new dr50((Object) mm40Var2, (Object) wcp0Var, (Object) w6nVar, (byte) 22), fetVar), fetVar, 56);
                    z3 = false;
                    fetVar.r(false);
                } else {
                    if (!(wcp0Var instanceof ocp0)) {
                        throw b1j.f(-1108167700, fetVar, false);
                    }
                    fetVar.e0(9291788);
                    zcl zclVar = qmk.f28987a;
                    thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var2);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, shdVar4);
                    jpm0.o(fetVar, bh90VarM, shdVar3);
                    vqd.u(iHashCode, fetVar, shdVar2, fetVar);
                    jpm0.o(fetVar, mm40VarC0, shdVar);
                    thg0 thg0VarA2 = shg0.a(new qw3(f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA2, shdVar4);
                    jpm0.o(fetVar, bh90VarM2, shdVar3);
                    vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar);
                    ocp0 ocp0Var = (ocp0) wcp0Var;
                    b8k0.k(ocp0Var.f25038a, ocp0Var.b, w6nVar, fetVar);
                    fetVar.r(true);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    if (yclVar != null) {
                        mm40VarW3 = o7k0.e(jm40Var, yclVar.f42389a);
                        z2 = false;
                    } else {
                        z2 = false;
                        mm40VarW3 = o7k0.w(jm40Var, null, false, 3);
                    }
                    fgp0.a(z2 ? 1 : 0, fetVar, mm40VarD.e(mm40VarW3), ocp0Var.c);
                    fetVar.r(true);
                    fetVar.r(z2);
                }
                fetVar.r(z2);
                return;
            }
            fetVar.e0(6539949);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(701601812, new en80(mm40Var2, f, yclVar, wcp0Var, w6nVar), fetVar), fetVar, 56);
            z3 = false;
            fetVar.r(false);
            z2 = z3;
            fetVar.r(z2);
            return;
        }
        if (!(vdp0Var instanceof qdp0)) {
            throw b1j.f(2147332620, fetVar, false);
        }
        fetVar.e0(2147338225);
        qdp0 qdp0Var = (qdp0) vdp0Var;
        int i4 = i & 1022;
        w6n w6nVar2 = (w6n) fetVar.k(eap.b);
        if (w6nVar2 == null) {
            w6nVar2 = w6n.e;
        }
        ycl yclVar2 = (ycl) fetVar.k(zfnVar);
        if (qdp0Var instanceof idp0) {
            fetVar.e0(-443410763);
            zcl zclVar2 = qmk.f28987a;
            qw3 qw3Var = new qw3(2.0f, true, new jf4((byte) 14));
            xx7 xx7Var = gqw0.n;
            x5d x5dVarA = w5d.a(qw3Var, xx7Var, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40Var2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar4);
            jpm0.o(fetVar, bh90VarM3, shdVar3);
            vqd.u(iHashCode3, fetVar, shdVar2, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar);
            idp0 idp0Var = (idp0) qdp0Var;
            n2x.l(jm40Var, idp0Var.f14597a, w6nVar2, function2, fetVar, ((i4 << 3) & 7168) | 6, 0);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            if (yclVar2 != null) {
                mm40VarW2 = o7k0.e(jm40Var, yclVar2.f42389a);
                z = false;
            } else {
                z = false;
                mm40VarW2 = o7k0.w(jm40Var, null, false, 3);
            }
            fgp0.a(z ? 1 : 0, fetVar, mm40VarD2.e(mm40VarW2), idp0Var.b);
            uy uyVar = idp0Var.c;
            if (uyVar == null) {
                fetVar.e0(203958849);
                fetVar.r(z);
                unit = null;
            } else {
                fetVar.e0(203958850);
                dwi0.a(new wkw(xx7Var), uyVar, fetVar, z ? 1 : 0);
                fetVar.r(z);
                unit = Unit.f46060a;
            }
            if (unit == null) {
                fetVar.e0(204186669);
                zq8.a(z ? 1 : 0, fetVar, o7k0.e(jm40Var, 14.0f));
                fetVar.r(z);
            } else {
                fetVar.e0(-1794536649);
                fetVar.r(z);
            }
            fetVar.r(true);
            fetVar.r(z);
        } else {
            w6n w6nVar3 = w6nVar2;
            if (qdp0Var instanceof ndp0) {
                fetVar.e0(-2092474819);
                n2x.l(mm40Var2, ((ndp0) qdp0Var).f23347a, w6nVar3, function2, fetVar, (i & 14) | ((i4 << 3) & 7168), 0);
                fetVar.r(false);
                z = false;
            } else {
                if (!(qdp0Var instanceof hdp0)) {
                    throw b1j.f(-2092514702, fetVar, false);
                }
                fetVar.e0(-441939007);
                zcl zclVar3 = qmk.f28987a;
                thg0 thg0VarA3 = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
                int iHashCode4 = Long.hashCode(fetVar.T);
                bh90 bh90VarM4 = fetVar.m();
                mm40 mm40VarC3 = kbc.c0(fetVar, jm40Var);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA3, shdVar4);
                jpm0.o(fetVar, bh90VarM4, shdVar3);
                vqd.u(iHashCode4, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC3, shdVar);
                hdp0 hdp0Var = (hdp0) qdp0Var;
                n2x.l(jm40Var, hdp0Var.f12880a, w6nVar3, function2, fetVar, ((i4 << 3) & 7168) | 6, 0);
                mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                if (yclVar2 != null) {
                    mm40VarW = o7k0.e(jm40Var, yclVar2.f42389a);
                    z = false;
                } else {
                    z = false;
                    mm40VarW = o7k0.w(jm40Var, null, false, 3);
                }
                fgp0.a(z ? 1 : 0, fetVar, mm40VarD3.e(mm40VarW), hdp0Var.b);
                fetVar.r(true);
                fetVar.r(z);
            }
        }
        fetVar.r(z);
    }
}
