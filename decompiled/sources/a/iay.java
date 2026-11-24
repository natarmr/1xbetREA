package a;

/* JADX INFO: loaded from: classes2.dex */
public final class iay {
    public static final iay f = new iay(null, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p860 f14460a;
    public final wx40 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public iay(p860 p860Var, wx40 wx40Var, boolean z, boolean z2, boolean z3) {
        this.f14460a = p860Var;
        this.b = wx40Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iay)) {
            return false;
        }
        iay iayVar = (iay) obj;
        return this.f14460a == iayVar.f14460a && this.b == iayVar.b && this.c == iayVar.c && this.d == iayVar.d && this.e == iayVar.e;
    }

    public final int hashCode() {
        p860 p860Var = this.f14460a;
        int iHashCode = (p860Var == null ? 0 : p860Var.hashCode()) * 31;
        wx40 wx40Var = this.b;
        return Boolean.hashCode(this.e) + brm0.e(brm0.e((iHashCode + (wx40Var != null ? wx40Var.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb.append(this.f14460a);
        sb.append(", mutability=");
        sb.append(this.b);
        sb.append(", definitelyNotNull=");
        sb.append(this.c);
        sb.append(", isNullabilityQualifierForWarning=");
        sb.append(this.d);
        sb.append(", isMutabilityQualifierForWarning=");
        return brm0.o(sb, this.e, ')');
    }

    public /* synthetic */ iay(p860 p860Var, boolean z) {
        this(p860Var, null, z, false, false);
    }
}
