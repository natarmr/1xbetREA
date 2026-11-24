package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gl50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11475a;
    public final String b;
    public final al50 c;
    public final luo d;

    public gl50(String str, String str2, al50 al50Var, luo luoVar) {
        this.f11475a = str;
        this.b = str2;
        this.c = al50Var;
        this.d = luoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl50)) {
            return false;
        }
        gl50 gl50Var = (gl50) obj;
        return this.f11475a.equals(gl50Var.f11475a) && Intrinsics.d(this.b, gl50Var.b) && this.c.equals(gl50Var.c) && Intrinsics.d(this.d, gl50Var.d);
    }

    public final int hashCode() {
        return this.d.f20682a.hashCode() + ohs0.f(this.c.f1052a, ua80.b(this.f11475a.hashCode() * 31, 31, this.b), 961);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("NetworkRequest(url=", this.f11475a, ", method=", this.b, ", headers=");
        sbN.append(this.c);
        sbN.append(", body=null, extras=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
