package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q5p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f28164a;
    public final long b;
    public final String c;
    public final String d;

    public q5p0(long j, Integer num, String str, String str2) {
        str.getClass();
        this.f28164a = num;
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5p0)) {
            return false;
        }
        q5p0 q5p0Var = (q5p0) obj;
        if (!Intrinsics.d(this.f28164a, q5p0Var.f28164a)) {
            return false;
        }
        long j = q5p0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && Intrinsics.d(this.c, q5p0Var.c) && this.d.equals(q5p0Var.d);
    }

    public final int hashCode() {
        Integer num = this.f28164a;
        int iHashCode = num == null ? 0 : num.hashCode();
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.d.hashCode() + ua80.b(rw2.b(iHashCode * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(h97.n(this.f28164a, "TeamCharacteristicsCardUiModel(iconRes=", ", subtitleColor=", y3d.i(this.b), ", title="), this.c, ", subTitle=", this.d, Separators.RPAREN);
    }
}
