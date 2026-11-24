package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class f4o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f8925a;

    public f4o(imm immVar) {
        this.f8925a = immVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f4o) && this.f8925a.equals(((f4o) obj).f8925a);
    }

    public final int hashCode() {
        return this.f8925a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f8925a, "EsportsToolbarUiModel(model=", Separators.RPAREN);
    }
}
