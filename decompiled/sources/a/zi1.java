package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zi1 implements aj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzb0 f44418a;

    public zi1(uzb0 uzb0Var) {
        uzb0Var.getClass();
        this.f44418a = uzb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zi1) && this.f44418a == ((zi1) obj).f44418a;
    }

    public final int hashCode() {
        return this.f44418a.hashCode();
    }

    public final String toString() {
        return "ShowChooseSortTypeDialog(sortType=" + this.f44418a + Separators.RPAREN;
    }
}
