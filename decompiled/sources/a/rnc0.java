package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rnc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gtc0 f30783a;
    public final zuc0 b;
    public final String c;
    public final String d;
    public final o0x e;
    public final o0x f;

    public rnc0(gtc0 gtc0Var, zuc0 zuc0Var, String str, String str2, o0x o0xVar, n0x n0xVar) {
        str.getClass();
        str2.getClass();
        o0xVar.getClass();
        this.f30783a = gtc0Var;
        this.b = zuc0Var;
        this.c = str;
        this.d = str2;
        this.e = o0xVar;
        this.f = n0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnc0)) {
            return false;
        }
        rnc0 rnc0Var = (rnc0) obj;
        return this.f30783a == rnc0Var.f30783a && this.b == rnc0Var.b && Intrinsics.d(this.c, rnc0Var.c) && Intrinsics.d(this.d, rnc0Var.d) && Intrinsics.d(this.e, rnc0Var.e) && Intrinsics.d(this.f, rnc0Var.f);
    }

    public final int hashCode() {
        int iD = w6x.d(this.e, ua80.b(ua80.b((this.b.hashCode() + (this.f30783a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31);
        o0x o0xVar = this.f;
        return iD + (o0xVar == null ? 0 : o0xVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoMenuItemUiModel(itemType=");
        sb.append(this.f30783a);
        sb.append(", promoType=");
        sb.append(this.b);
        sb.append(", title=");
        f140.v(sb, this.c, ", subtitle=", this.d, ", startIcon=");
        sb.append(this.e);
        sb.append(", endImage=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
