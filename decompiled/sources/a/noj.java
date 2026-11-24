package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class noj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aue0 f23869a;

    public noj(aue0 aue0Var) {
        this.f23869a = aue0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof noj) && this.f23869a == ((noj) obj).f23869a;
    }

    public final int hashCode() {
        return this.f23869a.hashCode() + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return "Registration(hasBackStack=false, registrationDefaultBonus=" + this.f23869a + Separators.RPAREN;
    }
}
