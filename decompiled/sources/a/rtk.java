package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rtk implements vtk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f31082a;

    public rtk(jkm jkmVar) {
        this.f31082a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rtk) && this.f31082a.equals(((rtk) obj).f31082a);
    }

    public final int hashCode() {
        return this.f31082a.hashCode();
    }

    public final String toString() {
        return twn.o("Empty(config=", this.f31082a, Separators.RPAREN);
    }
}
