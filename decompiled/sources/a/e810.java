package a;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class e810 extends c810 implements pj30 {
    public final s460 u;
    public LinkedHashMap w;
    public uj30 y;
    public final ry40 z;
    public long v = 0;
    public final f810 x = new f810(this);

    public e810(s460 s460Var) {
        this.u = s460Var;
        ry40 ry40Var = v960.f37020a;
        this.z = new ry40();
    }

    @Override // a.c810
    public final c810 H0() {
        s460 s460Var = this.u.v;
        if (s460Var != null) {
            return s460Var.e1();
        }
        return null;
    }

    @Override // a.c810
    public final j6z I0() {
        return this.x;
    }

    @Override // a.c810
    public final boolean J0() {
        return this.y != null;
    }

    @Override // a.c810
    public final e7z L0() {
        return this.u.u;
    }

    @Override // a.c810, a.cnx
    public final boolean M() {
        return true;
    }

    @Override // a.c810
    public final uj30 N0() {
        uj30 uj30Var = this.y;
        if (uj30Var != null) {
            return uj30Var;
        }
        throw cs0.g("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // a.c810
    public final c810 O0() {
        s460 s460Var = this.u.w;
        if (s460Var != null) {
            return s460Var.e1();
        }
        return null;
    }

    @Override // a.c810
    public final long P0() {
        return this.v;
    }

    @Override // a.c810
    public final void T0() {
        n0(this.v, 0.0f, null);
    }

    public void V0() {
        N0().b();
    }

    public final void W0(long j) {
        if (!ikx.b(this.v, j)) {
            this.v = j;
            s460 s460Var = this.u;
            i810 i810Var = s460Var.u.i1.q;
            if (i810Var != null) {
                i810Var.F0();
            }
            c810.R0(s460Var);
        }
        if (this.o) {
            return;
        }
        F0(N0());
    }

    public final long X0(e810 e810Var, boolean z) {
        long jD = 0;
        while (!this.equals(e810Var)) {
            if (!this.l || !z) {
                jD = ikx.d(jD, this.v);
            }
            s460 s460Var = this.u.w;
            s460Var.getClass();
            this = s460Var.e1();
            this.getClass();
        }
        return jD;
    }

    public final void Y0(uj30 uj30Var) {
        LinkedHashMap linkedHashMap;
        if (uj30Var != null) {
            p0((((long) uj30Var.f()) & 4294967295L) | (((long) uj30Var.j()) << 32));
        } else {
            p0(0L);
        }
        if (!Intrinsics.d(this.y, uj30Var) && uj30Var != null && ((((linkedHashMap = this.w) != null && !linkedHashMap.isEmpty()) || !uj30Var.a().isEmpty()) && !Intrinsics.d(uj30Var.a(), this.w))) {
            i810 i810Var = this.u.u.i1.q;
            i810Var.getClass();
            i810Var.s.f();
            LinkedHashMap linkedHashMap2 = this.w;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.w = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(uj30Var.a());
        }
        this.y = uj30Var;
    }

    @Override // a.w6k
    public final float getDensity() {
        return this.u.getDensity();
    }

    @Override // a.cnx
    public final k6z getLayoutDirection() {
        return this.u.u.A;
    }

    @Override // a.pu90, a.pj30
    public final Object n() {
        return this.u.n();
    }

    @Override // a.pu90
    public final void n0(long j, float f, Function1 function1) {
        W0(j);
        if (this.n) {
            return;
        }
        V0();
    }

    @Override // a.w6k
    public final float v0() {
        return this.u.v0();
    }
}
