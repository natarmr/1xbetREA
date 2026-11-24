package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rgv0 {
    public static final rgv0 g = new rgv0(lg30.c, 0, 0, 0, "", iun.f15405a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg30 f30457a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final List f;

    public rgv0(lg30 lg30Var, int i, int i2, int i3, String str, List list) {
        list.getClass();
        this.f30457a = lg30Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgv0)) {
            return false;
        }
        rgv0 rgv0Var = (rgv0) obj;
        return this.f30457a == rgv0Var.f30457a && this.b == rgv0Var.b && this.c == rgv0Var.c && this.d == rgv0Var.d && this.e.equals(rgv0Var.e) && Intrinsics.d(this.f, rgv0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(twn.a(this.d, twn.a(this.c, twn.a(this.b, this.f30457a.hashCode() * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WinLossModel(matchType=");
        sb.append(this.f30457a);
        sb.append(", season=");
        sb.append(this.b);
        sb.append(", wins=");
        axq.r(this.c, this.d, ", losses=", ", winRate=", sb);
        return rw2.m(this.e, ", surfaces=", Separators.RPAREN, sb, this.f);
    }
}
