package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class zce implements pde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f44162a;

    public zce(mdm mdmVar) {
        this.f44162a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zce) && this.f44162a.equals(((zce) obj).f44162a);
    }

    public final int hashCode() {
        return this.f44162a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottie=", this.f44162a, Separators.RPAREN);
    }
}
