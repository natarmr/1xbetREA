package a;

import android.gov.nist.core.Separators;
import android.text.SpannableString;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ydi0 implements p6t0, y640, ztc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42440a;
    public final String b;
    public final SpannableString c;
    public final x640 d;
    public final int e;
    public final Date f;
    public final ArrayList g;
    public final boolean h;

    public ydi0(int i, String str, SpannableString spannableString, x640 x640Var, int i2, Date date, ArrayList arrayList, boolean z) {
        x640Var.getClass();
        date.getClass();
        this.f42440a = i;
        this.b = str;
        this.c = spannableString;
        this.d = x640Var;
        this.e = i2;
        this.f = date;
        this.g = arrayList;
        this.h = z;
    }

    @Override // a.ztc
    public final int c() {
        return this.f42440a;
    }

    @Override // a.y640
    public final Date e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydi0)) {
            return false;
        }
        ydi0 ydi0Var = (ydi0) obj;
        return this.f42440a == ydi0Var.f42440a && Intrinsics.d(this.b, ydi0Var.b) && this.c.equals(ydi0Var.c) && Intrinsics.d(this.d, ydi0Var.d) && this.e == ydi0Var.e && Intrinsics.d(this.f, ydi0Var.f) && this.g.equals(ydi0Var.g) && this.h == ydi0Var.h;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        String str;
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof ydi0) && (p6t0Var2 instanceof ydi0)) {
            ydi0 ydi0Var = (ydi0) p6t0Var;
            String str2 = ydi0Var.b;
            if (str2 != null && (str = ((ydi0) p6t0Var2).b) != null) {
                return Intrinsics.d(str2, str);
            }
            if (ydi0Var.f42440a == ((ydi0) p6t0Var2).f42440a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f42440a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.h) + twn.g(this.g, brm0.i(this.f, twn.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31), 31), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return xun.f41520a;
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f42440a, "SendImagesMessageUIModel(id=", ", localMessageKey=", this.b, ", text=");
        sbR.append((Object) this.c);
        sbR.append(", status=");
        sbR.append(this.d);
        sbR.append(", statusRes=");
        sbR.append(this.e);
        sbR.append(", createdAt=");
        sbR.append(this.f);
        sbR.append(", images=");
        sbR.append(this.g);
        sbR.append(", error=");
        sbR.append(this.h);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
