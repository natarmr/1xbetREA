package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dgv0 {
    public static final cgv0 e = new cgv0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6061a;
    public final String b;
    public final boolean c;
    public final List d;

    public dgv0(String str, List list, boolean z, boolean z2) {
        list.getClass();
        this.f6061a = z;
        this.b = str;
        this.c = z2;
        this.d = list;
    }

    public static dgv0 a(dgv0 dgv0Var, boolean z, String str, boolean z2, List list, int i) {
        if ((i & 1) != 0) {
            z = dgv0Var.f6061a;
        }
        if ((i & 2) != 0) {
            str = dgv0Var.b;
        }
        if ((i & 4) != 0) {
            z2 = dgv0Var.c;
        }
        if ((i & 8) != 0) {
            list = dgv0Var.d;
        }
        dgv0Var.getClass();
        str.getClass();
        list.getClass();
        return new dgv0(str, list, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgv0)) {
            return false;
        }
        dgv0 dgv0Var = (dgv0) obj;
        return this.f6061a == dgv0Var.f6061a && this.b.equals(dgv0Var.b) && this.c == dgv0Var.c && Intrinsics.d(this.d, dgv0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(ua80.b(Boolean.hashCode(this.f6061a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("WildFreeBetSelectGameState(loading=", ", searchQuery=", this.b, this.f6061a, ", searchActive=");
        sbQ.append(this.c);
        sbQ.append(", gameList=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
