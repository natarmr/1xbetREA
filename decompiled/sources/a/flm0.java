package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class flm0 implements jlm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9746a;
    public final String b;
    public final String c;
    public final String d;

    public flm0(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.f9746a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flm0)) {
            return false;
        }
        flm0 flm0Var = (flm0) obj;
        return Intrinsics.d(this.f9746a, flm0Var.f9746a) && Intrinsics.d(this.b, flm0Var.b) && this.c.equals(flm0Var.c) && this.d.equals(flm0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f9746a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("OneOpponentWithLogo(teamName=", this.f9746a, ", infoLabel=", this.b, ", seedingLeft="), this.c, ", seedingRight=", this.d, Separators.RPAREN);
    }
}
