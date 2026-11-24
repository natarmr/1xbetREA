package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class un7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q4f f35947a;
    public final boolean b;

    public un7(q4f q4fVar, boolean z) {
        q4fVar.getClass();
        this.f35947a = q4fVar;
        this.b = z;
    }

    public static un7 a(un7 un7Var, boolean z) {
        q4f q4fVar = un7Var.f35947a;
        un7Var.getClass();
        q4fVar.getClass();
        return new un7(q4fVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un7)) {
            return false;
        }
        un7 un7Var = (un7) obj;
        return this.f35947a == un7Var.f35947a && this.b == un7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f35947a.hashCode() * 31);
    }

    public final String toString() {
        return "BetTypeFilterModel(betType=" + this.f35947a + ", isSelected=" + this.b + Separators.RPAREN;
    }
}
