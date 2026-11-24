package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class n5z implements q5z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9s f22969a;

    public n5z(k9s k9sVar) {
        this.f22969a = k9sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5z) && this.f22969a.equals(((n5z) obj).f22969a);
    }

    public final int hashCode() {
        return this.f22969a.hashCode();
    }

    public final String toString() {
        return "Success(gameDetailsModel=" + this.f22969a + Separators.RPAREN;
    }
}
