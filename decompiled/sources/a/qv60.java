package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qv60 extends uv60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nrv f29374a;
    public final String b;
    public final int c;
    public final int d;
    public final ArrayList e;
    public final ArrayList f;

    public qv60(nrv nrvVar, String str, int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        str.getClass();
        this.f29374a = nrvVar;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = arrayList;
        this.f = arrayList2;
    }

    @Override // a.uv60
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv60)) {
            return false;
        }
        qv60 qv60Var = (qv60) obj;
        return this.f29374a.equals(qv60Var.f29374a) && Intrinsics.d(this.b, qv60Var.b) && this.c == qv60Var.c && this.d == qv60Var.d && this.e.equals(qv60Var.e) && this.f.equals(qv60Var.f);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof qv60) && (p6t0Var2 instanceof qv60)) {
            return Intrinsics.d(((qv60) p6t0Var).b, ((qv60) p6t0Var2).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.g(this.e, twn.a(this.d, twn.a(this.c, ua80.b(this.f29374a.hashCode() * 31, 31, this.b), 31), 31), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return iun.f15405a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CategoryWithBannerUiModel(headerModel=");
        sb.append(this.f29374a);
        sb.append(", categoryId=");
        sb.append(this.b);
        sb.append(", backgroundRes=");
        axq.r(this.c, this.d, ", drawableRes=", ", gameList=", sb);
        sb.append(this.e);
        sb.append(", gameCollection=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
