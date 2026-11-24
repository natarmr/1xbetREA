package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class lke0 implements oke0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kke0 f20199a;

    public lke0(kke0 kke0Var) {
        this.f20199a = kke0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lke0) && this.f20199a.equals(((lke0) obj).f20199a);
    }

    public final int hashCode() {
        return this.f20199a.hashCode();
    }

    public final String toString() {
        return "Content(model=" + this.f20199a + Separators.RPAREN;
    }
}
