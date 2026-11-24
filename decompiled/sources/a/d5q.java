package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class d5q implements g5q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmy f5519a;

    public d5q(nmy nmyVar) {
        this.f5519a = nmyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d5q) && this.f5519a == ((d5q) obj).f5519a;
    }

    public final int hashCode() {
        return this.f5519a.hashCode();
    }

    public final String toString() {
        return "OnFilterChose(filterType=" + this.f5519a + Separators.RPAREN;
    }
}
