package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r07 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29616a;
    public final String b;
    public final boolean c;
    public final float d;

    public r07(long j, String str, boolean z, float f) {
        str.getClass();
        this.f29616a = j;
        this.b = str;
        this.c = z;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r07)) {
            return false;
        }
        r07 r07Var = (r07) obj;
        return this.f29616a == r07Var.f29616a && Intrinsics.d(this.b, r07Var.b) && this.c == r07Var.c && Float.compare(this.d, r07Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + brm0.e(ua80.b(Long.hashCode(this.f29616a) * 31, 31, this.b), 31, this.c);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof r07) && (p6t0Var2 instanceof r07)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            r07 r07Var = (r07) p6t0Var;
            r07 r07Var2 = (r07) p6t0Var2;
            k9x.G(linkedHashSet, new n07(r07Var.b), new n07(r07Var2.b));
            k9x.G(linkedHashSet, new o07(r07Var.c), new o07(r07Var2.c));
            k9x.G(linkedHashSet, new p07(r07Var.d), new p07(r07Var2.d));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        String strL = kng0.l("GroupName(value=", this.b, Separators.RPAREN);
        String strD = defpackage.c.d("IsExpanded(value=", Separators.RPAREN, this.c);
        String strJ = rw2.j(this.d, "RotationValue(value=", Separators.RPAREN);
        StringBuilder sbO = axq.o(this.f29616a, "BetHeaderUiModel(groupId=", ", groupName=", strL);
        f140.v(sbO, ", isExpanded=", strD, ", rotationValue=", strJ);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
