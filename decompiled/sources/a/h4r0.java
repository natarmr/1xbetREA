package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h4r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12448a;
    public final long b;
    public final String c;
    public final hjm d;
    public final zll e;

    public h4r0(long j, long j2, String str, hjm hjmVar, zll zllVar) {
        str.getClass();
        this.f12448a = j;
        this.b = j2;
        this.c = str;
        this.d = hjmVar;
        this.e = zllVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4r0)) {
            return false;
        }
        h4r0 h4r0Var = (h4r0) obj;
        return this.f12448a == h4r0Var.f12448a && this.b == h4r0Var.b && Intrinsics.d(this.c, h4r0Var.c) && this.d.equals(h4r0Var.d) && this.e.equals(h4r0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + hne.e(this.d, ua80.b(rw2.b(Long.hashCode(this.f12448a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f12448a, "TopGameItemUiModel(id=", ", partId=");
        kng0.z(sbQ, this.b, ", title=", this.c);
        sbQ.append(", headerModel=");
        sbQ.append(this.d);
        sbQ.append(", card=");
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
