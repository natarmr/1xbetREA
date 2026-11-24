package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wua implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39781a;
    public final String b;
    public final boolean c;

    public wua(String str, int i, boolean z) {
        this.f39781a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wua)) {
            return false;
        }
        wua wuaVar = (wua) obj;
        return this.f39781a == wuaVar.f39781a && this.b.equals(wuaVar.b) && this.c == wuaVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f39781a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f39781a, "CareerChipUiModel(id=", ", title=", this.b, ", selected="), this.c, Separators.RPAREN);
    }
}
