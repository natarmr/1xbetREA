package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c0p0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3535a;
    public final wul b;

    public c0p0(String str, wul wulVar) {
        str.getClass();
        this.f3535a = str;
        this.b = wulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0p0)) {
            return false;
        }
        c0p0 c0p0Var = (c0p0) obj;
        return Intrinsics.d(this.f3535a, c0p0Var.f3535a) && this.b.equals(c0p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3535a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamBetExpressUiItem(label=" + this.f3535a + ", generateButton=" + this.b + Separators.RPAREN;
    }
}
