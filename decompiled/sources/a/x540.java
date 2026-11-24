package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x540 extends a640 {
    public final int c;
    public final String d;
    public final ilf0 e;
    public final xrt0 f;
    public final String g;
    public final List h;
    public final List i;
    public final List j;
    public final x640 k;
    public final Date l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x540(int i, String str, ilf0 ilf0Var, xrt0 xrt0Var, String str2, List list, List list2, List list3, x640 x640Var, Date date) {
        super(str, xrt0Var);
        xrt0Var.getClass();
        str2.getClass();
        list2.getClass();
        list3.getClass();
        x640Var.getClass();
        date.getClass();
        this.c = i;
        this.d = str;
        this.e = ilf0Var;
        this.f = xrt0Var;
        this.g = str2;
        this.h = list;
        this.i = list2;
        this.j = list3;
        this.k = x640Var;
        this.l = date;
    }

    @Override // a.a640
    public final Date a() {
        return this.l;
    }

    @Override // a.a640
    public final int b() {
        return this.c;
    }

    @Override // a.a640
    public final String c() {
        return this.d;
    }

    @Override // a.a640
    public final x640 d() {
        return this.k;
    }

    @Override // a.a640
    public final xrt0 e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x540)) {
            return false;
        }
        x540 x540Var = (x540) obj;
        return this.c == x540Var.c && Intrinsics.d(this.d, x540Var.d) && Intrinsics.d(this.e, x540Var.e) && Intrinsics.d(this.f, x540Var.f) && Intrinsics.d(this.g, x540Var.g) && Intrinsics.d(this.h, x540Var.h) && Intrinsics.d(this.i, x540Var.i) && Intrinsics.d(this.j, x540Var.j) && Intrinsics.d(this.k, x540Var.k) && Intrinsics.d(this.l, x540Var.l);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.c) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ilf0 ilf0Var = this.e;
        int iB = ua80.b((this.f.hashCode() + ((iHashCode2 + (ilf0Var == null ? 0 : ilf0Var.hashCode())) * 31)) * 31, 31, this.g);
        List list = this.h;
        return this.l.hashCode() + ((this.k.hashCode() + dw9.a(dw9.a((iB + (list != null ? list.hashCode() : 0)) * 31, 31, this.i), 31, this.j)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.c, "TextMessageModel(id=", ", localMessageKey=", this.d, ", replyMessageModel=");
        sbR.append(this.e);
        sbR.append(", userModel=");
        sbR.append(this.f);
        sbR.append(", text=");
        cs0.y(this.g, ", markupModels=", ", buttons=", sbR, this.h);
        b1j.y(", rows=", ", status=", sbR, this.i, this.j);
        sbR.append(this.k);
        sbR.append(", createdAt=");
        sbR.append(this.l);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
