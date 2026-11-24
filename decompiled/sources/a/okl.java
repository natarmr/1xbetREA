package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class okl implements qkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f25409a;
    public final qc0 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public okl(n0x n0xVar, qc0 qc0Var, String str, String str2, String str3, String str4, String str5) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f25409a = n0xVar;
        this.b = qc0Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okl)) {
            return false;
        }
        okl oklVar = (okl) obj;
        return this.f25409a.equals(oklVar.f25409a) && this.b == oklVar.b && Intrinsics.d(this.c, oklVar.c) && Intrinsics.d(this.d, oklVar.d) && Intrinsics.d(this.e, oklVar.e) && Intrinsics.d(this.f, oklVar.f) && Intrinsics.d(this.g, oklVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f25409a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(pictureLink=");
        sb.append(this.f25409a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", titleText=");
        f140.v(sb, this.c, ", valueText=", this.d, ", labelText=");
        f140.v(sb, this.e, ", headerText=", this.f, ", subHeaderText=");
        return axq.n(sb, this.g, Separators.RPAREN);
    }
}
