package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qmm0 implements umm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28991a;
    public final String b;
    public final String c;
    public final String d;

    public qmm0(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.f28991a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmm0)) {
            return false;
        }
        qmm0 qmm0Var = (qmm0) obj;
        return Intrinsics.d(this.f28991a, qmm0Var.f28991a) && Intrinsics.d(this.b, qmm0Var.b) && this.c.equals(qmm0Var.c) && this.d.equals(qmm0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f28991a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("OneOpponentWithLogo(teamName=", this.f28991a, ", infoLabel=", this.b, ", seedingLeft="), this.c, ", seedingRight=", this.d, Separators.RPAREN);
    }
}
