package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zid0 implements ejd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44435a;

    public zid0(String str) {
        this.f44435a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zid0) && this.f44435a.equals(((zid0) obj).f44435a);
    }

    public final int hashCode() {
        return this.f44435a.hashCode();
    }

    public final String toString() {
        return kng0.l("ExpiredTokenError(message=", this.f44435a, Separators.RPAREN);
    }
}
