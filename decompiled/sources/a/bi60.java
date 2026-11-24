package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bi60 implements fi60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2645a;
    public final int b;
    public final int c;
    public final String d;

    public bi60(int i, int i2, int i3, String str) {
        str.getClass();
        this.f2645a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi60)) {
            return false;
        }
        bi60 bi60Var = (bi60) obj;
        return this.f2645a == bi60Var.f2645a && this.b == bi60Var.b && this.c == bi60Var.c && Intrinsics.d(this.d, bi60Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f2645a) * 31, 31), 31);
    }

    public final String toString() {
        return rw2.k(this.c, ", screenName=", this.d, Separators.RPAREN, dw9.t("OnAcceptClicked(tutorialId=", this.f2645a, ", index=", ", slidesCount=", this.b));
    }
}
