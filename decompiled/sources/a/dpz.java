package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class dpz implements epz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v95 f6489a;

    public final boolean equals(Object obj) {
        if (obj instanceof dpz) {
            return this.f6489a.equals(((dpz) obj).f6489a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6489a.hashCode();
    }

    public final String toString() {
        return "OnTimeSelected(availableValueUiModel=" + this.f6489a + Separators.RPAREN;
    }
}
