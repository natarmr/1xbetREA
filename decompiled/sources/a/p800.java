package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class p800 {
    public static final o800 Companion = new o800();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26531a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public /* synthetic */ p800(int i, Integer num, Integer num2, Integer num3, String str) {
        if ((i & 1) == 0) {
            this.f26531a = null;
        } else {
            this.f26531a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p800)) {
            return false;
        }
        p800 p800Var = (p800) obj;
        return Intrinsics.d(this.f26531a, p800Var.f26531a) && Intrinsics.d(this.b, p800Var.b) && Intrinsics.d(this.c, p800Var.c) && Intrinsics.d(this.d, p800Var.d);
    }

    public final int hashCode() {
        String str = this.f26531a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return ua80.l(axq.p(this.b, "LineUpPlayerResponse(player=", this.f26531a, ", line=", ", position="), this.c, ", num=", this.d, Separators.RPAREN);
    }
}
