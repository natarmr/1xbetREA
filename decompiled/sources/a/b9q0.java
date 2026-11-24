package a;

/* JADX INFO: loaded from: classes.dex */
public final class b9q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9q0 f2224a;
    public j6z b = null;
    public j6z c;

    public b9q0(a9q0 a9q0Var, j6z j6zVar) {
        this.f2224a = a9q0Var;
        this.c = j6zVar;
    }

    public final long a(long j) {
        jge0 jge0VarW;
        j6z j6zVar = this.b;
        jge0 jge0Var = jge0.e;
        if (j6zVar != null) {
            if (j6zVar.h()) {
                j6z j6zVar2 = this.c;
                jge0VarW = j6zVar2 != null ? j6zVar2.w(j6zVar, true) : null;
            } else {
                jge0VarW = jge0Var;
            }
            if (jge0VarW != null) {
                jge0Var = jge0VarW;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = jge0Var.f16474a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = jge0Var.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = jge0Var.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = jge0Var.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(boolean z, long j) {
        if (z) {
            j = a(j);
        }
        return this.f2224a.b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        a9q0 a9q0Var = this.f2224a;
        int iE = a9q0Var.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= a9q0Var.g(iE) && Float.intBitsToFloat(i) <= a9q0Var.h(iE);
    }

    public final long d(long j) {
        j6z j6zVar;
        j6z j6zVar2 = this.b;
        if (j6zVar2 != null) {
            if (!j6zVar2.h()) {
                j6zVar2 = null;
            }
            if (j6zVar2 != null && (j6zVar = this.c) != null) {
                j6z j6zVar3 = j6zVar.h() ? j6zVar : null;
                if (j6zVar3 != null) {
                    return j6zVar2.I(j6zVar3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        j6z j6zVar;
        j6z j6zVar2 = this.b;
        if (j6zVar2 != null) {
            if (!j6zVar2.h()) {
                j6zVar2 = null;
            }
            if (j6zVar2 != null && (j6zVar = this.c) != null) {
                j6z j6zVar3 = j6zVar.h() ? j6zVar : null;
                if (j6zVar3 != null) {
                    return j6zVar3.I(j6zVar2, j);
                }
            }
        }
        return j;
    }
}
