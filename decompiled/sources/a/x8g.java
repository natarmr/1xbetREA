package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class x8g implements y8g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f40460a;

    public x8g(jkm jkmVar) {
        this.f40460a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x8g) && this.f40460a.equals(((x8g) obj).f40460a);
    }

    public final int hashCode() {
        return this.f40460a.hashCode();
    }

    public final String toString() {
        return twn.o("ErrorState(lottieConfig=", this.f40460a, Separators.RPAREN);
    }
}
