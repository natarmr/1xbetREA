package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class fp5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9912a;
    public final n0x b;
    public final mq5 c;
    public final String d;
    public final String e;
    public final String f;
    public final m0x g;
    public final gp5 h;

    public fp5(int i, n0x n0xVar, mq5 mq5Var, String str, String str2, m0x m0xVar) {
        gp5 gp5Var = new gp5(new m0x(R.drawable.ic_glyph_sand_clock, null, 6));
        str.getClass();
        str2.getClass();
        this.f9912a = i;
        this.b = n0xVar;
        this.c = mq5Var;
        this.d = str;
        this.e = str2;
        this.f = "";
        this.g = m0xVar;
        this.h = gp5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp5)) {
            return false;
        }
        fp5 fp5Var = (fp5) obj;
        return this.f9912a == fp5Var.f9912a && Intrinsics.d(this.b, fp5Var.b) && this.c == fp5Var.c && Intrinsics.d(this.d, fp5Var.d) && Intrinsics.d(this.e, fp5Var.e) && Intrinsics.d(this.f, fp5Var.f) && Intrinsics.d(this.g, fp5Var.g) && Intrinsics.d(this.h, fp5Var.h);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b((this.c.hashCode() + f140.f(this.b, Integer.hashCode(this.f9912a) * 31, 31)) * 31, 31, this.d), 31, this.e), 961, this.f);
        m0x m0xVar = this.g;
        return this.h.hashCode() + ((iB + (m0xVar == null ? 0 : m0xVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerCollectionItemModel(bannerId=");
        sb.append(this.f9912a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", bannerStyle=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", subtitle=");
        f140.v(sb, this.e, ", tagText=", this.f, ", tagColor=null, decorationImage=");
        sb.append(this.g);
        sb.append(", placeHolder=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
