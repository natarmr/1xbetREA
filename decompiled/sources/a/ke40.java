package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ke40 implements le40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cu7 f18136a;

    public ke40(cu7 cu7Var) {
        cu7Var.getClass();
        this.f18136a = cu7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ke40) && this.f18136a == ((ke40) obj).f18136a;
    }

    public final int hashCode() {
        return this.f18136a.hashCode();
    }

    public final String toString() {
        return "Loading(mode=" + this.f18136a + Separators.RPAREN;
    }
}
