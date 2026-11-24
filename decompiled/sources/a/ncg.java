package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ncg implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23291a;
    public final jjm b;

    public ncg(String str, jjm jjmVar) {
        this.f23291a = str;
        this.b = jjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncg)) {
            return false;
        }
        ncg ncgVar = (ncg) obj;
        return this.f23291a.equals(ncgVar.f23291a) && this.b.equals(ncgVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f23291a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23291a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberChampHeaderUiModel(key=" + this.f23291a + ", headerModel=" + this.b + Separators.RPAREN;
    }
}
