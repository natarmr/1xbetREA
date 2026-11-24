package a;

import android.gov.nist.core.Separators;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f28406a;
    public final int b;
    public final int c;
    public final boolean d;

    public qao(View view, int i, int i2, boolean z) {
        this.f28406a = view;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qao)) {
            return false;
        }
        qao qaoVar = (qao) obj;
        return Intrinsics.d(this.f28406a, qaoVar.f28406a) && this.b == qaoVar.b && this.c == qaoVar.c && this.d == qaoVar.d;
    }

    public final int hashCode() {
        View view = this.f28406a;
        return Boolean.hashCode(this.d) + twn.a(this.c, twn.a(this.b, (view == null ? 0 : view.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MeasureHeader(view=");
        sb.append(this.f28406a);
        sb.append(", rowCount=");
        sb.append(this.b);
        sb.append(", headerCount=");
        return ohs0.k(this.c, ", expandable=", Separators.RPAREN, sb, this.d);
    }
}
