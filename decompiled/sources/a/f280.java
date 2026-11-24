package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f280 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8801a;
    public final String b;
    public final String c;
    public final seo d;

    public f280(int i, String str, String str2, seo seoVar) {
        str.getClass();
        this.f8801a = i;
        this.b = str;
        this.c = str2;
        this.d = seoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f280)) {
            return false;
        }
        f280 f280Var = (f280) obj;
        return this.f8801a == f280Var.f8801a && Intrinsics.d(this.b, f280Var.b) && Intrinsics.d(this.c, f280Var.c) && this.d.equals(f280Var.d);
    }

    public final int hashCode() {
        int iB = ua80.b(Integer.hashCode(this.f8801a) * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f8801a, "OpponentModel(id=", ", name=", this.b, ", image=");
        sbR.append(this.c);
        sbR.append(", event=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
