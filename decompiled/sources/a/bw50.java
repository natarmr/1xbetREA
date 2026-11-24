package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bw50 extends dw50 {
    public final mdm d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw50(mdm mdmVar, String str, String str2, String str3) {
        super(str, str2, str3);
        mdmVar.getClass();
        str2.getClass();
        str3.getClass();
        this.d = mdmVar;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw50)) {
            return false;
        }
        bw50 bw50Var = (bw50) obj;
        return Intrinsics.d(this.d, bw50Var.d) && this.e.equals(bw50Var.e) && Intrinsics.d(this.f, bw50Var.f) && Intrinsics.d(this.g, bw50Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(ua80.b(this.d.hashCode() * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorView(lottieConfig=");
        sb.append(this.d);
        sb.append(", bannerTitle=");
        sb.append(this.e);
        sb.append(", url=");
        return ua80.m(sb, this.f, ", takingPart=", this.g, Separators.RPAREN);
    }
}
