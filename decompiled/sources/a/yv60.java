package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yv60 implements zv60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mz60 f43306a;
    public final int b;
    public final int c;
    public final String d;

    public yv60(mz60 mz60Var, int i, int i2, String str) {
        mz60Var.getClass();
        this.f43306a = mz60Var;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv60)) {
            return false;
        }
        yv60 yv60Var = (yv60) obj;
        return Intrinsics.d(this.f43306a, yv60Var.f43306a) && this.b == yv60Var.b && this.c == yv60Var.c && Intrinsics.d(this.d, yv60Var.d);
    }

    public final int hashCode() {
        int iA = twn.a(this.c, twn.a(this.b, this.f43306a.hashCode() * 31, 31), 31);
        String str = this.d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpotlightClick(gameModel=");
        sb.append(this.f43306a);
        sb.append(", categoryId=");
        sb.append(this.b);
        sb.append(", bannerPosition=");
        return rw2.k(this.c, ", loadedPictureUrl=", this.d, Separators.RPAREN, sb);
    }
}
