package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rd5 implements ud5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30274a;
    public final int b;

    public rd5(String str, int i) {
        str.getClass();
        this.f30274a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd5)) {
            return false;
        }
        rd5 rd5Var = (rd5) obj;
        return Intrinsics.d(this.f30274a, rd5Var.f30274a) && this.b == rd5Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f30274a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "RemoteImage(url=", this.f30274a, ", defaultColor=", Separators.RPAREN);
    }
}
