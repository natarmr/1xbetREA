package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ch8 implements jh8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jan f4347a;

    public ch8(jan janVar) {
        this.f4347a = janVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ch8) && this.f4347a.equals(((ch8) obj).f4347a);
    }

    public final int hashCode() {
        return this.f4347a.hashCode();
    }

    public final String toString() {
        return "CraftingBonus(cellUiModel=" + this.f4347a + Separators.RPAREN;
    }
}
