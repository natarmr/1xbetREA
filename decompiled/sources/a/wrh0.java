package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wrh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39643a;
    public final int b;
    public final int c;
    public final Map d;
    public final boolean e;
    public final String f;

    public wrh0(int i, int i2, int i3, Map map, boolean z, String str) {
        map.getClass();
        this.f39643a = i;
        this.b = i2;
        this.c = i3;
        this.d = map;
        this.e = z;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrh0)) {
            return false;
        }
        wrh0 wrh0Var = (wrh0) obj;
        return this.f39643a == wrh0Var.f39643a && this.b == wrh0Var.b && this.c == wrh0Var.c && Intrinsics.d(this.d, wrh0Var.d) && this.e == wrh0Var.e && this.f.equals(wrh0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(ohs0.f(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f39643a) * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("SecurityLevelModel(lastDayChangePass=", this.f39643a, ", dayChangePassCount=", ", protectionStage=", this.b);
        sbT.append(this.c);
        sbT.append(", securityItems=");
        sbT.append(this.d);
        sbT.append(", isPromoAvailable=");
        return twn.q(", title=", this.f, Separators.RPAREN, sbT, this.e);
    }
}
