package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class r6j implements t6j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f29935a;

    public r6j(jkm jkmVar) {
        this.f29935a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r6j) && this.f29935a.equals(((r6j) obj).f29935a);
    }

    public final int hashCode() {
        return this.f29935a.hashCode();
    }

    public final String toString() {
        return twn.o("EmptyPrizes(config=", this.f29935a, Separators.RPAREN);
    }
}
