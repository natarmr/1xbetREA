package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kxr implements rxr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19070a;
    public final String b;
    public final String c;
    public final f5h0 d;
    public final String e;
    public final f5h0 f;

    public kxr(boolean z, String str, String str2, f5h0 f5h0Var, String str3, f5h0 f5h0Var2) {
        this.f19070a = z;
        this.b = str;
        this.c = str2;
        this.d = f5h0Var;
        this.e = str3;
        this.f = f5h0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxr)) {
            return false;
        }
        kxr kxrVar = (kxr) obj;
        return this.f19070a == kxrVar.f19070a && this.b.equals(kxrVar.b) && this.c.equals(kxrVar.c) && this.d == kxrVar.d && this.e.equals(kxrVar.e) && this.f == kxrVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b((this.d.hashCode() + ua80.b(ua80.b(Boolean.hashCode(this.f19070a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("ScoreGame(columnVisible=", ", columnName=", this.b, this.f19070a, ", firstRow=");
        sbQ.append(this.c);
        sbQ.append(", firstRowStyle=");
        sbQ.append(this.d);
        sbQ.append(", secondRow=");
        sbQ.append(this.e);
        sbQ.append(", secondRowStyle=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
