package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g2n implements h2n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2n f10567a;
    public final n2n b;
    public final y1m c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    public g2n(n2n n2nVar, n2n n2nVar2, y1m y1mVar, String str, String str2, String str3, boolean z) {
        brm0.B(str, str2, str3);
        this.f10567a = n2nVar;
        this.b = n2nVar2;
        this.c = y1mVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2n)) {
            return false;
        }
        g2n g2nVar = (g2n) obj;
        return this.f10567a.equals(g2nVar.f10567a) && this.b.equals(g2nVar.b) && this.c.equals(g2nVar.c) && Intrinsics.d(this.d, g2nVar.d) && Intrinsics.d(this.e, g2nVar.e) && Intrinsics.d(this.f, g2nVar.f) && this.g == g2nVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ua80.b(ua80.b(ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f10567a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V4(firstOpponent=");
        sb.append(this.f10567a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreModel=");
        sb.append(this.c);
        sb.append(", gameLabel=");
        sb.append(this.d);
        sb.append(", infoLabel=");
        f140.v(sb, this.e, ", tagLive=", this.f, ", supportRtl=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
