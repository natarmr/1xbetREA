package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class k7o implements r7o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wnk f17832a;

    public k7o(wnk wnkVar) {
        this.f17832a = wnkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k7o) && this.f17832a.equals(((k7o) obj).f17832a);
    }

    public final int hashCode() {
        return this.f17832a.hashCode();
    }

    public final String toString() {
        return "OnDisciplineClick(item=" + this.f17832a + Separators.RPAREN;
    }
}
