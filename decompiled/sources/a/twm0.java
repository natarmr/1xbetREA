package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class twm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34658a;
    public final String b;
    public final boolean c;

    public twm0(String str, long j, boolean z) {
        this.f34658a = j;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twm0)) {
            return false;
        }
        twm0 twm0Var = (twm0) obj;
        return this.f34658a == twm0Var.f34658a && this.b.equals(twm0Var.b) && this.c == twm0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Long.hashCode(this.f34658a) * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(axq.o(this.f34658a, "SubGameUiModel(id=", ", name=", this.b), ", isSelected=", this.c, Separators.RPAREN);
    }
}
