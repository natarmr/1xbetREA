package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class r5j implements v5j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jr1 f29888a;

    public r5j(jr1 jr1Var) {
        this.f29888a = jr1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r5j) && this.f29888a.equals(((r5j) obj).f29888a);
    }

    public final int hashCode() {
        return this.f29888a.c.hashCode();
    }

    public final String toString() {
        return "NavigateToTab(tab=" + this.f29888a + Separators.RPAREN;
    }
}
