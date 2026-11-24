package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nn0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yl0 f23797a;

    public nn0(yl0 yl0Var) {
        this.f23797a = yl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nn0) && this.f23797a.equals(((nn0) obj).f23797a);
    }

    public final int hashCode() {
        return this.f23797a.hashCode();
    }

    public final String toString() {
        return "Games(item=" + this.f23797a + Separators.RPAREN;
    }
}
