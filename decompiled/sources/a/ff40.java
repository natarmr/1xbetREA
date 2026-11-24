package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ff40 implements tf40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hkl f9434a;

    public ff40(hkl hklVar) {
        this.f9434a = hklVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ff40) && this.f9434a.equals(((ff40) obj).f9434a);
    }

    @Override // a.tf40
    public final String getKey() {
        String strJ = sre0.f32672a.b(ff40.class).J();
        return strJ == null ? "" : strJ;
    }

    public final int hashCode() {
        return this.f9434a.hashCode();
    }

    public final String toString() {
        return "BonusRegistrationBanner(model=" + this.f9434a + Separators.RPAREN;
    }
}
