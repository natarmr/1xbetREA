package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o180 implements u180 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24468a;
    public final c280 b;
    public final String c;
    public final c280 d;
    public final String e;
    public final String f;

    public o180(String str, c280 c280Var, String str2, c280 c280Var2, String str3, String str4) {
        str3.getClass();
        str4.getClass();
        this.f24468a = str;
        this.b = c280Var;
        this.c = str2;
        this.d = c280Var2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o180)) {
            return false;
        }
        o180 o180Var = (o180) obj;
        return this.f24468a.equals(o180Var.f24468a) && this.b.equals(o180Var.b) && this.c.equals(o180Var.c) && this.d.equals(o180Var.d) && Intrinsics.d(this.e, o180Var.e) && Intrinsics.d(this.f, o180Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(hne.g(this.d, ua80.b(hne.g(this.b, this.f24468a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "Cricket(opponentTopTitle=", this.f24468a, ", opponentTopImage=", ", opponentBottomTitle=");
        sbP.append(this.c);
        sbP.append(", opponentBottomImage=");
        sbP.append(this.d);
        sbP.append(", opponentTopScore=");
        return ua80.m(sbP, this.e, ", opponentBottomScore=", this.f, Separators.RPAREN);
    }
}
