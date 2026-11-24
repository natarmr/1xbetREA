package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ht00 implements jt00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rue0 f13608a;

    public ht00(rue0 rue0Var) {
        this.f13608a = rue0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ht00) && this.f13608a.equals(((ht00) obj).f13608a);
    }

    public final int hashCode() {
        return this.f13608a.hashCode();
    }

    public final String toString() {
        return "ExitWithResult(item=" + this.f13608a + Separators.RPAREN;
    }
}
