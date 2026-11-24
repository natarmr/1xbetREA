package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class duy implements h3w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6718a;
    public final String b;
    public final long c;

    public duy(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.f6718a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof duy)) {
            return false;
        }
        duy duyVar = (duy) obj;
        if (!Intrinsics.d(this.f6718a, duyVar.f6718a) || !Intrinsics.d(this.b, duyVar.b)) {
            return false;
        }
        long j = duyVar.c;
        int i = y3d.h;
        return h2t0.a(this.c, j);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f6718a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + iB;
    }

    public final String toString() {
        return axq.n(b1j.n("LabelTextSmallHistoryUiModel(titleText=", this.f6718a, ", descriptionText=", this.b, ", descriptionColor="), y3d.i(this.c), Separators.RPAREN);
    }
}
