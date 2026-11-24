package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sqw implements yqw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32648a;

    public sqw(String str) {
        this.f32648a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sqw) && this.f32648a.equals(((sqw) obj).f32648a);
    }

    public final int hashCode() {
        return this.f32648a.hashCode();
    }

    public final String toString() {
        return kng0.l("HorseCardClick(id=", this.f32648a, Separators.RPAREN);
    }
}
