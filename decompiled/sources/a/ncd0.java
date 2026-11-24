package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ncd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aue0 f23288a;

    public ncd0(aue0 aue0Var) {
        this.f23288a = aue0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ncd0) && this.f23288a == ((ncd0) obj).f23288a;
    }

    public final int hashCode() {
        return this.f23288a.hashCode();
    }

    public final String toString() {
        return "Registration(registrationDefaultBonus=" + this.f23288a + Separators.RPAREN;
    }
}
