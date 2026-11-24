package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class oy00 implements yy00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ims f26038a;

    public final boolean equals(Object obj) {
        if (obj instanceof oy00) {
            return this.f26038a.equals(((oy00) obj).f26038a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26038a.hashCode();
    }

    public final String toString() {
        return "OnMatchInfoAction(value=" + this.f26038a + Separators.RPAREN;
    }
}
