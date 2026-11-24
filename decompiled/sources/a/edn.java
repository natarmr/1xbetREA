package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class edn implements gdn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f7626a;
    public final boolean b;
    public final boolean c;

    public edn(udl0 udl0Var, boolean z, boolean z2) {
        this.f7626a = udl0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edn)) {
            return false;
        }
        edn ednVar = (edn) obj;
        return this.f7626a == ednVar.f7626a && this.b == ednVar.b && this.c == ednVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f7626a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Progress(sportGameType=");
        sb.append(this.f7626a);
        sb.append(", isClassicRefactorEnabled=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
