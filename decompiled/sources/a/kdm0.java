package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kdm0 implements odm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18114a;
    public final String b;
    public final bom0 c;

    public kdm0(String str, String str2, bom0 bom0Var) {
        str.getClass();
        str2.getClass();
        bom0Var.getClass();
        this.f18114a = str;
        this.b = str2;
        this.c = bom0Var;
    }

    @Override // a.odm0
    public final bom0 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdm0)) {
            return false;
        }
        kdm0 kdm0Var = (kdm0) obj;
        return Intrinsics.d(this.f18114a, kdm0Var.f18114a) && Intrinsics.d(this.b, kdm0Var.b) && Intrinsics.d(this.c, kdm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f18114a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Description(eventTitle=", this.f18114a, ", description=", this.b, ", gameStatusModel=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
