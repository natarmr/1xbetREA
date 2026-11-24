package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lkl implements nkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f20206a;
    public final qc0 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public lkl(n0x n0xVar, qc0 qc0Var, String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f20206a = n0xVar;
        this.b = qc0Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkl)) {
            return false;
        }
        lkl lklVar = (lkl) obj;
        return this.f20206a.equals(lklVar.f20206a) && this.b == lklVar.b && Intrinsics.d(this.c, lklVar.c) && Intrinsics.d(this.d, lklVar.d) && Intrinsics.d(this.e, lklVar.e) && Intrinsics.d(this.f, lklVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f20206a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(pictureLink=");
        sb.append(this.f20206a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", titleText=");
        f140.v(sb, this.c, ", valueText=", this.d, ", labelText=");
        return ua80.m(sb, this.e, ", buttonLabelText=", this.f, Separators.RPAREN);
    }
}
