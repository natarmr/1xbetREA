package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q3i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f28054a;
    public final mfj b;
    public final mfj c;

    /* JADX WARN: Multi-variable type inference failed */
    public q3i0(int i, mfj mfjVar, mfj mfjVar2) {
        this.f28054a = i;
        this.b = mfjVar;
        this.c = mfjVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3i0)) {
            return false;
        }
        q3i0 q3i0Var = (q3i0) obj;
        return this.f28054a == q3i0Var.f28054a && this.b.equals(q3i0Var.b) && this.c.equals(q3i0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f28054a) * 31)) * 31);
    }

    public final String toString() {
        return "DateSelectionUiState(selectedFilterId=" + ((int) this.f28054a) + ", startDateValue=" + this.b + ", endDateValue=" + this.c + Separators.RPAREN;
    }
}
