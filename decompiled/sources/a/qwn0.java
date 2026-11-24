package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qwn0 implements uwn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fzc f29444a;

    public final boolean equals(Object obj) {
        if (obj instanceof qwn0) {
            return this.f29444a == ((qwn0) obj).f29444a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29444a.hashCode();
    }

    public final String toString() {
        return "CoefColor(coefColorType=" + this.f29444a + Separators.RPAREN;
    }
}
