package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class acs extends dcs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yxk0 f643a;

    public acs(yxk0 yxk0Var) {
        yxk0Var.getClass();
        this.f643a = yxk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof acs) && this.f643a == ((acs) obj).f643a;
    }

    public final int hashCode() {
        return this.f643a.hashCode();
    }

    public final String toString() {
        return "ResetButton(betType=" + this.f643a + Separators.RPAREN;
    }
}
