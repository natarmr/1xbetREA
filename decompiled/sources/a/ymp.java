package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ymp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xlp f42901a;
    public final hn8 b;

    public ymp(xlp xlpVar, hn8 hn8Var) {
        this.f42901a = xlpVar;
        this.b = hn8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymp)) {
            return false;
        }
        ymp ympVar = (ymp) obj;
        return this.f42901a.equals(ympVar.f42901a) && this.b.equals(ympVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42901a.hashCode() * 31);
    }

    public final String toString() {
        return "FeedsChampsItemsUiState(contentState=" + this.f42901a + ", bottomBarState=" + this.b + Separators.RPAREN;
    }
}
