package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h86 implements j86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yws0 f12612a;
    public final yws0 b;
    public final y1m c;
    public final String d;
    public final String e;
    public final r0n f;

    public h86(yws0 yws0Var, yws0 yws0Var2, y1m y1mVar, String str, String str2, r0n r0nVar) {
        str2.getClass();
        this.f12612a = yws0Var;
        this.b = yws0Var2;
        this.c = y1mVar;
        this.d = str;
        this.e = str2;
        this.f = r0nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h86)) {
            return false;
        }
        h86 h86Var = (h86) obj;
        return this.f12612a.equals(h86Var.f12612a) && this.b.equals(h86Var.b) && this.c.equals(h86Var.c) && this.d.equals(h86Var.d) && Intrinsics.d(this.e, h86Var.e) && this.f.equals(h86Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f12612a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "TwoOpponents(firstOpponentModel=" + this.f12612a + ", secondOpponentModel=" + this.b + ", score=" + this.c + ", infoLabel=" + this.d + ", tagLive=" + this.e + ", options=" + this.f + Separators.RPAREN;
    }
}
