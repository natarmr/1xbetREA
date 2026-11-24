package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dad implements fad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f5741a;

    public dad(j83 j83Var) {
        this.f5741a = j83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dad) && this.f5741a.equals(((dad) obj).f5741a);
    }

    public final int hashCode() {
        return this.f5741a.hashCode();
    }

    public final String toString() {
        return "Label(value=" + ((Object) this.f5741a) + Separators.RPAREN;
    }
}
