package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9a0 f21474a;
    public final String b;
    public final String c;
    public final b9a0 d;
    public final String e;
    public final String f;
    public final ufp0 g;
    public final boolean h;
    public final boolean i;

    public mas(b9a0 b9a0Var, String str, String str2, b9a0 b9a0Var2, String str3, String str4, ufp0 ufp0Var, boolean z, boolean z2) {
        b9a0Var.getClass();
        str.getClass();
        b9a0Var2.getClass();
        this.f21474a = b9a0Var;
        this.b = str;
        this.c = str2;
        this.d = b9a0Var2;
        this.e = str3;
        this.f = str4;
        this.g = ufp0Var;
        this.h = z;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mas)) {
            return false;
        }
        mas masVar = (mas) obj;
        return Intrinsics.d(this.f21474a, masVar.f21474a) && Intrinsics.d(this.b, masVar.b) && this.c.equals(masVar.c) && Intrinsics.d(this.d, masVar.d) && this.e.equals(masVar.e) && this.f.equals(masVar.f) && this.g.equals(masVar.g) && this.h == masVar.h && this.i == masVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + brm0.e(twn.f(this.g, ua80.b(ua80.b((this.d.hashCode() + ua80.b(ua80.b(this.f21474a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameEventModel(assistant=");
        sb.append(this.f21474a);
        sb.append(", eventTimeString=");
        sb.append(this.b);
        sb.append(", eventNote=");
        sb.append(this.c);
        sb.append(", player=");
        sb.append(this.d);
        sb.append(", pngImageId=");
        f140.v(sb, this.e, ", svgImageId=", this.f, ", team=");
        sb.append(this.g);
        sb.append(", typeIsChange=");
        sb.append(this.h);
        sb.append(", important=");
        return rw2.p(sb, this.i, Separators.RPAREN);
    }
}
