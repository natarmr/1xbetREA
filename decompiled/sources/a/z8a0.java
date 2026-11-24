package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z8a0 {
    public static final z8a0 g = new z8a0("", "", 0, "", zqe.c, "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43958a;
    public final String b;
    public final int c;
    public final String d;
    public final zqe e;
    public final String f;

    public z8a0(String str, String str2, int i, String str3, zqe zqeVar, String str4) {
        zqeVar.getClass();
        this.f43958a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = zqeVar;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8a0)) {
            return false;
        }
        z8a0 z8a0Var = (z8a0) obj;
        return this.f43958a.equals(z8a0Var.f43958a) && this.b.equals(z8a0Var.b) && this.c == z8a0Var.c && this.d.equals(z8a0Var.d) && Intrinsics.d(this.e, z8a0Var.e) && this.f.equals(z8a0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ua80.b(twn.a(this.c, ua80.b(this.f43958a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PlayerModel(id=", this.f43958a, ", name=", this.b, ", translationId=");
        kng0.w(this.c, ", shortName=", this.d, ", country=", sbN);
        sbN.append(this.e);
        sbN.append(", image=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
