package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class tc40 {
    public static final sc40 Companion = new sc40();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new ec40(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f33702a;
    public final Float b;
    public final List c;

    public /* synthetic */ tc40(int i, Integer num, Float f, List list) {
        if ((i & 1) == 0) {
            this.f33702a = null;
        } else {
            this.f33702a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc40)) {
            return false;
        }
        tc40 tc40Var = (tc40) obj;
        return Intrinsics.d(this.f33702a, tc40Var.f33702a) && Intrinsics.d(this.b, tc40Var.b) && Intrinsics.d(this.c, tc40Var.c);
    }

    public final int hashCode() {
        Integer num = this.f33702a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f = this.b;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetaHeroesSkillBuildResponse(numberOfMatches=");
        sb.append(this.f33702a);
        sb.append(", winRate=");
        sb.append(this.b);
        sb.append(", skills=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
