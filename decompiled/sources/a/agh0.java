package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class agh0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f825a;
    public final String b;

    public agh0(hjm hjmVar) {
        this.f825a = hjmVar;
        this.b = String.valueOf(hjmVar.f13167a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agh0) && this.f825a.equals(((agh0) obj).f825a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.f825a.hashCode();
    }

    public final String toString() {
        return "SearchHeaderUiModel(header=" + this.f825a + Separators.RPAREN;
    }
}
