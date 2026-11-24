package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jpk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16907a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final lwk0 g;
    public final ipk0 h;
    public final boolean i;
    public final long j;
    public final boolean k;

    public jpk0(int i, String str, String str2, String str3, String str4, long j, lwk0 lwk0Var, ipk0 ipk0Var, boolean z, long j2, boolean z2) {
        str.getClass();
        this.f16907a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
        this.g = lwk0Var;
        this.h = ipk0Var;
        this.i = z;
        this.j = j2;
        this.k = z2;
    }

    public static jpk0 a(jpk0 jpk0Var, String str, String str2, String str3, long j, lwk0 lwk0Var, boolean z, int i) {
        int i2 = jpk0Var.f16907a;
        String str4 = jpk0Var.b;
        String str5 = (i & 4) != 0 ? jpk0Var.c : str;
        String str6 = (i & 8) != 0 ? jpk0Var.d : str2;
        String str7 = (i & 16) != 0 ? jpk0Var.e : str3;
        long j2 = (i & 32) != 0 ? jpk0Var.f : j;
        lwk0 lwk0Var2 = (i & 64) != 0 ? jpk0Var.g : lwk0Var;
        ipk0 ipk0Var = jpk0Var.h;
        boolean z2 = jpk0Var.i;
        long j3 = jpk0Var.j;
        boolean z3 = (i & 1024) != 0 ? jpk0Var.k : z;
        jpk0Var.getClass();
        str4.getClass();
        return new jpk0(i2, str4, str5, str6, str7, j2, lwk0Var2, ipk0Var, z2, j3, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jpk0) {
            jpk0 jpk0Var = (jpk0) obj;
            if (this.f16907a == jpk0Var.f16907a && Intrinsics.d(this.b, jpk0Var.b) && this.c.equals(jpk0Var.c) && this.d.equals(jpk0Var.d) && this.e.equals(jpk0Var.e) && this.f == jpk0Var.f && this.g.equals(jpk0Var.g) && this.h.equals(jpk0Var.h) && this.i == jpk0Var.i && znq0.e(this.j, jpk0Var.j) && this.k == jpk0Var.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + rw2.b(brm0.e((this.h.hashCode() + ((this.g.hashCode() + rw2.b(ua80.b(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f16907a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31, 31, this.i), 31, this.j);
    }

    public final String toString() {
        String strG = ynq0.g(this.f);
        String strH = znq0.h(this.j);
        StringBuilder sbR = vqd.r(this.f16907a, "SpecialEventMainStateModel(eventId=", ", title=", this.b, ", backgroundUrl=");
        f140.v(sbR, this.c, ", leftPlayerImageUrl=", this.d, ", rightPlayerImageUrl=");
        f140.v(sbR, this.e, ", eventStartTimerValue=", strG, ", tabsStateModel=");
        sbR.append(this.g);
        sbR.append(", screenSettings=");
        sbR.append(this.h);
        sbR.append(", hasTimer=");
        f140.s(", eventStartTime=", strH, ", isThemeDark=", sbR, this.i);
        return rw2.p(sbR, this.k, Separators.RPAREN);
    }
}
