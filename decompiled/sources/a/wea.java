package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wea implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uea f39010a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final List f;
    public final List g;

    public wea(uea ueaVar, int i, int i2, int i3, int i4, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f39010a = ueaVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = list;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wea)) {
            return false;
        }
        wea weaVar = (wea) obj;
        return this.f39010a == weaVar.f39010a && this.b == weaVar.b && this.c == weaVar.c && this.d == weaVar.d && this.e == weaVar.e && Intrinsics.d(this.f, weaVar.f) && Intrinsics.d(this.g, weaVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + dw9.a(twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, this.f39010a.hashCode() * 31, 31), 31), 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardCricketModel(gameState=");
        sb.append(this.f39010a);
        sb.append(", firstScore=");
        sb.append(this.b);
        sb.append(", secondScore=");
        axq.r(this.c, this.d, ", firstWickets=", ", secondWickets=", sb);
        ohs0.v(this.e, ", firstInning=", ", secondInning=", sb, this.f);
        return dw9.r(sb, this.g, Separators.RPAREN);
    }
}
