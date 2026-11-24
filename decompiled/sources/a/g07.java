package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g07 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10444a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final int f;
    public final ArrayList g;

    public g07(long j, String str, String str2, boolean z, int i, int i2, ArrayList arrayList) {
        str.getClass();
        this.f10444a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g07)) {
            return false;
        }
        g07 g07Var = (g07) obj;
        return this.f10444a == g07Var.f10444a && Intrinsics.d(this.b, g07Var.b) && this.c.equals(g07Var.c) && this.d == g07Var.d && this.e == g07Var.e && this.f == g07Var.f && this.g.equals(g07Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + twn.a(this.f, twn.a(this.e, brm0.e(ua80.b(ua80.b(Long.hashCode(this.f10444a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f10444a, "BetGroupMapModel(id=", ", groupName=", this.b);
        w6x.z(", subGameName=", this.c, ", subGameVisible=", sbO, this.d);
        rw2.s(this.e, this.f, ", columnCount=", ", coefListSize=", sbO);
        sbO.append(", coefButtonList=");
        sbO.append(this.g);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
