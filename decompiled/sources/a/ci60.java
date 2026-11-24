package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ci60 implements fi60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4397a;
    public final int b;
    public final int c;
    public final String d;

    public ci60(int i, int i2, int i3, String str) {
        str.getClass();
        this.f4397a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci60)) {
            return false;
        }
        ci60 ci60Var = (ci60) obj;
        return this.f4397a == ci60Var.f4397a && this.b == ci60Var.b && this.c == ci60Var.c && Intrinsics.d(this.d, ci60Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f4397a) * 31, 31), 31);
    }

    public final String toString() {
        return rw2.k(this.c, ", screenName=", this.d, Separators.RPAREN, dw9.t("OnCloseBottomSheet(tutorialId=", this.f4397a, ", index=", ", slidesCount=", this.b));
    }
}
