package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class f0z implements l0z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3q f8739a;

    public f0z(n3q n3qVar) {
        this.f8739a = n3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0z) && this.f8739a == ((f0z) obj).f8739a;
    }

    public final int hashCode() {
        return this.f8739a.hashCode();
    }

    public final String toString() {
        return "OnFilterSelect(filter=" + this.f8739a + Separators.RPAREN;
    }
}
