package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jts0 implements mts0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17116a;
    public final String b;
    public final String c;
    public final a4x d;

    public jts0(String str, String str2, String str3, i4 i4Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        i4Var.getClass();
        this.f17116a = str;
        this.b = str2;
        this.c = str3;
        this.d = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jts0)) {
            return false;
        }
        jts0 jts0Var = (jts0) obj;
        return Intrinsics.d(this.f17116a, jts0Var.f17116a) && Intrinsics.d(this.b, jts0Var.b) && Intrinsics.d(this.c, jts0Var.c) && Intrinsics.d(this.d, jts0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f17116a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(dateLabel=", this.f17116a, ", nameLabel=", this.b, ", winLabel=");
        sbN.append(this.c);
        sbN.append(", items=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
