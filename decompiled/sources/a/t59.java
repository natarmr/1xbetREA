package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class t59 implements y59 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vb8 f33356a;

    public t59(vb8 vb8Var) {
        this.f33356a = vb8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t59) && this.f33356a == ((t59) obj).f33356a;
    }

    public final int hashCode() {
        return this.f33356a.hashCode();
    }

    public final String toString() {
        return "OpenWindow(navigateToWindow=" + this.f33356a + Separators.RPAREN;
    }
}
