package a;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class j7z implements c5n0, vj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m7z f16062a;
    public final /* synthetic */ r7z b;

    public j7z(r7z r7zVar) {
        this.b = r7zVar;
        this.f16062a = r7zVar.h;
    }

    @Override // a.w6k
    public final long B(float f) {
        return this.f16062a.B(f);
    }

    @Override // a.w6k
    public final int B0(long j) {
        return this.f16062a.B0(j);
    }

    @Override // a.vj30
    public final uj30 D0(int i, int i2, Map map, Function1 function1, Function1 function2) {
        return this.f16062a.D0(i, i2, map, function1, function2);
    }

    @Override // a.w6k
    public final long G0(long j) {
        return this.f16062a.G0(j);
    }

    @Override // a.cnx
    public final boolean M() {
        return this.f16062a.M();
    }

    @Override // a.w6k
    public final int T(float f) {
        return this.f16062a.T(f);
    }

    @Override // a.w6k
    public final float X(long j) {
        return this.f16062a.X(j);
    }

    @Override // a.w6k
    public final float getDensity() {
        return this.f16062a.b;
    }

    @Override // a.cnx
    public final k6z getLayoutDirection() {
        return this.f16062a.f21343a;
    }

    @Override // a.vj30
    public final uj30 i0(int i, int i2, Map map, Function1 function1) {
        return this.f16062a.D0(i, i2, map, null, function1);
    }

    @Override // a.c5n0
    public final List k(Object obj, Function2 function2) {
        r7z r7zVar = this.b;
        e7z e7zVar = r7zVar.f30000a;
        hz40 hz40Var = r7zVar.g;
        e7z e7zVar2 = (e7z) hz40Var.g(obj);
        if (e7zVar2 != null && ((xz40) ((ty40) e7zVar.p()).b).i(e7zVar2) < r7zVar.d) {
            return e7zVar2.n();
        }
        hz40 hz40Var2 = r7zVar.l;
        hz40 hz40Var3 = r7zVar.j;
        xz40 xz40Var = r7zVar.m;
        if (xz40Var.c < r7zVar.e) {
            xcx.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        e7z e7zVar3 = (e7z) hz40Var.g(obj);
        int i = xz40Var.c;
        int i2 = r7zVar.e;
        if (i == i2) {
            xz40Var.b(obj);
        } else {
            Object[] objArr = xz40Var.f41739a;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        r7zVar.e++;
        boolean zB = hz40Var3.b(obj);
        if (zB || e7zVar3 != null) {
            if (!zB && e7zVar3 != null) {
                r7zVar.k(((xz40) ((ty40) e7zVar.p()).b).i(e7zVar3), ((xz40) ((ty40) e7zVar.p()).b).c);
                r7zVar.o++;
                hz40Var.l(obj);
                hz40Var3.n(obj, e7zVar3);
                hz40Var2.n(obj, r7zVar.d(obj));
                if (e7zVar.I()) {
                    r7zVar.i();
                }
            }
            e7z e7zVar4 = (e7z) hz40Var3.g(obj);
            k7z k7zVar = e7zVar4 != null ? (k7z) r7zVar.f.g(e7zVar4) : null;
            if (k7zVar != null && k7zVar.d) {
                r7zVar.n(e7zVar4, obj, false, function2);
            }
            if ((k7zVar != null ? k7zVar.f : null) != null) {
                r7zVar.b(k7zVar, true);
            }
        } else {
            r7zVar.l(obj, function2, false);
            hz40Var2.n(obj, r7zVar.d(obj));
        }
        e7z e7zVar5 = (e7z) hz40Var3.g(obj);
        if (e7zVar5 == null) {
            return iun.f15405a;
        }
        List listX0 = e7zVar5.i1.p.x0();
        ty40 ty40Var = (ty40) listX0;
        int i3 = ((xz40) ty40Var.b).c;
        for (int i4 = 0; i4 < i3; i4++) {
            ((sj30) ty40Var.get(i4)).f.b = true;
        }
        return listX0;
    }

    @Override // a.w6k
    public final long o(float f) {
        return this.f16062a.o(f);
    }

    @Override // a.w6k
    public final long p(long j) {
        return this.f16062a.p(j);
    }

    @Override // a.w6k
    public final float r0(int i) {
        return this.f16062a.r0(i);
    }

    @Override // a.w6k
    public final float s(long j) {
        return this.f16062a.s(j);
    }

    @Override // a.w6k
    public final float s0(float f) {
        return f / this.f16062a.getDensity();
    }

    @Override // a.w6k
    public final float v0() {
        return this.f16062a.c;
    }

    @Override // a.w6k
    public final float w0(float f) {
        return this.f16062a.getDensity() * f;
    }

    @Override // a.w6k
    public final long z(int i) {
        return this.f16062a.z(i);
    }
}
