package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class inl0 implements pnl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cum f15079a;

    public inl0(cum cumVar) {
        this.f15079a = cumVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof inl0) && this.f15079a.equals(((inl0) obj).f15079a);
    }

    public final int hashCode() {
        return this.f15079a.hashCode();
    }

    public final String toString() {
        return "Cricket(model=" + this.f15079a + Separators.RPAREN;
    }
}
