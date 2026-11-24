package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tw1 implements vw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34626a;
    public final String b;
    public final qw1 c;
    public final boolean d;

    public tw1(String str, String str2, qw1 qw1Var, boolean z) {
        str2.getClass();
        this.f34626a = str;
        this.b = str2;
        this.c = qw1Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw1)) {
            return false;
        }
        tw1 tw1Var = (tw1) obj;
        return this.f34626a.equals(tw1Var.f34626a) && Intrinsics.d(this.b, tw1Var.b) && this.c.equals(tw1Var.c) && this.d == tw1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ua80.b(this.f34626a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(title=", this.f34626a, ", caption=", this.b, ", cellModel=");
        sbN.append(this.c);
        sbN.append(", initiallyExpanded=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
