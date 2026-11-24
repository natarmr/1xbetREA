package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class lwa implements mwa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fwa f20756a;

    public lwa(fwa fwaVar) {
        this.f20756a = fwaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lwa) && this.f20756a == ((lwa) obj).f20756a;
    }

    public final int hashCode() {
        return this.f20756a.hashCode();
    }

    public final String toString() {
        return "Shimmer(type=" + this.f20756a + Separators.RPAREN;
    }
}
