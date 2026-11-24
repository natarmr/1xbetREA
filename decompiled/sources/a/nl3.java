package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nl3 implements ql3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23708a;
    public final String b;
    public final ml3 c;

    public nl3(String str, String str2, ml3 ml3Var) {
        str.getClass();
        str2.getClass();
        this.f23708a = str;
        this.b = str2;
        this.c = ml3Var;
    }

    @Override // a.ql3
    public final ml3 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl3)) {
            return false;
        }
        nl3 nl3Var = (nl3) obj;
        return Intrinsics.d(this.f23708a, nl3Var.f23708a) && Intrinsics.d(this.b, nl3Var.b) && this.c.equals(nl3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f23708a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BottomSheetStyle(label=", this.f23708a, ", description=", this.b, ", barStyle=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
