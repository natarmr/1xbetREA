package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vp0 implements bq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37789a;

    public vp0(String str) {
        this.f37789a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vp0) && this.f37789a.equals(((vp0) obj).f37789a);
    }

    public final int hashCode() {
        return this.f37789a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnProviderIconClick(id=", this.f37789a, Separators.RPAREN);
    }
}
