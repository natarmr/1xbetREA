package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ru0 implements su0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av0 f31101a;

    public ru0(av0 av0Var) {
        this.f31101a = av0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ru0) && this.f31101a == ((ru0) obj).f31101a;
    }

    public final int hashCode() {
        return this.f31101a.hashCode();
    }

    public final String toString() {
        return "SelectMode(mode=" + this.f31101a + Separators.RPAREN;
    }
}
