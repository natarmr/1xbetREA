package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cms0 implements l7m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lxs0 f4623a;
    public final pz40 b;
    public final pz40 c;
    public final pz40 d;
    public jvh0 e;
    public wto0 f;
    public final pz40 g;
    public final agk0 h;
    public boolean i;
    public final pz40 j;
    public t73 k;
    public final egk0 l;
    public boolean m;
    public final nul0 n;
    public final /* synthetic */ oms0 o;

    public cms0(oms0 oms0Var, Object obj, t73 t73Var, lxs0 lxs0Var) {
        this.o = oms0Var;
        this.f4623a = lxs0Var;
        pz40 pz40VarE = androidx.compose.runtime.e.e(obj);
        this.b = pz40VarE;
        Object objInvoke = null;
        pz40 pz40VarE2 = androidx.compose.runtime.e.e(ro4.g0(0.0f, 0.0f, null, 7));
        this.c = pz40VarE2;
        this.d = androidx.compose.runtime.e.e(new wto0((cfq) ((hgk0) pz40VarE2).getValue(), lxs0Var, obj, ((hgk0) pz40VarE).getValue(), t73Var));
        this.g = androidx.compose.runtime.e.e(Boolean.TRUE);
        this.h = androidx.compose.runtime.e.a(-1.0f);
        this.j = androidx.compose.runtime.e.e(obj);
        this.k = t73Var;
        this.l = androidx.compose.runtime.e.c(b().d());
        Float f = (Float) quu0.f29360a.get(lxs0Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            t73 t73Var2 = (t73) lxs0Var.f20832a.invoke(obj);
            int iB = t73Var2.b();
            for (int i = 0; i < iB; i++) {
                t73Var2.e(fFloatValue, i);
            }
            objInvoke = this.f4623a.b.invoke(t73Var2);
        }
        this.n = ro4.g0(0.0f, 0.0f, objInvoke, 3);
    }

    public final wto0 b() {
        return (wto0) ((hgk0) this.d).getValue();
    }

    public final void c(long j) {
        if (this.h.l() == -1.0f) {
            this.m = true;
            if (Intrinsics.d(b().c, b().d)) {
                e(b().c);
            } else {
                e(b().f(j));
                this.k = b().b(j);
            }
        }
    }

    public final void e(Object obj) {
        ((hgk0) this.j).setValue(obj);
    }

    public final void f(Object obj, boolean z) {
        wto0 wto0Var = this.f;
        Object obj2 = wto0Var != null ? wto0Var.c : null;
        hgk0 hgk0Var = (hgk0) this.b;
        boolean zD = Intrinsics.d(obj2, hgk0Var.getValue());
        egk0 egk0Var = this.l;
        pz40 pz40Var = this.d;
        cfq cfqVar = this.n;
        if (zD) {
            ((hgk0) pz40Var).setValue(new wto0(cfqVar, this.f4623a, obj, obj, this.k.c()));
            this.i = true;
            egk0Var.m(b().d());
            return;
        }
        pz40 pz40Var2 = this.c;
        if (!z || this.m || (((cfq) ((hgk0) pz40Var2).getValue()) instanceof nul0)) {
            cfqVar = (cfq) ((hgk0) pz40Var2).getValue();
        }
        oms0 oms0Var = this.o;
        ((hgk0) pz40Var).setValue(new wto0(oms0Var.e() <= 0 ? cfqVar : new z4m0(cfqVar, oms0Var.e()), this.f4623a, obj, hgk0Var.getValue(), this.k));
        egk0Var.m(b().d());
        this.i = false;
        oms0Var.p(true);
        if (oms0Var.h()) {
            SnapshotStateList snapshotStateList = oms0Var.j;
            int size = snapshotStateList.size();
            for (int i = 0; i < size; i++) {
                cms0 cms0Var = (cms0) snapshotStateList.get(i);
                cms0Var.l.l();
                cms0Var.c(0L);
            }
            oms0Var.p(false);
        }
    }

    public final void g(Object obj, Object obj2, cfq cfqVar) {
        ((hgk0) this.b).setValue(obj2);
        ((hgk0) this.c).setValue(cfqVar);
        if (Intrinsics.d(b().d, obj) && Intrinsics.d(b().c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // a.l7m0
    public final Object getValue() {
        return ((hgk0) this.j).getValue();
    }

    public final void h(Object obj, cfq cfqVar, Object obj2, t73 t73Var) {
        Object value;
        if (this.i) {
            wto0 wto0Var = this.f;
            if (Intrinsics.d(obj, wto0Var != null ? wto0Var.c : null)) {
                return;
            }
        }
        pz40 pz40Var = this.b;
        boolean zD = Intrinsics.d(((hgk0) pz40Var).getValue(), obj);
        agk0 agk0Var = this.h;
        if (zD && agk0Var.l() == -1.0f && (obj2 == null || obj2.equals(b().d))) {
            return;
        }
        ((hgk0) pz40Var).setValue(obj);
        ((hgk0) this.c).setValue(cfqVar);
        if (obj2 == null) {
            value = agk0Var.l() == -3.0f ? obj : ((hgk0) this.j).getValue();
        } else {
            value = obj2;
        }
        if (obj2 != null) {
            e(value);
            if (t73Var != null) {
                this.k = t73Var;
            }
        }
        pz40 pz40Var2 = this.g;
        f(value, !((Boolean) ((hgk0) pz40Var2).getValue()).booleanValue());
        ((hgk0) pz40Var2).setValue(Boolean.valueOf(agk0Var.l() == -3.0f));
        if (agk0Var.l() >= 0.0f) {
            e(b().f((long) (agk0Var.l() * b().d())));
        } else if (agk0Var.l() == -3.0f) {
            e(obj);
        }
        this.i = false;
        agk0Var.m(-1.0f);
    }

    public final String toString() {
        return "current value: " + ((hgk0) this.j).getValue() + ", target: " + ((hgk0) this.b).getValue() + ", spec: " + ((cfq) ((hgk0) this.c).getValue());
    }
}
