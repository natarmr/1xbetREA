package a;

import android.gov.nist.core.Separators;
import android.text.SpannableString;
import java.util.Collection;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rde0 implements p6t0, y640, tde0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30288a;
    public final SpannableString b;
    public final x640 c;
    public final Date d;
    public final g0x e;
    public final boolean f;
    public final dtt0 g;
    public final boolean h;

    public rde0(int i, SpannableString spannableString, x640 x640Var, Date date, g0x g0xVar, boolean z, dtt0 dtt0Var, boolean z2) {
        x640Var.getClass();
        date.getClass();
        this.f30288a = i;
        this.b = spannableString;
        this.c = x640Var;
        this.d = date;
        this.e = g0xVar;
        this.f = z;
        this.g = dtt0Var;
        this.h = z2;
    }

    @Override // a.tde0
    public final int c() {
        return this.f30288a;
    }

    @Override // a.y640
    public final Date e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rde0)) {
            return false;
        }
        rde0 rde0Var = (rde0) obj;
        return this.f30288a == rde0Var.f30288a && this.b.equals(rde0Var.b) && Intrinsics.d(this.c, rde0Var.c) && Intrinsics.d(this.d, rde0Var.d) && this.e.equals(rde0Var.e) && this.f == rde0Var.f && this.g.equals(rde0Var.g) && this.h == rde0Var.h;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof rde0) && (p6t0Var2 instanceof rde0) && ((rde0) p6t0Var).f30288a == ((rde0) p6t0Var2).f30288a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + brm0.e((this.e.hashCode() + brm0.i(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f30288a) * 31)) * 31)) * 31, 31)) * 31, 31, this.f)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return xun.f41520a;
    }

    public final String toString() {
        return "ReceiveImageMessageUIModel(id=" + this.f30288a + ", text=" + ((Object) this.b) + ", status=" + this.c + ", createdAt=" + this.d + ", imageInfoUiModel=" + this.e + ", visibleBotLabel=" + this.f + ", userUIModel=" + this.g + ", error=" + this.h + Separators.RPAREN;
    }
}
