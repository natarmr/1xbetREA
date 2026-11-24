package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o4i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24637a;
    public final String b;

    public o4i0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f24637a = str;
        this.b = str2;
    }

    public static o4i0 a(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new o4i0(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4i0)) {
            return false;
        }
        o4i0 o4i0Var = (o4i0) obj;
        return Intrinsics.d(this.f24637a, o4i0Var.f24637a) && Intrinsics.d(this.b, o4i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24637a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("SelectedPlayersState(firstTeamPlayerId=", this.f24637a, ", secondTeamPlayerId=", this.b, Separators.RPAREN);
    }
}
