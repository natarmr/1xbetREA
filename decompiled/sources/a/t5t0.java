package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class t5t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lui0 f33386a;

    public t5t0(lui0 lui0Var) {
        this.f33386a = lui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t5t0) && this.f33386a == ((t5t0) obj).f33386a;
    }

    public final int hashCode() {
        return this.f33386a.hashCode();
    }

    public final String toString() {
        return "UfcPostGameToolbarUiModel(settingState=" + this.f33386a + Separators.RPAREN;
    }
}
