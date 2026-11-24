package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t9e implements v9e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sv80 f33557a;

    public t9e(sv80 sv80Var) {
        sv80Var.getClass();
        this.f33557a = sv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t9e) && this.f33557a == ((t9e) obj).f33557a;
    }

    public final int hashCode() {
        return this.f33557a.hashCode();
    }

    public final String toString() {
        return "Action(participantActions=" + this.f33557a + Separators.RPAREN;
    }
}
