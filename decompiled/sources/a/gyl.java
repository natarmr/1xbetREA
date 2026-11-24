package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gyl implements hyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final syl f12135a;
    public final hh80 b;

    public /* synthetic */ gyl(syl sylVar, lh80 lh80Var, int i) {
        this((i & 1) != 0 ? syl.f33027a : sylVar, (i & 2) != 0 ? null : lh80Var);
    }

    public static gyl a(gyl gylVar, hh80 hh80Var) {
        syl sylVar = gylVar.f12135a;
        gylVar.getClass();
        sylVar.getClass();
        return new gyl(sylVar, hh80Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyl)) {
            return false;
        }
        gyl gylVar = (gyl) obj;
        return this.f12135a == gylVar.f12135a && Intrinsics.d(this.b, gylVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f12135a.hashCode() * 31;
        hh80 hh80Var = this.b;
        return iHashCode + (hh80Var == null ? 0 : hh80Var.hashCode());
    }

    public final String toString() {
        return "Shimmers(orientation=" + this.f12135a + ", contentPadding=" + this.b + Separators.RPAREN;
    }

    public gyl(syl sylVar, hh80 hh80Var) {
        sylVar.getClass();
        this.f12135a = sylVar;
        this.b = hh80Var;
    }
}
