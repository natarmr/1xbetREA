package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a30 implements v30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148a;

    public a30(String str) {
        this.f148a = str;
    }

    @Override // a.v30
    public final String a() {
        return this.f148a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a30) && this.f148a.equals(((a30) obj).f148a);
    }

    public final int hashCode() {
        return this.f148a.hashCode();
    }

    public final String toString() {
        return kng0.l("Animated(advanceTitle=", this.f148a, Separators.RPAREN);
    }
}
