package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class e16 extends i16 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k390 f7023a;

    public e16(k390 k390Var) {
        this.f7023a = k390Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e16) && this.f7023a.equals(((e16) obj).f7023a);
    }

    public final int hashCode() {
        return this.f7023a.hashCode();
    }

    public final String toString() {
        return "PaidRotationCommand(payRotationModel=" + this.f7023a + Separators.RPAREN;
    }
}
