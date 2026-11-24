package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ym1 implements fn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8b f42865a;

    public ym1(j8b j8bVar) {
        this.f42865a = j8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ym1) && this.f42865a.equals(((ym1) obj).f42865a);
    }

    public final int hashCode() {
        return this.f42865a.hashCode();
    }

    public final String toString() {
        return "OnAllClicked(item=" + this.f42865a + Separators.RPAREN;
    }
}
