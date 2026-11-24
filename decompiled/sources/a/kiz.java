package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class kiz implements miz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rf5 f18360a;

    public kiz(rf5 rf5Var) {
        this.f18360a = rf5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kiz) && this.f18360a.equals(((kiz) obj).f18360a);
    }

    public final int hashCode() {
        return this.f18360a.hashCode();
    }

    public final String toString() {
        return "Badge(badgeStyle=" + this.f18360a + Separators.RPAREN;
    }
}
