package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gat0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f10987a;

    public gat0(imm immVar) {
        this.f10987a = immVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gat0) && this.f10987a.equals(((gat0) obj).f10987a);
    }

    public final int hashCode() {
        return this.f10987a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f10987a, "UniversalChampNavigationBarUiModel(model=", Separators.RPAREN);
    }
}
