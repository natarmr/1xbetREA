package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ukl implements wkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f35832a;
    public final qc0 b;
    public final String c;
    public final String d;
    public final String e;

    public ukl(n0x n0xVar, qc0 qc0Var, String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f35832a = n0xVar;
        this.b = qc0Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ukl)) {
            return false;
        }
        ukl uklVar = (ukl) obj;
        return this.f35832a.equals(uklVar.f35832a) && this.b == uklVar.b && Intrinsics.d(this.c, uklVar.c) && Intrinsics.d(this.d, uklVar.d) && Intrinsics.d(this.e, uklVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b((this.b.hashCode() + (this.f35832a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(pictureLink=");
        sb.append(this.f35832a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", titleText=");
        f140.v(sb, this.c, ", valueText=", this.d, ", labelText=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
