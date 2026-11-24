package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dlp implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6295a;
    public final int b;

    public dlp(boolean z, int i) {
        this.f6295a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlp)) {
            return false;
        }
        dlp dlpVar = (dlp) obj;
        return this.f6295a == dlpVar.f6295a && this.b == dlpVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.f6295a) * 31);
    }

    public final String toString() {
        return "Favorite(value=" + this.f6295a + ", iconRes=" + this.b + Separators.RPAREN;
    }
}
