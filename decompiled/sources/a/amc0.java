package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class amc0 implements dmc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rnc0 f1101a;

    public amc0(rnc0 rnc0Var) {
        this.f1101a = rnc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof amc0) && this.f1101a.equals(((amc0) obj).f1101a);
    }

    public final int hashCode() {
        return this.f1101a.hashCode();
    }

    public final String toString() {
        return "OnMenuItemClick(item=" + this.f1101a + Separators.RPAREN;
    }
}
