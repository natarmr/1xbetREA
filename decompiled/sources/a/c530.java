package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c530 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3752a;
    public final boolean b;
    public final String c;
    public final gho d;
    public final boolean e;
    public final y9q0 f;

    public c530(String str, boolean z, String str2, gho ghoVar, boolean z2, y9q0 y9q0Var) {
        str.getClass();
        this.f3752a = str;
        this.b = z;
        this.c = str2;
        this.d = ghoVar;
        this.e = z2;
        this.f = y9q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c530)) {
            return false;
        }
        c530 c530Var = (c530) obj;
        return Intrinsics.d(this.f3752a, c530Var.f3752a) && this.b == c530Var.b && this.c.equals(c530Var.c) && this.d == c530Var.d && this.e == c530Var.e && this.f.equals(c530Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e((this.d.hashCode() + ua80.b(brm0.e(this.f3752a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("MarketsGroupCardHeaderUiModel(groupName=", this.f3752a, ", isPinned=", this.b, ", marketsCounterText=");
        sbU.append(this.c);
        sbU.append(", eventSpecialBetType=");
        sbU.append(this.d);
        sbU.append(", showInfoButton=");
        sbU.append(this.e);
        sbU.append(", textStyle=");
        sbU.append(this.f);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
