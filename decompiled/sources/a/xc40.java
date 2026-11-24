package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class xc40 {
    public static final wc40 Companion = new wc40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40629a;
    public final Integer b;
    public final String c;

    public /* synthetic */ xc40(int i, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f40629a = null;
        } else {
            this.f40629a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
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
        if (!(obj instanceof xc40)) {
            return false;
        }
        xc40 xc40Var = (xc40) obj;
        return Intrinsics.d(this.f40629a, xc40Var.f40629a) && Intrinsics.d(this.b, xc40Var.b) && Intrinsics.d(this.c, xc40Var.c);
    }

    public final int hashCode() {
        String str = this.f40629a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(axq.p(this.b, "MetaHeroesSkillResponse(name=", this.f40629a, ", level=", ", image="), this.c, Separators.RPAREN);
    }
}
