package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ajh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f976a;
    public final String b;
    public final boolean c;

    public ajh0(String str, String str2, boolean z) {
        this.f976a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajh0)) {
            return false;
        }
        ajh0 ajh0Var = (ajh0) obj;
        return this.f976a.equals(ajh0Var.f976a) && this.b.equals(ajh0Var.b) && this.c == ajh0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f976a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("SeasonSelectorModel(id=", this.f976a, ", title=", this.b, ", selected="), this.c, Separators.RPAREN);
    }
}
