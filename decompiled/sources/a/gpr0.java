package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gpr0 implements ipr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kfk0 f11698a;

    public gpr0(kfk0 kfk0Var) {
        this.f11698a = kfk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gpr0) && this.f11698a == ((gpr0) obj).f11698a;
    }

    public final int hashCode() {
        return this.f11698a.hashCode();
    }

    public final String toString() {
        return "OnSnapStateChanges(snapState=" + this.f11698a + Separators.RPAREN;
    }
}
