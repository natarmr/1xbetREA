package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pgc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26947a;

    public final boolean equals(Object obj) {
        if (obj instanceof pgc) {
            return this.f26947a == ((pgc) obj).f26947a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26947a);
    }

    public final String toString() {
        return ua80.e(this.f26947a, "LanguageChosen(id=", Separators.RPAREN);
    }
}
