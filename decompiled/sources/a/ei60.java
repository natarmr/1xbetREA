package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ei60 implements fi60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7844a;
    public final int b;
    public final int c;
    public final String d;

    public ei60(int i, int i2, int i3, String str) {
        str.getClass();
        this.f7844a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei60)) {
            return false;
        }
        ei60 ei60Var = (ei60) obj;
        return this.f7844a == ei60Var.f7844a && this.b == ei60Var.b && this.c == ei60Var.c && Intrinsics.d(this.d, ei60Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f7844a) * 31, 31), 31);
    }

    public final String toString() {
        return rw2.k(this.c, ", screenName=", this.d, Separators.RPAREN, dw9.t("OnSkipOnboarding(tutorialId=", this.f7844a, ", index=", ", slidesCount=", this.b));
    }
}
