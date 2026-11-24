package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class aq7 extends eq7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1285a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;
    public final List f;
    public final v5l0 g;
    public final boolean h;

    public aq7(String str, String str2, int i, String str3, boolean z, List list, v5l0 v5l0Var, boolean z2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.f1285a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = z;
        this.f = list;
        this.g = v5l0Var;
        this.h = z2;
    }

    @Override // a.eq7
    public final String a() {
        return this.f1285a;
    }

    @Override // a.eq7
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq7)) {
            return false;
        }
        aq7 aq7Var = (aq7) obj;
        return Intrinsics.d(this.f1285a, aq7Var.f1285a) && Intrinsics.d(this.b, aq7Var.b) && this.c == aq7Var.c && Intrinsics.d(this.d, aq7Var.d) && this.e == aq7Var.e && Intrinsics.d(this.f, aq7Var.f) && this.g == aq7Var.g && this.h == aq7Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + axq.c(this.g, dw9.a(brm0.e(ua80.b(twn.a(this.c, ua80.b(this.f1285a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(imgUrl=", this.f1285a, ", title=", this.b, ", lotteryId=");
        kng0.w(this.c, ", bannerId=", this.d, ", expanded=", sbN);
        vqd.y(sbN, ", itemList=", this.f, ", sportEventCardStyle=", this.e);
        sbN.append(this.g);
        sbN.append(", supportRtl=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
