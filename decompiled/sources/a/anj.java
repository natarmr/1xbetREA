package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class anj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final frj f1156a;

    public anj(frj frjVar) {
        frjVar.getClass();
        this.f1156a = frjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof anj) && this.f1156a == ((anj) obj).f1156a;
    }

    public final int hashCode() {
        return this.f1156a.hashCode() + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return "Favorite(hasBackStack=false, type=" + this.f1156a + Separators.RPAREN;
    }
}
