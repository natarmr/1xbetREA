package a;

import android.gov.nist.core.Separators;
import android.text.SpannableString;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class sde0 implements p6t0, y640, tde0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32031a;
    public final SpannableString b;
    public final x640 c;
    public final Date d;
    public final ArrayList e;
    public final boolean f;
    public final dtt0 g;
    public final boolean h;

    public sde0(int i, x640 x640Var, dtt0 dtt0Var, SpannableString spannableString, ArrayList arrayList, Date date, boolean z, boolean z2) {
        x640Var.getClass();
        date.getClass();
        this.f32031a = i;
        this.b = spannableString;
        this.c = x640Var;
        this.d = date;
        this.e = arrayList;
        this.f = z;
        this.g = dtt0Var;
        this.h = z2;
    }

    @Override // a.tde0
    public final int c() {
        return this.f32031a;
    }

    @Override // a.y640
    public final Date e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sde0)) {
            return false;
        }
        sde0 sde0Var = (sde0) obj;
        return this.f32031a == sde0Var.f32031a && this.b.equals(sde0Var.b) && Intrinsics.d(this.c, sde0Var.c) && Intrinsics.d(this.d, sde0Var.d) && this.e.equals(sde0Var.e) && this.f == sde0Var.f && this.g.equals(sde0Var.g) && this.h == sde0Var.h;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof sde0) && (p6t0Var2 instanceof sde0) && ((sde0) p6t0Var).f32031a == ((sde0) p6t0Var2).f32031a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + brm0.e(twn.g(this.e, brm0.i(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f32031a) * 31)) * 31)) * 31, 31), 31), 31, this.f)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return xun.f41520a;
    }

    public final String toString() {
        return "ReceiveImagesMessageUIModel(id=" + this.f32031a + ", text=" + ((Object) this.b) + ", status=" + this.c + ", createdAt=" + this.d + ", images=" + this.e + ", visibleBotLabel=" + this.f + ", userUIModel=" + this.g + ", error=" + this.h + Separators.RPAREN;
    }
}
