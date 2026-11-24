package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mrf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fof f22269a;
    public final wif b;
    public final List c;
    public final ljg d;
    public final List e;
    public final boolean f;

    public mrf(fof fofVar, wif wifVar, List list, ljg ljgVar, List list2, boolean z) {
        fofVar.getClass();
        wifVar.getClass();
        list.getClass();
        ljgVar.getClass();
        list2.getClass();
        this.f22269a = fofVar;
        this.b = wifVar;
        this.c = list;
        this.d = ljgVar;
        this.e = list2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrf)) {
            return false;
        }
        mrf mrfVar = (mrf) obj;
        return Intrinsics.d(this.f22269a, mrfVar.f22269a) && Intrinsics.d(this.b, mrfVar.b) && Intrinsics.d(this.c, mrfVar.c) && Intrinsics.d(this.d, mrfVar.d) && Intrinsics.d(this.e, mrfVar.e) && this.f == mrfVar.f;
    }

    public final int hashCode() {
        return brm0.e(dw9.a((this.d.hashCode() + dw9.a((this.b.hashCode() + (this.f22269a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "Cs2StatisticModel(statisticInfo=" + this.f22269a + ", playerCompositionInfo=" + this.b + ", mapsPick=" + this.c + ", lastMatchesInfoModel=" + this.d + ", playersDuelModels=" + this.e + ", hasStatistics=" + this.f + ", video=null)";
    }
}
