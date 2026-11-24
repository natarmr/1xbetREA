package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bfe extends hfe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2497a;

    public bfe(Object obj) {
        this.f2497a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bfe) && this.f2497a.equals(((bfe) obj).f2497a);
    }

    public final int hashCode() {
        return this.f2497a.hashCode();
    }

    public final String toString() {
        return f140.k(this.f2497a, "Loaded(content=", Separators.RPAREN);
    }
}
