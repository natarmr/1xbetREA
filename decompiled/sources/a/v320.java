package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class v320 implements a420 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8q0 f36715a;

    public v320(a8q0 a8q0Var) {
        this.f36715a = a8q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v320) && this.f36715a.equals(((v320) obj).f36715a);
    }

    public final int hashCode() {
        return this.f36715a.hashCode();
    }

    public final String toString() {
        return "ValueChange(inputValue=" + this.f36715a + Separators.RPAREN;
    }
}
