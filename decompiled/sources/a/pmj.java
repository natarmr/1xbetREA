package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pmj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27237a;
    public final int b;
    public final List c;

    public pmj(int i, int i2, List list) {
        list.getClass();
        this.f27237a = i;
        this.b = i2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmj)) {
            return false;
        }
        pmj pmjVar = (pmj) obj;
        return this.f27237a == pmjVar.f27237a && this.b == pmjVar.b && Intrinsics.d(this.c, pmjVar.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + dw9.a(twn.a(this.b, Integer.hashCode(this.f27237a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return dw9.r(dw9.t("CyberRecommendVirtualGames(cyberType=", this.f27237a, ", viewType=", ", sportsId=", this.b), this.c, ", hasBackStack=false)");
    }
}
