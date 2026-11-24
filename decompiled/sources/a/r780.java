package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class r780 implements x780 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29967a;

    public r780(String str) {
        this.f29967a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r780) && this.f29967a.equals(((r780) obj).f29967a);
    }

    public final int hashCode() {
        return this.f29967a.hashCode();
    }

    public final String toString() {
        return kng0.l("CallbackOrdered(message=", this.f29967a, Separators.RPAREN);
    }
}
