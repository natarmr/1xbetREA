package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class hj00 implements kj00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f13140a;

    public hj00(mdm mdmVar) {
        this.f13140a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hj00) && this.f13140a.equals(((hj00) obj).f13140a);
    }

    public final int hashCode() {
        return this.f13140a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f13140a, Separators.RPAREN);
    }
}
