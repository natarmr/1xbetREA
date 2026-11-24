package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class c8v implements e8v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfo0 f3934a;

    public final boolean equals(Object obj) {
        if (obj instanceof c8v) {
            return this.f3934a == ((c8v) obj).f3934a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3934a.hashCode();
    }

    public final String toString() {
        return "OnSelectTab(tabType=" + this.f3934a + Separators.RPAREN;
    }
}
