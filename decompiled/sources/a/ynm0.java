package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ynm0 implements bom0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aoq0 f42948a;

    public ynm0(aoq0 aoq0Var) {
        this.f42948a = aoq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ynm0) && this.f42948a.equals(((ynm0) obj).f42948a);
    }

    public final int hashCode() {
        return this.f42948a.hashCode();
    }

    public final String toString() {
        return "Line(eventDate=" + this.f42948a + Separators.RPAREN;
    }
}
