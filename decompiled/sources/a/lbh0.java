package a;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class lbh0 extends hel implements lky, qai0 {
    public final yj50 k1;
    public iob0 l1;
    public a5 m1;
    public boolean n1;
    public boolean o1;
    public iu40 p1;
    public pds0 q1;
    public final iuj r1;
    public final sch0 s1;
    public final hbh0 t1;
    public final nqq u1;
    public final nee v1;

    public lbh0(j39 j39Var, qkq qkqVar, gy40 gy40Var, ma80 ma80Var, vf80 vf80Var, bch0 bch0Var, boolean z, boolean z2) {
        super(dwi0.f6800a, z, gy40Var, ma80Var);
        this.k1 = new yj50();
        iuj iujVar = new iuj(new sjj(new epi0(fbh0.c)));
        this.r1 = iujVar;
        sch0 sch0Var = new sch0(bch0Var, vf80Var, qkqVar == null ? iujVar : qkqVar, ma80Var, z2, this.k1, this, new ibh0(this, (byte) 0));
        this.s1 = sch0Var;
        hbh0 hbh0Var = new hbh0(sch0Var, z);
        this.t1 = hbh0Var;
        nqq nqqVar = new nqq(2, null, 10);
        Z0(nqqVar);
        this.u1 = nqqVar;
        nee neeVar = new nee(ma80Var, sch0Var, z2, j39Var, new ibh0(this, (byte) 1));
        Z0(neeVar);
        this.v1 = neeVar;
        Z0(new ek50(hbh0Var, this.k1));
        g39 g39Var = new g39();
        g39Var.o = neeVar;
        Z0(g39Var);
    }

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    @Override // a.lm40
    public final void R0() {
        iu40 iu40Var = this.p1;
        if (iu40Var != null) {
            iu40Var.c = vcc.Z(this).z;
        }
        pds0 pds0Var = this.q1;
        if (pds0Var != null) {
            pds0Var.c = vcc.Z(this).z;
        }
        if (this.n) {
            w6k w6kVar = vcc.Z(this).z;
            iuj iujVar = this.r1;
            iujVar.getClass();
            iujVar.f15399a = new sjj(new epi0(w6kVar));
        }
    }

    @Override // a.yzj
    public final void b() {
        n0();
        iu40 iu40Var = this.p1;
        if (iu40Var != null) {
            iu40Var.c = vcc.Z(this).z;
        }
        pds0 pds0Var = this.q1;
        if (pds0Var != null) {
            pds0Var.c = vcc.Z(this).z;
        }
        n0();
        if (this.n) {
            w6k w6kVar = vcc.Z(this).z;
            iuj iujVar = this.r1;
            iujVar.getClass();
            iujVar.f15399a = new sjj(new epi0(w6kVar));
        }
    }

    @Override // a.lky
    public final boolean c0(KeyEvent keyEvent) {
        return false;
    }

    @Override // a.hel
    public final Object d1(ic1 ic1Var, xb2 xb2Var) {
        c050 c050Var = c050.b;
        sch0 sch0Var = this.s1;
        Object objG = sch0Var.g(c050Var, new kmg0((Object) ic1Var, (Object) sch0Var, (yje) null, (byte) 13), xb2Var);
        return objG == wne.f39444a ? objG : Unit.f46060a;
    }

    @Override // a.hel, a.gpa0
    public final void h(woa0 woa0Var, xoa0 xoa0Var, long j) {
        int i;
        int i2;
        List list = woa0Var.f39485a;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((Boolean) this.r.invoke(new lpa0(((dpa0) list.get(i3)).i))).booleanValue()) {
                super.h(woa0Var, xoa0Var, j);
                break;
            }
        }
        if (this.s) {
            if (this.A == null) {
                amt amtVar = new amt(this);
                Z0(amtVar);
                this.A = amtVar;
            }
            xoa0 xoa0Var2 = xoa0.f41207a;
            yje yjeVar = null;
            if (xoa0Var == xoa0Var2 && woa0Var.f == 6) {
                if (!this.n1) {
                    this.p1 = new iu40(this.s1, new do20(ViewConfiguration.get(tdc.Z(this).getContext())), new jbh0(2, this, lbh0.class, "onMouseWheelScrollStopped", "onMouseWheelScrollStopped-TH1AsA0(J)V", 4, (byte) 0), vcc.Z(this).z);
                    this.n1 = true;
                }
                iu40 iu40Var = this.p1;
                if (iu40Var != null) {
                    vne vneVarN0 = N0();
                    if (iu40Var.h == null) {
                        iu40Var.h = qjj.W(vneVarN0, null, null, new fhq(iu40Var, yjeVar, (byte) 27), 3);
                    }
                }
            }
            iu40 iu40Var2 = this.p1;
            if (iu40Var2 != null && woa0Var.f == 6) {
                List list2 = woa0Var.f39485a;
                int size2 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        if (xoa0Var == xoa0.f41207a && iu40Var2.d) {
                            iu40Var2.f(woa0Var);
                            d660.a(woa0Var);
                        }
                        if (xoa0Var != xoa0.b || iu40Var2.d || !iu40Var2.f(woa0Var)) {
                            break;
                            break;
                            break;
                        } else {
                            d660.a(woa0Var);
                            break;
                        }
                    }
                    if (((dpa0) list2.get(i4)).c()) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            if (xoa0Var == xoa0Var2 && ((i2 = woa0Var.f) == 10 || i2 == 11 || i2 == 12)) {
                if (this.o1) {
                    i = 10;
                } else {
                    i = 10;
                    this.q1 = new pds0(this.s1, new jbh0(2, this, lbh0.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, (byte) 1), vcc.Z(this).z);
                    this.o1 = true;
                }
                pds0 pds0Var = this.q1;
                if (pds0Var != null) {
                    vne vneVarN1 = N0();
                    if (pds0Var.g == null) {
                        pds0Var.g = qjj.W(vneVarN1, null, null, new pnd0(pds0Var, yjeVar, (byte) 16), 3);
                    }
                }
            } else {
                i = 10;
            }
            pds0 pds0Var2 = this.q1;
            if (pds0Var2 != null) {
                int i5 = woa0Var.f;
                if (i5 == i || i5 == 11 || i5 == 12) {
                    List list3 = woa0Var.f39485a;
                    int size3 = list3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        if (((dpa0) list3.get(i6)).c()) {
                            return;
                        }
                    }
                    if (xoa0Var == xoa0.f41207a && pds0Var2.d) {
                        pds0Var2.d(woa0Var);
                        d660.a(woa0Var);
                    }
                    if (xoa0Var == xoa0.b && !pds0Var2.d && pds0Var2.d(woa0Var)) {
                        d660.a(woa0Var);
                    }
                }
            }
        }
    }

    @Override // a.hel
    public final void j1(qdl qdlVar) {
        if (this.n) {
            qjj.W(this.k1.c(), null, null, new kbh0(qdlVar, this, null, (byte) 0), 3);
        }
    }

    @Override // a.lky
    public final boolean l0(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.s || ((!qjy.a(n7x.C(keyEvent), qjy.D) && !qjy.a(u7x.c(keyEvent.getKeyCode()), qjy.C)) || n7x.H(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.s1.d == ma80.f21447a;
        nee neeVar = this.v1;
        if (z) {
            int iA1 = (int) (neeVar.a1() & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(qjy.a(u7x.c(keyEvent.getKeyCode()), qjy.C) ? iA1 : -iA1)));
        } else {
            int iA2 = (int) (neeVar.a1() >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(qjy.a(u7x.c(keyEvent.getKeyCode()), qjy.C) ? iA2 : -iA2)) << 32);
        }
        qjj.W(N0(), null, null, new a5(this, jFloatToRawIntBits, null, (byte) 1), 3);
        return true;
    }

    public final void u1(j39 j39Var, qkq qkqVar, gy40 gy40Var, ma80 ma80Var, vf80 vf80Var, bch0 bch0Var, boolean z, boolean z2) {
        boolean z3;
        if (this.s != z) {
            this.t1.b = z;
            this.l1 = null;
            this.m1 = null;
            s0x.S(this);
        }
        if (qkqVar == null) {
            qkqVar = this.r1;
        }
        sch0 sch0Var = this.s1;
        boolean z4 = true;
        if (Intrinsics.d(sch0Var.f31986a, bch0Var)) {
            z3 = false;
        } else {
            sch0Var.f31986a = bch0Var;
            z3 = true;
        }
        sch0Var.b = vf80Var;
        ma80 ma80Var2 = sch0Var.d;
        if (ma80Var2 != ma80Var) {
            sch0Var.d = ma80Var;
            ma80Var2 = ma80Var;
            z3 = true;
        }
        if (sch0Var.e != z2) {
            sch0Var.e = z2;
        } else {
            z4 = z3;
        }
        sch0Var.c = qkqVar;
        sch0Var.f = this.k1;
        nee neeVar = this.v1;
        neeVar.o = ma80Var;
        neeVar.q = z2;
        neeVar.r = j39Var;
        b5 b5Var = dwi0.f6800a;
        ma80 ma80Var3 = ma80.f21447a;
        if (ma80Var2 != ma80Var3) {
            ma80Var3 = ma80.b;
        }
        t1(b5Var, z, gy40Var, ma80Var3, z4);
    }

    @Override // a.qai0
    public final void x0(abi0 abi0Var) {
        if (this.s && (this.l1 == null || this.m1 == null)) {
            this.l1 = new iob0((Object) this, (byte) 21);
            this.m1 = new a5(this, null);
        }
        iob0 iob0Var = this.l1;
        if (iob0Var != null) {
            iiy[] iiyVarArr = yai0.f42300a;
            abi0Var.b(mai0.d, new m6(null, iob0Var));
        }
        a5 a5Var = this.m1;
        if (a5Var != null) {
            iiy[] iiyVarArr2 = yai0.f42300a;
            abi0Var.b(mai0.e, a5Var);
        }
    }

    @Override // a.hel
    public final void i1(long j) {
    }
}
