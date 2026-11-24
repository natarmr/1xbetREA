package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hvr implements lvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13738a;
    public final String b;
    public final f5h0 c;
    public final String d;
    public final f5h0 e;

    public hvr(String str, String str2, f5h0 f5h0Var, String str3, f5h0 f5h0Var2) {
        this.f13738a = str;
        this.b = str2;
        this.c = f5h0Var;
        this.d = str3;
        this.e = f5h0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvr)) {
            return false;
        }
        hvr hvrVar = (hvr) obj;
        return this.f13738a.equals(hvrVar.f13738a) && this.b.equals(hvrVar.b) && this.c == hvrVar.c && this.d.equals(hvrVar.d) && this.e == hvrVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f13738a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GameScore(title=" + this.f13738a + ", firstRow=" + ((Object) this.b) + ", firstRowStyle=" + this.c + ", secondRow=" + ((Object) this.d) + ", secondRowStyle=" + this.e + Separators.RPAREN;
    }
}
