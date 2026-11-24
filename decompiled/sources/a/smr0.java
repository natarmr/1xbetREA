package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class smr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32461a;
    public final boolean b;

    public smr0(String str, boolean z) {
        this.f32461a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smr0)) {
            return false;
        }
        smr0 smr0Var = (smr0) obj;
        return this.f32461a.equals(smr0Var.f32461a) && this.b == smr0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f32461a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("TotoBottomBarUiModel(counter=", this.f32461a, ", isMakeBetEnabled=", this.b, Separators.RPAREN);
    }
}
