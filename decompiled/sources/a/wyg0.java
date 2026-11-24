package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class wyg0 {
    public static final vyg0 Companion = new vyg0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39972a;
    public final int b;
    public final hae0 c;

    public /* synthetic */ wyg0(int i, String str, int i2, hae0 hae0Var) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, uyg0.f36487a.getDescriptor());
            throw null;
        }
        this.f39972a = str;
        this.b = i2;
        this.c = hae0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyg0)) {
            return false;
        }
        wyg0 wyg0Var = (wyg0) obj;
        return Intrinsics.d(this.f39972a, wyg0Var.f39972a) && this.b == wyg0Var.b && this.c == wyg0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f39972a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "SaveUserReactionByMessageIdRequest(messageId=", this.f39972a, ", issuer=", ", reaction=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }

    public wyg0(int i, hae0 hae0Var, String str) {
        str.getClass();
        hae0Var.getClass();
        this.f39972a = str;
        this.b = i;
        this.c = hae0Var;
    }
}
