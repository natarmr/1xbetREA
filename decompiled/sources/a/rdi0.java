package a;

import android.gov.nist.core.Separators;
import android.text.SpannableString;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rdi0 implements p6t0, y640, ztc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30293a;
    public final String b;
    public final SpannableString c;
    public final x640 d;
    public final int e;
    public final Date f;
    public final xrt0 g;
    public final ArrayList h;
    public final boolean i;

    public rdi0(int i, String str, SpannableString spannableString, x640 x640Var, int i2, Date date, xrt0 xrt0Var, ArrayList arrayList, boolean z) {
        x640Var.getClass();
        date.getClass();
        this.f30293a = i;
        this.b = str;
        this.c = spannableString;
        this.d = x640Var;
        this.e = i2;
        this.f = date;
        this.g = xrt0Var;
        this.h = arrayList;
        this.i = z;
    }

    @Override // a.ztc
    public final int c() {
        return this.f30293a;
    }

    @Override // a.y640
    public final Date e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdi0)) {
            return false;
        }
        rdi0 rdi0Var = (rdi0) obj;
        return this.f30293a == rdi0Var.f30293a && Intrinsics.d(this.b, rdi0Var.b) && this.c.equals(rdi0Var.c) && Intrinsics.d(this.d, rdi0Var.d) && this.e == rdi0Var.e && Intrinsics.d(this.f, rdi0Var.f) && this.g.equals(rdi0Var.g) && this.h.equals(rdi0Var.h) && this.i == rdi0Var.i;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        String str;
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof rdi0) && (p6t0Var2 instanceof rdi0)) {
            rdi0 rdi0Var = (rdi0) p6t0Var;
            String str2 = rdi0Var.b;
            if (str2 != null && (str = ((rdi0) p6t0Var2).b) != null) {
                return Intrinsics.d(str2, str);
            }
            if (rdi0Var.f30293a == ((rdi0) p6t0Var2).f30293a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f30293a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.i) + twn.g(this.h, (this.g.hashCode() + brm0.i(this.f, twn.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31), 31)) * 31, 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return xun.f41520a;
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f30293a, "SendFileMessageUIModel(id=", ", localMessageKey=", this.b, ", text=");
        sbR.append((Object) this.c);
        sbR.append(", status=");
        sbR.append(this.d);
        sbR.append(", statusRes=");
        sbR.append(this.e);
        sbR.append(", createdAt=");
        sbR.append(this.f);
        sbR.append(", userModel=");
        sbR.append(this.g);
        sbR.append(", fileInfos=");
        sbR.append(this.h);
        sbR.append(", error=");
        return rw2.p(sbR, this.i, Separators.RPAREN);
    }
}
