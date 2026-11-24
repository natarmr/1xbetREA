package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class con implements gon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gho f4709a;
    public final long b;

    public con(gho ghoVar, long j) {
        this.f4709a = ghoVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof con)) {
            return false;
        }
        con conVar = (con) obj;
        return this.f4709a == conVar.f4709a && this.b == conVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f4709a.hashCode() * 31);
    }

    public final String toString() {
        return "OnMarketsGroupInfoButtonClick(eventSpecialBetType=" + this.f4709a + ", groupId=" + this.b + Separators.RPAREN;
    }
}
