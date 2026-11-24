package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class p3f implements c4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26297a;

    public p3f(String str) {
        this.f26297a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p3f) && this.f26297a.equals(((p3f) obj).f26297a);
    }

    public final int hashCode() {
        return this.f26297a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowDialogError(message=", this.f26297a, Separators.RPAREN);
    }
}
