package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public abstract class kcp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f18071a = new zfn(new ccp0((byte) 4), (byte) 0);
    public static final zfn b = new zfn(new ccp0((byte) 5), (byte) 0);
    public static final zfn c = new zfn(new ago((byte) 28), (byte) 0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    public static final void a(mm40 mm40Var, udp0 udp0Var, Function2 function2, fet fetVar, int i, int i2) {
        boolean z;
        mm40 mm40VarW;
        boolean z2;
        ?? r4;
        mm40 mm40VarW2;
        boolean z3;
        mm40 mm40Var2;
        mm40 mm40VarW3;
        boolean z4;
        mm40 mm40VarW4;
        int i3;
        mm40 mm40VarW5;
        boolean z5;
        mm40 mm40VarW6;
        fet fetVar2;
        fet fetVar3 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        xx7 xx7Var = gqw0.m;
        yx7 yx7Var = gqw0.k;
        udp0Var.getClass();
        function2.getClass();
        int i4 = i2 & 1;
        jm40 jm40Var = jm40.b;
        mm40 mm40Var3 = i4 != 0 ? jm40Var : mm40Var;
        boolean z6 = udp0Var instanceof ycp0;
        zfn zfnVar = f18071a;
        pcy pcyVar = e7z.u1;
        if (z6) {
            fetVar3.e0(465608555);
            ycp0 ycp0Var = (ycp0) udp0Var;
            int i5 = i & 1022;
            w6n w6nVar = (w6n) fetVar3.k(cn80.b);
            if (w6nVar == null) {
                w6nVar = w6n.e;
            }
            ycl yclVar = (ycl) fetVar3.k(zfnVar);
            float f = ((ycl) fetVar3.k(b)).f42389a;
            if (ycp0Var instanceof rcp0) {
                fetVar3.e0(-1691403470);
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(-998414516, new gc3(mm40Var3, yclVar, ycp0Var, f, w6nVar, function2), fetVar3), fetVar3, 56);
                fetVar3.r(false);
                z5 = false;
                fetVar2 = fetVar3;
            } else {
                w6n w6nVar2 = w6nVar;
                mm40 mm40Var4 = mm40Var3;
                if (ycp0Var instanceof vcp0) {
                    fetVar3.e0(-1688676710);
                    x5d x5dVarA = w5d.a(new qw3(f, true, new jf4((byte) 14)), xx7Var, fetVar3, 0);
                    int iHashCode = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM = fetVar3.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar3, mm40Var4);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, x5dVarA, shdVar4);
                    jpm0.o(fetVar3, bh90VarM, shdVar3);
                    vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
                    jpm0.o(fetVar3, mm40VarC0, shdVar);
                    vcp0 vcp0Var = (vcp0) ycp0Var;
                    cn80.a(vcp0Var.f37197a, vcp0Var.b, w6nVar2, null, fetVar, 0, 17);
                    fet fetVar4 = fetVar;
                    fetVar4.r(true);
                    z5 = false;
                    fetVar4.r(false);
                    fetVar2 = fetVar4;
                } else {
                    if (!(ycp0Var instanceof scp0)) {
                        throw b1j.f(-1855677013, fetVar3, false);
                    }
                    fetVar3.e0(-1688220297);
                    zcl zclVar = qmk.f28987a;
                    thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar3, 48);
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, mm40Var4);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, thg0VarA, shdVar4);
                    jpm0.o(fetVar3, bh90VarM2, shdVar3);
                    vqd.u(iHashCode2, fetVar3, shdVar2, fetVar3);
                    jpm0.o(fetVar3, mm40VarC1, shdVar);
                    thg0 thg0VarA2 = shg0.a(new qw3(f, true, new jf4((byte) 14)), yx7Var, fetVar3, 48);
                    int iHashCode3 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM3 = fetVar3.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar3, jm40Var);
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, thg0VarA2, shdVar4);
                    jpm0.o(fetVar3, bh90VarM3, shdVar3);
                    vqd.u(iHashCode3, fetVar3, shdVar2, fetVar3);
                    jpm0.o(fetVar3, mm40VarC2, shdVar);
                    scp0 scp0Var = (scp0) ycp0Var;
                    cn80.a(scp0Var.f31999a, scp0Var.b, w6nVar2, function2, fetVar3, (i5 << 6) & 57344, 1);
                    fet fetVar5 = fetVar3;
                    fetVar5.r(true);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    if (yclVar != null) {
                        mm40VarW6 = o7k0.e(jm40Var, yclVar.f42389a);
                        z5 = false;
                    } else {
                        z5 = false;
                        mm40VarW6 = o7k0.w(jm40Var, null, false, 3);
                    }
                    egp0.a(z5 ? 1 : 0, fetVar5, mm40VarD.e(mm40VarW6), scp0Var.c);
                    fetVar5.r(true);
                    fetVar5.r(z5);
                    fetVar2 = fetVar5;
                }
            }
            fetVar2.r(z5);
            return;
        }
        mm40 mm40Var5 = mm40Var3;
        if (!(udp0Var instanceof sdp0)) {
            throw b1j.f(465607067, fetVar3, false);
        }
        fetVar3.e0(465614253);
        sdp0 sdp0Var = (sdp0) udp0Var;
        int i6 = i & 1022;
        ycl yclVar2 = (ycl) fetVar3.k(zfnVar);
        w6n w6nVar3 = (w6n) fetVar3.k(cn80.b);
        if (w6nVar3 == null) {
            w6nVar3 = w6n.f;
        }
        boolean z7 = sdp0Var instanceof kdp0;
        zfn zfnVar2 = c;
        if (z7) {
            fetVar3.e0(-1661063026);
            if (((Boolean) fetVar3.k(zfnVar2)).booleanValue()) {
                fetVar3.e0(-1661032522);
                zcl zclVar2 = qmk.f28987a;
                thg0 thg0VarA3 = shg0.a(new qw3(16.0f, true, new jf4((byte) 14)), yx7Var, fetVar3, 48);
                int iHashCode4 = Long.hashCode(fetVar3.T);
                bh90 bh90VarM4 = fetVar3.m();
                mm40 mm40VarC3 = kbc.c0(fetVar3, mm40Var5);
                mkd.c0.getClass();
                fetVar3.i0();
                if (fetVar3.S) {
                    fetVar3.l(pcyVar);
                } else {
                    fetVar3.r0();
                }
                jpm0.o(fetVar3, thg0VarA3, shdVar4);
                jpm0.o(fetVar3, bh90VarM4, shdVar3);
                vqd.u(iHashCode4, fetVar3, shdVar2, fetVar3);
                x7z x7zVarI = ohs0.i(fetVar3, mm40VarC3, shdVar, 1.0f, true);
                if (yclVar2 != null) {
                    mm40VarW5 = o7k0.e(jm40Var, yclVar2.f42389a);
                    i3 = 0;
                } else {
                    i3 = 0;
                    mm40VarW5 = o7k0.w(jm40Var, null, false, 3);
                }
                kdp0 kdp0Var = (kdp0) sdp0Var;
                egp0.a(i3, fetVar3, x7zVarI.e(mm40VarW5), kdp0Var.b);
                boolean z8 = i3;
                m2x.i(null, kdp0Var.f18117a, w6nVar3, kdp0Var.c, function2, fetVar3, (i6 << 6) & 57344, 1);
                fetVar3.r(true);
                fetVar3.r(z8);
                z3 = z8 ? 1 : 0;
            } else {
                w6n w6nVar4 = w6nVar3;
                fetVar3.e0(-1660125834);
                zcl zclVar3 = qmk.f28987a;
                thg0 thg0VarA4 = shg0.a(new qw3(16.0f, true, new jf4((byte) 14)), yx7Var, fetVar3, 48);
                int iHashCode5 = Long.hashCode(fetVar3.T);
                bh90 bh90VarM5 = fetVar3.m();
                mm40 mm40VarC4 = kbc.c0(fetVar3, mm40Var5);
                mkd.c0.getClass();
                fetVar3.i0();
                if (fetVar3.S) {
                    fetVar3.l(pcyVar);
                } else {
                    fetVar3.r0();
                }
                jpm0.o(fetVar3, thg0VarA4, shdVar4);
                jpm0.o(fetVar3, bh90VarM5, shdVar3);
                vqd.u(iHashCode5, fetVar3, shdVar2, fetVar3);
                jpm0.o(fetVar3, mm40VarC4, shdVar);
                kdp0 kdp0Var2 = (kdp0) sdp0Var;
                m2x.i(null, kdp0Var2.f18117a, w6nVar4, kdp0Var2.c, function2, fetVar3, (i6 << 6) & 57344, 1);
                x7z x7zVar = new x7z(1.0f, true);
                if (yclVar2 != null) {
                    mm40VarW4 = o7k0.e(jm40Var, yclVar2.f42389a);
                    z3 = false;
                } else {
                    z3 = false;
                    mm40VarW4 = o7k0.w(jm40Var, null, false, 3);
                }
                egp0.a(z3 ? 1 : 0, fetVar3, x7zVar.e(mm40VarW4), kdp0Var2.b);
                fetVar3.r(true);
                fetVar3.r(z3);
            }
            fetVar3.r(z3);
        } else {
            w6n w6nVar5 = w6nVar3;
            if (!(sdp0Var instanceof ldp0)) {
                if (sdp0Var instanceof pdp0) {
                    fetVar3.e0(-1854605710);
                    m2x.i(mm40Var5, ((pdp0) sdp0Var).f26818a, w6nVar5, null, function2, fetVar3, (i & 14) | 3072 | ((i6 << 6) & 57344), 0);
                    z3 = false;
                    fetVar3.r(false);
                } else {
                    if (!(sdp0Var instanceof mdp0)) {
                        throw b1j.f(-1854696805, fetVar3, false);
                    }
                    fetVar3.e0(-1657892470);
                    if (((Boolean) fetVar3.k(zfnVar2)).booleanValue()) {
                        fetVar3.e0(-1657861532);
                        zcl zclVar4 = qmk.f28987a;
                        thg0 thg0VarA5 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar3, 48);
                        int iHashCode6 = Long.hashCode(fetVar3.T);
                        bh90 bh90VarM6 = fetVar3.m();
                        mm40 mm40VarC5 = kbc.c0(fetVar3, mm40Var5);
                        mkd.c0.getClass();
                        fetVar3.i0();
                        if (fetVar3.S) {
                            fetVar3.l(pcyVar);
                        } else {
                            fetVar3.r0();
                        }
                        jpm0.o(fetVar3, thg0VarA5, shdVar4);
                        jpm0.o(fetVar3, bh90VarM6, shdVar3);
                        vqd.u(iHashCode6, fetVar3, shdVar2, fetVar3);
                        jpm0.o(fetVar3, mm40VarC5, shdVar);
                        mdp0 mdp0Var = (mdp0) sdp0Var;
                        m2x.i(null, mdp0Var.f21608a, w6nVar5, null, function2, fetVar3, ((i6 << 6) & 57344) | 3072, 1);
                        x7z x7zVar2 = new x7z(1.0f, true);
                        if (yclVar2 != null) {
                            mm40VarW2 = o7k0.e(jm40Var, yclVar2.f42389a);
                            r4 = 0;
                        } else {
                            r4 = 0;
                            mm40VarW2 = o7k0.w(jm40Var, null, false, 3);
                        }
                        egp0.a(r4, fetVar3, x7zVar2.e(mm40VarW2), mdp0Var.b);
                        fetVar3.r(true);
                        fetVar3.r(r4);
                        z2 = r4;
                    } else {
                        fetVar3.e0(-1656968732);
                        zcl zclVar5 = qmk.f28987a;
                        thg0 thg0VarA6 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar3, 48);
                        int iHashCode7 = Long.hashCode(fetVar3.T);
                        bh90 bh90VarM7 = fetVar3.m();
                        mm40 mm40VarC6 = kbc.c0(fetVar3, mm40Var5);
                        mkd.c0.getClass();
                        fetVar3.i0();
                        if (fetVar3.S) {
                            fetVar3.l(pcyVar);
                        } else {
                            fetVar3.r0();
                        }
                        jpm0.o(fetVar3, thg0VarA6, shdVar4);
                        jpm0.o(fetVar3, bh90VarM7, shdVar3);
                        vqd.u(iHashCode7, fetVar3, shdVar2, fetVar3);
                        x7z x7zVarI2 = ohs0.i(fetVar3, mm40VarC6, shdVar, 1.0f, true);
                        if (yclVar2 != null) {
                            mm40VarW = o7k0.e(jm40Var, yclVar2.f42389a);
                            z = false;
                        } else {
                            z = false;
                            mm40VarW = o7k0.w(jm40Var, null, false, 3);
                        }
                        mdp0 mdp0Var2 = (mdp0) sdp0Var;
                        egp0.a(z ? 1 : 0, fetVar3, x7zVarI2.e(mm40VarW), mdp0Var2.b);
                        m2x.i(null, mdp0Var2.f21608a, w6nVar5, null, function2, fetVar3, ((i6 << 6) & 57344) | 3072, 1);
                        fetVar3.r(true);
                        fetVar3.r(z);
                        z2 = z;
                    }
                    fetVar3.r(z2);
                    z4 = z2;
                }
                fetVar3.r(z4);
            }
            fetVar3.e0(-1659168740);
            zcl zclVar6 = qmk.f28987a;
            thg0 thg0VarA7 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar3, 48);
            int iHashCode8 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM8 = fetVar3.m();
            mm40 mm40VarC7 = kbc.c0(fetVar3, mm40Var5);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA7, shdVar4);
            jpm0.o(fetVar3, bh90VarM8, shdVar3);
            vqd.u(iHashCode8, fetVar3, shdVar2, fetVar3);
            jpm0.o(fetVar3, mm40VarC7, shdVar);
            ldp0 ldp0Var = (ldp0) sdp0Var;
            m2x.i(null, ldp0Var.f19863a, w6nVar5, null, function2, fetVar3, ((i6 << 6) & 57344) | 3072, 1);
            x7z x7zVar3 = new x7z(1.0f, true);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), xx7Var, fetVar3, 0);
            int iHashCode9 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM9 = fetVar3.m();
            mm40 mm40VarC8 = kbc.c0(fetVar3, x7zVar3);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA2, shdVar4);
            jpm0.o(fetVar3, bh90VarM9, shdVar3);
            vqd.u(iHashCode9, fetVar3, shdVar2, fetVar3);
            jpm0.o(fetVar3, mm40VarC8, shdVar);
            if (yclVar2 != null) {
                mm40VarW3 = o7k0.e(jm40Var, yclVar2.f42389a);
                z3 = false;
                mm40Var2 = null;
            } else {
                z3 = false;
                mm40Var2 = null;
                mm40VarW3 = o7k0.w(jm40Var, null, false, 3);
            }
            egp0.a(z3 ? 1 : 0, fetVar3, mm40VarW3, ldp0Var.b);
            aad.a(mm40Var2, ldp0Var.c, fetVar3, z3 ? 1 : 0);
            ohs0.x(fetVar3, true, true, z3);
        }
        z4 = z3;
        fetVar3.r(z4);
    }
}
