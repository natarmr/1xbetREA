package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ahn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f881a;
    public final String b;

    public ahn(List list, String str) {
        list.getClass();
        this.f881a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahn)) {
            return false;
        }
        ahn ahnVar = (ahn) obj;
        return Intrinsics.d(this.f881a, ahnVar.f881a) && this.b.equals(ahnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f881a.hashCode() * 31);
    }

    public final String toString() {
        return "EarnedTableModel(rankingsBreakdownModel=" + this.f881a + ", tournType=" + this.b + Separators.RPAREN;
    }
}
