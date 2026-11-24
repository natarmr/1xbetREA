package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class csv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4908a;
    public final a4x b;
    public final boolean c;
    public final int d;

    public csv(int i, a4x a4xVar, String str, boolean z) {
        str.getClass();
        a4xVar.getClass();
        this.f4908a = str;
        this.b = a4xVar;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csv)) {
            return false;
        }
        csv csvVar = (csv) obj;
        return Intrinsics.d(this.f4908a, csvVar.f4908a) && Intrinsics.d(this.b, csvVar.b) && this.c == csvVar.c && this.d == csvVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + brm0.e(cs0.b(this.b, this.f4908a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbU = kng0.u("HeaderSummaryUiModel(totalMatchesAndDraw=", this.f4908a, ", sectionUiModelList=", this.b, ", isExpanded=");
        sbU.append(this.c);
        sbU.append(", iconRes=");
        sbU.append(this.d);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
