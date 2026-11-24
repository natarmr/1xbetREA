package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class j4o implements s4o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ims f15893a;

    public final boolean equals(Object obj) {
        if (obj instanceof j4o) {
            return this.f15893a.equals(((j4o) obj).f15893a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15893a.hashCode();
    }

    public final String toString() {
        return "OnMatchInfoAction(value=" + this.f15893a + Separators.RPAREN;
    }
}
