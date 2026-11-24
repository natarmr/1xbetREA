package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hzc0 implements izc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ma80 f13901a;

    public hzc0(ma80 ma80Var) {
        this.f13901a = ma80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hzc0) && this.f13901a == ((hzc0) obj).f13901a;
    }

    public final int hashCode() {
        return this.f13901a.hashCode();
    }

    public final String toString() {
        return "Theme(orientation=" + this.f13901a + Separators.RPAREN;
    }
}
