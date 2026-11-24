package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class i730 implements l730 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h730 f14272a;

    public i730(h730 h730Var) {
        this.f14272a = h730Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i730) && this.f14272a == ((i730) obj).f14272a;
    }

    public final int hashCode() {
        return this.f14272a.hashCode();
    }

    public final String toString() {
        return "Error(currentMode=" + this.f14272a + Separators.RPAREN;
    }
}
