package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class r210 implements t210 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f29709a;

    public r210(mdm mdmVar) {
        this.f29709a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r210) && this.f29709a.equals(((r210) obj).f29709a);
    }

    public final int hashCode() {
        return this.f29709a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f29709a, Separators.RPAREN);
    }
}
