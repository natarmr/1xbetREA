package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class d6p implements f6p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f5561a;

    public d6p(jkm jkmVar) {
        this.f5561a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d6p) && this.f5561a.equals(((d6p) obj).f5561a);
    }

    public final int hashCode() {
        return this.f5561a.hashCode();
    }

    public final String toString() {
        return twn.o("Error(config=", this.f5561a, Separators.RPAREN);
    }
}
