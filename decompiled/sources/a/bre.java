package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bre {
    public static final bre c = new bre("", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3077a;
    public final String b;

    public bre(String str, String str2) {
        this.f3077a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bre)) {
            return false;
        }
        bre breVar = (bre) obj;
        return this.f3077a.equals(breVar.f3077a) && this.b.equals(breVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3077a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("CountryModel(title=", this.f3077a, ", image=", this.b, Separators.RPAREN);
    }
}
