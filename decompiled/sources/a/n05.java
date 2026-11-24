package a;

/* JADX INFO: loaded from: classes.dex */
public final class n05 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22684a;
    public final long b;
    public final long c;

    public n05(long j, long j2, long j3) {
        this.f22684a = j;
        this.b = j2;
        this.c = j3;
        long j4 = daq0.c;
        if (daq0.a(j, j4)) {
            jf4.o("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
            throw null;
        }
        if (daq0.a(j2, j4)) {
            jf4.o("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
            throw null;
        }
        if (daq0.a(j3, j4)) {
            jf4.o("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
            throw null;
        }
        if (eaq0.a(daq0.b(j), daq0.b(j2))) {
            idm0.n(j, j2);
            if (Float.compare(daq0.c(j), daq0.c(j2)) > 0) {
                this.f22684a = j2;
                j = j2;
            }
        }
        if (eaq0.a(daq0.b(j3), 4294967296L)) {
            long jV = idm0.v(1.0E-4f, 4294967296L);
            idm0.n(j3, jV);
            if (Float.compare(daq0.c(j3), daq0.c(jV)) < 0) {
                jf4.o("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
                throw null;
            }
        }
        if (daq0.c(j) < 0.0f) {
            jf4.o("AutoSize.StepBased: minFontSize must not be negative");
            throw null;
        }
        if (daq0.c(j2) >= 0.0f) {
            return;
        }
        jf4.o("AutoSize.StepBased: maxFontSize must not be negative");
        throw null;
    }

    public static boolean a(a9q0 a9q0Var) {
        int i = a9q0Var.f491a.f;
        if (i == 1 || i == 3) {
            return a9q0Var.e() || a9q0Var.d();
        }
        if (i != 4 && i != 5 && i != 2) {
            jf4.o(kng0.l("TextOverflow type ", j9q0.a(i), " is not supported."));
            return false;
        }
        int i2 = a9q0Var.b.f;
        if (i2 != 0) {
            if (i2 == 1) {
                return a9q0Var.m(0);
            }
            if (i == 4 || i == 5) {
                return a9q0Var.e() || a9q0Var.d();
            }
            if (i == 2) {
                return a9q0Var.m(i2 - 1);
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof n05)) {
            return false;
        }
        n05 n05Var = (n05) obj;
        return daq0.a(n05Var.f22684a, this.f22684a) && daq0.a(n05Var.b, this.b) && daq0.a(n05Var.c, this.c);
    }

    public final int hashCode() {
        eaq0[] eaq0VarArr = daq0.b;
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f22684a) * 31, 31, this.b);
    }
}
