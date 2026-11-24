package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class aoe0 {
    public static final zne0 Companion = new zne0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1197a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ aoe0(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f1197a = null;
        } else {
            this.f1197a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoe0)) {
            return false;
        }
        aoe0 aoe0Var = (aoe0) obj;
        return Intrinsics.d(this.f1197a, aoe0Var.f1197a) && Intrinsics.d(this.b, aoe0Var.b) && Intrinsics.d(this.c, aoe0Var.c) && Intrinsics.d(this.d, aoe0Var.d);
    }

    public final int hashCode() {
        String str = this.f1197a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(b1j.n("ReferralObject(tag=", this.f1197a, ", bTag=", this.b, ", pb="), this.c, ", betPariTag=", this.d, Separators.RPAREN);
    }

    public aoe0() {
        this.f1197a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
