package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lxr implements rxr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20829a;
    public final String b;
    public final String c;
    public final f5h0 d;
    public final String e;
    public final f5h0 f;

    public lxr(boolean z, String str, String str2, f5h0 f5h0Var, String str3, f5h0 f5h0Var2) {
        str.getClass();
        this.f20829a = z;
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
        if (!(obj instanceof lxr)) {
            return false;
        }
        lxr lxrVar = (lxr) obj;
        return this.f20829a == lxrVar.f20829a && Intrinsics.d(this.b, lxrVar.b) && this.c.equals(lxrVar.c) && this.d == lxrVar.d && this.e.equals(lxrVar.e) && this.f == lxrVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b((this.d.hashCode() + ua80.b(ua80.b(Boolean.hashCode(this.f20829a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("ScorePeriod(columnVisible=", ", columnName=", this.b, this.f20829a, ", firstRow=");
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
