package a;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class p1c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26194a;
    public final Map b;
    public final boolean c;
    public final boolean d;

    public p1c0(boolean z, Map map, boolean z2, boolean z3) {
        this.f26194a = z;
        this.b = map;
        this.c = z2;
        this.d = z3;
    }

    public static p1c0 a(p1c0 p1c0Var, boolean z, Map map, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = p1c0Var.f26194a;
        }
        if ((i & 2) != 0) {
            map = p1c0Var.b;
        }
        if ((i & 4) != 0) {
            z2 = p1c0Var.c;
        }
        boolean z3 = (i & 8) != 0 ? p1c0Var.d : true;
        p1c0Var.getClass();
        map.getClass();
        return new p1c0(z, map, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1c0)) {
            return false;
        }
        p1c0 p1c0Var = (p1c0) obj;
        return this.f26194a == p1c0Var.f26194a && this.b.equals(p1c0Var.b) && this.c == p1c0Var.c && this.d == p1c0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ohs0.f(this.b, Boolean.hashCode(this.f26194a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileEditTjState(loading=");
        sb.append(this.f26194a);
        sb.append(", fieldsMap=");
        sb.append(this.b);
        sb.append(", residentStatusPickerShowed=");
        return ohs0.p(", navigateToActivatePhone=", Separators.RPAREN, sb, this.c, this.d);
    }
}
