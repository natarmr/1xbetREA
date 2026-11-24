package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class kf40 implements tf40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hkl f18181a;

    public kf40(hkl hklVar) {
        this.f18181a = hklVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kf40) && this.f18181a.equals(((kf40) obj).f18181a);
    }

    @Override // a.tf40
    public final String getKey() {
        String strJ = sre0.f32672a.b(kf40.class).J();
        return strJ == null ? "" : strJ;
    }

    public final int hashCode() {
        return this.f18181a.hashCode();
    }

    public final String toString() {
        return "JackpotWidget(model=" + this.f18181a + Separators.RPAREN;
    }
}
