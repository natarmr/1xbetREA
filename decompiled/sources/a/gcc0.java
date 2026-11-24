package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gcc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f11053a;
    public final Date b;
    public final ArrayList c;
    public final int d;
    public final String e;
    public final occ0 f;
    public final ncc0 g;

    public gcc0(Date date, Date date2, ArrayList arrayList, int i, String str, occ0 occ0Var, ncc0 ncc0Var) {
        str.getClass();
        this.f11053a = date;
        this.b = date2;
        this.c = arrayList;
        this.d = i;
        this.e = str;
        this.f = occ0Var;
        this.g = ncc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcc0)) {
            return false;
        }
        gcc0 gcc0Var = (gcc0) obj;
        return this.f11053a.equals(gcc0Var.f11053a) && this.b.equals(gcc0Var.b) && this.c.equals(gcc0Var.c) && this.d == gcc0Var.d && Intrinsics.d(this.e, gcc0Var.e) && this.f == gcc0Var.f && this.g.equals(gcc0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ua80.b(twn.a(this.d, twn.g(this.c, brm0.i(this.b, this.f11053a.hashCode() * 31, 31), 31), 31), 31, this.e)) * 31);
    }

    public final String toString() {
        return "PromoCmsPromotionInfoModel(startDate=" + this.f11053a + ", endDate=" + this.b + ", stages=" + this.c + ", currencyId=" + this.d + ", currencyCode=" + this.e + ", templateId=" + this.f + ", templateInfo=" + this.g + Separators.RPAREN;
    }
}
