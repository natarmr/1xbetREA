package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class l490 implements q490 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mbu0 f19392a;

    public l490(mbu0 mbu0Var) {
        this.f19392a = mbu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l490) && this.f19392a == ((l490) obj).f19392a;
    }

    public final int hashCode() {
        return this.f19392a.hashCode();
    }

    public final String toString() {
        return "OnPassVerification(type=" + this.f19392a + Separators.RPAREN;
    }
}
