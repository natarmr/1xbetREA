package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class eol implements gol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8144a;
    public final n0x b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final o0x g;

    public eol(String str, n0x n0xVar, boolean z, String str2, String str3, String str4, m0x m0xVar) {
        cs0.x(str, str2, str3, str4);
        this.f8144a = str;
        this.b = n0xVar;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eol)) {
            return false;
        }
        eol eolVar = (eol) obj;
        return Intrinsics.d(this.f8144a, eolVar.f8144a) && this.b.equals(eolVar.b) && this.c == eolVar.c && Intrinsics.d(this.d, eolVar.d) && Intrinsics.d(this.e, eolVar.e) && Intrinsics.d(this.f, eolVar.f) && Intrinsics.d(this.g, eolVar.g);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(brm0.e(f140.f(this.b, this.f8144a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        o0x o0xVar = this.g;
        return iB + (o0xVar == null ? 0 : o0xVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(id=");
        sb.append(this.f8144a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", isSelected=");
        f140.s(", title=", this.d, ", count=", sb, this.c);
        f140.v(sb, this.e, ", counterName=", this.f, ", placeholder=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
