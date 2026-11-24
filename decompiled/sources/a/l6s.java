package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class l6s implements v6s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19523a;
    public final jaj b;

    public l6s(boolean z, jaj jajVar) {
        this.f19523a = z;
        this.b = jajVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6s)) {
            return false;
        }
        l6s l6sVar = (l6s) obj;
        return this.f19523a == l6sVar.f19523a && this.b == l6sVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f19523a) * 31);
    }

    public final String toString() {
        return "ExpandClick(isExpanded=" + this.f19523a + ", type=" + this.b + Separators.RPAREN;
    }
}
