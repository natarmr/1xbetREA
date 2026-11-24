package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hsm implements jsm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13592a;
    public final String b;
    public final a4x c;

    public hsm(a4x a4xVar, String str, String str2) {
        w6x.x(a4xVar, str, str2);
        this.f13592a = str;
        this.b = str2;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsm)) {
            return false;
        }
        hsm hsmVar = (hsm) obj;
        return Intrinsics.d(this.f13592a, hsmVar.f13592a) && Intrinsics.d(this.b, hsmVar.b) && Intrinsics.d(this.c, hsmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f13592a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("Default(btnFilterText=", this.f13592a, ", btnAllText=", this.b, ", items="), this.c, Separators.RPAREN);
    }
}
