package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lfc implements nfc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19947a;

    public lfc(int i) {
        this.f19947a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lfc) && this.f19947a == ((lfc) obj).f19947a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19947a);
    }

    public final String toString() {
        return ua80.e(this.f19947a, "OnLanguageSelected(languageId=", Separators.RPAREN);
    }
}
