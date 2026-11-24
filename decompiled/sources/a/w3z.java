package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class w3z implements x3z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9s f38520a;

    public w3z(k9s k9sVar) {
        this.f38520a = k9sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w3z) && this.f38520a.equals(((w3z) obj).f38520a);
    }

    public final int hashCode() {
        return this.f38520a.hashCode();
    }

    public final String toString() {
        return "Success(gameDetailsModel=" + this.f38520a + Separators.RPAREN;
    }
}
