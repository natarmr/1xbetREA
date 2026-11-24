package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class bte0 {
    public static final ate0 Companion = new ate0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f3179a;
    public final String b;
    public final String c;

    public /* synthetic */ bte0(int i, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f3179a = null;
        } else {
            this.f3179a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bte0)) {
            return false;
        }
        bte0 bte0Var = (bte0) obj;
        return Intrinsics.d(this.f3179a, bte0Var.f3179a) && Intrinsics.d(this.b, bte0Var.b) && Intrinsics.d(this.c, bte0Var.c);
    }

    public final int hashCode() {
        Integer num = this.f3179a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(h97.n(this.f3179a, "RegisterAuthenticatorRequestV2(keyType=", ", keyData=", this.b, ", deviceName="), this.c, Separators.RPAREN);
    }

    public bte0(Integer num, String str, String str2) {
        this.f3179a = num;
        this.b = str;
        this.c = str2;
    }
}
