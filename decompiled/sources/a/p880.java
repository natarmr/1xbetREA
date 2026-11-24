package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class p880 implements w880 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26542a;

    public p880(String str) {
        this.f26542a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p880) && this.f26542a.equals(((p880) obj).f26542a);
    }

    public final int hashCode() {
        return this.f26542a.hashCode();
    }

    public final String toString() {
        return kng0.l("CallbackOrdered(message=", this.f26542a, Separators.RPAREN);
    }
}
