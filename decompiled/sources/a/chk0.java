package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class chk0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4365a;
    public final int b;
    public final zgk0 c;
    public final String d;

    public chk0(int i, int i2, zgk0 zgk0Var, String str) {
        str.getClass();
        this.f4365a = i;
        this.b = i2;
        this.c = zgk0Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chk0)) {
            return false;
        }
        chk0 chk0Var = (chk0) obj;
        return this.f4365a == chk0Var.f4365a && this.b == chk0Var.b && this.c == chk0Var.c && Intrinsics.d(this.d, chk0Var.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return String.valueOf(this.f4365a);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f4365a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("SocialButtonUiModel(socialId=", this.f4365a, ", iconResId=", ", state=", this.b);
        sbT.append(this.c);
        sbT.append(", title=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
