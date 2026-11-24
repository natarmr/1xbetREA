package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class r4l0 implements c5l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cmb0 f29841a;

    public r4l0(cmb0 cmb0Var) {
        this.f29841a = cmb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r4l0) && this.f29841a == ((r4l0) obj).f29841a;
    }

    public final int hashCode() {
        return this.f29841a.hashCode();
    }

    public final String toString() {
        return "UpdatePopularTopType(type=" + this.f29841a + Separators.RPAREN;
    }
}
