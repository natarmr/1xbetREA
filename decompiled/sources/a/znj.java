package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class znj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44677a;
    public final aue0 b;

    public znj(long j, aue0 aue0Var) {
        aue0Var.getClass();
        this.f44677a = j;
        this.b = aue0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znj)) {
            return false;
        }
        znj znjVar = (znj) obj;
        return this.f44677a == znjVar.f44677a && this.b == znjVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + rw2.b(Boolean.hashCode(false) * 31, 31, this.f44677a);
    }

    public final String toString() {
        return "PaySystem(hasBackStack=false, balanceId=" + this.f44677a + ", registrationBonus=" + this.b + Separators.RPAREN;
    }

    public /* synthetic */ znj() {
        this(0L, aue0.c);
    }
}
