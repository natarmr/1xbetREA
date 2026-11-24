package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wxt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39946a;
    public final String b;
    public final int c;
    public final int d;

    public wxt0(int i, String str, int i2, String str2) {
        str.getClass();
        this.f39946a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxt0)) {
            return false;
        }
        wxt0 wxt0Var = (wxt0) obj;
        return Intrinsics.d(this.f39946a, wxt0Var.f39946a) && this.b.equals(wxt0Var.b) && this.c == wxt0Var.c && this.d == wxt0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, ua80.b(this.f39946a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", losses=", Separators.RPAREN, b1j.n("ValorantMapPoolModel(name=", this.f39946a, ", imageS3=", this.b, ", wins="));
    }
}
