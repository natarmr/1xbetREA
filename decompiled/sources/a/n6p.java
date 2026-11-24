package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class n6p implements o6p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s9p f23006a;

    public n6p(s9p s9pVar) {
        this.f23006a = s9pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6p) && this.f23006a.equals(((n6p) obj).f23006a);
    }

    public final int hashCode() {
        return this.f23006a.hashCode();
    }

    public final String toString() {
        return "OnSelect(groupModel=" + this.f23006a + Separators.RPAREN;
    }
}
