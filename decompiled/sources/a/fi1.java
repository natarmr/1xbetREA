package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class fi1 implements gi1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzb0 f9565a;

    public fi1(uzb0 uzb0Var) {
        this.f9565a = uzb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fi1) && this.f9565a == ((fi1) obj).f9565a;
    }

    public final int hashCode() {
        return this.f9565a.hashCode();
    }

    public final String toString() {
        return "OnSortTypeSelect(sortType=" + this.f9565a + Separators.RPAREN;
    }
}
