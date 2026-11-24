package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class p5z implements q5z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9s f26428a;

    public p5z(k9s k9sVar) {
        this.f26428a = k9sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p5z) && this.f26428a.equals(((p5z) obj).f26428a);
    }

    public final int hashCode() {
        return this.f26428a.hashCode();
    }

    public final String toString() {
        return "Success(gameDetailsModel=" + this.f26428a + Separators.RPAREN;
    }
}
