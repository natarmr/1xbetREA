package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class h6k implements vjn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12533a;
    public final int b;

    public h6k(int i, int i2) {
        this.f12533a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        ycx.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // a.vjn
    public final void a(z55 z55Var) {
        int i = 0;
        for (int i2 = 0; i2 < this.f12533a; i2++) {
            int i3 = i + 1;
            int i4 = z55Var.b;
            if (i4 <= i3) {
                i = i4;
                break;
            }
            i = (Character.isHighSurrogate(z55Var.f((i4 - i3) + (-1))) && Character.isLowSurrogate(z55Var.f(z55Var.b - i3))) ? i + 2 : i3;
        }
        int iB = 0;
        for (int i5 = 0; i5 < this.b; i5++) {
            int i6 = iB + 1;
            int i7 = z55Var.c;
            tyc tycVar = (tyc) z55Var.f;
            if (i7 + i6 >= tycVar.B()) {
                iB = tycVar.B() - z55Var.c;
                break;
            }
            iB = (Character.isHighSurrogate(z55Var.f((z55Var.c + i6) + (-1))) && Character.isLowSurrogate(z55Var.f(z55Var.c + i6))) ? iB + 2 : i6;
        }
        int i8 = z55Var.c;
        z55Var.e(i8, iB + i8);
        int i9 = z55Var.b;
        z55Var.e(i9 - i, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6k)) {
            return false;
        }
        h6k h6kVar = (h6k) obj;
        return this.f12533a == h6kVar.f12533a && this.b == h6kVar.b;
    }

    public final int hashCode() {
        return (this.f12533a * 31) + this.b;
    }

    public final String toString() {
        return ohs0.m("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", this.f12533a, ", lengthAfterCursor=", Separators.RPAREN, this.b);
    }
}
