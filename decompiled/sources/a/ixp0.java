package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ixp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15554a;
    public final String b;
    public final String c;
    public final String d;

    public ixp0(String str, String str2, String str3, String str4) {
        str2.getClass();
        str3.getClass();
        this.f15554a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixp0)) {
            return false;
        }
        ixp0 ixp0Var = (ixp0) obj;
        return this.f15554a.equals(ixp0Var.f15554a) && Intrinsics.d(this.b, ixp0Var.b) && Intrinsics.d(this.c, ixp0Var.c) && Intrinsics.d(this.d, ixp0Var.d);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(this.f15554a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ua80.m(b1j.n("TennisRowUiModel(surface=", this.f15554a, ", wins=", this.b, ", losses="), this.c, ", winRate=", this.d, Separators.RPAREN);
    }
}
