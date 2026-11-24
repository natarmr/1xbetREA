package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rcd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30234a;

    public rcd0(String str) {
        this.f30234a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rcd0) && this.f30234a.equals(((rcd0) obj).f30234a);
    }

    public final int hashCode() {
        return this.f30234a.hashCode();
    }

    public final String toString() {
        return kng0.l("Scanner(type=", this.f30234a, Separators.RPAREN);
    }
}
