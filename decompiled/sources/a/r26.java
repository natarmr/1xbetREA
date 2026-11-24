package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r26 implements v26 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f29715a;

    public r26(jkm jkmVar) {
        this.f29715a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r26) && this.f29715a.equals(((r26) obj).f29715a);
    }

    public final int hashCode() {
        return this.f29715a.hashCode();
    }

    public final String toString() {
        return twn.o("Error(lottieEmptyConfig=", this.f29715a, Separators.RPAREN);
    }
}
