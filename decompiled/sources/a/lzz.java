package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class lzz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20926a;
    public final List b;

    public lzz(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f20926a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzz)) {
            return false;
        }
        lzz lzzVar = (lzz) obj;
        return Intrinsics.d(this.f20926a, lzzVar.f20926a) && Intrinsics.d(this.b, lzzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20926a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("LimitsModel(financialLimitModels=", ", timeLimitModels=", this.f20926a, Separators.RPAREN, this.b);
    }
}
