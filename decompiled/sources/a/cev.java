package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cev {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4232a;
    public final long b;
    public final long c;
    public final List d;
    public final List e;
    public final int f;
    public final List g;

    public cev(float f, long j, long j2, List list, List list2, int i, List list3) {
        b1j.B(list, list2, list3);
        this.f4232a = f;
        this.b = j;
        this.c = j2;
        this.d = list;
        this.e = list2;
        this.f = i;
        this.g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cev)) {
            return false;
        }
        cev cevVar = (cev) obj;
        return Float.compare(this.f4232a, cevVar.f4232a) == 0 && this.b == cevVar.b && this.c == cevVar.c && Intrinsics.d(this.d, cevVar.d) && Intrinsics.d(this.e, cevVar.e) && this.f == cevVar.f && Intrinsics.d(this.g, cevVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + twn.a(this.f, dw9.a(dw9.a(rw2.b(rw2.b(Float.hashCode(this.f4232a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphPointInfoModel(startLevel=");
        sb.append(this.f4232a);
        sb.append(", remainingTime=");
        sb.append(this.b);
        kng0.A(sb, ", remainingTimeMobile=", this.c, ", yValues=");
        b1j.y(", points=", ", size=", sb, this.d, this.e);
        sb.append(this.f);
        sb.append(", startMiddleEnd=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
