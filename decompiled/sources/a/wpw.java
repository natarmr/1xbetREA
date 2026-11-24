package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wpw implements aqw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gqw f39563a;

    public wpw(gqw gqwVar) {
        this.f39563a = gqwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wpw) && this.f39563a.equals(((wpw) obj).f39563a);
    }

    public final int hashCode() {
        return this.f39563a.hashCode();
    }

    public final String toString() {
        return "OnItemClick(menuType=" + this.f39563a + Separators.RPAREN;
    }
}
