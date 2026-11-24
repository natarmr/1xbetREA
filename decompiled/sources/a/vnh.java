package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vnh implements xnh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qnh f37718a;

    public final boolean equals(Object obj) {
        if (obj instanceof vnh) {
            return this.f37718a.equals(((vnh) obj).f37718a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37718a.hashCode();
    }

    public final String toString() {
        return "Content(value=" + this.f37718a + Separators.RPAREN;
    }
}
