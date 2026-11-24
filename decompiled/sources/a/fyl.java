package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fyl implements hyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f10362a;
    public final tyl b;
    public final syl c;
    public final hh80 d;
    public final jyl e;

    public /* synthetic */ fyl(a4x a4xVar, tyl tylVar, syl sylVar, hh80 hh80Var, jyl jylVar, int i) {
        this(a4xVar, (i & 2) != 0 ? tyl.b : tylVar, (i & 4) != 0 ? syl.f33027a : sylVar, (i & 8) != 0 ? null : hh80Var, (i & 16) != 0 ? null : jylVar);
    }

    public static fyl a(fyl fylVar, hh80 hh80Var) {
        a4x a4xVar = fylVar.f10362a;
        tyl tylVar = fylVar.b;
        syl sylVar = fylVar.c;
        jyl jylVar = fylVar.e;
        fylVar.getClass();
        a4xVar.getClass();
        tylVar.getClass();
        sylVar.getClass();
        return new fyl(a4xVar, tylVar, sylVar, hh80Var, jylVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyl)) {
            return false;
        }
        fyl fylVar = (fyl) obj;
        return Intrinsics.d(this.f10362a, fylVar.f10362a) && this.b == fylVar.b && this.c == fylVar.c && Intrinsics.d(this.d, fylVar.d) && Intrinsics.d(this.e, fylVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f10362a.hashCode() * 31)) * 31)) * 31;
        hh80 hh80Var = this.d;
        int iHashCode2 = (iHashCode + (hh80Var == null ? 0 : hh80Var.hashCode())) * 31;
        jyl jylVar = this.e;
        return iHashCode2 + (jylVar != null ? jylVar.hashCode() : 0);
    }

    public final String toString() {
        return "Chips(items=" + this.f10362a + ", selectionMode=" + this.b + ", orientation=" + this.c + ", contentPadding=" + this.d + ", customColors=" + this.e + Separators.RPAREN;
    }

    public fyl(a4x a4xVar, tyl tylVar, syl sylVar, hh80 hh80Var, jyl jylVar) {
        a4xVar.getClass();
        tylVar.getClass();
        sylVar.getClass();
        this.f10362a = a4xVar;
        this.b = tylVar;
        this.c = sylVar;
        this.d = hh80Var;
        this.e = jylVar;
    }
}
