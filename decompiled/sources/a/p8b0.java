package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class p8b0 extends q8b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f26546a;

    public p8b0(Object obj) {
        this.f26546a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8b0) && this.f26546a.equals(((p8b0) obj).f26546a);
    }

    public final int hashCode() {
        return this.f26546a.hashCode();
    }

    public final String toString() {
        return f140.k(this.f26546a, "Loaded(content=", Separators.RPAREN);
    }
}
