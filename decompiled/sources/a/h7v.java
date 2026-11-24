package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class h7v implements j7v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hyl f12594a;

    public h7v(hyl hylVar) {
        this.f12594a = hylVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7v) && this.f12594a.equals(((h7v) obj).f12594a);
    }

    public final int hashCode() {
        return this.f12594a.hashCode();
    }

    public final String toString() {
        return "Content(dsChipUiModel=" + this.f12594a + Separators.RPAREN;
    }
}
