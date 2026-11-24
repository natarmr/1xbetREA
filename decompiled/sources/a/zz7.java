package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zz7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45238a;
    public final int b;
    public final String c;

    public zz7(int i, int i2, String str) {
        str.getClass();
        this.f45238a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz7)) {
            return false;
        }
        zz7 zz7Var = (zz7) obj;
        return this.f45238a == zz7Var.f45238a && this.b == zz7Var.b && Intrinsics.d(this.c, zz7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f45238a) * 31, 31);
    }

    public final String toString() {
        return axq.n(dw9.t("BigPigPlayerThrowItemUiModel(firstCubeImage=", this.f45238a, ", secondCubeImage=", ", value=", this.b), this.c, Separators.RPAREN);
    }
}
