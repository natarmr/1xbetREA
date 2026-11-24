package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class cv40 implements cd40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5015a;
    public final bv40 b;
    public final bv40 c;

    public cv40(float f, bv40 bv40Var, bv40 bv40Var2) {
        this.f5015a = f;
        this.b = bv40Var;
        this.c = bv40Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cv40)) {
            return false;
        }
        cv40 cv40Var = (cv40) obj;
        return Float.compare(this.f5015a, cv40Var.f5015a) == 0 && Objects.equals(this.b, cv40Var.b) && Objects.equals(this.c, cv40Var.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f5015a) * 31;
        bv40 bv40Var = this.b;
        int iHashCode2 = (iHashCode + (bv40Var != null ? bv40Var.hashCode() : 0)) * 31;
        bv40 bv40Var2 = this.c;
        return iHashCode2 + (bv40Var2 != null ? bv40Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.f5015a + ", field 1=" + this.b + ", field 2=" + this.c;
    }
}
