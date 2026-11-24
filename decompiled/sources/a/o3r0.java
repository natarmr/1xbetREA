package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class o3r0 {
    public static final n3r0 Companion = new n3r0();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24601a;
    public final r3r0 b;

    static {
        q3r0 q3r0Var = r3r0.Companion;
        c = new a8z[]{maz.a(wez.f39042a, new joq0((byte) 8)), null};
    }

    public /* synthetic */ o3r0(int i, List list, r3r0 r3r0Var) {
        if ((i & 1) == 0) {
            this.f24601a = null;
        } else {
            this.f24601a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = r3r0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3r0)) {
            return false;
        }
        o3r0 o3r0Var = (o3r0) obj;
        return Intrinsics.d(this.f24601a, o3r0Var.f24601a) && Intrinsics.d(this.b, o3r0Var.b);
    }

    public final int hashCode() {
        List list = this.f24601a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        r3r0 r3r0Var = this.b;
        return iHashCode + (r3r0Var != null ? r3r0Var.hashCode() : 0);
    }

    public final String toString() {
        return "TopEventPlayersResponse(players=" + this.f24601a + ", response=" + this.b + Separators.RPAREN;
    }
}
