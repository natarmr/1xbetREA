package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hlr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13277a;
    public final zqq0 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final List l;

    public hlr0(int i, zqq0 zqq0Var, String str, String str2, String str3, String str4, int i2, int i3, int i4, int i5, long j, List list) {
        list.getClass();
        this.f13277a = i;
        this.b = zqq0Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = j;
        this.l = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlr0)) {
            return false;
        }
        hlr0 hlr0Var = (hlr0) obj;
        return this.f13277a == hlr0Var.f13277a && this.b == hlr0Var.b && this.c.equals(hlr0Var.c) && this.d.equals(hlr0Var.d) && this.e.equals(hlr0Var.e) && this.f.equals(hlr0Var.f) && this.g == hlr0Var.g && this.h == hlr0Var.h && this.i == hlr0Var.i && this.j == hlr0Var.j && this.k == hlr0Var.k && Intrinsics.d(this.l, hlr0Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + rw2.b(twn.a(this.j, twn.a(this.i, twn.a(this.h, twn.a(this.g, ua80.b(ua80.b(ua80.b(ua80.b((this.b.hashCode() + (Integer.hashCode(this.f13277a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31), 31), 31), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotoBetTirageItemModel(tirage=");
        sb.append(this.f13277a);
        sb.append(", tiragStatus=");
        sb.append(this.b);
        sb.append(", stringTiragStatus=");
        f140.v(sb, this.c, ", jackpot=", this.d, ", pool=");
        f140.v(sb, this.e, ", prizeFund=", this.f, ", numberOfBets=");
        axq.r(this.g, this.h, ", confirmedBets=", ", numberOfVariants=", sb);
        axq.r(this.i, this.j, ", numberOfUnique=", ", timeUntilEndReception=", sb);
        hne.x(sb, this.k, ", reportFilesModelList=", this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
