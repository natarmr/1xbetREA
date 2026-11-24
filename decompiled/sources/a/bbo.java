package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bbo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f2317a;
    public final CharSequence b;
    public final j0d c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public bbo(CharSequence charSequence, CharSequence charSequence2, j0d j0dVar, boolean z, boolean z2, boolean z3, int i) {
        charSequence = (i & 1) != 0 ? null : charSequence;
        charSequence2 = (i & 2) != 0 ? null : charSequence2;
        j0dVar = (i & 4) != 0 ? j0d.f15678a : j0dVar;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? false : z2;
        z3 = (i & 32) != 0 ? false : z3;
        boolean z4 = (i & 64) == 0;
        boolean z5 = (i & 128) == 0;
        this.f2317a = charSequence;
        this.b = charSequence2;
        this.c = j0dVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbo)) {
            return false;
        }
        bbo bboVar = (bbo) obj;
        return Intrinsics.d(this.f2317a, bboVar.f2317a) && Intrinsics.d(this.b, bboVar.b) && this.c == bboVar.c && this.d == bboVar.d && this.e == bboVar.e && this.f == bboVar.f && this.g == bboVar.g && this.h == bboVar.h;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f2317a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        return brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((this.c.hashCode() + ((iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 961, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventCardMarket(title=");
        sb.append((Object) this.f2317a);
        sb.append(", coefficient=");
        sb.append((Object) this.b);
        sb.append(", coefficientState=");
        sb.append(this.c);
        sb.append(", showCoupon=");
        sb.append(this.d);
        sb.append(", showTrack=");
        ua80.u(", showBlock=", ", blocked=", sb, this.e, this.f);
        return ohs0.p(", showButtonMore=", ", onClickListener=null, onLongClickListener=null)", sb, this.g, this.h);
    }
}
