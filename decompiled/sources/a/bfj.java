package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bfj implements h3w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2506a;
    public final String b;
    public final int c;
    public final long d;

    public bfj(int i, long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f2506a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfj)) {
            return false;
        }
        bfj bfjVar = (bfj) obj;
        if (!Intrinsics.d(this.f2506a, bfjVar.f2506a) || !Intrinsics.d(this.b, bfjVar.b) || this.c != bfjVar.c) {
            return false;
        }
        long j = bfjVar.d;
        int i = y3d.h;
        return h2t0.a(this.d, j);
    }

    public final int hashCode() {
        int iA = twn.a(this.c, ua80.b(this.f2506a.hashCode() * 31, 31, this.b), 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.d) + iA;
    }

    public final String toString() {
        return rw2.k(this.c, ", statusColor=", y3d.i(this.d), Separators.RPAREN, b1j.n("DateSmallHistoryItemUiModel(date=", this.f2506a, ", statusTitle=", this.b, ", statusIcon="));
    }
}
