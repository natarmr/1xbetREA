package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rkl implements tkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f30653a;
    public final qc0 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public rkl(n0x n0xVar, qc0 qc0Var, String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f30653a = n0xVar;
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
        if (!(obj instanceof rkl)) {
            return false;
        }
        rkl rklVar = (rkl) obj;
        return this.f30653a.equals(rklVar.f30653a) && this.b == rklVar.b && Intrinsics.d(this.c, rklVar.c) && Intrinsics.d(this.d, rklVar.d) && Intrinsics.d(this.e, rklVar.e) && Intrinsics.d(this.f, rklVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f30653a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(pictureLink=");
        sb.append(this.f30653a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", titleText=");
        f140.v(sb, this.c, ", valueText=", this.d, ", labelText=");
        return ua80.m(sb, this.e, ", headerText=", this.f, Separators.RPAREN);
    }
}
