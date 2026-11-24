package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class j81 implements t81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16064a;

    public j81(String str) {
        this.f16064a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j81) && this.f16064a.equals(((j81) obj).f16064a);
    }

    public final int hashCode() {
        return this.f16064a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowInfoDialog(description=", this.f16064a, Separators.RPAREN);
    }
}
