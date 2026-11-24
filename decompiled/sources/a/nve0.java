package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nve0 implements hwe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hgt f24186a;

    public nve0(hgt hgtVar) {
        this.f24186a = hgtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nve0) && this.f24186a == ((nve0) obj).f24186a;
    }

    public final int hashCode() {
        return this.f24186a.hashCode();
    }

    public final String toString() {
        return "OnGenderFieldClick(genderType=" + this.f24186a + Separators.RPAREN;
    }
}
