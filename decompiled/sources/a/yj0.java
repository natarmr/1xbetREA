package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yj0 implements ik0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42721a;
    public final int b;
    public final String c;
    public final String d;
    public final gz8 e;
    public final List f;
    public final String g;

    public yj0(String str, int i, String str2, String str3, gz8 gz8Var, a4x a4xVar, String str4) {
        a4xVar.getClass();
        this.f42721a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = gz8Var;
        this.f = a4xVar;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj0)) {
            return false;
        }
        yj0 yj0Var = (yj0) obj;
        return this.f42721a.equals(yj0Var.f42721a) && this.b == yj0Var.b && this.c.equals(yj0Var.c) && this.d.equals(yj0Var.d) && this.e == yj0Var.e && Intrinsics.d(this.f, yj0Var.f) && this.g.equals(yj0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + dw9.a((this.e.hashCode() + ua80.b(ua80.b(twn.a(this.b, this.f42721a.hashCode() * 31, 31), 31, this.c), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "MonthProviderClick(img=", this.f42721a, ", productId=", ", productName=");
        f140.v(sbP, this.c, ", description=", this.d, ", viewType=");
        sbP.append(this.e);
        sbP.append(", partitions=");
        sbP.append(this.f);
        sbP.append(", imgBanner=");
        return axq.n(sbP, this.g, Separators.RPAREN);
    }
}
