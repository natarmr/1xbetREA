package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z540 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43799a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final boolean h;
    public final t440 i;

    public z540(boolean z, String str, String str2, String str3, String str4, String str5, int i, boolean z2, t440 t440Var) {
        this.f43799a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i;
        this.h = z2;
        this.i = t440Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z540)) {
            return false;
        }
        z540 z540Var = (z540) obj;
        return this.f43799a == z540Var.f43799a && this.b.equals(z540Var.b) && this.c.equals(z540Var.c) && this.d.equals(z540Var.d) && Intrinsics.d(this.e, z540Var.e) && this.f.equals(z540Var.f) && this.g == z540Var.g && this.h == z540Var.h && this.i.equals(z540Var.i);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(Boolean.hashCode(this.f43799a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.i.hashCode() + brm0.e(twn.a(this.g, ua80.b((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("MessageModel(isRead=", ", id=", this.b, this.f43799a, ", title=");
        f140.v(sbQ, this.c, ", text=", this.d, ", imageUrl=");
        f140.v(sbQ, this.e, ", buttonText=", this.f, ", date=");
        brm0.w(this.g, ", isMatchOfDays=", ", extension=", sbQ, this.h);
        sbQ.append(this.i);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
