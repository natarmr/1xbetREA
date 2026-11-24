package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m3w implements h3w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21138a;
    public final String b;
    public final long c;

    public m3w(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.f21138a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3w)) {
            return false;
        }
        m3w m3wVar = (m3w) obj;
        if (!Intrinsics.d(this.f21138a, m3wVar.f21138a) || !Intrinsics.d(this.b, m3wVar.b)) {
            return false;
        }
        long j = m3wVar.c;
        int i = y3d.h;
        return h2t0.a(this.c, j);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f21138a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + iB;
    }

    public final String toString() {
        return axq.n(b1j.n("HistoryItemLabelTextUiModel(titleText=", this.f21138a, ", descriptionText=", this.b, ", labelTextColor="), y3d.i(this.c), Separators.RPAREN);
    }
}
