package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dl7 implements kl7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6263a;

    public final boolean equals(Object obj) {
        if (obj instanceof dl7) {
            return this.f6263a.equals(((dl7) obj).f6263a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6263a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(message=", this.f6263a, Separators.RPAREN);
    }
}
