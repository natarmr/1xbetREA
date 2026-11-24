package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mn6 implements qn6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9a0 f22074a;

    public mn6(d9a0 d9a0Var) {
        this.f22074a = d9a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mn6) && this.f22074a.equals(((mn6) obj).f22074a);
    }

    public final int hashCode() {
        return this.f22074a.hashCode();
    }

    public final String toString() {
        return "OnPlayerClick(player=" + this.f22074a + Separators.RPAREN;
    }
}
