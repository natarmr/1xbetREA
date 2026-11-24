package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wd80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38961a;
    public final String b;
    public final String c;

    public wd80(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f38961a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd80)) {
            return false;
        }
        wd80 wd80Var = (wd80) obj;
        return Intrinsics.d(this.f38961a, wd80Var.f38961a) && Intrinsics.d(this.b, wd80Var.b) && this.c.equals(wd80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f38961a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("OutcomesCardHeaderUiModel(counterValue=", this.f38961a, ", date=", this.b, ", quarter="), this.c, Separators.RPAREN);
    }
}
