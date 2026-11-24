package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jci0 implements tci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16279a;

    public jci0(String str) {
        this.f16279a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jci0) && this.f16279a.equals(((jci0) obj).f16279a);
    }

    public final int hashCode() {
        return this.f16279a.hashCode();
    }

    public final String toString() {
        return kng0.l("ExpiredTokenError(message=", this.f16279a, Separators.RPAREN);
    }
}
