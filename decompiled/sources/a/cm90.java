package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class cm90 {
    public static final am90 Companion = new am90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4593a;
    public final int b;
    public final int c;
    public final String d;

    public /* synthetic */ cm90(int i, int i2, int i3, int i4, String str) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, zl90.f44570a.getDescriptor());
            throw null;
        }
        this.f4593a = i2;
        this.b = i3;
        this.c = i4;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm90)) {
            return false;
        }
        cm90 cm90Var = (cm90) obj;
        return this.f4593a == cm90Var.f4593a && this.b == cm90Var.b && this.c == cm90Var.c && Intrinsics.d(this.d, cm90Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f4593a) * 31, 31), 31);
    }

    public final String toString() {
        return rw2.k(this.c, ", mask=", this.d, Separators.RPAREN, dw9.t("PhoneMask(countryId=", this.f4593a, ", minLength=", ", maxLength=", this.b));
    }

    public cm90(int i, int i2, int i3, String str) {
        str.getClass();
        this.f4593a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }
}
