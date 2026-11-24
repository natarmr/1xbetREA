package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rng0 extends ung0 {
    public final mdm c;
    public final String d;
    public final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rng0(mdm mdmVar, String str, boolean z) {
        super(str, z);
        mdmVar.getClass();
        str.getClass();
        this.c = mdmVar;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rng0)) {
            return false;
        }
        rng0 rng0Var = (rng0) obj;
        return Intrinsics.d(this.c, rng0Var.c) && Intrinsics.d(this.d, rng0Var.d) && this.e == rng0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(this.c.hashCode() * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(lottieConfig=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", show=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
