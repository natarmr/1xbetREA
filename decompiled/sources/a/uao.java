package a;

import android.gov.nist.core.Separators;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class uao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f35340a;
    public final int b;
    public final int c;
    public final int d;
    public final vao e;

    public uao(View view, int i, int i2, int i3, vao vaoVar) {
        this.f35340a = view;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = vaoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uao)) {
            return false;
        }
        uao uaoVar = (uao) obj;
        return this.f35340a.equals(uaoVar.f35340a) && this.b == uaoVar.b && this.c == uaoVar.c && this.d == uaoVar.d && this.e == uaoVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, twn.a(this.c, twn.a(this.b, this.f35340a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MeasureView(view=");
        sb.append(this.f35340a);
        sb.append(", rowIndex=");
        sb.append(this.b);
        sb.append(", viewIndex=");
        axq.r(this.c, this.d, ", headerCount=", ", viewType=", sb);
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
