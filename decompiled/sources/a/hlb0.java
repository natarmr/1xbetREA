package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hlb0 implements llb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f13251a;

    public hlb0(mdm mdmVar) {
        this.f13251a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hlb0) && this.f13251a.equals(((hlb0) obj).f13251a);
    }

    public final int hashCode() {
        return this.f13251a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f13251a, Separators.RPAREN);
    }
}
