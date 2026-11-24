package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ycm implements adm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final icm f42390a;

    public ycm(icm icmVar) {
        this.f42390a = icmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ycm) && this.f42390a.equals(((ycm) obj).f42390a);
    }

    public final int hashCode() {
        return this.f42390a.hashCode();
    }

    public final String toString() {
        return "Content(item=" + this.f42390a + Separators.RPAREN;
    }
}
