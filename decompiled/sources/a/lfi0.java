package a;

import android.gov.nist.core.Separators;
import android.text.SpannableString;
import java.util.Collection;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lfi0 implements p6t0, y640, ztc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19958a;
    public final String b;
    public final SpannableString c;
    public final x640 d;
    public final Date e;
    public final int f;
    public final boolean g;

    public lfi0(int i, String str, SpannableString spannableString, x640 x640Var, Date date, int i2, boolean z) {
        x640Var.getClass();
        date.getClass();
        this.f19958a = i;
        this.b = str;
        this.c = spannableString;
        this.d = x640Var;
        this.e = date;
        this.f = i2;
        this.g = z;
    }

    @Override // a.ztc
    public final int c() {
        return this.f19958a;
    }

    @Override // a.y640
    public final Date e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfi0)) {
            return false;
        }
        lfi0 lfi0Var = (lfi0) obj;
        return this.f19958a == lfi0Var.f19958a && Intrinsics.d(this.b, lfi0Var.b) && this.c.equals(lfi0Var.c) && Intrinsics.d(this.d, lfi0Var.d) && Intrinsics.d(this.e, lfi0Var.e) && this.f == lfi0Var.f && this.g == lfi0Var.g;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        String str;
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof lfi0) && (p6t0Var2 instanceof lfi0)) {
            lfi0 lfi0Var = (lfi0) p6t0Var;
            String str2 = lfi0Var.b;
            if (str2 != null && (str = ((lfi0) p6t0Var2).b) != null) {
                return Intrinsics.d(str2, str);
            }
            if (lfi0Var.f19958a == ((lfi0) p6t0Var2).f19958a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f19958a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.g) + twn.a(this.f, brm0.i(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return xun.f41520a;
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f19958a, "SendTextMessageUIModel(id=", ", localMessageKey=", this.b, ", text=");
        sbR.append((Object) this.c);
        sbR.append(", status=");
        sbR.append(this.d);
        sbR.append(", createdAt=");
        sbR.append(this.e);
        sbR.append(", statusRes=");
        sbR.append(this.f);
        sbR.append(", error=");
        return rw2.p(sbR, this.g, Separators.RPAREN);
    }
}
