package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yoq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42999a;
    public final int b;
    public final String c;
    public final boolean d;

    public yoq0(int i, int i2, String str, boolean z) {
        str.getClass();
        this.f42999a = i;
        this.b = i2;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yoq0)) {
            return false;
        }
        yoq0 yoq0Var = (yoq0) obj;
        return this.f42999a == yoq0Var.f42999a && this.b == yoq0Var.b && Intrinsics.d(this.c, yoq0Var.c) && this.d == yoq0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(twn.a(this.b, Integer.hashCode(this.f42999a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return defpackage.c.c(this.c, ", imageCropped=", Separators.RPAREN, dw9.t("TipsItem(title=", this.f42999a, ", description=", ", image=", this.b), this.d);
    }
}
