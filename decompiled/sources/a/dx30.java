package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dx30 implements kx30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6828a;

    public dx30(String str) {
        this.f6828a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dx30) && this.f6828a.equals(((dx30) obj).f6828a);
    }

    public final int hashCode() {
        return this.f6828a.hashCode();
    }

    public final String toString() {
        return kng0.l("Notify(betId=", this.f6828a, Separators.RPAREN);
    }
}
