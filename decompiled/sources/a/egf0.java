package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class egf0 implements hgf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7762a;

    public egf0(String str) {
        this.f7762a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof egf0) && this.f7762a.equals(((egf0) obj).f7762a);
    }

    public final int hashCode() {
        return this.f7762a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnKeyClicked(keyName=", this.f7762a, Separators.RPAREN);
    }
}
