package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class iu30 implements cv30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r040 f15380a;

    public iu30(r040 r040Var) {
        r040Var.getClass();
        this.f15380a = r040Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iu30) && this.f15380a == ((iu30) obj).f15380a;
    }

    public final int hashCode() {
        return this.f15380a.hashCode();
    }

    public final String toString() {
        return "OnAccordionClick(menuSectionType=" + this.f15380a + Separators.RPAREN;
    }
}
