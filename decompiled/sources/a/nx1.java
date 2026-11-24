package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nx1 implements by1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s9s0 f24261a;

    public nx1(s9s0 s9s0Var) {
        this.f24261a = s9s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx1) && this.f24261a == ((nx1) obj).f24261a;
    }

    public final int hashCode() {
        return this.f24261a.hashCode();
    }

    public final String toString() {
        return "OnBottomClicked(page=" + this.f24261a + Separators.RPAREN;
    }
}
