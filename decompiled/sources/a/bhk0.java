package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bhk0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2612a;
    public final int b;
    public final ygk0 c;
    public final String d;

    public bhk0(int i, int i2, ygk0 ygk0Var, String str) {
        str.getClass();
        this.f2612a = i;
        this.b = i2;
        this.c = ygk0Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhk0)) {
            return false;
        }
        bhk0 bhk0Var = (bhk0) obj;
        return this.f2612a == bhk0Var.f2612a && this.b == bhk0Var.b && this.c == bhk0Var.c && Intrinsics.d(this.d, bhk0Var.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return String.valueOf(this.f2612a);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f2612a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("SocialButtonUiModel(socialId=", this.f2612a, ", iconResId=", ", state=", this.b);
        sbT.append(this.c);
        sbT.append(", title=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
