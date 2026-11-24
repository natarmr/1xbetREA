package a;

import android.gov.nist.core.Separators;
import android.text.SpannableString;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ude0 implements p6t0, y640, tde0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35473a;
    public final rlf0 b;
    public final boolean c;
    public final SpannableString d;
    public final x640 e;
    public final Date f;
    public final boolean g;
    public final boolean h;
    public final List i;
    public final List j;
    public final dtt0 k;

    public ude0(int i, rlf0 rlf0Var, boolean z, SpannableString spannableString, x640 x640Var, Date date, boolean z2, boolean z3, List list, List list2, dtt0 dtt0Var) {
        x640Var.getClass();
        date.getClass();
        list.getClass();
        list2.getClass();
        this.f35473a = i;
        this.b = rlf0Var;
        this.c = z;
        this.d = spannableString;
        this.e = x640Var;
        this.f = date;
        this.g = z2;
        this.h = z3;
        this.i = list;
        this.j = list2;
        this.k = dtt0Var;
    }

    @Override // a.tde0
    public final int c() {
        return this.f35473a;
    }

    @Override // a.y640
    public final Date e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ude0)) {
            return false;
        }
        ude0 ude0Var = (ude0) obj;
        return this.f35473a == ude0Var.f35473a && this.b.equals(ude0Var.b) && this.c == ude0Var.c && this.d.equals(ude0Var.d) && Intrinsics.d(this.e, ude0Var.e) && Intrinsics.d(this.f, ude0Var.f) && this.g == ude0Var.g && this.h == ude0Var.h && Intrinsics.d(this.i, ude0Var.i) && Intrinsics.d(this.j, ude0Var.j) && this.k.equals(ude0Var.k);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof ude0) && (p6t0Var2 instanceof ude0) && ((ude0) p6t0Var).f35473a == ((ude0) p6t0Var2).f35473a;
    }

    public final int hashCode() {
        return this.k.hashCode() + dw9.a(dw9.a(brm0.e(brm0.e(brm0.i(this.f, (this.e.hashCode() + ((this.d.hashCode() + brm0.e((this.b.hashCode() + (Integer.hashCode(this.f35473a) * 31)) * 31, 31, this.c)) * 31)) * 31, 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return xun.f41520a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReceiveTextMessageUIModel(id=");
        sb.append(this.f35473a);
        sb.append(", reply=");
        sb.append(this.b);
        sb.append(", textVisible=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append((Object) this.d);
        sb.append(", status=");
        sb.append(this.e);
        sb.append(", createdAt=");
        sb.append(this.f);
        sb.append(", visibleBotLabel=");
        ua80.u(", visibleRows=", ", buttons=", sb, this.g, this.h);
        b1j.y(", rows=", ", userUIModel=", sb, this.i, this.j);
        sb.append(this.k);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
