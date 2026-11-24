package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kok implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18635a;
    public final hyl b;

    public kok(String str, hyl hylVar) {
        this.f18635a = str;
        this.b = hylVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kok)) {
            return false;
        }
        kok kokVar = (kok) obj;
        return this.f18635a.equals(kokVar.f18635a) && this.b.equals(kokVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f18635a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18635a.hashCode() * 31);
    }

    public final String toString() {
        return "DisciplineChipsUiModel(key=" + this.f18635a + ", chips=" + this.b + Separators.RPAREN;
    }
}
