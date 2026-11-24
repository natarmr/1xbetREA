package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class l1k implements u1k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r6w f19258a;

    public l1k(r6w r6wVar) {
        this.f19258a = r6wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1k) && this.f19258a == ((l1k) obj).f19258a;
    }

    public final int hashCode() {
        return this.f19258a.hashCode();
    }

    public final String toString() {
        return "OnPushSettingsClick(historyScreenType=" + this.f19258a + Separators.RPAREN;
    }
}
