package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l8d implements vjn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f19598a;
    public final int b;

    public l8d(String str, int i) {
        this(new j83(str), i);
    }

    @Override // a.vjn
    public final void a(z55 z55Var) {
        int i = z55Var.d;
        j83 j83Var = this.f19598a;
        if (i != -1) {
            z55Var.o(i, z55Var.e, j83Var.b);
        } else {
            z55Var.o(z55Var.b, z55Var.c, j83Var.b);
        }
        int i2 = z55Var.b;
        int i3 = z55Var.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int iD = l1e0.d(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - j83Var.b.length(), 0, ((tyc) z55Var.f).B());
        z55Var.q(iD, iD);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8d)) {
            return false;
        }
        l8d l8dVar = (l8d) obj;
        return Intrinsics.d(this.f19598a.b, l8dVar.f19598a.b) && this.b == l8dVar.b;
    }

    public final int hashCode() {
        return (this.f19598a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return dw9.n(this.b, "CommitTextCommand(text='", this.f19598a.b, "', newCursorPosition=", Separators.RPAREN);
    }

    public l8d(j83 j83Var, int i) {
        this.f19598a = j83Var;
        this.b = i;
    }
}
