package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class g6k implements vjn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10770a;
    public final int b;

    public g6k(int i, int i2) {
        this.f10770a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        ycx.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // a.vjn
    public final void a(z55 z55Var) {
        int i = z55Var.c;
        tyc tycVar = (tyc) z55Var.f;
        int i2 = this.b;
        int iB = i + i2;
        if (((i ^ iB) & (i2 ^ iB)) < 0) {
            iB = tycVar.B();
        }
        z55Var.e(z55Var.c, Math.min(iB, tycVar.B()));
        int i3 = z55Var.b;
        int i4 = this.f10770a;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        z55Var.e(Math.max(0, i5), z55Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6k)) {
            return false;
        }
        g6k g6kVar = (g6k) obj;
        return this.f10770a == g6kVar.f10770a && this.b == g6kVar.b;
    }

    public final int hashCode() {
        return (this.f10770a * 31) + this.b;
    }

    public final String toString() {
        return ohs0.m("DeleteSurroundingTextCommand(lengthBeforeCursor=", this.f10770a, ", lengthAfterCursor=", Separators.RPAREN, this.b);
    }
}
