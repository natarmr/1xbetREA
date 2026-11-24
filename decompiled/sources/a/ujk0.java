package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ujk0 {
    public static final qjk0 Companion = new qjk0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35786a;
    public final String b;
    public final tjk0 c;

    public /* synthetic */ ujk0(int i, String str, String str2, tjk0 tjk0Var) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, pjk0.f27096a.getDescriptor());
            throw null;
        }
        this.f35786a = str;
        this.b = str2;
        this.c = tjk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujk0)) {
            return false;
        }
        ujk0 ujk0Var = (ujk0) obj;
        return Intrinsics.d(this.f35786a, ujk0Var.f35786a) && Intrinsics.d(this.b, ujk0Var.b) && Intrinsics.d(this.c, ujk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f35786a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SocketAuthorizationRequest(id=", this.f35786a, ", rt=", this.b, ", payload=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }

    public ujk0(String str, tjk0 tjk0Var) {
        str.getClass();
        this.f35786a = str;
        this.b = "http://company.com/Feeds/System/Auth.json?v=2";
        this.c = tjk0Var;
    }
}
