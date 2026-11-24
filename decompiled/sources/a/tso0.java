package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class tso0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34470a;
    public final String b;
    public final sso0 c;

    public tso0(String str, String str2, sso0 sso0Var) {
        str.getClass();
        str2.getClass();
        sso0Var.getClass();
        this.f34470a = str;
        this.b = str2;
        this.c = sso0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tso0)) {
            return false;
        }
        tso0 tso0Var = (tso0) obj;
        return Intrinsics.d(this.f34470a, tso0Var.f34470a) && Intrinsics.d(this.b, tso0Var.b) && Intrinsics.d(this.c, tso0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f34470a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TagUiModel(id=", this.f34470a, ", text=", this.b, ", style=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
