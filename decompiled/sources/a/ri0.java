package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ri0 implements ti0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ui0 f30514a;

    public ri0(ui0 ui0Var) {
        this.f30514a = ui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ri0) && this.f30514a == ((ri0) obj).f30514a;
    }

    public final int hashCode() {
        return this.f30514a.hashCode();
    }

    public final String toString() {
        return "ResType(type=" + this.f30514a + Separators.RPAREN;
    }
}
