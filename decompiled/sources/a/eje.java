package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class eje implements ije {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7904a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public eje(List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f7904a = list;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eje)) {
            return false;
        }
        eje ejeVar = (eje) obj;
        return Intrinsics.d(this.f7904a, ejeVar.f7904a) && this.b == ejeVar.b && this.c == ejeVar.c && this.d == ejeVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(this.f7904a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(couponModelsList=");
        sb.append(this.f7904a);
        sb.append(", enableTouch=");
        sb.append(this.b);
        sb.append(", itemsAppearanceChanged=");
        return ohs0.p(", withBlock=", Separators.RPAREN, sb, this.c, this.d);
    }
}
