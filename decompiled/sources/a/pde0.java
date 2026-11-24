package a;

import android.gov.nist.core.Separators;
import android.text.SpannableString;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pde0 implements p6t0, y640, tde0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26804a;
    public final SpannableString b;
    public final x640 c;
    public final Date d;
    public final boolean e;
    public final dtt0 f;
    public final ArrayList g;
    public final boolean h;

    public pde0(int i, x640 x640Var, dtt0 dtt0Var, SpannableString spannableString, ArrayList arrayList, Date date, boolean z, boolean z2) {
        x640Var.getClass();
        date.getClass();
        this.f26804a = i;
        this.b = spannableString;
        this.c = x640Var;
        this.d = date;
        this.e = z;
        this.f = dtt0Var;
        this.g = arrayList;
        this.h = z2;
    }

    @Override // a.tde0
    public final int c() {
        return this.f26804a;
    }

    @Override // a.y640
    public final Date e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pde0)) {
            return false;
        }
        pde0 pde0Var = (pde0) obj;
        return this.f26804a == pde0Var.f26804a && this.b.equals(pde0Var.b) && Intrinsics.d(this.c, pde0Var.c) && Intrinsics.d(this.d, pde0Var.d) && this.e == pde0Var.e && this.f.equals(pde0Var.f) && this.g.equals(pde0Var.g) && this.h == pde0Var.h;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof pde0) && (p6t0Var2 instanceof pde0) && ((pde0) p6t0Var).f26804a == ((pde0) p6t0Var2).f26804a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + twn.g(this.g, (this.f.hashCode() + brm0.e(brm0.i(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f26804a) * 31)) * 31)) * 31, 31), 31, this.e)) * 31, 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return xun.f41520a;
    }

    public final String toString() {
        return "ReceiveFileMessageUIModel(id=" + this.f26804a + ", text=" + ((Object) this.b) + ", status=" + this.c + ", createdAt=" + this.d + ", visibleBotLabel=" + this.e + ", userUIModel=" + this.f + ", fileInfos=" + this.g + ", error=" + this.h + Separators.RPAREN;
    }
}
