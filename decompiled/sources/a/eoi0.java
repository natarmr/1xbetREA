package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class eoi0 implements vjn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f8142a;
    public final int b;

    public eoi0(String str, int i) {
        this.f8142a = new j83(str);
        this.b = i;
    }

    @Override // a.vjn
    public final void a(z55 z55Var) {
        String str = this.f8142a.b;
        int i = z55Var.d;
        if (i != -1) {
            z55Var.o(i, z55Var.e, str);
            if (str.length() > 0) {
                z55Var.p(i, str.length() + i);
            }
        } else {
            int i2 = z55Var.b;
            z55Var.o(i2, z55Var.c, str);
            if (str.length() > 0) {
                z55Var.p(i2, str.length() + i2);
            }
        }
        int i3 = z55Var.b;
        int i4 = z55Var.c;
        int i5 = i3 == i4 ? i4 : -1;
        int i6 = this.b;
        int iD = l1e0.d(i6 > 0 ? (i5 + i6) - 1 : (i5 + i6) - str.length(), 0, ((tyc) z55Var.f).B());
        z55Var.q(iD, iD);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoi0)) {
            return false;
        }
        eoi0 eoi0Var = (eoi0) obj;
        return Intrinsics.d(this.f8142a.b, eoi0Var.f8142a.b) && this.b == eoi0Var.b;
    }

    public final int hashCode() {
        return (this.f8142a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return dw9.n(this.b, "SetComposingTextCommand(text='", this.f8142a.b, "', newCursorPosition=", Separators.RPAREN);
    }
}
