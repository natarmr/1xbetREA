package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nyp implements pyp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9m f24339a;

    public nyp(n9m n9mVar) {
        this.f24339a = n9mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nyp) && this.f24339a.equals(((nyp) obj).f24339a);
    }

    public final int hashCode() {
        return this.f24339a.hashCode();
    }

    public final String toString() {
        return "Content(profilePreview=" + this.f24339a + Separators.RPAREN;
    }
}
