package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ahk0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f880a;
    public final int b;
    public final xgk0 c;
    public final String d;

    public ahk0(int i, int i2, xgk0 xgk0Var, String str) {
        str.getClass();
        this.f880a = i;
        this.b = i2;
        this.c = xgk0Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahk0)) {
            return false;
        }
        ahk0 ahk0Var = (ahk0) obj;
        return this.f880a == ahk0Var.f880a && this.b == ahk0Var.b && this.c == ahk0Var.c && Intrinsics.d(this.d, ahk0Var.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return String.valueOf(this.f880a);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f880a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("SocialButtonUiModel(socialId=", this.f880a, ", iconResId=", ", state=", this.b);
        sbT.append(this.c);
        sbT.append(", title=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
