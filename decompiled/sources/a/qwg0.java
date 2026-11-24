package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qwg0 implements rwg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dvh0 f29435a;

    public qwg0(dvh0 dvh0Var) {
        this.f29435a = dvh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qwg0) && this.f29435a == ((qwg0) obj).f29435a;
    }

    public final int hashCode() {
        return this.f29435a.hashCode();
    }

    public final String toString() {
        return "OnlyOneEnabled(enabledBarType=" + this.f29435a + Separators.RPAREN;
    }
}
