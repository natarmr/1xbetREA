package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class k730 implements l730 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17800a;

    public k730(String str) {
        this.f17800a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k730) && this.f17800a.equals(((k730) obj).f17800a);
    }

    public final int hashCode() {
        return this.f17800a.hashCode();
    }

    public final String toString() {
        return kng0.l("Success(playerId=", this.f17800a, Separators.RPAREN);
    }
}
