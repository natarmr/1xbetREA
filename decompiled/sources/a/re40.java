package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class re40 implements ef40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vbj f30317a;

    public re40(vbj vbjVar) {
        this.f30317a = vbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof re40) && this.f30317a.equals(((re40) obj).f30317a);
    }

    @Override // a.ef40
    public final String getKey() {
        return "GUEST_RECOMMENDED_KEY";
    }

    @Override // a.ef40
    public final vbj getState() {
        return this.f30317a;
    }

    public final int hashCode() {
        return this.f30317a.hashCode();
    }

    public final String toString() {
        return "GamesSpinner(state=" + this.f30317a + Separators.RPAREN;
    }
}
