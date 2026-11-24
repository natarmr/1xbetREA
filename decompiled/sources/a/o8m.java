package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o8m implements q8m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m8m f24837a;

    public final boolean equals(Object obj) {
        if (obj instanceof o8m) {
            return this.f24837a.equals(((o8m) obj).f24837a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24837a.hashCode();
    }

    public final String toString() {
        return "Content(value=" + this.f24837a + Separators.RPAREN;
    }
}
