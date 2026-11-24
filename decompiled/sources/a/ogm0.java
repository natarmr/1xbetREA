package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ogm0 implements pgm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25228a;
    public final String b;
    public final String c;
    public final String d;

    public ogm0(String str, String str2, String str3, String str4) {
        str2.getClass();
        str4.getClass();
        this.f25228a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogm0)) {
            return false;
        }
        ogm0 ogm0Var = (ogm0) obj;
        return this.f25228a.equals(ogm0Var.f25228a) && Intrinsics.d(this.b, ogm0Var.b) && this.c.equals(ogm0Var.c) && Intrinsics.d(this.d, ogm0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f25228a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("PlayerParams(playerName=", this.f25228a, ", heroName=", this.b, ", heroImage="), this.c, ", tagText=", this.d, Separators.RPAREN);
    }
}
