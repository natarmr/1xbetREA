package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class urk implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36167a;
    public final b8m b;
    public final vb90 c;

    public urk(String str, b8m b8mVar, vb90 vb90Var) {
        this.f36167a = str;
        this.b = b8mVar;
        this.c = vb90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urk)) {
            return false;
        }
        urk urkVar = (urk) obj;
        return this.f36167a.equals(urkVar.f36167a) && this.b.equals(urkVar.b) && this.c.equals(urkVar.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f36167a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f36167a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DisciplineDetailsIconFocusGameEventsUiModel(key=" + this.f36167a + ", header=" + this.b + ", gameCardUiModel=" + this.c + Separators.RPAREN;
    }
}
