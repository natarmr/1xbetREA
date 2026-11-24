package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15125a;
    public final ArrayList b;
    public final long c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;

    public ion(long j, ArrayList arrayList, long j2, String str, long j3, String str2, String str3, String str4, boolean z) {
        str2.getClass();
        str3.getClass();
        this.f15125a = j;
        this.b = arrayList;
        this.c = j2;
        this.d = str;
        this.e = j3;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ion)) {
            return false;
        }
        ion ionVar = (ion) obj;
        return this.f15125a == ionVar.f15125a && this.b.equals(ionVar.b) && this.c == ionVar.c && this.d.equals(ionVar.d) && this.e == ionVar.e && Intrinsics.d(this.f, ionVar.f) && Intrinsics.d(this.g, ionVar.g) && this.h.equals(ionVar.h) && this.i == ionVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(rw2.b(twn.g(this.b, Long.hashCode(this.f15125a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditEventDataModel(gameId=");
        sb.append(this.f15125a);
        sb.append(", eventMarketsGroupModelsList=");
        sb.append(this.b);
        kng0.A(sb, ", sportId=", this.c, ", champName=");
        defpackage.c.i(sb, this.e, this.d, ", timeStart=");
        f140.v(sb, ", teamOneName=", this.f, ", teamTwoName=", this.g);
        w6x.z(", fullName=", this.h, ", isSingle=", sb, this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
