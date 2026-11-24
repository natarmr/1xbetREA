package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class r6u0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29952a;
    public final String b;
    public final ArrayList c;

    public r6u0(long j, String str, ArrayList arrayList) {
        this.f29952a = j;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6u0)) {
            return false;
        }
        r6u0 r6u0Var = (r6u0) obj;
        return this.f29952a == r6u0Var.f29952a && this.b.equals(r6u0Var.b) && this.c.equals(r6u0Var.c);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof r6u0) && (p6t0Var2 instanceof r6u0) && ((r6u0) p6t0Var).f29952a == ((r6u0) p6t0Var2).f29952a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f29952a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f29952a, "VenueUiModel(id=", ", title=", this.b);
        sbO.append(", description=");
        sbO.append(this.c);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
