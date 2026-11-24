package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class oq6 implements sq6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9a0 f25672a;

    public oq6(d9a0 d9a0Var) {
        this.f25672a = d9a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oq6) && this.f25672a.equals(((oq6) obj).f25672a);
    }

    public final int hashCode() {
        return this.f25672a.hashCode();
    }

    public final String toString() {
        return "OnPlayerClick(player=" + this.f25672a + Separators.RPAREN;
    }
}
