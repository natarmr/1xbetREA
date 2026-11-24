package a;

import android.gov.nist.core.Separators;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class fot0 {
    public fpt0 f;
    public fpt0 g;
    public HashSet h;
    public fpt0 i;
    public h55 j;
    public fpt0 k;
    public Rect l;
    public s0a n;
    public s0a o;
    public xii0 p;
    public xii0 q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9899a = false;
    public final HashSet b = new HashSet();
    public final Object c = new Object();
    public final Object d = new Object();
    public int e = 2;
    public Matrix m = new Matrix();

    public fot0(fpt0 fpt0Var) {
        new v4i0(this, (byte) 29);
        this.p = xii0.a();
        this.q = xii0.a();
        this.g = fpt0Var;
        this.i = fpt0Var;
    }

    public abstract void A();

    public void B(Matrix matrix) {
        this.m = new Matrix(matrix);
    }

    public void C(Rect rect) {
        this.l = rect;
    }

    public final void D(s0a s0aVar) {
        A();
        synchronized (this.c) {
            try {
                s0a s0aVar2 = this.n;
                if (s0aVar == s0aVar2) {
                    this.b.remove(s0aVar2);
                    this.n = null;
                }
                s0a s0aVar3 = this.o;
                if (s0aVar == s0aVar3) {
                    this.b.remove(s0aVar3);
                    this.o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.d) {
        }
        this.j = null;
        this.l = null;
        this.i = this.g;
        this.f = null;
        this.k = null;
    }

    public final void E(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.p = (xii0) list.get(0);
        if (list.size() > 1) {
            this.q = (xii0) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (hzj hzjVar : ((xii0) it.next()).b()) {
                if (hzjVar.j == null) {
                    hzjVar.j = getClass();
                }
            }
        }
    }

    public final void F(h55 h55Var, h55 h55Var2) {
        this.j = z(h55Var, h55Var2);
    }

    public final void a(tii0 tii0Var, h55 h55Var) {
        Range range = h55.h;
        if (!range.equals(h55Var.e)) {
            ((wy40) tii0Var.b.d).y(t7a.h, h55Var.e);
            return;
        }
        synchronized (this.c) {
            try {
                s0a s0aVar = this.n;
                s0aVar.getClass();
                ArrayList arrayListC = s0aVar.h().o().c(AeFpsRangeQuirk.class);
                boolean z = true;
                if (arrayListC.size() > 1) {
                    z = false;
                }
                z1x.t("There should not have more than one AeFpsRangeQuirk.", z);
                if (!arrayListC.isEmpty()) {
                    Range range2 = (Range) ((AeFpsRangeLegacyQuirk) ((AeFpsRangeQuirk) arrayListC.get(0))).f45303a.getValue();
                    if (range2 != null) {
                        range = range2;
                    }
                    ((wy40) tii0Var.b.d).y(t7a.h, range);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(s0a s0aVar, s0a s0aVar2, fpt0 fpt0Var, fpt0 fpt0Var2) {
        synchronized (this.c) {
            this.n = s0aVar;
            this.o = s0aVar2;
            this.b.add(s0aVar);
            if (s0aVar2 != null) {
                this.b.add(s0aVar2);
            }
        }
        this.f = fpt0Var;
        this.k = fpt0Var2;
        this.i = q(s0aVar.h(), this.f, this.k);
        synchronized (this.d) {
        }
        t();
    }

    public final Size c() {
        h55 h55Var = this.j;
        if (h55Var != null) {
            return h55Var.f12463a;
        }
        return null;
    }

    public final s0a d() {
        s0a s0aVar;
        synchronized (this.c) {
            s0aVar = this.n;
        }
        return s0aVar;
    }

    public final ry9 e() {
        synchronized (this.c) {
            try {
                s0a s0aVar = this.n;
                if (s0aVar == null) {
                    return ry9.f31301a;
                }
                return s0aVar.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String f() {
        s0a s0aVarD = d();
        z1x.x(s0aVarD, "No camera attached to use case: " + this);
        return s0aVarD.h().e();
    }

    public abstract fpt0 g(boolean z, ipt0 ipt0Var);

    public final String h() {
        String str = (String) this.i.e(xto0.z0, "<UnknownUseCase-" + hashCode() + Separators.GREATER_THAN);
        Objects.requireNonNull(str);
        return str;
    }

    public final int i(s0a s0aVar, boolean z) {
        int iB = s0aVar.h().B(m());
        return (s0aVar.q() || !z) ? iB : jls0.i(-iB);
    }

    public final s0a j() {
        s0a s0aVar;
        synchronized (this.c) {
            s0aVar = this.o;
        }
        return s0aVar;
    }

    public Set k(n0a n0aVar) {
        return null;
    }

    public Set l() {
        return Collections.EMPTY_SET;
    }

    public final int m() {
        return ((w0x) this.i).s(0);
    }

    public ept0 n(drd drdVar) {
        return new gyw(wy40.p(drdVar), (byte) 0);
    }

    public boolean o() {
        return this instanceof jyw;
    }

    public final boolean p(s0a s0aVar) {
        int iIntValue = ((Integer) ((w0x) this.i).e(w0x.n0, -1)).intValue();
        if (iIntValue == -1 || iIntValue == 0) {
            return false;
        }
        if (iIntValue == 1) {
            return true;
        }
        if (iIntValue == 2) {
            return s0aVar.k();
        }
        c99.l(twn.m(iIntValue, "Unknown mirrorMode: "));
        return false;
    }

    public final fpt0 q(n0a n0aVar, fpt0 fpt0Var, fpt0 fpt0Var2) {
        wy40 wy40VarL;
        if (fpt0Var2 != null) {
            wy40VarL = wy40.p(fpt0Var2);
            wy40VarL.z(xto0.z0);
        } else {
            wy40VarL = wy40.l();
        }
        TreeMap treeMap = wy40VarL.f2093a;
        if (this.g.f(w0x.k0) || this.g.f(w0x.o0)) {
            u15 u15Var = w0x.s0;
            if (treeMap.containsKey(u15Var)) {
                wy40VarL.z(u15Var);
            }
        }
        fpt0 fpt0Var3 = this.g;
        u15 u15Var2 = w0x.s0;
        if (fpt0Var3.f(u15Var2)) {
            u15 u15Var3 = w0x.q0;
            if (treeMap.containsKey(u15Var3) && ((isf0) this.g.d(u15Var2)).b != null) {
                wy40VarL.z(u15Var3);
            }
        }
        Iterator it = this.g.c().iterator();
        while (it.hasNext()) {
            drd.m(wy40VarL, wy40VarL, this.g, (u15) it.next());
        }
        if (fpt0Var != null) {
            for (u15 u15Var4 : fpt0Var.c()) {
                if (!u15Var4.f34886a.equals(xto0.z0.f34886a)) {
                    drd.m(wy40VarL, wy40VarL, fpt0Var, u15Var4);
                }
            }
        }
        if (treeMap.containsKey(w0x.o0)) {
            u15 u15Var5 = w0x.k0;
            if (treeMap.containsKey(u15Var5)) {
                wy40VarL.z(u15Var5);
            }
        }
        u15 u15Var6 = w0x.s0;
        if (treeMap.containsKey(u15Var6) && ((isf0) wy40VarL.d(u15Var6)).c != 0) {
            wy40VarL.y(fpt0.L0, Boolean.TRUE);
        }
        l8x.U("UseCase", "applyFeaturesToConfig: mFeatureGroup = " + this.h + ", this = " + this);
        HashSet<giv> hashSet = this.h;
        if (hashSet != null) {
            int i = cgn.c;
            Range range = h55.h;
            rfu0 rfu0Var = sfu0.c;
            agn agnVar = agn.d;
            for (giv givVar : hashSet) {
                if (givVar instanceof cgn) {
                    agnVar = ((cgn) givVar).f4320a;
                } else if (givVar instanceof rwq) {
                    rwq rwqVar = (rwq) givVar;
                    range = new Range(Integer.valueOf(rwqVar.f31227a), Integer.valueOf(rwqVar.b));
                } else if (givVar instanceof sfu0) {
                    rfu0Var = ((sfu0) givVar).f32133a;
                }
            }
            if ((this instanceof oub0) || qsm0.v(this)) {
                wy40VarL.y(h0x.j0, agnVar);
            }
            wy40VarL.y(fpt0.I0, range);
            int iOrdinal = rfu0Var.ordinal();
            if (iOrdinal == 0) {
                wy40VarL.y(fpt0.O0, 0);
                wy40VarL.y(fpt0.P0, 0);
            } else if (iOrdinal == 1) {
                wy40VarL.y(fpt0.O0, 1);
                wy40VarL.y(fpt0.P0, 1);
            } else if (iOrdinal == 2) {
                wy40VarL.y(fpt0.O0, 0);
                wy40VarL.y(fpt0.P0, 2);
            } else if (iOrdinal == 3) {
                wy40VarL.y(fpt0.O0, 2);
                wy40VarL.y(fpt0.P0, 0);
            }
        }
        return v(n0aVar, n(wy40VarL));
    }

    public final void r() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((eot0) it.next()).l(this);
        }
    }

    public final void s() {
        int iE = hne.E(this.e);
        HashSet hashSet = this.b;
        if (iE == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((eot0) it.next()).j(this);
            }
        } else {
            if (iE != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((eot0) it2.next()).c(this);
            }
        }
    }

    public fpt0 v(n0a n0aVar, ept0 ept0Var) {
        return ept0Var.e();
    }

    public void w() {
        this.f9899a = true;
    }

    public void x() {
        this.f9899a = false;
    }

    public h55 y(drd drdVar) {
        h55 h55Var = this.j;
        if (h55Var == null) {
            v4i0.p("Attempt to update the implementation options for a use case without attached stream specifications.");
            return null;
        }
        qgd qgdVarB = h55Var.b();
        qgdVarB.g = drdVar;
        return qgdVarB.i();
    }

    public abstract h55 z(h55 h55Var, h55 h55Var2);

    public void t() {
    }

    public void u() {
    }
}
