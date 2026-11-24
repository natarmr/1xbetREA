package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vrr implements zrr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uqr f37915a;
    public final String b;
    public final j83 c;

    public vrr(uqr uqrVar, String str, j83 j83Var) {
        str.getClass();
        this.f37915a = uqrVar;
        this.b = str;
        this.c = j83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrr)) {
            return false;
        }
        vrr vrrVar = (vrr) obj;
        return this.f37915a.equals(vrrVar.f37915a) && Intrinsics.d(this.b, vrrVar.b) && this.c.equals(vrrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f37915a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "SingleTeam(labels=" + this.f37915a + ", teamName=" + this.b + ", bottomInfo=" + ((Object) this.c) + Separators.RPAREN;
    }
}
