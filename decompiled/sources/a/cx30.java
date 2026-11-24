package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cx30 implements kx30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5106a;

    public cx30(String str) {
        this.f5106a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cx30) && this.f5106a.equals(((cx30) obj).f5106a);
    }

    public final int hashCode() {
        return this.f5106a.hashCode();
    }

    public final String toString() {
        return kng0.l("More(betId=", this.f5106a, Separators.RPAREN);
    }
}
