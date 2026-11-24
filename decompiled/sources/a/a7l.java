package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class a7l implements e7l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa30 f376a;

    public final boolean equals(Object obj) {
        if (obj instanceof a7l) {
            return this.f376a.equals(((a7l) obj).f376a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f376a.hashCode();
    }

    public final String toString() {
        return "SendGameMatchInfoSideEffect(value=" + this.f376a + Separators.RPAREN;
    }
}
