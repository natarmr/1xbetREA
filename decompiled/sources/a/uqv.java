package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uqv implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36135a;
    public final tqv b;
    public final cev0 c;

    public uqv(String str, tqv tqvVar, cev0 cev0Var) {
        this.f36135a = str;
        this.b = tqvVar;
        this.c = cev0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqv)) {
            return false;
        }
        uqv uqvVar = (uqv) obj;
        return this.f36135a.equals(uqvVar.f36135a) && this.b.equals(uqvVar.b) && this.c.equals(uqvVar.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f36135a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f36135a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "HeaderContainerUiModel(key=" + this.f36135a + ", title=" + this.b + ", widgetGroup=" + this.c + Separators.RPAREN;
    }
}
