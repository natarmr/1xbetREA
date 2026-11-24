package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ex0 {
    public static final dx0 Companion = new dx0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f8552a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ ex0(int i, Long l, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f8552a = null;
        } else {
            this.f8552a = l;
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
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex0)) {
            return false;
        }
        ex0 ex0Var = (ex0) obj;
        return Intrinsics.d(this.f8552a, ex0Var.f8552a) && Intrinsics.d(this.b, ex0Var.b) && Intrinsics.d(this.c, ex0Var.c) && Intrinsics.d(this.d, ex0Var.d);
    }

    public final int hashCode() {
        Long l = this.f8552a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(cs0.s(this.f8552a, "AggregatorGamesBrandResponse(id=", ", name=", this.b, ", imgPictogramPath="), this.c, ", imgBannerPath=", this.d, Separators.RPAREN);
    }
}
