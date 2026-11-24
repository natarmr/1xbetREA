package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class k79 implements n79 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vb8 f17809a;

    public k79(vb8 vb8Var) {
        this.f17809a = vb8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k79) && this.f17809a == ((k79) obj).f17809a;
    }

    public final int hashCode() {
        return this.f17809a.hashCode();
    }

    public final String toString() {
        return "OpenWindow(navigateToWindow=" + this.f17809a + Separators.RPAREN;
    }
}
