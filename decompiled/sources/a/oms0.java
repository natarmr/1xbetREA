package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class oms0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4 f25519a;
    public final oms0 b;
    public final String c;
    public final pz40 d;
    public final pz40 f;
    public final pz40 i;
    public final SnapshotStateList j;
    public final SnapshotStateList k;
    public final pz40 l;
    public final zbk m;
    public final pz40 e = androidx.compose.runtime.e.e(null);
    public final egk0 g = androidx.compose.runtime.e.c(0);
    public final egk0 h = androidx.compose.runtime.e.c(Long.MIN_VALUE);

    public oms0(p4 p4Var, oms0 oms0Var, String str) {
        this.f25519a = p4Var;
        this.b = oms0Var;
        this.c = str;
        this.d = androidx.compose.runtime.e.e(p4Var.y0());
        this.f = androidx.compose.runtime.e.e(new bms0(p4Var.y0(), p4Var.y0()));
        Boolean bool = Boolean.FALSE;
        this.i = androidx.compose.runtime.e.e(bool);
        this.j = new SnapshotStateList();
        this.k = new SnapshotStateList();
        this.l = androidx.compose.runtime.e.e(bool);
        this.m = jgk0.b(new kb50(this, (byte) 3));
        p4Var.K0(this);
    }

    public final void a(Object obj, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1493585151);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(obj) : fetVar.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(this) ? 32 : 16;
        }
        byte b2 = 1;
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (h()) {
            fetVar.e0(467722849);
            fetVar.r(false);
        } else {
            fetVar.e0(466062241);
            r(obj);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = jgk0.b(new kb50(this, b));
                fetVar.o0(objP);
            }
            if (((Boolean) ((l7m0) objP).getValue()).booleanValue()) {
                fetVar.e0(466470356);
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                    fetVar.o0(objP2);
                }
                vne vneVar = (vne) objP2;
                boolean zI = (i3 == 32) | fetVar.i(vneVar);
                Object objP3 = fetVar.P();
                if (zI || objP3 == cl5Var) {
                    objP3 = new xis0(vneVar, this, b2);
                    fetVar.o0(objP3);
                }
                m0x0.n(vneVar, this, (Function1) objP3, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(467712929);
                fetVar.r(false);
            }
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0((Object) this, obj, i, (byte) 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        SnapshotStateList snapshotStateList = this.j;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((cms0) snapshotStateList.get(i)).l.l());
        }
        SnapshotStateList snapshotStateList2 = this.k;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((oms0) snapshotStateList2.get(i2)).b());
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        SnapshotStateList snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            cms0 cms0Var = (cms0) snapshotStateList.get(i);
            cms0Var.f = null;
            cms0Var.e = null;
            cms0Var.i = false;
        }
        SnapshotStateList snapshotStateList2 = this.k;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((oms0) snapshotStateList2.get(i2)).c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d() {
        SnapshotStateList snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            if (((cms0) snapshotStateList.get(i)).e != null) {
                return true;
            }
        }
        SnapshotStateList snapshotStateList2 = this.k;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((oms0) snapshotStateList2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        oms0 oms0Var = this.b;
        return oms0Var != null ? oms0Var.e() : this.g.l();
    }

    public final ams0 f() {
        return (ams0) ((hgk0) this.f).getValue();
    }

    public final boolean g() {
        return this.h.l() != Long.MIN_VALUE;
    }

    public final boolean h() {
        return ((Boolean) ((hgk0) this.l).getValue()).booleanValue();
    }

    public final void i(boolean z, long j) {
        egk0 egk0Var = this.h;
        long jL = egk0Var.l();
        p4 p4Var = this.f25519a;
        if (jL == Long.MIN_VALUE) {
            egk0Var.m(j);
            ((hgk0) ((pz40) p4Var.b)).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((hgk0) ((pz40) p4Var.b)).getValue()).booleanValue()) {
            ((hgk0) ((pz40) p4Var.b)).setValue(Boolean.TRUE);
        }
        p(false);
        SnapshotStateList snapshotStateList = this.j;
        int size = snapshotStateList.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            cms0 cms0Var = (cms0) snapshotStateList.get(i);
            pz40 pz40Var = cms0Var.g;
            pz40 pz40Var2 = cms0Var.g;
            if (!((Boolean) ((hgk0) pz40Var).getValue()).booleanValue()) {
                long jD = z ? cms0Var.b().d() : j;
                cms0Var.e(cms0Var.b().f(jD));
                cms0Var.k = cms0Var.b().b(jD);
                if (cms0Var.b().c(jD)) {
                    ((hgk0) pz40Var2).setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) ((hgk0) pz40Var2).getValue()).booleanValue()) {
                z2 = false;
            }
        }
        SnapshotStateList snapshotStateList2 = this.k;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            oms0 oms0Var = (oms0) snapshotStateList2.get(i2);
            pz40 pz40Var3 = oms0Var.d;
            p4 p4Var2 = oms0Var.f25519a;
            if (!Intrinsics.d(((hgk0) pz40Var3).getValue(), p4Var2.y0())) {
                oms0Var.i(z, j);
            }
            if (!Intrinsics.d(((hgk0) oms0Var.d).getValue(), p4Var2.y0())) {
                z2 = false;
            }
        }
        if (z2) {
            j();
        }
    }

    public final void j() {
        this.h.m(Long.MIN_VALUE);
        p4 p4Var = this.f25519a;
        if (p4Var instanceof uz40) {
            p4Var.I0(((hgk0) this.d).getValue());
        }
        o(0L);
        ((hgk0) ((pz40) p4Var.b)).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.k;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((oms0) snapshotStateList.get(i)).j();
        }
    }

    public final void k(float f) {
        SnapshotStateList snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            cms0 cms0Var = (cms0) snapshotStateList.get(i);
            cms0Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                wto0 wto0Var = cms0Var.f;
                if (wto0Var != null) {
                    cms0Var.b().h(wto0Var.c);
                    cms0Var.e = null;
                    cms0Var.f = null;
                }
                Object obj = f == -4.0f ? cms0Var.b().d : cms0Var.b().c;
                cms0Var.b().h(obj);
                cms0Var.b().i(obj);
                cms0Var.e(obj);
                cms0Var.l.m(cms0Var.b().d());
            } else {
                cms0Var.h.m(f);
            }
        }
        SnapshotStateList snapshotStateList2 = this.k;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((oms0) snapshotStateList2.get(i2)).k(f);
        }
    }

    public final void l(Object obj, Object obj2) {
        this.h.m(Long.MIN_VALUE);
        p4 p4Var = this.f25519a;
        ((hgk0) ((pz40) p4Var.b)).setValue(Boolean.FALSE);
        boolean zH = h();
        pz40 pz40Var = this.d;
        if (!zH || !Intrinsics.d(p4Var.y0(), obj) || !Intrinsics.d(((hgk0) pz40Var).getValue(), obj2)) {
            if (!Intrinsics.d(p4Var.y0(), obj) && (p4Var instanceof uz40)) {
                p4Var.I0(obj);
            }
            ((hgk0) pz40Var).setValue(obj2);
            ((hgk0) this.l).setValue(Boolean.TRUE);
            ((hgk0) this.f).setValue(new bms0(obj, obj2));
        }
        SnapshotStateList snapshotStateList = this.k;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            oms0 oms0Var = (oms0) snapshotStateList.get(i);
            oms0Var.getClass();
            if (oms0Var.h()) {
                oms0Var.l(oms0Var.f25519a.y0(), ((hgk0) oms0Var.d).getValue());
            }
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((cms0) snapshotStateList2.get(i2)).c(0L);
        }
    }

    public final void m(long j) {
        egk0 egk0Var = this.h;
        if (egk0Var.l() == Long.MIN_VALUE) {
            egk0Var.m(j);
        }
        o(j);
        p(false);
        SnapshotStateList snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((cms0) snapshotStateList.get(i)).c(j);
        }
        SnapshotStateList snapshotStateList2 = this.k;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            oms0 oms0Var = (oms0) snapshotStateList2.get(i2);
            if (!Intrinsics.d(((hgk0) oms0Var.d).getValue(), oms0Var.f25519a.y0())) {
                oms0Var.m(j);
            }
        }
    }

    public final void n(jvh0 jvh0Var) {
        SnapshotStateList snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            cms0 cms0Var = (cms0) snapshotStateList.get(i);
            pz40 pz40Var = cms0Var.j;
            if (!Intrinsics.d(cms0Var.b().c, cms0Var.b().d)) {
                cms0Var.f = cms0Var.b();
                cms0Var.e = jvh0Var;
            }
            hgk0 hgk0Var = (hgk0) pz40Var;
            ((hgk0) cms0Var.d).setValue(new wto0(cms0Var.n, cms0Var.f4623a, hgk0Var.getValue(), hgk0Var.getValue(), cms0Var.k.c()));
            cms0Var.l.m(cms0Var.b().d());
            cms0Var.i = true;
        }
        SnapshotStateList snapshotStateList2 = this.k;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((oms0) snapshotStateList2.get(i2)).n(jvh0Var);
        }
    }

    public final void o(long j) {
        if (this.b == null) {
            this.g.m(j);
        }
    }

    public final void p(boolean z) {
        ((hgk0) this.i).setValue(Boolean.valueOf(z));
    }

    public final void q() {
        wto0 wto0Var;
        SnapshotStateList snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            cms0 cms0Var = (cms0) snapshotStateList.get(i);
            jvh0 jvh0Var = cms0Var.e;
            if (jvh0Var != null && (wto0Var = cms0Var.f) != null) {
                long jC = si30.c(jvh0Var.g * ((double) jvh0Var.d));
                Object objF = wto0Var.f(jC);
                if (cms0Var.i) {
                    cms0Var.b().i(objF);
                }
                cms0Var.b().h(objF);
                cms0Var.l.m(cms0Var.b().d());
                if (cms0Var.h.l() == -2.0f || cms0Var.i) {
                    cms0Var.e(objF);
                } else {
                    cms0Var.c(cms0Var.o.e());
                }
                if (jC >= jvh0Var.g) {
                    cms0Var.e = null;
                    cms0Var.f = null;
                } else {
                    jvh0Var.c = false;
                }
            }
        }
        SnapshotStateList snapshotStateList2 = this.k;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((oms0) snapshotStateList2.get(i2)).q();
        }
    }

    public final void r(Object obj) {
        pz40 pz40Var = this.d;
        hgk0 hgk0Var = (hgk0) pz40Var;
        if (Intrinsics.d(hgk0Var.getValue(), obj)) {
            return;
        }
        ((hgk0) this.f).setValue(new bms0(hgk0Var.getValue(), obj));
        p4 p4Var = this.f25519a;
        if (!Intrinsics.d(p4Var.y0(), hgk0Var.getValue())) {
            p4Var.I0(hgk0Var.getValue());
        }
        ((hgk0) pz40Var).setValue(obj);
        if (!g()) {
            p(true);
        }
        SnapshotStateList snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((cms0) snapshotStateList.get(i)).h.m(-2.0f);
        }
    }

    public final String toString() {
        SnapshotStateList snapshotStateList = this.j;
        int size = snapshotStateList.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((cms0) snapshotStateList.get(i)) + ", ";
        }
        return str;
    }
}
