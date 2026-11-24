package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zc80 implements cd80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tn60 f44155a;

    public zc80(tn60 tn60Var) {
        this.f44155a = tn60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc80) && this.f44155a.equals(((zc80) obj).f44155a);
    }

    public final int hashCode() {
        return this.f44155a.hashCode();
    }

    public final String toString() {
        return "SendOneXGamesSideEffect(internalEffect=" + this.f44155a + Separators.RPAREN;
    }
}
