package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class wz5 {
    public static final vz5 Companion = new vz5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f40006a;
    public final String b;
    public final String c;
    public final Integer d;

    public /* synthetic */ wz5(int i, Integer num, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f40006a = null;
        } else {
            this.f40006a = l;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz5)) {
            return false;
        }
        wz5 wz5Var = (wz5) obj;
        return Intrinsics.d(this.f40006a, wz5Var.f40006a) && Intrinsics.d(this.b, wz5Var.b) && Intrinsics.d(this.c, wz5Var.c) && Intrinsics.d(this.d, wz5Var.d);
    }

    public final int hashCode() {
        Long l = this.f40006a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return vqd.l(this.d, this.c, ", cyberType=", Separators.RPAREN, cs0.s(this.f40006a, "BaseLigaResponse(id=", ", name=", this.b, ", image="));
    }
}
