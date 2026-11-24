package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class pf40 implements tf40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wyh f26883a;

    public pf40(wyh wyhVar) {
        this.f26883a = wyhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pf40) && this.f26883a.equals(((pf40) obj).f26883a);
    }

    @Override // a.tf40
    public final String getKey() {
        String strJ = sre0.f32672a.b(pf40.class).J();
        return strJ == null ? "" : strJ;
    }

    public final int hashCode() {
        return this.f26883a.hashCode();
    }

    public final String toString() {
        return "RegistrationBanner(model=" + this.f26883a + Separators.RPAREN;
    }
}
