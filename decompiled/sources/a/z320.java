package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class z320 implements a420 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8q0 f43698a;

    public z320(a8q0 a8q0Var) {
        this.f43698a = a8q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z320) && this.f43698a.equals(((z320) obj).f43698a);
    }

    public final int hashCode() {
        return this.f43698a.hashCode();
    }

    public final String toString() {
        return "ValueChange(inputValue=" + this.f43698a + Separators.RPAREN;
    }
}
