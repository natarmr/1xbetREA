package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sl8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32386a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final rl8 j;

    public sl8(int i, String str, String str2, long j, String str3, String str4, String str5, String str6, int i2, rl8 rl8Var) {
        str3.getClass();
        str5.getClass();
        this.f32386a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = i2;
        this.j = rl8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl8)) {
            return false;
        }
        sl8 sl8Var = (sl8) obj;
        return this.f32386a == sl8Var.f32386a && this.b.equals(sl8Var.b) && this.c.equals(sl8Var.c) && this.d == sl8Var.d && Intrinsics.d(this.e, sl8Var.e) && this.f.equals(sl8Var.f) && Intrinsics.d(this.g, sl8Var.g) && this.h.equals(sl8Var.h) && this.i == sl8Var.i && Double.compare(0.0d, 0.0d) == 0 && this.j.equals(sl8Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + brm0.d(0.0d, twn.a(this.i, ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(ua80.b(Integer.hashCode(this.f32386a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f32386a, "BonusesUiModel(id=", ", title=", this.b, ", subtitle=");
        defpackage.c.i(sbR, this.d, this.c, ", subtitleTime=");
        f140.v(sbR, ", left=", this.e, ", moneyProgress=", this.f);
        f140.v(sbR, ", experience=", this.g, ", fullExperience=", this.h);
        sbR.append(", progress=");
        sbR.append(this.i);
        sbR.append(", money=0.0, button=");
        sbR.append(this.j);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
