package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jph0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16901a;
    public final int b;
    public final int c;
    public final Map d;
    public final zrt0 e;
    public final String f;
    public final boolean g;
    public final String h;

    public jph0(int i, int i2, int i3, Map map, zrt0 zrt0Var, String str, boolean z, String str2) {
        map.getClass();
        this.f16901a = i;
        this.b = i2;
        this.c = i3;
        this.d = map;
        this.e = zrt0Var;
        this.f = str;
        this.g = z;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jph0)) {
            return false;
        }
        jph0 jph0Var = (jph0) obj;
        return this.f16901a == jph0Var.f16901a && this.b == jph0Var.b && this.c == jph0Var.c && Intrinsics.d(this.d, jph0Var.d) && this.e == jph0Var.e && this.f.equals(jph0Var.f) && this.g == jph0Var.g && this.h.equals(jph0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + brm0.e(ua80.b((this.e.hashCode() + ohs0.f(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f16901a) * 31, 31), 31), 31)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("SecurityDataModel(lastDayChangePass=", this.f16901a, ", dayChangePassCount=", ", protectionStage=", this.b);
        sbT.append(this.c);
        sbT.append(", securityItems=");
        sbT.append(this.d);
        sbT.append(", phoneState=");
        sbT.append(this.e);
        sbT.append(", phone=");
        sbT.append(this.f);
        sbT.append(", isPromoAvailable=");
        return twn.q(", title=", this.h, Separators.RPAREN, sbT, this.g);
    }
}
