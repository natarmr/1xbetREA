package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vjm0 implements zjm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37536a;
    public final String b;
    public final String c;
    public final String d;

    public vjm0(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.f37536a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjm0)) {
            return false;
        }
        vjm0 vjm0Var = (vjm0) obj;
        return Intrinsics.d(this.f37536a, vjm0Var.f37536a) && Intrinsics.d(this.b, vjm0Var.b) && this.c.equals(vjm0Var.c) && this.d.equals(vjm0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f37536a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("OneOpponentWithLogo(teamName=", this.f37536a, ", infoLabel=", this.b, ", seedingLeft="), this.c, ", seedingRight=", this.d, Separators.RPAREN);
    }
}
