package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pt3 implements vt3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27544a;

    public pt3(String str) {
        this.f27544a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pt3) && this.f27544a.equals(((pt3) obj).f27544a);
    }

    public final int hashCode() {
        return this.f27544a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSessionTimeIsEnd(message=", this.f27544a, Separators.RPAREN);
    }
}
