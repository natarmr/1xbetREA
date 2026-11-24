package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a8h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f425a;
    public final z7h0 b;

    public a8h0(String str, z7h0 z7h0Var) {
        str.getClass();
        this.f425a = str;
        this.b = z7h0Var;
    }

    public static a8h0 a(a8h0 a8h0Var, z7h0 z7h0Var) {
        String str = a8h0Var.f425a;
        a8h0Var.getClass();
        str.getClass();
        return new a8h0(str, z7h0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8h0)) {
            return false;
        }
        a8h0 a8h0Var = (a8h0) obj;
        return Intrinsics.d(this.f425a, a8h0Var.f425a) && Intrinsics.d(this.b, a8h0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f425a.hashCode() * 31;
        z7h0 z7h0Var = this.b;
        return iHashCode + (z7h0Var == null ? 0 : z7h0Var.hashCode());
    }

    public final String toString() {
        return "ScreenSelectsModel(teamId=" + this.f425a + ", mode=" + this.b + Separators.RPAREN;
    }
}
