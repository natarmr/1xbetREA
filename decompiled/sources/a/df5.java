package a;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class df5 extends lm40 implements v6z, ehl, qai0, gpa0, rm40, fp80, g6z, t7v, lpq, bqq, eqq, dg80, y99 {
    public km40 o;
    public cf5 p;
    public HashSet q;

    @Override // a.gpa0
    public final void D() {
        km40 km40Var = this.o;
        km40Var.getClass();
        ((jpa0) km40Var).e.getClass();
    }

    @Override // a.gpa0
    public final boolean F0() {
        km40 km40Var = this.o;
        km40Var.getClass();
        ((jpa0) km40Var).e.getClass();
        return true;
    }

    @Override // a.rm40
    public final azw I() {
        cf5 cf5Var = this.p;
        return cf5Var != null ? cf5Var : mun.f22420a;
    }

    @Override // a.lpq
    public final void L(iqq iqqVar) {
        km40 km40Var = this.o;
        xcx.b("onFocusEvent called on wrong node");
        km40Var.getClass();
        throw new ClassCastException();
    }

    @Override // a.t7v
    public final void P(s460 s460Var) {
        this.o.getClass();
        throw new ClassCastException();
    }

    @Override // a.lm40
    public final void R0() {
        Z0(true);
    }

    @Override // a.lm40
    public final void S0() {
        a1();
    }

    @Override // a.v6z
    public final int U(c810 c810Var, pj30 pj30Var, int i) {
        km40 km40Var = this.o;
        km40Var.getClass();
        return ((t6z) km40Var).c(new rnx(c810Var, c810Var.getLayoutDirection()), new cvj(pj30Var, ck30.b, dk30.f6214a, (byte) 1), r4e.b(0, 0, 0, i, 7)).j();
    }

    public final void Z0(boolean z) {
        if (!this.n) {
            xcx.b("initializeModifier called on unattached node");
        }
        km40 km40Var = this.o;
        if ((this.c & 32) != 0 && (km40Var instanceof sm40)) {
            sm40 sm40Var = (sm40) km40Var;
            i5d0 i5d0Var = nzj.f24376a;
            cf5 cf5Var = this.p;
            if (cf5Var == null || !cf5Var.D(i5d0Var)) {
                cf5 cf5Var2 = new cf5();
                cf5Var2.f4242a = sm40Var;
                this.p = cf5Var2;
                wso0 wso0Var = (wso0) vcc.Z(this).h1.f;
                wso0Var.getClass();
                if (wso0Var.o) {
                    qm40 modifierLocalManager = vcc.a0(this).getModifierLocalManager();
                    vy40 vy40Var = modifierLocalManager.b;
                    if (vy40Var == null) {
                        vy40Var = new vy40();
                        modifierLocalManager.b = vy40Var;
                    }
                    vy40Var.a(this);
                    vy40 vy40Var2 = modifierLocalManager.c;
                    if (vy40Var2 == null) {
                        vy40Var2 = new vy40();
                        modifierLocalManager.c = vy40Var2;
                    }
                    vy40Var2.a(i5d0Var);
                    modifierLocalManager.a();
                }
            } else {
                cf5Var.f4242a = sm40Var;
                qm40 modifierLocalManager2 = vcc.a0(this).getModifierLocalManager();
                vy40 vy40Var3 = modifierLocalManager2.b;
                if (vy40Var3 == null) {
                    vy40Var3 = new vy40();
                    modifierLocalManager2.b = vy40Var3;
                }
                vy40Var3.a(this);
                vy40 vy40Var4 = modifierLocalManager2.c;
                if (vy40Var4 == null) {
                    vy40Var4 = new vy40();
                    modifierLocalManager2.c = vy40Var4;
                }
                vy40Var4.a(i5d0Var);
                modifierLocalManager2.a();
            }
        }
        if ((this.c & 4) != 0 && !z) {
            vcc.X(this, 2).o1();
        }
        if ((this.c & 2) != 0) {
            wso0 wso0Var2 = (wso0) vcc.Z(this).h1.f;
            wso0Var2.getClass();
            if (wso0Var2.o) {
                s460 s460Var = this.h;
                s460Var.getClass();
                ((x6z) s460Var).K1(this);
                bg80 bg80Var = s460Var.u1;
                if (bg80Var != null) {
                    ((gfv) bg80Var).c();
                }
            }
            if (!z) {
                vcc.X(this, 2).o1();
                vcc.Z(this).F();
            }
        }
        if (km40Var instanceof a9z) {
            a9z a9zVar = (a9z) km40Var;
            e7z e7zVarZ = vcc.Z(this);
            switch (a9zVar.b) {
                case 0:
                    ((d9z) a9zVar.c).j = e7zVarZ;
                    break;
                case 1:
                    ((xcz) a9zVar.c).l = e7zVarZ;
                    break;
                case 2:
                    ((mez) a9zVar.c).h = e7zVarZ;
                    break;
                default:
                    ((hgk0) ((xk80) a9zVar.c).y).setValue(e7zVarZ);
                    break;
            }
        }
        int i = this.c;
        if ((i & 16) != 0 && (km40Var instanceof jpa0)) {
            ((jpa0) km40Var).e.f22981a = this.h;
        }
        if ((i & 8) != 0) {
            ((AndroidComposeView) vcc.a0(this)).z();
        }
    }

    public final void a1() {
        if (!this.n) {
            xcx.b("unInitializeModifier called on unattached node");
        }
        km40 km40Var = this.o;
        if ((this.c & 32) != 0 && (km40Var instanceof sm40)) {
            qm40 modifierLocalManager = vcc.a0(this).getModifierLocalManager();
            i5d0 i5d0Var = nzj.f24376a;
            vy40 vy40Var = modifierLocalManager.d;
            if (vy40Var == null) {
                vy40Var = new vy40();
                modifierLocalManager.d = vy40Var;
            }
            vy40Var.a(vcc.Z(this));
            vy40 vy40Var2 = modifierLocalManager.e;
            if (vy40Var2 == null) {
                vy40Var2 = new vy40();
                modifierLocalManager.e = vy40Var2;
            }
            vy40Var2.a(i5d0Var);
            modifierLocalManager.a();
        }
        if ((this.c & 8) != 0) {
            ((AndroidComposeView) vcc.a0(this)).z();
        }
    }

    @Override // a.yzj
    public final void b() {
        if (this.o instanceof jpa0) {
            n0();
        }
    }

    public final void b1() {
        if (this.n) {
            this.q.clear();
            eg80 snapshotObserver = vcc.a0(this).getSnapshotObserver();
            snapshotObserver.f7752a.d(this, j120.b, new zo4(this, (byte) 6));
        }
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        km40 km40Var = this.o;
        km40Var.getClass();
        return ((t6z) km40Var).c(vj30Var, pj30Var, j);
    }

    @Override // a.y99
    public final long d() {
        return n2x.Q(vcc.X(this, 128).c);
    }

    @Override // a.v6z
    public final int e0(c810 c810Var, pj30 pj30Var, int i) {
        km40 km40Var = this.o;
        km40Var.getClass();
        return ((t6z) km40Var).c(new rnx(c810Var, c810Var.getLayoutDirection()), new cvj(pj30Var, ck30.f4488a, dk30.f6214a, (byte) 1), r4e.b(0, 0, 0, i, 7)).j();
    }

    @Override // a.y99
    public final w6k getDensity() {
        return vcc.Z(this).z;
    }

    @Override // a.y99
    public final k6z getLayoutDirection() {
        return vcc.Z(this).A;
    }

    @Override // a.gpa0
    public final void h(woa0 woa0Var, xoa0 xoa0Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        km40 km40Var = this.o;
        km40Var.getClass();
        n660 n660Var = ((jpa0) km40Var).e;
        jpa0 jpa0Var = (jpa0) n660Var.d;
        List list = woa0Var.f39485a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            dpa0 dpa0Var = (dpa0) list.get(i);
            if (x2x.J(dpa0Var) || x2x.L(dpa0Var)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = true;
                break;
            } else {
                if (((dpa0) list.get(i2)).c()) {
                    z2 = false;
                    break;
                }
                i2++;
            }
        }
        if (jpa0Var.d) {
            z3 = true;
            break;
        }
        int size3 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                if (!z2) {
                    z3 = false;
                    break;
                }
                break;
            } else {
                dpa0 dpa0Var2 = (dpa0) list.get(i3);
                if (!x2x.J(dpa0Var2) && !x2x.L(dpa0Var2)) {
                    i3++;
                }
            }
            z3 = true;
            break;
        }
        if (((ipa0) n660Var.b) != ipa0.c) {
            if (xoa0Var == xoa0.f41207a && z3) {
                n660Var.c = woa0Var;
                n660Var.k(woa0Var, !z || jpa0Var.d);
            }
            if (xoa0Var == xoa0.b && z && woa0Var == ((woa0) n660Var.c) && jpa0Var.d) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((dpa0) list.get(i4)).a();
                }
            }
            if (xoa0Var == xoa0.c && !z3 && woa0Var != ((woa0) n660Var.c)) {
                n660Var.k(woa0Var, true);
            }
        }
        if (xoa0Var == xoa0.c) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    n660Var.b = ipa0.f15153a;
                    ((jpa0) n660Var.d).d = false;
                    n660Var.c = null;
                    break;
                } else if (!x2x.L((dpa0) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (woa0Var == ((woa0) n660Var.c) && z) {
                int size6 = list.size();
                for (int i6 = 0; i6 < size6; i6++) {
                    if (((dpa0) list.get(i6)).c()) {
                        if (jpa0Var.d) {
                            break;
                        }
                        n660Var.K(woa0Var);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((dpa0) list.get(i7)).a();
                }
            }
        }
    }

    @Override // a.dg80
    public final boolean h0() {
        return this.n;
    }

    @Override // a.fp80
    public final Object m(w6k w6kVar, Object obj) {
        km40 km40Var = this.o;
        km40Var.getClass();
        return ((ep80) km40Var).d(w6kVar);
    }

    @Override // a.bqq
    public final void n(zpq zpqVar) {
        km40 km40Var = this.o;
        xcx.b("applyFocusProperties called on wrong node");
        km40Var.getClass();
        throw new ClassCastException();
    }

    @Override // a.gpa0
    public final void n0() {
        km40 km40Var = this.o;
        km40Var.getClass();
        n660 n660Var = ((jpa0) km40Var).e;
        ipa0 ipa0Var = (ipa0) n660Var.b;
        jpa0 jpa0Var = (jpa0) n660Var.d;
        if (ipa0Var == ipa0.b) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            jpa0Var.f().invoke(motionEventObtain);
            motionEventObtain.recycle();
            n660Var.b = ipa0.f15153a;
            jpa0Var.d = false;
            n660Var.c = null;
        }
    }

    @Override // a.ehl
    public final void p0() {
        vfc.J(this);
    }

    public final String toString() {
        return this.o.toString();
    }

    @Override // a.ehl
    public final void u0(g7z g7zVar) {
        km40 km40Var = this.o;
        km40Var.getClass();
        g7zVar.a();
    }

    @Override // a.v6z
    public final int v(c810 c810Var, pj30 pj30Var, int i) {
        km40 km40Var = this.o;
        km40Var.getClass();
        return ((t6z) km40Var).c(new rnx(c810Var, c810Var.getLayoutDirection()), new cvj(pj30Var, ck30.b, dk30.b, (byte) 1), r4e.b(0, i, 0, 0, 13)).f();
    }

    @Override // a.v6z
    public final int w(c810 c810Var, pj30 pj30Var, int i) {
        km40 km40Var = this.o;
        km40Var.getClass();
        return ((t6z) km40Var).c(new rnx(c810Var, c810Var.getLayoutDirection()), new cvj(pj30Var, ck30.f4488a, dk30.b, (byte) 1), r4e.b(0, i, 0, 0, 13)).f();
    }

    @Override // a.qai0
    public final void x0(abi0 abi0Var) {
        km40 km40Var = this.o;
        km40Var.getClass();
        nai0 nai0VarG = ((oai0) km40Var).g();
        abi0Var.getClass();
        nai0 nai0Var = (nai0) abi0Var;
        hz40 hz40Var = nai0Var.f23193a;
        if (nai0VarG.c) {
            nai0Var.c = true;
        }
        if (nai0VarG.d) {
            nai0Var.d = true;
        }
        hz40 hz40Var2 = nai0VarG.f23193a;
        Object[] objArr = hz40Var2.b;
        Object[] objArr2 = hz40Var2.c;
        long[] jArr = hz40Var2.f13891a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        zai0 zai0Var = (zai0) obj;
                        if (!hz40Var.b(zai0Var)) {
                            hz40Var.n(zai0Var, obj2);
                        } else if (obj2 instanceof m6) {
                            Object objG = hz40Var.g(zai0Var);
                            objG.getClass();
                            m6 m6Var = (m6) objG;
                            String str = m6Var.f21241a;
                            if (str == null) {
                                str = ((m6) obj2).f21241a;
                            }
                            wdr wdrVar = m6Var.b;
                            if (wdrVar == null) {
                                wdrVar = ((m6) obj2).b;
                            }
                            hz40Var.n(zai0Var, new m6(str, wdrVar));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // a.g6z
    public final void N(j6z j6zVar) {
    }

    @Override // a.g6z, a.xj30
    public final void a(long j) {
    }
}
