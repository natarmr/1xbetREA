package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class dz8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f6929a;
    public final String b;
    public final String c;

    public dz8(imm immVar, String str, String str2) {
        immVar.getClass();
        this.f6929a = immVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz8)) {
            return false;
        }
        dz8 dz8Var = (dz8) obj;
        return Intrinsics.d(this.f6929a, dz8Var.f6929a) && this.b.equals(dz8Var.b) && this.c.equals(dz8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f6929a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrandInfoUiState(navigationBar=");
        sb.append(this.f6929a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
