package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class a9f0 implements s9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ggt f473a;

    public a9f0(ggt ggtVar) {
        this.f473a = ggtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9f0) && this.f473a == ((a9f0) obj).f473a;
    }

    public final int hashCode() {
        return this.f473a.hashCode();
    }

    public final String toString() {
        return "OnGenderFieldClick(genderType=" + this.f473a + Separators.RPAREN;
    }
}
