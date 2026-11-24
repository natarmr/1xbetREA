package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class r5g implements v5g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29883a;
    public final boolean b;
    public final int c;

    public r5g(String str, int i, boolean z) {
        this.f29883a = str;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5g)) {
            return false;
        }
        r5g r5gVar = (r5g) obj;
        return this.f29883a.equals(r5gVar.f29883a) && this.b == r5gVar.b && this.c == r5gVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + brm0.e(this.f29883a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, brm0.u("DisciplineImage(imageUrl=", this.f29883a, ", isAvailable=", this.b, ", placeholderRes="));
    }
}
