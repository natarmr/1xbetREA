package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class h7f0 implements n7f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12571a;

    public h7f0(String str) {
        this.f12571a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7f0) && this.f12571a.equals(((h7f0) obj).f12571a);
    }

    public final int hashCode() {
        return this.f12571a.hashCode();
    }

    public final String toString() {
        return kng0.l("CopyLoginPassword(parsedLoginPassword=", this.f12571a, Separators.RPAREN);
    }
}
