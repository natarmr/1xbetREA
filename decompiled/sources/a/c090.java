package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class c090 implements d090 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3513a;

    public c090(String str) {
        this.f3513a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c090) && this.f3513a.equals(((c090) obj).f3513a);
    }

    public final int hashCode() {
        return this.f3513a.hashCode();
    }

    public final String toString() {
        return kng0.l("TokenExpiredError(message=", this.f3513a, Separators.RPAREN);
    }
}
