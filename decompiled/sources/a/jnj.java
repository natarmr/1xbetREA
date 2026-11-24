package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jnj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aue0 f16816a;
    public final int b;

    public jnj(int i, aue0 aue0Var) {
        this.f16816a = aue0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnj)) {
            return false;
        }
        jnj jnjVar = (jnj) obj;
        return this.f16816a == jnjVar.f16816a && this.b == jnjVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + ((this.f16816a.hashCode() + (Boolean.hashCode(false) * 31)) * 31);
    }

    public final String toString() {
        return "Login(hasBackStack=false, registrationDefaultBonus=" + this.f16816a + ", authReminderType=" + this.b + Separators.RPAREN;
    }
}
