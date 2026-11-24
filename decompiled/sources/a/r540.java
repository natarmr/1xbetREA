package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r540 extends a640 {
    public final int c;
    public final ilf0 d;
    public final String e;
    public final xrt0 f;
    public final x640 g;
    public final Date h;
    public final String i;
    public final List j;
    public final List k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r540(int i, ilf0 ilf0Var, String str, xrt0 xrt0Var, x640 x640Var, Date date, String str2, List list, List list2) {
        super(str, xrt0Var);
        x640Var.getClass();
        date.getClass();
        str2.getClass();
        this.c = i;
        this.d = ilf0Var;
        this.e = str;
        this.f = xrt0Var;
        this.g = x640Var;
        this.h = date;
        this.i = str2;
        this.j = list;
        this.k = list2;
    }

    @Override // a.a640
    public final Date a() {
        return this.h;
    }

    @Override // a.a640
    public final int b() {
        return this.c;
    }

    @Override // a.a640
    public final String c() {
        return this.e;
    }

    @Override // a.a640
    public final x640 d() {
        return this.g;
    }

    @Override // a.a640
    public final xrt0 e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r540)) {
            return false;
        }
        r540 r540Var = (r540) obj;
        return this.c == r540Var.c && Intrinsics.d(this.d, r540Var.d) && Intrinsics.d(this.e, r540Var.e) && this.f.equals(r540Var.f) && Intrinsics.d(this.g, r540Var.g) && Intrinsics.d(this.h, r540Var.h) && Intrinsics.d(this.i, r540Var.i) && Intrinsics.d(this.j, r540Var.j) && this.k.equals(r540Var.k);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.c) * 31;
        ilf0 ilf0Var = this.d;
        int iHashCode2 = (iHashCode + (ilf0Var == null ? 0 : ilf0Var.hashCode())) * 31;
        String str = this.e;
        int iB = ua80.b(brm0.i(this.h, (this.g.hashCode() + ((this.f.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31), 31, this.i);
        List list = this.j;
        return this.k.hashCode() + ((iB + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageMessageModel(id=");
        sb.append(this.c);
        sb.append(", replyMessageModel=");
        sb.append(this.d);
        sb.append(", localMessageKey=");
        sb.append(this.e);
        sb.append(", userModel=");
        sb.append(this.f);
        sb.append(", status=");
        sb.append(this.g);
        sb.append(", createdAt=");
        sb.append(this.h);
        sb.append(", text=");
        cs0.y(this.i, ", markupModels=", ", images=", sb, this.j);
        return dw9.r(sb, this.k, Separators.RPAREN);
    }
}
