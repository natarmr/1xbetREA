package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class tyf0 {
    public static final pyf0 Companion = new pyf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34752a;
    public final String b;
    public final syf0 c;

    public /* synthetic */ tyf0(int i, String str, String str2, syf0 syf0Var) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, oyf0.f26058a.getDescriptor());
            throw null;
        }
        this.f34752a = str;
        this.b = str2;
        this.c = syf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyf0)) {
            return false;
        }
        tyf0 tyf0Var = (tyf0) obj;
        return Intrinsics.d(this.f34752a, tyf0Var.f34752a) && Intrinsics.d(this.b, tyf0Var.b) && Intrinsics.d(this.c, tyf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f34752a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RestorePasswordDeclineRequest(id=", this.f34752a, ", rt=", this.b, ", payload=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }

    public tyf0(String str, syf0 syf0Var) {
        str.getClass();
        this.f34752a = str;
        this.b = "http://company.com/Feeds/Authenticator/DiscardOperation.json?v=1";
        this.c = syf0Var;
    }
}
