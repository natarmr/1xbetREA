package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class qaq implements saq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f28408a;
    public final mdm b;

    public qaq(mdm mdmVar, imm immVar) {
        this.f28408a = immVar;
        this.b = mdmVar;
    }

    @Override // a.saq
    public final imm a() {
        return this.f28408a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qaq)) {
            return false;
        }
        qaq qaqVar = (qaq) obj;
        return this.f28408a.equals(qaqVar.f28408a) && this.b.equals(qaqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28408a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(dsNavigationBarUiModel=" + this.f28408a + ", dsEmptyConfig=" + this.b + Separators.RPAREN;
    }
}
