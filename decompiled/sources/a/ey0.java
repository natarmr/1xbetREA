package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ey0 implements jy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8b f8602a;

    public ey0(j8b j8bVar) {
        this.f8602a = j8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ey0) && this.f8602a.equals(((ey0) obj).f8602a);
    }

    public final int hashCode() {
        return this.f8602a.hashCode();
    }

    public final String toString() {
        return "OnAllClicked(item=" + this.f8602a + Separators.RPAREN;
    }
}
