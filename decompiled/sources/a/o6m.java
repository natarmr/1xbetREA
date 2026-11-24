package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o6m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24743a;
    public final n0x b;
    public final p6m c;
    public final p6m d;
    public final String e;
    public final String f;
    public final boolean g;

    public o6m(String str, n0x n0xVar, p6m p6mVar, p6m p6mVar2, String str2, String str3, boolean z) {
        brm0.B(str, str2, str3);
        this.f24743a = str;
        this.b = n0xVar;
        this.c = p6mVar;
        this.d = p6mVar2;
        this.e = str2;
        this.f = str3;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6m)) {
            return false;
        }
        o6m o6mVar = (o6m) obj;
        return Intrinsics.d(this.f24743a, o6mVar.f24743a) && this.b.equals(o6mVar.b) && this.c.equals(o6mVar.c) && this.d.equals(o6mVar.d) && Intrinsics.d(this.e, o6mVar.e) && Intrinsics.d(this.f, o6mVar.f) && this.g == o6mVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ua80.b(ua80.b((this.d.hashCode() + ((this.c.hashCode() + f140.f(this.b, this.f24743a.hashCode() * 31, 31)) * 31)) * 31, 31, this.e), 961, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsCyberGameMapModel(title=");
        sb.append(this.f24743a);
        sb.append(", background=");
        sb.append(this.b);
        sb.append(", firstOpponent=");
        sb.append(this.c);
        sb.append(", secondOpponent=");
        sb.append(this.d);
        sb.append(", firstScore=");
        f140.v(sb, this.e, ", secondScore=", this.f, ", time=null, supportRtl=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
