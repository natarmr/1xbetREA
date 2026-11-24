package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kha implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18280a;
    public final tha b;
    public final tha c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final int g;
    public final List h;
    public final boolean i;

    public kha(int i, tha thaVar, tha thaVar2, boolean z, boolean z2, long j, int i2, List list, boolean z3) {
        list.getClass();
        this.f18280a = i;
        this.b = thaVar;
        this.c = thaVar2;
        this.d = z;
        this.e = z2;
        this.f = j;
        this.g = i2;
        this.h = list;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kha)) {
            return false;
        }
        kha khaVar = (kha) obj;
        return this.f18280a == khaVar.f18280a && this.b.equals(khaVar.b) && this.c.equals(khaVar.c) && this.d == khaVar.d && this.e == khaVar.e && this.f == khaVar.f && this.g == khaVar.g && Intrinsics.d(this.h, khaVar.h) && this.i == khaVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + dw9.a(twn.a(this.g, rw2.b(brm0.e(brm0.e((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f18280a) * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardFootballModel(attackCount=");
        sb.append(this.f18280a);
        sb.append(", teamOne=");
        sb.append(this.b);
        sb.append(", teamTwo=");
        sb.append(this.c);
        sb.append(", goalOne=");
        sb.append(this.d);
        sb.append(", goalTwo=");
        rw2.v(this.f, ", timer=", sb, this.e);
        sb.append(", timerDecrease=");
        sb.append(this.g);
        sb.append(", periodScores=");
        sb.append(this.h);
        return f140.n(sb, ", ruLng=", this.i, Separators.RPAREN);
    }
}
