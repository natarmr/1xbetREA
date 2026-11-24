package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class pca0 {
    public static final oca0 Companion = new oca0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26750a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ pca0(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f26750a = null;
        } else {
            this.f26750a = str;
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
        if (!(obj instanceof pca0)) {
            return false;
        }
        pca0 pca0Var = (pca0) obj;
        return Intrinsics.d(this.f26750a, pca0Var.f26750a) && Intrinsics.d(this.b, pca0Var.b) && Intrinsics.d(this.c, pca0Var.c) && Intrinsics.d(this.d, pca0Var.d);
    }

    public final int hashCode() {
        String str = this.f26750a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(b1j.n("PlayerTransferValueResponse(dateString=", this.f26750a, ", teamOneId=", this.b, ", teamTwoId="), this.c, ", transferType=", this.d, Separators.RPAREN);
    }
}
