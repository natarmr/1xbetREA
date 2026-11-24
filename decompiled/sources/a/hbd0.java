package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hbd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12765a;
    public final aue0 b;

    public hbd0(int i, aue0 aue0Var) {
        this.f12765a = i;
        this.b = aue0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbd0)) {
            return false;
        }
        hbd0 hbd0Var = (hbd0) obj;
        return this.f12765a == hbd0Var.f12765a && this.b == hbd0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f12765a) * 31);
    }

    public final String toString() {
        return "Login(authReminderType=" + this.f12765a + ", registrationDefaultBonus=" + this.b + Separators.RPAREN;
    }
}
