package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class x4s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v4s f40282a;

    public final boolean equals(Object obj) {
        if (obj instanceof x4s) {
            return this.f40282a == ((x4s) obj).f40282a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40282a.hashCode();
    }

    public final String toString() {
        return "GameTypeChanged(type=" + this.f40282a + Separators.RPAREN;
    }
}
