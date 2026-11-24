package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class fd30 {
    public static final ed30 Companion = new ed30();
    public static final a8z[] e = {null, maz.a(wez.f39042a, new n230(12)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9340a;
    public final List b;
    public final Integer c;
    public final Integer d;

    public /* synthetic */ fd30(int i, Integer num, Integer num2, String str, List list) {
        if ((i & 1) == 0) {
            this.f9340a = null;
        } else {
            this.f9340a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd30)) {
            return false;
        }
        fd30 fd30Var = (fd30) obj;
        return Intrinsics.d(this.f9340a, fd30Var.f9340a) && Intrinsics.d(this.b, fd30Var.b) && Intrinsics.d(this.c, fd30Var.c) && Intrinsics.d(this.d, fd30Var.d);
    }

    public final int hashCode() {
        String str = this.f9340a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.l(defpackage.c.f("MatchProgressResponse(title=", this.f9340a, ", pointByPoints=", this.b, ", subScoreOne="), this.c, ", subScoreTwo=", this.d, Separators.RPAREN);
    }
}
