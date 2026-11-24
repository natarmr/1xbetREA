package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qz7 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kz7 f29568a;
    public final uz7 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;
    public final List j;
    public final List k;

    public qz7(kz7 kz7Var, uz7 uz7Var, int i, int i2, int i3, int i4, boolean z, int i5, int i6, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f29568a = kz7Var;
        this.b = uz7Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = i5;
        this.i = i6;
        this.j = list;
        this.k = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz7)) {
            return false;
        }
        qz7 qz7Var = (qz7) obj;
        return this.f29568a == qz7Var.f29568a && this.b == qz7Var.b && this.c == qz7Var.c && this.d == qz7Var.d && this.e == qz7Var.e && this.f == qz7Var.f && this.g == qz7Var.g && this.h == qz7Var.h && this.i == qz7Var.i && Intrinsics.d(this.j, qz7Var.j) && Intrinsics.d(this.k, qz7Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + dw9.a(twn.a(this.i, twn.a(this.h, brm0.e(twn.a(this.f, twn.a(this.e, twn.a(this.d, twn.a(this.c, (this.b.hashCode() + (this.f29568a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31, this.g), 31), 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BigPigModel(status=");
        sb.append(this.f29568a);
        sb.append(", currentPlayer=");
        sb.append(this.b);
        sb.append(", numberOfThrow=");
        axq.r(this.c, this.d, ", numberOfSeries=", ", currentSeriesPoints=", sb);
        axq.r(this.e, this.f, ", currentSeriesPointsBeforeThrow=", ", seriesFinished=", sb);
        ua80.q(this.h, ", firstDice=", ", secondDice=", sb, this.g);
        ohs0.v(this.i, ", firstPlayerSeries=", ", secondPlayerSeries=", sb, this.j);
        return dw9.r(sb, this.k, Separators.RPAREN);
    }
}
