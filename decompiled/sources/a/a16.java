package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class a16 extends i16 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final le8 f55a;

    public a16(le8 le8Var) {
        this.f55a = le8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a16) && this.f55a.equals(((a16) obj).f55a);
    }

    public final int hashCode() {
        return this.f55a.hashCode();
    }

    public final String toString() {
        return "GameFinishedCommand(result=" + this.f55a + Separators.RPAREN;
    }
}
