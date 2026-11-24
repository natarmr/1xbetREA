package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bc6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2338a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;

    public bc6(String str, String str2, String str3, String str4, int i, ArrayList arrayList) {
        str.getClass();
        this.f2338a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc6)) {
            return false;
        }
        bc6 bc6Var = (bc6) obj;
        return Intrinsics.d(this.f2338a, bc6Var.f2338a) && this.b.equals(bc6Var.b) && this.c.equals(bc6Var.c) && this.d.equals(bc6Var.d) && this.e == bc6Var.e && this.f.equals(bc6Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.a(this.e, ua80.b(ua80.b(ua80.b(this.f2338a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BestHeroPlayerModel(playerId=", this.f2338a, ", image=", this.b, ", name=");
        f140.v(sbN, this.c, ", role=", this.d, ", position=");
        sbN.append(this.e);
        sbN.append(", heroes=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
