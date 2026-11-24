package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u3e0 extends v8b {
    public final s3e0 d;
    public final boolean e;
    public final ArrayList f;
    public final int g;
    public final Integer h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3e0(s3e0 s3e0Var, boolean z, ArrayList arrayList, int i, Integer num) {
        super(6, num, Integer.valueOf(i), arrayList);
        s3e0Var.getClass();
        this.d = s3e0Var;
        this.e = z;
        this.f = arrayList;
        this.g = i;
        this.h = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3e0)) {
            return false;
        }
        u3e0 u3e0Var = (u3e0) obj;
        return Intrinsics.d(this.d, u3e0Var.d) && this.e == u3e0Var.e && this.f.equals(u3e0Var.f) && this.g == u3e0Var.g && Intrinsics.d(this.h, u3e0Var.h);
    }

    public final int hashCode() {
        int iA = twn.a(this.g, twn.g(this.f, brm0.e(brm0.e(this.d.hashCode() * 31, 31, false), 31, this.e), 31), 31);
        Integer num = this.h;
        return iA + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RatingCellUiModel(cellTypeModel=");
        sb.append(this.d);
        sb.append(", isExpanded=false, isSection=");
        sb.append(this.e);
        sb.append(", cellContent=");
        sb.append(this.f);
        sb.append(", widthMin=");
        sb.append(this.g);
        sb.append(", widthMax=");
        return dw9.q(sb, this.h, Separators.RPAREN);
    }
}
