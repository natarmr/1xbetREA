package a;

import android.gov.nist.core.Separators;
import android.text.SpannableString;
import java.util.Collection;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xdi0 implements p6t0, y640, ztc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40694a;
    public final String b;
    public final SpannableString c;
    public final x640 d;
    public final int e;
    public final Date f;
    public final g0x g;
    public final boolean h;

    public xdi0(int i, String str, SpannableString spannableString, x640 x640Var, int i2, Date date, g0x g0xVar, boolean z) {
        x640Var.getClass();
        date.getClass();
        this.f40694a = i;
        this.b = str;
        this.c = spannableString;
        this.d = x640Var;
        this.e = i2;
        this.f = date;
        this.g = g0xVar;
        this.h = z;
    }

    @Override // a.ztc
    public final int c() {
        return this.f40694a;
    }

    @Override // a.y640
    public final Date e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdi0)) {
            return false;
        }
        xdi0 xdi0Var = (xdi0) obj;
        return this.f40694a == xdi0Var.f40694a && Intrinsics.d(this.b, xdi0Var.b) && this.c.equals(xdi0Var.c) && Intrinsics.d(this.d, xdi0Var.d) && this.e == xdi0Var.e && Intrinsics.d(this.f, xdi0Var.f) && this.g.equals(xdi0Var.g) && this.h == xdi0Var.h;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        String str;
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof xdi0) && (p6t0Var2 instanceof xdi0)) {
            xdi0 xdi0Var = (xdi0) p6t0Var;
            String str2 = xdi0Var.b;
            if (str2 != null && (str = ((xdi0) p6t0Var2).b) != null) {
                return Intrinsics.d(str2, str);
            }
            if (xdi0Var.f40694a == ((xdi0) p6t0Var2).f40694a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f40694a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + brm0.i(this.f, twn.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31), 31)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return xun.f41520a;
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f40694a, "SendImageMessageUIModel(id=", ", localMessageKey=", this.b, ", text=");
        sbR.append((Object) this.c);
        sbR.append(", status=");
        sbR.append(this.d);
        sbR.append(", statusRes=");
        sbR.append(this.e);
        sbR.append(", createdAt=");
        sbR.append(this.f);
        sbR.append(", imageInfoUiModel=");
        sbR.append(this.g);
        sbR.append(", error=");
        sbR.append(this.h);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
