package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class k1k implements u1k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r6w f17528a;

    public k1k(r6w r6wVar) {
        this.f17528a = r6wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1k) && this.f17528a == ((k1k) obj).f17528a;
    }

    public final int hashCode() {
        return this.f17528a.hashCode();
    }

    public final String toString() {
        return "OnPushSettingsCancelClick(historyScreenType=" + this.f17528a + Separators.RPAREN;
    }
}
