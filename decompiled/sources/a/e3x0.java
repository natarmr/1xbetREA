package a;

/* JADX INFO: loaded from: classes.dex */
public final class e3x0 {
    public static final e3x0 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j4x f7158a;

    static {
        int i = j4x.f;
        b = new e3x0(zcf0.h);
    }

    public e3x0(j4x j4xVar) {
        this.f7158a = j4xVar;
    }

    public static e3x0 a(tdw0 tdw0Var) throws zew0 {
        String strL;
        long j;
        d3x0 d3x0Var;
        int iC0 = tdw0Var.c0();
        if (iC0 < 0) {
            itt0.x("Negative number of flags");
            return null;
        }
        int i = j4x.f;
        i4x i4xVar = new i4x(4);
        long j2 = 0;
        for (int i2 = 0; i2 < iC0; i2++) {
            long jE0 = tdw0Var.e0();
            int i3 = (int) jE0;
            long j3 = jE0 >>> 3;
            if (j3 == 0) {
                j = 0;
                strL = tdw0Var.L();
            } else {
                long j4 = j3 + j2;
                if (j4 > 2305843009213693951L) {
                    itt0.x("Flag name larger than max size");
                    return null;
                }
                strL = null;
                j = j4;
            }
            int i4 = i3 & 7;
            if (i4 == 0 || i4 == 1) {
                d3x0Var = new d3x0(j, strL, i4, 0L, null);
            } else if (i4 == 2) {
                d3x0Var = new d3x0(j, strL, i4, tdw0Var.e0(), null);
            } else if (i4 == 3) {
                d3x0Var = new d3x0(j, strL, i4, Double.doubleToRawLongBits(tdw0Var.v()), null);
            } else if (i4 == 4) {
                d3x0Var = new d3x0(j, strL, i4, 0L, tdw0Var.L());
            } else {
                if (i4 != 5) {
                    itt0.x(b1j.h(i4, "Unrecognized flag type ", new StringBuilder(String.valueOf(i4).length() + 23)));
                    return null;
                }
                d3x0Var = new d3x0(j, strL, i4, 0L, tdw0Var.Q());
            }
            long j5 = d3x0Var.f5427a;
            if (j5 != 0) {
                j2 = j5;
            }
            i4xVar.b(d3x0Var);
        }
        return new e3x0(i4xVar.h());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e3x0)) {
            return false;
        }
        return this.f7158a.equals(((e3x0) obj).f7158a);
    }

    public final int hashCode() {
        j4x j4xVar = this.f7158a;
        j4xVar.getClass();
        return d7x.A(j4xVar);
    }
}
