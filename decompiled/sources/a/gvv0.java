package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gvv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f11994a;
    public final Map b;
    public final kvv0 c;

    public gvv0(Map map, Map map2, kvv0 kvv0Var) {
        map.getClass();
        map2.getClass();
        this.f11994a = map;
        this.b = map2;
        this.c = kvv0Var;
    }

    public static gvv0 a(gvv0 gvv0Var, Map map, Map map2, kvv0 kvv0Var, int i) {
        if ((i & 1) != 0) {
            map = gvv0Var.f11994a;
        }
        if ((i & 2) != 0) {
            map2 = gvv0Var.b;
        }
        if ((i & 4) != 0) {
            kvv0Var = gvv0Var.c;
        }
        map.getClass();
        map2.getClass();
        return new gvv0(map, map2, kvv0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvv0)) {
            return false;
        }
        gvv0 gvv0Var = (gvv0) obj;
        return Intrinsics.d(this.f11994a, gvv0Var.f11994a) && Intrinsics.d(this.b, gvv0Var.b) && Intrinsics.d(this.c, gvv0Var.c);
    }

    public final int hashCode() {
        int iF = ohs0.f(this.b, this.f11994a.hashCode() * 31, 31);
        kvv0 kvv0Var = this.c;
        return iF + (kvv0Var == null ? 0 : kvv0Var.hashCode());
    }

    public final String toString() {
        return "State(owners=" + this.f11994a + ", ownerRefs=" + this.b + ", visibleOwner=" + this.c + Separators.RPAREN;
    }
}
