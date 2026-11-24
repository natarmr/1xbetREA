package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class u0w implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pdj f34874a;
    public final int b;

    public u0w(pdj pdjVar, int i) {
        this.f34874a = pdjVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0w)) {
            return false;
        }
        u0w u0wVar = (u0w) obj;
        return this.f34874a == u0wVar.f34874a && this.b == u0wVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f34874a.hashCode() * 31);
    }

    public final String toString() {
        return "HistoryDateFilterUiModel(type=" + this.f34874a + ", textColorResId=" + this.b + Separators.RPAREN;
    }
}
