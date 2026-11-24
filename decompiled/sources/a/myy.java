package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class myy implements nyy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f22626a;

    public myy(mdm mdmVar) {
        this.f22626a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof myy) && this.f22626a.equals(((myy) obj).f22626a);
    }

    public final int hashCode() {
        return this.f22626a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f22626a, Separators.RPAREN);
    }
}
