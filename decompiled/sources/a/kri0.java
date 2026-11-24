package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kri0 implements ori0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18766a;

    public kri0(String str) {
        this.f18766a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kri0) && this.f18766a.equals(((kri0) obj).f18766a);
    }

    public final int hashCode() {
        return this.f18766a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowMessage(message=", this.f18766a, Separators.RPAREN);
    }
}
