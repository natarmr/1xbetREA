package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jcx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16301a;
    public final String b;

    public jcx(String str, String str2) {
        this.f16301a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcx)) {
            return false;
        }
        jcx jcxVar = (jcx) obj;
        return this.f16301a.equals(jcxVar.f16301a) && this.b.equals(jcxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16301a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("InjuryModel(date=", this.f16301a, ", injury=", this.b, Separators.RPAREN);
    }
}
