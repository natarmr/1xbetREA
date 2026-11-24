package a;

import android.content.res.ColorStateList;
import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42289a;
    public final boolean b;
    public final ColorStateList c;
    public final boolean d;
    public final long e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final boolean l;

    public yad(String str, boolean z, ColorStateList colorStateList, boolean z2, long j, boolean z3, int i, boolean z4, boolean z5, String str2, boolean z6, boolean z7) {
        colorStateList.getClass();
        this.f42289a = str;
        this.b = z;
        this.c = colorStateList;
        this.d = z2;
        this.e = j;
        this.f = z3;
        this.g = i;
        this.h = z4;
        this.i = z5;
        this.j = str2;
        this.k = z6;
        this.l = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yad)) {
            return false;
        }
        yad yadVar = (yad) obj;
        return this.f42289a.equals(yadVar.f42289a) && this.b == yadVar.b && Intrinsics.d(this.c, yadVar.c) && this.d == yadVar.d && znq0.e(this.e, yadVar.e) && this.f == yadVar.f && this.g == yadVar.g && this.h == yadVar.h && this.i == yadVar.i && this.j.equals(yadVar.j) && this.k == yadVar.k && this.l == yadVar.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + brm0.e(ua80.b(brm0.e(brm0.e(twn.a(this.g, brm0.e(rw2.b(brm0.e((this.c.hashCode() + brm0.e(this.f42289a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        String strH = znq0.h(this.e);
        StringBuilder sbU = brm0.u("CompactHeaderUiModel(typeText=", this.f42289a, ", typeVisible=", this.b, ", typeBackgroundTintList=");
        sbU.append(this.c);
        sbU.append(", isLive=");
        sbU.append(this.d);
        sbU.append(", date=");
        brm0.C(strH, ", imageBellContainerVisible=", ", imageBellImage=", sbU, this.f);
        brm0.w(this.g, ", imageMoreContainerVisible=", ", tagVisible=", sbU, this.h);
        f140.s(", tagText=", this.j, ", hasAutoSub=", sbU, this.i);
        return ohs0.p(", is24HourFormat=", Separators.RPAREN, sbU, this.k, this.l);
    }
}
