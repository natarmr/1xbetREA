package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class g3f0 implements q3f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xpa0 f10608a;

    public g3f0(xpa0 xpa0Var) {
        this.f10608a = xpa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3f0) && this.f10608a == ((g3f0) obj).f10608a;
    }

    public final int hashCode() {
        return this.f10608a.hashCode();
    }

    public final String toString() {
        return "OnPoliticalExposedPersonFieldClick(politicalExposedPersonType=" + this.f10608a + Separators.RPAREN;
    }
}
