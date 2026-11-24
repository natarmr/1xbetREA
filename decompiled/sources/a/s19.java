package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class s19 implements t19 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzb0 f31444a;

    public s19(uzb0 uzb0Var) {
        uzb0Var.getClass();
        this.f31444a = uzb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s19) && this.f31444a == ((s19) obj).f31444a;
    }

    public final int hashCode() {
        return this.f31444a.hashCode();
    }

    public final String toString() {
        return "ShowChooseSortTypeDialog(sortType=" + this.f31444a + Separators.RPAREN;
    }
}
