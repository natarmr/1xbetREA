package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ktd0 {
    public static final ktd0 k = new ktd0("", "", "", 0, lho.UNKNOWN, 0, "", 0, 0, iun.f15405a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18860a;
    public final String b;
    public final String c;
    public final long d;
    public final lho e;
    public final long f;
    public final String g;
    public final long h;
    public final long i;
    public final List j;

    public ktd0(String str, String str2, String str3, long j, lho lhoVar, long j2, String str4, long j3, long j4, List list) {
        list.getClass();
        this.f18860a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = lhoVar;
        this.f = j2;
        this.g = str4;
        this.h = j3;
        this.i = j4;
        this.j = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktd0)) {
            return false;
        }
        ktd0 ktd0Var = (ktd0) obj;
        return this.f18860a.equals(ktd0Var.f18860a) && this.b.equals(ktd0Var.b) && this.c.equals(ktd0Var.c) && this.d == ktd0Var.d && this.e == ktd0Var.e && this.f == ktd0Var.f && this.g.equals(ktd0Var.g) && this.h == ktd0Var.h && this.i == ktd0Var.i && Intrinsics.d(this.j, ktd0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + rw2.b(rw2.b(ua80.b(rw2.b((this.e.hashCode() + rw2.b(ua80.b(ua80.b(this.f18860a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RacesStatisticInfoModel(id=", this.f18860a, ", tournTitle=", this.b, ", trackTitle=");
        defpackage.c.i(sbN, this.d, this.c, ", trackId=");
        sbN.append(", status=");
        sbN.append(this.e);
        sbN.append(", dateStart=");
        kng0.z(sbN, this.f, ", circuitLength=", this.g);
        kng0.A(sbN, ", laps=", this.h, ", raceDistance=");
        hne.x(sbN, this.i, ", menus=", this.j);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
