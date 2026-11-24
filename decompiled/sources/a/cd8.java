package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class cd8 {
    public static final bd8 Companion = new bd8();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new os7(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f4149a;
    public final String b;
    public final String c;
    public final List d;

    public /* synthetic */ cd8(int i, Integer num, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f4149a = null;
        } else {
            this.f4149a = num;
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
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd8)) {
            return false;
        }
        cd8 cd8Var = (cd8) obj;
        return Intrinsics.d(this.f4149a, cd8Var.f4149a) && Intrinsics.d(this.b, cd8Var.b) && Intrinsics.d(this.c, cd8Var.c) && Intrinsics.d(this.d, cd8Var.d);
    }

    public final int hashCode() {
        Integer num = this.f4149a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return rw2.m(this.c, ", bonuses=", Separators.RPAREN, h97.n(this.f4149a, "BonusAgreementsResponse(groupId=", ", title=", this.b, ", description="), this.d);
    }
}
