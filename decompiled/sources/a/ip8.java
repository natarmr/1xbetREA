package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ip8 implements lp8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q00 f15150a;

    public ip8(q00 q00Var) {
        this.f15150a = q00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ip8) && this.f15150a.equals(((ip8) obj).f15150a);
    }

    public final int hashCode() {
        return this.f15150a.hashCode();
    }

    public final String toString() {
        return "AdditionalTop(additionalTopPresetDsModel=" + this.f15150a + Separators.RPAREN;
    }
}
