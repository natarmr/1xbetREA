package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class grn implements hrn {
    public static final frn Companion = new frn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11788a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public /* synthetic */ grn(int i, int i2, int i3, int i4, int i5, int i6) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, ern.f8291a.getDescriptor());
            throw null;
        }
        this.f11788a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grn)) {
            return false;
        }
        grn grnVar = (grn) obj;
        return this.f11788a == grnVar.f11788a && this.b == grnVar.b && this.c == grnVar.c && this.d == grnVar.d && this.e == grnVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f11788a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("NotificationsRequest(notifyNewsEmail=", this.f11788a, ", notifyBetEmail=", ", notifyAdsSMS=", this.b);
        axq.r(this.c, this.d, ", notifyDep=", ", notifyNewsCall=", sbT);
        return rz4.j(this.e, Separators.RPAREN, sbT);
    }

    public grn(int i, int i2, int i3, int i4, int i5) {
        this.f11788a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }
}
