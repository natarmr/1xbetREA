package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iqa0 implements zqa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final chq0 f15201a;

    public iqa0(chq0 chq0Var) {
        this.f15201a = chq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iqa0) && this.f15201a.equals(((iqa0) obj).f15201a);
    }

    public final int hashCode() {
        return this.f15201a.hashCode();
    }

    public final String toString() {
        return "OnFilterChipClick(filter=" + this.f15201a + Separators.RPAREN;
    }
}
