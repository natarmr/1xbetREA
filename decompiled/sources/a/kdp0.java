package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kdp0 implements sdp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5a0 f18117a;
    public final String b;
    public final rpe c;

    public kdp0(g5a0 g5a0Var, String str, rpe rpeVar) {
        str.getClass();
        this.f18117a = g5a0Var;
        this.b = str;
        this.c = rpeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdp0)) {
            return false;
        }
        kdp0 kdp0Var = (kdp0) obj;
        return this.f18117a.equals(kdp0Var.f18117a) && Intrinsics.d(this.b, kdp0Var.b) && Intrinsics.d(this.c, kdp0Var.c);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f18117a.hashCode() * 31, 31, this.b);
        rpe rpeVar = this.c;
        return iB + (rpeVar == null ? 0 : Integer.hashCode(rpeVar.f30883a));
    }

    public final String toString() {
        return "Default(playerLogo=" + this.f18117a + ", name=" + this.b + ", redCards=" + this.c + Separators.RPAREN;
    }
}
