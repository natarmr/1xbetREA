package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class e980 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7408a;
    public final String b;
    public final boolean c;

    public e980(String str, boolean z, boolean z2) {
        this.f7408a = z;
        this.b = str;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e980)) {
            return false;
        }
        e980 e980Var = (e980) obj;
        return this.f7408a == e980Var.f7408a && this.b.equals(e980Var.b) && this.c == e980Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Boolean.hashCode(this.f7408a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(axq.q("LanguageFieldUiModel(isFieldVisible=", ", languageName=", this.b, this.f7408a, ", enableChangeLanguage="), this.c, Separators.RPAREN);
    }
}
