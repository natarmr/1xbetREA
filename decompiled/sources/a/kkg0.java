package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class kkg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f18438a;
    public final String b;
    public final boolean c;

    public kkg0(o0x o0xVar, String str, boolean z) {
        this.f18438a = o0xVar;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkg0)) {
            return false;
        }
        kkg0 kkg0Var = (kkg0) obj;
        return this.f18438a.equals(kkg0Var.f18438a) && this.b.equals(kkg0Var.b) && this.c == kkg0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f18438a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RpsRoundResultUiModel(figureIcon=");
        sb.append(this.f18438a);
        sb.append(", scoreChange=");
        sb.append(this.b);
        sb.append(", isWin=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
