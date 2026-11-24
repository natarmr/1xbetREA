package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class x730 implements a830 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f40394a;
    public final boolean b;
    public final boolean c;

    public x730(udl0 udl0Var, boolean z, boolean z2) {
        this.f40394a = udl0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x730)) {
            return false;
        }
        x730 x730Var = (x730) obj;
        return this.f40394a == x730Var.f40394a && this.b == x730Var.b && this.c == x730Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f40394a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Progress(sportGameType=");
        sb.append(this.f40394a);
        sb.append(", isClassicRefactorEnabled=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
